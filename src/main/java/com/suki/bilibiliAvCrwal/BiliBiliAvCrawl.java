package com.suki.bilibiliAvCrwal;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用途：爬取B站感兴趣的UP主的首页视频信息，方便下载
 */
@WebServlet("/avCrawl")
public class BiliBiliAvCrawl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        // 获取请求参数,即UP主的AV号
        String av = req.getParameter("av");
        System.out.println("[BiliBiliAvCrawl Test]==> UP主的AV号为：" + av);

        // mid接UP主的AV号
        // pagesize代表UP主视频页每页最多有30项
        // page接有多少页，这里固定写1即可，后面会解析总共有多少页
        String url = "https://space.bilibili.com/ajax/member/getSubmitVideos?mid=" + av + "&pagesize=30&tid=0&page=1&keyword=&order=pubdate";
        System.out.println("[BiliBiliAvCrwal Test]==> 请求网址为：" + url);

        JSONObject json = new JSONObject();  // 用于输出的json
        JSONArray jsonArray = new JSONArray();  // 用于存储UP主每个视频信息的json数组
        JSONObject jsonArray_obj;  // jsonArray里面每个json对象

        JSONObject biliBiliVideoJson = getBiliBiliVideoJson(url);
        if (biliBiliVideoJson == null) {
            json.put("state", false);
            json.put("video", "");
        } else {
            System.out.println(biliBiliVideoJson);
            // 获取到json数据的data部分
            JSONObject biliBiliVideoJosn_data = biliBiliVideoJson.getJSONObject("data");
            System.out.println(biliBiliVideoJosn_data);
            // 获取到pages数据
            String biliBiliVideoJson_data_pages =  biliBiliVideoJosn_data.getString("pages");
            // 获取到count数据
            String biliBiliVideoJson_data_count = biliBiliVideoJosn_data.getString("count");

            if (biliBiliVideoJson_data_count.equals("0")) { // 该用户没有视频展示
                json.put("state", true);
                json.put("count", 0);
                json.put("video", "no video");
            } else {  // 该用户有视频展示
                for (int i = 0; i < Integer.parseInt(biliBiliVideoJson_data_pages); i++) {
                    url = "https://space.bilibili.com/ajax/member/getSubmitVideos?mid=" + av + "&pagesize=30&tid=0&page=" + (i + 1) +"&keyword=&order=pubdate";
                    biliBiliVideoJson = getBiliBiliVideoJson(url);
                    biliBiliVideoJosn_data = biliBiliVideoJson.getJSONObject("data");
                    // 获取到vlist数据
                    JSONArray biliBiliVideoJson_data_vlist = biliBiliVideoJosn_data.getJSONArray("vlist"); // 这就是UP主视频页首页的视频array
                    for (Object biliBiliVideoJson_data_vlist_item : biliBiliVideoJson_data_vlist) {
                        biliBiliVideoJson_data_vlist_item = (JSONObject) biliBiliVideoJson_data_vlist_item;
                        jsonArray_obj = new JSONObject();
                        jsonArray_obj.put("title", ((JSONObject) biliBiliVideoJson_data_vlist_item).getString("title"));
                        jsonArray_obj.put("author", ((JSONObject) biliBiliVideoJson_data_vlist_item).getString("author"));
                        jsonArray_obj.put("description", ((JSONObject) biliBiliVideoJson_data_vlist_item).getString("description"));
                        jsonArray_obj.put("site", "https://www.bilibili.com/video/av" + ((JSONObject) biliBiliVideoJson_data_vlist_item).getString("aid"));
                        jsonArray.add(jsonArray_obj);
                    }
                }
                json.put("state", true);
                json.put("count", biliBiliVideoJson_data_count);
                json.put("video", jsonArray);
            }

        }

        // 返回json数据
        resp.getWriter().print(json);

    }


    /**
     * 请求网址返回给我JSON数据
     * @param url 请求网址
     * @return 请求网址返回给我的JSON数据
     */
    private JSONObject getBiliBiliVideoJson(String url){
        HttpGet httpGet = new HttpGet(url);
        try {
            HttpResponse response = new DefaultHttpClient().execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200) {
                // 获取返回的内容
                String biliBiliVideoStr = EntityUtils.toString(response.getEntity());
                System.out.println("[BiliBiliAvCrawl getBiliBiliVideoJson函数Test]==> 请求" + url + "传回的数据为：" + biliBiliVideoStr);
                // 转成JSON数据并返回
                return JSONObject.parseObject(biliBiliVideoStr);
            }
        } catch (IOException e) {
            System.out.println("[BiliBiliAvCrawl getBiliBiliVideoJson函数出现异常]");
            e.printStackTrace();
        }
        return null;
    }
}

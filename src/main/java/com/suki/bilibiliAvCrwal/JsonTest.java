package com.suki.bilibiliAvCrwal;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {
    public static void main(String[] args) {

        String jsonStr = "{\n" +
                "    \"status\": true,\n" +
                "    \"data\": {\n" +
                "        \"tlist\": {\n" +
                "            \"36\": {\n" +
                "                \"tid\": 36,\n" +
                "                \"count\": 13,\n" +
                "                \"name\": \"科技\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"vlist\": [\n" +
                "            {\n" +
                "                \"comment\": 5,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 1370,\n" +
                "                \"pic\": \"//i0.hdslb.com/bfs/archive/570d3058410c86ccfbfe542ee67a710224f93674.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"-\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"注意力机制\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1559981174,\n" +
                "                \"length\": \"49:44\",\n" +
                "                \"video_review\": 8,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 137,\n" +
                "                \"aid\": 54944893,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 10,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 781,\n" +
                "                \"pic\": \"//i2.hdslb.com/bfs/archive/4c8626b1880a9e07eabe1b514e4860b0a62a7253.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"如果我在评论区的评论删了就是全部上传完毕了，委屈各位老爷先看几天连续剧。抱歉抱歉<(_ _)>\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"目标检测：Cornernet（anchor free）\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1558801524,\n" +
                "                \"length\": \"55:48\",\n" +
                "                \"video_review\": 0,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 52,\n" +
                "                \"aid\": 53597704,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 2,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 295,\n" +
                "                \"pic\": \"//i1.hdslb.com/bfs/archive/3743d7f0f0d8051ba8805b70dcb596d038c5a765.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"-\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"网络级联 for 车牌识别\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1558253160,\n" +
                "                \"length\": \"09:40\",\n" +
                "                \"video_review\": 1,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 5,\n" +
                "                \"aid\": 52960737,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 8,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 684,\n" +
                "                \"pic\": \"//i2.hdslb.com/bfs/archive/2cc21e948d862c417cde835b0774a04e93052173.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"-\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"目标检测：M2Det\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1557217018,\n" +
                "                \"length\": \"35:37\",\n" +
                "                \"video_review\": 2,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 49,\n" +
                "                \"aid\": 51726239,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 7,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 926,\n" +
                "                \"pic\": \"//i0.hdslb.com/bfs/archive/12f92d4d3a72b105d6ae2ea8298f52e36acd8424.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"-\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"目标检测-Focal loss,RFBNet\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1556298584,\n" +
                "                \"length\": \"73:46\",\n" +
                "                \"video_review\": 2,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 59,\n" +
                "                \"aid\": 50577127,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 7,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 2612,\n" +
                "                \"pic\": \"//i2.hdslb.com/bfs/archive/2e9aa4e7599df27ea751ff019a86c36497460deb.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"-\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"人脸识别/对齐/验证（MTCNN+FaceNet）复现\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1555147836,\n" +
                "                \"length\": \"89:41\",\n" +
                "                \"video_review\": 2,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 151,\n" +
                "                \"aid\": 49179065,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 11,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 961,\n" +
                "                \"pic\": \"//i2.hdslb.com/bfs/archive/a028ede59d9c4a2b1c29c63c257f9b5d2db77dd8.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"第三集视频全是噪音，第三集只是搭建FC层，可以跳过\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"tensorflow实现目标跟踪GOTURN\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1554527751,\n" +
                "                \"length\": \"101:49\",\n" +
                "                \"video_review\": 6,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 66,\n" +
                "                \"aid\": 48458595,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 14,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 2020,\n" +
                "                \"pic\": \"//i0.hdslb.com/bfs/archive/010a4c01292adbf01f0d47ff70c1df85a6c8a74c.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"-\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"yolov2,v3（test+train）\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1553357760,\n" +
                "                \"length\": \"80:36\",\n" +
                "                \"video_review\": 5,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 91,\n" +
                "                \"aid\": 47148069,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 10,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 3336,\n" +
                "                \"pic\": \"//i1.hdslb.com/bfs/archive/3767d222037b30184f7750c3932d1b4db9a1fc22.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"hi\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"python：tensorflow实现yolov1\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1552299673,\n" +
                "                \"length\": \"90:49\",\n" +
                "                \"video_review\": 14,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 230,\n" +
                "                \"aid\": 45998222,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 36,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 1959,\n" +
                "                \"pic\": \"//i0.hdslb.com/bfs/archive/3e3c84e9cb518d7191fbf2800ada50944219c629.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"嗝，来晚了\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"python:tensorflow实现ssd（训练部分）\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1551935878,\n" +
                "                \"length\": \"34:38\",\n" +
                "                \"video_review\": 8,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 109,\n" +
                "                \"aid\": 45571739,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 56,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 9344,\n" +
                "                \"pic\": \"//i0.hdslb.com/bfs/archive/35d669ff583626adecf96f9310192564f1833a56.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"不定时更新\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"python:tensorflow实现ssd目标检测算法\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1550499748,\n" +
                "                \"length\": \"109:55\",\n" +
                "                \"video_review\": 74,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 612,\n" +
                "                \"aid\": 43996494,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 3,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 1520,\n" +
                "                \"pic\": \"//i2.hdslb.com/bfs/archive/991e9927fb7463d183755b34de345a165616c9f7.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"！\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"我们一起撸代码――tensorflow：alexnet做猫狗数据集\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1548526593,\n" +
                "                \"length\": \"44:19\",\n" +
                "                \"video_review\": 4,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 48,\n" +
                "                \"aid\": 41802900,\n" +
                "                \"hide_click\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"comment\": 6,\n" +
                "                \"typeid\": 124,\n" +
                "                \"play\": 1026,\n" +
                "                \"pic\": \"//i1.hdslb.com/bfs/archive/74b4fca8d22effbce9e34f5676830adcb89188f4.jpg\",\n" +
                "                \"subtitle\": \"\",\n" +
                "                \"description\": \"很是紧张。。\",\n" +
                "                \"copyright\": \"\",\n" +
                "                \"title\": \"keras,vgg\",\n" +
                "                \"review\": 0,\n" +
                "                \"author\": \"白博文的猫\",\n" +
                "                \"mid\": 347060865,\n" +
                "                \"is_union_video\": 0,\n" +
                "                \"created\": 1547982062,\n" +
                "                \"length\": \"27:18\",\n" +
                "                \"video_review\": 1,\n" +
                "                \"is_pay\": 0,\n" +
                "                \"favorites\": 25,\n" +
                "                \"aid\": 41228356,\n" +
                "                \"hide_click\": false\n" +
                "            }\n" +
                "        ],\n" +
                "        \"count\": 13,\n" +
                "        \"pages\": 1\n" +
                "    }\n" +
                "}";

        JSONObject json = JSONObject.parseObject(jsonStr);
        System.out.println(json);

        System.out.println(json.get("status"));

        JSONObject json_data = json.getJSONObject("data");
        System.out.println(json_data);
        System.out.println(json_data.get("count"));
        System.out.println(json_data.get("pages"));

        // 获取json数组test
        JSONArray json_data_vlist = json_data.getJSONArray("vlist");
        for (Object json_data_vlist_item : json_data_vlist) {
            json_data_vlist_item = (JSONObject) json_data_vlist_item;
            System.out.println(((JSONObject) json_data_vlist_item).getString("aid"));
        }

    }
}

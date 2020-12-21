package com.tyjw.inspectline.common.utils;

import com.tyjw.gofastdfs.GoFastdfsUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

@Slf4j
public class GoFastDfsUtil {

    public static void main(String[] args) {
        //文件地址
        File file = new File("E:\\image\\22.png");
        //声明参数集合
        HashMap<String, Object> paramMap = new HashMap<>();
        //文件
        paramMap.put("file", file);

        //输出
        paramMap.put("output","json");
        //自定义路径
//        paramMap.put("path","image");
        //场景
        paramMap.put("scene","test");
//        paramMap.put("auth_token","d4bcfe6ab16b74ae63e7b077db019751");

        //上传
//        String result= HttpUtil.post("http://119.57.164.153:18080/upload", paramMap);
//        String result= HttpUtil.post("http://192.168.1.51:18080/upload", paramMap);
//        String result= HttpUtil.post("http://116.178.68.235:8005/group1/upload", paramMap);
//        System.out.println(result);

        String GO_FASTDFS_URL="http://116.178.68.235:8005/group1";
        String GO_FASTDFS_PATH="";
        String GO_FASTDFS_SCENE="test";
        String GO_FASTDFS_SHOWURL="http://116.178.68.235:8005";
//        com.tyjw.gofastdfs.ResultInfo result = GoFastdfsUtil.uploadFile(GO_FASTDFS_URL, GO_FASTDFS_PATH, GO_FASTDFS_SCENE, file, GO_FASTDFS_SHOWURL);
        try {
            InputStream inputStream = new FileInputStream(file);
            com.tyjw.gofastdfs.ResultInfo result = GoFastdfsUtil.uploadInputStream(GO_FASTDFS_URL, GO_FASTDFS_PATH, GO_FASTDFS_SCENE, inputStream, GO_FASTDFS_SHOWURL);
            System.out.println(result.getReturnData());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



}

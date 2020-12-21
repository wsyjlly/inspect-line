package com.tyjw.inspectline.web.controller;

import cn.hutool.http.HttpUtil;
import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
public class UploadController {

    @Autowired
    private Constants constants;

    @Autowired
    private UploadService uploadService;


    @PostMapping(value = "/api/upload/one")
    public ResultInfo upload(@RequestParam("file") MultipartFile multipartFile) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        String url = uploadService.upload(multipartFile);
        if (null==url)
            resultInfo.setResultEnum(ResultEnum.FAIL);
        resultInfo.setReturnData(url);
        return resultInfo;
    }


    @PostMapping(value = "/api/upload/more")
    public ResultInfo filesUpload(@RequestParam("files") MultipartFile[] files) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        List<String> list = uploadService.filesUpload(files);
        if (null==list || list.size()==0)
            resultInfo.setResultEnum(ResultEnum.FAIL);
        resultInfo.setReturnData(list);
        return resultInfo;
    }


    @GetMapping(value = "/api/upload/test")
    public ResultInfo test() {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        //文件地址
        File file = new File("/data/tahe/server/1.jpg");
        //声明参数集合
        HashMap<String, Object> paramMap = new HashMap<>();
        //文件
        paramMap.put("file", file);
        //输出
        paramMap.put("output","json");
        //自定义路径

        //场景
        paramMap.put("scene","test");

        String result= HttpUtil.post("http://172.16.10.100:18081/upload", paramMap);
        //输出json结果
        System.out.println(result);
        resultInfo.setReturnData(result);
        return resultInfo;
    }

}

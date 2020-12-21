package com.tyjw.inspectline.service.impl;

import com.alibaba.fastjson.JSON;
import com.tyjw.gofastdfs.GoFastDfsUploadResult;
import com.tyjw.gofastdfs.GoFastdfsUtil;
import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UploadServiceImpl implements UploadService {
    @Autowired
    private Constants constants;

    @Override
    public String upload(MultipartFile multipartFile) {
        try {
            byte[] bytes = multipartFile.getBytes();
            InputStream inputStream = new ByteArrayInputStream(bytes);
            com.tyjw.gofastdfs.ResultInfo result = GoFastdfsUtil.uploadInputStream(constants.GO_FASTDFS_URL, constants.GO_FASTDFS_PATH, constants.GO_FASTDFS_SCENE, inputStream, constants.GO_FASTDFS_SHOWURL);
//            com.tyjw.gofastdfs.ResultInfo result = GoFastdfsUtil.uploadMultipartFile(constants.GO_FASTDFS_URL, constants.GO_FASTDFS_PATH, constants.GO_FASTDFS_SCENE, multipartFile, constants.GO_FASTDFS_SHOWURL);
            log.info("请求gofastdfs返回：{}", JSON.toJSONString(result));
            if (result.getState()==0){
                GoFastDfsUploadResult goFastDfsUploadResult = (GoFastDfsUploadResult) result.getReturnData();
                return goFastDfsUploadResult.getSrc();
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<String> filesUpload(MultipartFile[] files) {
        List<String> list = new ArrayList<>();
        //判断file数组不能为空并且长度大于0
        try {
            if(files!=null&&files.length>0){
                //循环获取file数组中得文件
                for(int i = 0;i<files.length;i++){
                    MultipartFile multipartFile = files[i];
                    String url = upload(multipartFile);
                    if (StringUtils.isNotBlank(url))
                        list.add(url);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

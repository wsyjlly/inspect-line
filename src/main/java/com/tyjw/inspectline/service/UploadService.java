package com.tyjw.inspectline.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UploadService {

    String upload(MultipartFile multipartFile);

    List<String> filesUpload(MultipartFile[] files);
}

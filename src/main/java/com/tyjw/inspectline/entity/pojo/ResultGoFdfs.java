package com.tyjw.inspectline.entity.pojo;

import java.io.Serializable;

public class ResultGoFdfs implements Serializable {
    private static final long serialVersionUID = 1L;

    private String url;//图片地址全路径
    private String md5;//加密
    private String path;//路径
    private String domain;//服务器ip和端口地址
    private String scene;//场景
    private Integer size;//文件大小
    private String mtime;//上传时间
    private String retmsg;//返回信息
    private int retcode;//返回码
    private String src;//

}

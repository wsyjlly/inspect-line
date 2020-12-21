package com.tyjw.inspectline.pdf.demo.util.pp;

public class Converter {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
//        String result = Html2pdfUtil.parseHtml2Pdf("https://www.baidu.com");
        String result = Html2pdfUtil.parseHtml2Pdf("F:/test/templates/pdfDemo02.html");
//        String result = Html2pdfUtil.parseHtml2Pdf("http://uav-xinjiang.oss-cn-beijing.aliyuncs.com/pic/pdfDemo02.html");
        long all = System.currentTimeMillis()- start;
        System.out.println("pdf生成地址:"+result+",用时:"+all/1000+"秒");
    }
}
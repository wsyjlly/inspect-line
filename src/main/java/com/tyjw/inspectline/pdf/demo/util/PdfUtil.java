package com.tyjw.inspectline.pdf.demo.util;

import com.itextpdf.text.pdf.BaseFont;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;
import java.util.Map;

/**
 * 通过FreeMarker生成PDF
 */
public class PdfUtil {

//    private static final String PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final String PATH = "F:\\test\\";

    private static final String TEMPLATE = PATH+"templates";//模板存储路径

    private static final String CONTRACT = PATH+"templates";//pdf生成路径

    //柱形图路径
    private static final String IMAGE_PATH = PATH+"static/images/";
    //字体路径
    private static final String TYPEFACE_PATH = PATH+"static/typeface/";

    private static final String PDFNAME = "pdfDemo02";//pdf文件名
    private static final String HTMLNAME = "report01";//html文件名

    public static void contractHandler(String templateName,
                                       Map<String, Object> paramMap) throws Exception {
        // 获取本地模板存储路径、合同文件存储路径
        String templatePath = TEMPLATE;
        String contractPath = CONTRACT;
        // 组装html和pdf合同的全路径URL
        String localHtmlUrl = contractPath +"/"+ HTMLNAME + ".html";
        String localPdfPath = contractPath ;
        // 判断本地路径是否存在如果不存在则创建
        File localFile = new File(localPdfPath);
        if (!localFile.exists()) {
            localFile.mkdirs();
        }
        String localPdfUrl = localFile +"/"+ PDFNAME + ".pdf";
        templateName = templateName + ".ftl";
        htmHandler(templatePath, templateName, localHtmlUrl, paramMap);// 生成html合同
        System.out.println("html生成成功");
//        pdfHandler(localHtmlUrl, localPdfUrl);// 根据html合同生成pdf合同
//        deleteFile(localHtmlUrl);// 删除html格式合同

//        System.out.println("PDF生成成功");
    }

    /**
     * 生成html合同
     * @param templatePath
     * @param templateName
     * @param htmUrl
     * @param paramMap
     * @throws Exception
     */
    private static void htmHandler(String templatePath, String templateName,
                                   String htmUrl, Map<String, Object> paramMap) throws Exception {
        Configuration cfg = new Configuration();
        cfg.setDefaultEncoding("UTF-8");
        cfg.setDirectoryForTemplateLoading(new File(templatePath));
        Template template = cfg.getTemplate(templateName);
        File outHtmFile = new File(htmUrl);
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outHtmFile)));
        template.process(paramMap, out);
        out.close();
    }

    /**
     * 根据html合同生成pdf合同
     * @param htmUrl
     * @param pdfUrl
     * @throws Exception
     */
    private static void pdfHandler(String htmUrl, String pdfUrl)
            throws Exception {
        File htmFile = new File(htmUrl);
        File pdfFile = new File(pdfUrl);
        String url = htmFile.toURI().toURL().toString();
        OutputStream os = new FileOutputStream(pdfFile);
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(url);

        org.xhtmlrenderer.pdf.ITextFontResolver fontResolver = renderer.getFontResolver();
        // 显示中文
        String fontPath=TYPEFACE_PATH+"simsun.ttc";
		fontResolver.addFont(fontPath,BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
		String imagePath = "file:"+IMAGE_PATH;
        //设置打印的图片的前缀--解决图片的相对路径问题---注意："file:/"必须存在
        renderer.getSharedContext().setBaseURL(imagePath);

        renderer.layout();
        try {
            renderer.createPDF(os);
        } catch (Exception e) {
            e.printStackTrace();
        }
        os.close();
    }

    /**
     * 删除html格式合同
     * @param fileUrl
     */
    private static void deleteFile(String fileUrl) {
        File file = new File(fileUrl);
        file.delete();
    }

}
package com.tyjw.inspectline.pdf.demo.util;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;

public class HtmUtil {

    /**
     * 生成html
     *
     * @param templatePath  模板路径
     * @param templateName  模板名称，包含后缀名 .ftl
     * @param localHtmlPath 生成html路径
     * @param localHtmlName 生成html名称，包含.html
     * @param paramMap
     * @throws IOException
     */
    public static File createHtm(String templatePath, String templateName, String localHtmlPath, String localHtmlName, Object paramMap) throws IOException {
        Writer out = null;
        try {
            Configuration cfg = new Configuration();
            cfg.setDefaultEncoding("UTF-8");
            cfg.setDirectoryForTemplateLoading(new File(templatePath));
            Template template = cfg.getTemplate(templateName);
            File outHtmFile = new File(localHtmlPath + localHtmlName);
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outHtmFile)));
            template.process(paramMap, out);
            System.out.println("html生成成功");
            return outHtmFile;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null)
                out.close();
        }
        return null;
    }


}

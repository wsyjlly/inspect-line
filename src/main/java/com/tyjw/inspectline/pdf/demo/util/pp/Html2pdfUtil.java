package com.tyjw.inspectline.pdf.demo.util.pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 转换html为pdf
 * @author Zachary46
 */
public class Html2pdfUtil {

    public static String parseHtml2Pdf(String url) throws IOException {
        System.out.println(url);
        Runtime rt = Runtime.getRuntime();
//        Process p = rt.exec("F:/test/phantomjs-2.1.1-windows/bin/html2pdf.js "+url);
        Process p = rt.exec("F:/test/phantomjs-2.1.1-windows/bin/phantomjs F:/test/phantomjs-2.1.1-windows/bin/html2pdf.js "+url);
        InputStream is = p.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuffer sbf = new StringBuffer();
        String tmp = "";
        while ((tmp = br.readLine()) != null) {
            sbf.append(tmp);
        }
        String resultstr = sbf.toString();
        System.out.println("resultstr:"+resultstr);
        String[] arr = resultstr.split("\\$");
        String result = "";
        for(String s : arr){
            if(s.endsWith("pdf"))result = s;
        }
        return result;
    }
}

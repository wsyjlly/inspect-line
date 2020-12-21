package com.tyjw.inspectline.pdf.demo.util;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

import java.awt.*;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther:
 * @Date: 2019/12/05/16:34
 * @Description:
 */
public class ImageUtil {

    private static final String PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    //柱形图路径
    private static final String IMAGE_PATH = PATH+"static/images/";

    public String getImage(CategoryDataset dataset,String imageName) throws Exception {
        //创建主题样式
        StandardChartTheme standardChartTheme=new StandardChartTheme("CN");
        //设置标题字体
        standardChartTheme.setExtraLargeFont(new Font("隶书",Font.BOLD,20));
        //设置图例的字体
        standardChartTheme.setRegularFont(new Font("宋书",Font.PLAIN,15));
        //设置轴向的字体
        standardChartTheme.setLargeFont(new Font("宋书",Font.PLAIN,15));
        //应用主题样式
        ChartFactory.setChartTheme(standardChartTheme);
        JFreeChart chart = ChartFactory.createBarChart3D(
                "", // 图表标题
                "", // 目录轴的显示标签
                "单位:%", // 数值轴的显示标签
                dataset, // 数据集
                PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                true,  // 是否显示图例(对于简单的柱状图必须是 false)
                false, // 是否生成工具
                false  // 是否生成 URL 链接
        );

        FileOutputStream fos_jpg = null;
        String path = IMAGE_PATH+imageName+".jpg";
        try {
            fos_jpg = new FileOutputStream(path);
            ChartUtilities.writeChartAsJPEG(fos_jpg,chart,400,300);
        } finally {
            try {
                fos_jpg.close();
            } catch (Exception e) {}
        }
        return path;
    }

}
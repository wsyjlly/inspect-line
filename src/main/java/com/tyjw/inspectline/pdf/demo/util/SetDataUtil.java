package com.tyjw.inspectline.pdf.demo.util;

import com.tyjw.inspectline.pdf.demo.bean.Person;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther:
 * @Date: 2019/12/06/9:26
 * @Description:
 */
public class SetDataUtil {

    private static final String IMAGE_NAME_ONE = "one";
    private static final String IMAGE_NAME_TWO = "two";

    public static void setTempData(Map<String, Object> map) throws Exception {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Person("张三",i,"男"));
        }
        map.put("persons",list);
        map.put("name","aa");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        SetDataUtil.getDataSet2(dataset);
//        new ImageUtil().getImage(dataset, IMAGE_NAME_ONE);
//        new ImageUtil().getImage(dataset, IMAGE_NAME_TWO);
    }
    /**
     * 获取一个演示用的组合数据集对象
     *
     * @return
     */
    public static void getDataSet2(DefaultCategoryDataset dataset) {
        dataset.addValue(1.2, "男性", "0~39岁");
        dataset.addValue(2.2, "女性", "0~39岁");
        dataset.addValue(3.2, "合计", "0~39岁");
        dataset.addValue(1.2, "男性", "40~59岁");
        dataset.addValue(4.2, "女性", "40~59岁");
        dataset.addValue(5.2, "合计", "40~59岁");
        dataset.addValue(2.2, "男性", "60岁以上");
        dataset.addValue(1.2, "女性", "60岁以上");
        dataset.addValue(3.2, "合计", "60岁以上");
    }


}
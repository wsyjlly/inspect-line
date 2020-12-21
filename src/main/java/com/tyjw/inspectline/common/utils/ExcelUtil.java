package com.tyjw.inspectline.common.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelUtil {


    /**
     * 这个inputStream文件可以来源于本地文件的流，
     * 也可以来源与上传上来的文件的流，也就是MultipartFile的流，
     * 使用getInputStream()方法进行获取。
     * 然后再读取文件的时候，应该excel文件的后缀名在不同的版本中对应的解析类不一样
     * 要对fileName进行后缀的解析
     */
    public static Map<Integer,List<String>> readExcelFile(InputStream inputStream, String fileName) {
        Map<Integer,List<String>> map = new HashMap<>();
        Workbook workbook = null;
        try {
            //判断什么类型文件
            if (fileName.endsWith(".xls")) {
                workbook = new HSSFWorkbook(inputStream);
            } else if (fileName.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(inputStream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (workbook == null) {
            return null;
        } else {
            //获取所有的工作表的的数量
            int numOfSheet = workbook.getNumberOfSheets();
            System.out.println(numOfSheet + "--->numOfSheet");
            //遍历表
            for (int i = 0; i < numOfSheet; i++) {
                //获取一个sheet也就是一个工作本。
                Sheet sheet = workbook.getSheetAt(i);
                if (sheet == null) continue;
                //获取一个sheet有多少Row
                int lastRowNum = sheet.getLastRowNum();
                if (lastRowNum == 0) continue;
                Row row;
                for (int j = 1; j <= lastRowNum; j++) {
                    row = sheet.getRow(j);
                    if (row == null) {
                        continue;
                    }
                    List<String> list = new ArrayList<>();
                    //获取一个Row有多少Cell
                    short lastCellNum = row.getLastCellNum();
                    for (int k = 0; k <= lastCellNum; k++) {
                        if (row.getCell(k) == null) {
                            continue;
                        }
                        row.getCell(k).setCellType(Cell.CELL_TYPE_STRING);
                        String res = row.getCell(k).getStringCellValue().trim();
                        //打印出cell(单元格的内容)
//                        System.out.println(res);
                        list.add(res);
                    }
                    map.put(row.getRowNum(),list);
                }
            }
        }
        return map;
    }


    /**
     * 这个outputstream可以来自与文件的输出流，
     * 也可以直接输出到response的getOutputStream()里面
     * 然后用户就可以直接解析到你生产的excel文件了
     */
    public static void writeExcel(OutputStream outputStream) {
        Workbook wb = new SXSSFWorkbook(100);
        //创建一个工作本
        Sheet sheet = wb.createSheet("sheet");

        //通过一个sheet创建一个Row
        Row row = sheet.createRow(0);

        for (int i = 0; i < 10; i++) {
            //通过row创建一个cell
            Cell cell = row.createCell(i);
            cell.setCellValue("这是第" + i + "个cell");
        }
        try {
            wb.write(outputStream);
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //F:\workspaces\油气管道巡线\无人机基础资料-新
        /*File file = new File("F:\\workspaces\\油气管道巡线\\无人机基础资料-新\\高后果区.xls");
        try {
            InputStream inputStream = new FileInputStream(file);
            Map<Integer, List<String>> map = readExcelFile(inputStream, "高后果区.xls");
            System.out.println(map);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        String str = "重要设施区  环境敏感区";
        String[] split = str.split(" ");
        System.out.println(split.length);
    }
}

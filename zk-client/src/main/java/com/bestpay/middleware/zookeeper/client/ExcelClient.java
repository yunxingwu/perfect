package com.bestpay.middleware.zookeeper.client;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by  wuyunxing on   2016/5/31.
 */

public class ExcelClient {
    private HSSFWorkbook wb;
    private HSSFSheet sheet;
    public ExcelClient(){
        //创建HSSFWorkbook对象
         wb = new HSSFWorkbook();
        //创建HSSFSheet对象
         sheet = wb.createSheet("sheet0");
        sheet.setDefaultColumnWidth(45);
        //创建HSSFRow对象
        HSSFRow row = sheet.createRow(0);
        //创建HSSFCell对象
        row.createCell(0).setCellValue("服务名称");
        row.createCell(1).setCellValue("consumer");
        row.createCell(2).setCellValue("provider");
    }

    public void start() throws IOException {
        FileOutputStream output=new FileOutputStream("/home/bppf_inf/workbook.xls");
        wb.write(output);
        output.flush();
    }

    public void close() throws IOException {
        wb.close();
    }

    public HSSFWorkbook getWb() {
        return wb;
    }

    public void setWb(HSSFWorkbook wb) {
        this.wb = wb;
    }

    public HSSFSheet getSheet() {
        return sheet;
    }

    public void setSheet(HSSFSheet sheet) {
        this.sheet = sheet;
    }

    public static void main(String[] args) throws IOException {
        ExcelClient excelClient = new ExcelClient();
        //输出Excel文件

    }

}

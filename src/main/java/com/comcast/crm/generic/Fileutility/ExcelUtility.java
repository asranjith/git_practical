package com.comcast.crm.generic.Fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
    public String readDataFromExcel(String sheetName,int rowNum,int columnNum) throws EncryptedDocumentException, IOException {
    	FileInputStream file = new FileInputStream("./TestData/Test_Script_Data.xlsx");
    	Workbook workbook = WorkbookFactory.create(file);
    	Sheet sheet = workbook.getSheet(sheetName);
    	Row row = sheet.getRow(rowNum);
    	Cell cell = row.getCell(columnNum);
    	String data = cell.getStringCellValue();
    	workbook.close();
    	return data;
    }
    public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
    	FileInputStream file = new FileInputStream("./TestData/Test_Script_Data.xlsx");
    	Workbook workbook = WorkbookFactory.create(file);
    	Sheet sheet = workbook.getSheet(sheetName);
    	int lastRowNum = sheet.getLastRowNum();
    	workbook.close();
    	return lastRowNum;
    }
    public void writeDataIntoExcel(String sheetName,int rowNum,int columnNum,String data) throws EncryptedDocumentException, IOException {
    	FileInputStream file = new FileInputStream("./TestData/Test_Script_Data.xlsx");
    	Workbook workbook = WorkbookFactory.create(file);
    	Cell cell = workbook.getSheet(sheetName).getRow(rowNum).createCell(columnNum);
    	cell.setCellValue(data);
    	FileOutputStream fos=new FileOutputStream("./TestData/Test_Script_Data.xlsx");
    	workbook.write(fos);
    	workbook.close();
    	
    }
    public String readDataFromExcelWithCondition(String expectedTestId,String sheetName,int column) throws EncryptedDocumentException, IOException {
        String data1=" ";
       FileInputStream file=new FileInputStream("./TestData/Test_Script_Data.xlsx");
       Workbook workbook = WorkbookFactory.create(file);
       Sheet sheet = workbook.getSheet(sheetName);
       int lastRowNum = sheet.getLastRowNum();
       for(int i=0;i<=lastRowNum;i++) {
    	   String data=" ";
    	   try {
    		   data=sheet.getRow(i).getCell(0).toString();
    		   if(data.equals(expectedTestId)) {
    			 data1=sheet.getRow(i).getCell(column).toString();
    		   }
    		   
    	   }catch (Exception e) {}
      }
       workbook.close();
       return data1;
    }
}

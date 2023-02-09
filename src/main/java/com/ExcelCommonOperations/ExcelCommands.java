package com.ExcelCommonOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCommands {

	private static FileInputStream excelFile;
	private static FileOutputStream excelSaveFile;
	private static XSSFWorkbook workbook;
	private static XSSFSheet workBookSheet;
	
    public static void loadExcelFile(String excelFilePath,String sheetName) throws IOException {
    	
    	excelFile=new FileInputStream(excelFilePath);
    	workbook=new XSSFWorkbook(excelFile);
    	workBookSheet=workbook.getSheet(sheetName);
    	
    }
    
	public static String getStringCellValue(int rowIndex,int cellIndex) {
		
		XSSFRow row=workBookSheet.getRow(rowIndex);
		XSSFCell rowOfCell=row.getCell(cellIndex);
		String cellValue=rowOfCell.getStringCellValue();
		return cellValue;
	}
	
	public static void setStringCellValue(int rowIndex,int cellIndex,String cellData) {
		
		XSSFRow row=workBookSheet.getRow(rowIndex);
		XSSFCell cellOfRow=row.createCell(cellIndex);
        cellOfRow.setCellValue(cellData);		
        
	}
	
	public static void excelSave(String excelSaveFilePath) throws IOException {
		excelSaveFile=new FileOutputStream(excelSaveFilePath);
		workbook.write(excelSaveFile);
		excelSaveFile.close();
	}
	
}

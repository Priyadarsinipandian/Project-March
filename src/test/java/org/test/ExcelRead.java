package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\PRIYA\\eclipse-workspace\\Maven\\excel\\ssexcel.xlsx");
	
	FileInputStream stream=new FileInputStream(file);
	
	Workbook b=new XSSFWorkbook(stream);
	
	Sheet sheet = b.getSheet("Sheet1");
	
	Row row = sheet.getRow(1);
	
	Cell cell = row.getCell(1);
	
	String s = cell.getStringCellValue();
	
	System.out.println(s);
}
}

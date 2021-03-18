package org.excelread;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewSheet {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\PRIYA\\eclipse-workspace\\Maven\\excel\\ssexcel.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook b=new XSSFWorkbook(stream);
		Sheet createsheet=b.createSheet("Data");
//		createsheet.getSheetName("Data");
		Row createrow=createsheet.createRow(0);
		Cell createcell=createrow.createCell(3);
		createcell.setCellValue("Javaaaa");
		FileOutputStream stream2=new FileOutputStream(file);
		b.write(stream2);
	}
}

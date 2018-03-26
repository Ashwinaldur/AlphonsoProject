package com.alphonso.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static   String getdata(String filepath , String sheetName , int row , int cell) throws IOException
	{
		try
		{
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		XSSFRow rw = sheet.getRow(row);
		XSSFCell cl = rw.getCell(cell);
		String data = cl.getStringCellValue();
		return data;
		}
		catch(Exception e)
		{
			return "";
		}
	}

}

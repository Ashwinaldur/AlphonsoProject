package com.alphonso.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.alphonso.pages.AssetSearchPage;

public class ExcelData extends BaseTest  {

	public static void assetSearch() throws IOException, InterruptedException
	{	
	  AssetSearchPage asp = new AssetSearchPage(driver);
	  asp.clickOnSearch();
	  File file = new File("D:\\ProjectManagement\\Alphonso\\Data\\input.xlsx" );
	  FileInputStream fis = new FileInputStream(file);
	  XSSFWorkbook wbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = wbook.getSheet("Asset");
	  int lastrow = sheet.getLastRowNum();
	  for(int i = 1 ; i<=lastrow; i++)	
	  {
			XSSFRow Row = sheet.getRow(i);
		    String Headend = Row.getCell(0).getStringCellValue();
		    asp.enterHeadend(Headend);
		    String paidID = Row.getCell(1).getStringCellValue();
		    asp.enterPaid(paidID);
		    asp.clickOnAssetSearch(); 
		    asp.ScrollDown();
		    boolean present = asp.checkActive();
		    System.out.println(present);
		    if(present==true)
		    {
		    	 sheet.getRow(i).createCell(2).setCellValue("Asset is Present");
		    	 FileOutputStream fout=new FileOutputStream(new File("D:\\ProjectManagement\\Alphonso\\Data\\input.xlsx"));
		    	 wbook.write(fout);
		    }
		    else
		    {
		    	sheet.getRow(i).createCell(2).setCellValue("Asset is not Present");
		    	FileOutputStream fout=new FileOutputStream(new File("D:\\ProjectManagement\\Alphonso\\Data\\input.xlsx"));
		    	wbook.write(fout);
		    }
		    asp.RemoveHeadend();
		    asp.RemovePaid();
		    
	  }
	 	
	}	
	
}

	
	


	//To write the data
	//public static void writedata(String filepath , String sheetName , int row , int cell) throws IOException
		//{
		//File file = new File(filepath);
		//FileInputStream fis = new FileInputStream(file);
		//XSSFWorkbook wb= new XSSFWorkbook(fis);
		//XSSFSheet sheet = wb.getSheet(sheetName);
		//sheet.getRow(row).createCell(cell).setCellValue("Asset is present");
		//FileOutputStream fout = new FileOutputStream(file);
		//wb.write(fout);
		//wb.close();
		
	
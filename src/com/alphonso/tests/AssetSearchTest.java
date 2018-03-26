package com.alphonso.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.alphonso.generic.BaseTest;
import com.alphonso.generic.ExcelData;
import com.alphonso.pages.AssetSearchPage;
import com.alphonso.pages.LoginPage;

public class AssetSearchTest extends BaseTest {
	
		@Test(priority = 2)
	public void assetSearch() throws IOException, InterruptedException
	{
	String headend = ExcelData.getdata(file_path, "Asset", 1, 0);
	String PackageID  = ExcelData.getdata(file_path, "Asset", 1, 1);
	AssetSearchPage asp = new AssetSearchPage(driver);
	asp.clickOnSearch();
	Thread.sleep(2000);
	asp.enterHeadend(headend);
	Thread.sleep(2000);
	asp.enterPaid(PackageID);
	Thread.sleep(2000);
	asp.clickOnAssetSearch();
	Thread.sleep(2000);
	asp.clickOnInfo();

	}
	}


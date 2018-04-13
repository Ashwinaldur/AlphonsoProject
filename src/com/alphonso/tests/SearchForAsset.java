package com.alphonso.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.alphonso.generic.BaseTest;
import com.alphonso.generic.ExcelData;

@Listeners(com.alphonso.generic.ListenerTest.class)

 public class SearchForAsset extends BaseTest
 {
	 @Test
	 public void alphonsoSearch() throws IOException, InterruptedException
	 {
		 ExcelData.assetSearch();

		 
	 }

 }
 
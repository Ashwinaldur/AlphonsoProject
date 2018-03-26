package com.alphonso.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant{
 public static WebDriver driver ;
	@BeforeMethod
	public void precondition()
	{   
		System.setProperty(gecko_key, gecko_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://alphonso-stackc.engprod-charter.net/alphonso-web/#/login/");
	}
	//@AfterMethod
	//public void postcondition()
	
	//{
	//	driver.close();
//	}

}

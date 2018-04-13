package com.alphonso.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.alphonso.pages.LoginPage;

public abstract class BaseTest implements AutoConstant{
 public static  WebDriver driver ;
	@BeforeMethod
	public void precondition() throws IOException, InterruptedException
	{   
		System.setProperty(gecko_key, gecko_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://alphonso-stackc.engprod-charter.net/alphonso-web/#/login/");
		String username1 = "alphonso-user";
		String password1 = "password";
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username1);
		lp.enterPassword(password1);
		lp.clickLogin();
	}
	@AfterMethod
	public void postcondition()
	
	{
		driver.close();
	}

}

package com.alphonso.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.alphonso.generic.BaseTest;
import com.alphonso.generic.ExcelData;
//import com.alphonso.pages.LoginPage;
import com.alphonso.pages.LoginPage;

public class LoginTest extends BaseTest 
{
	@Test(priority = 1)
public void login() throws IOException, InterruptedException
{
String username1 = ExcelData.getdata(file_path, "Login", 1, 0);
String password1 = ExcelData.getdata(file_path, "Login", 1, 1);
LoginPage lp = new LoginPage(driver);
lp.enterUsername(username1);
lp.enterPassword(password1);
lp.clickLogin();

}
}

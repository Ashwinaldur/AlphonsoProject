package com.alphonso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetSearchPage {
	
	@FindBy(xpath = "//span[.='VOD Asset Search']")
	private WebElement assetsearch;
	
	@FindBy(xpath = "/html/body/div[1]/al-menu/ch-menu/div/section/ac-search/div/al-vod-assets/div[1]/div/ac-filters/div/div[2]/form/div[1]/div[1]/div[2]/div/div/div/div/div/tags-input/div/div/input")
	private WebElement head;
	
	@FindBy(xpath = "//span[.='ctec_a6h1']")
	private WebElement headclick;
	
	@FindBy(xpath = "/html/body/div[1]/al-menu/ch-menu/div/section/ac-search/div/al-vod-assets/div[1]/div/ac-filters/div/div[2]/form/div[1]/div[4]/div/div/div/div/div/div/tags-input/div/div/input")
	private WebElement paid;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement search;
	
	@FindBy(xpath = "//i[@class='fa fa-info-circle']")
	private WebElement info;
	
	public  AssetSearchPage(WebDriver driver)
	{
	Super(driver);
		PageFactory.initElements(driver,this);
	}

	private void Super(WebDriver driver)
	{
		// TODO Auto-generated method stub	
	}	
	public void clickOnSearch()
	{
		assetsearch.click();
	}
	public void enterHeadend(String headend)
	{
		head.sendKeys(headend);
	}
	public void headendClick()
	{
		headclick.click();
	}
	public void enterPaid(String paid1)
	{
		paid.sendKeys(paid1);
	}
	public void clickOnAssetSearch()
	{
		search.click();
	}
	public void clickOnInfo()
	{
		info.click();
	}
}

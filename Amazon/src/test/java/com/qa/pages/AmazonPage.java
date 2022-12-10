package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage 
{
	WebDriver driver ;
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchbox;
	public WebElement getSearchbox()
	{
		return searchbox;
	}
/*@FindBy(id="nav-search-submit-button")
WebElement mgnbtn;
public WebElement GetMagnButton()
{
	return mgnbtn;
}*/
public AmazonPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}


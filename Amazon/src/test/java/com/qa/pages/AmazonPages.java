package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPages {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchbox;
	
	public WebElement SearchBox()
	{
		return searchbox;
	}

}

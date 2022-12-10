package com.qa.testscripts;

import java.util.List;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonSignIn;

public class TC_AmazonSearch_002 extends TestBase {
	AmazonSignIn amz;
	
	@Parameters({"Browser","Url"})
	@Test
	
	public void Search(String browser,String Url) throws InterruptedException {
		amz=new AmazonSignIn(driver);
		//amz.SearchBox2().sendKeys("amazon"+Keys.ENTER);
		//amz.amznpg1().click();
		//Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in");
		amz.amznsearch().sendKeys("iphone");
		List<WebElement> alllist=amz.Dropdown2();
		for(WebElement list:alllist)
		{
			System.out.println(list.getText());
		}
		
		//driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("===========TC2==========");
		
		Thread.sleep(2000);
		}

}

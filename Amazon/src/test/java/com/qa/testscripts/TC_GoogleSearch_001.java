package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonSignIn;

public class TC_GoogleSearch_001 extends TestBase{
	AmazonSignIn amz;
	
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String browser,String Url) throws InterruptedException {
		amz=new AmazonSignIn(driver);
		amz.SearchBox1().sendKeys("Samsung mobile");
		
		Thread.sleep(3000);
		List<WebElement> alllist=amz.Dropdown1();
		for(WebElement list1:alllist)
		{
			System.out.println(list1.getText());
		}
		Thread.sleep(3000);
		//amz.SearchBox1().clear();
		System.out.println("=================TC1==============");
	
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		
	}		
	
	

}

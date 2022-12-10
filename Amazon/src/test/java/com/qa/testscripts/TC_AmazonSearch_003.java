package com.qa.testscripts;

//import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonSignIn;

public class TC_AmazonSearch_003 extends TestBase{
	AmazonSignIn amz;
	
	@Parameters({"Browser","Url"})
	@Test
	
	public void Search(String browser,String Url) throws InterruptedException {
		amz=new AmazonSignIn(driver);
		
		//amz.SearchBox3().sendKeys("amazon"+Keys.ENTER);
		//amz.amznpg2().click();
		//Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.in");
		amz.signup().click();
		Thread.sleep(2000);
		amz.createAccount().click();
		Thread.sleep(2000);
		amz.fname().sendKeys("Supithaa");
		amz.mobno().sendKeys("9500980239");
		amz.email().sendKeys("19p244@kce.ac.in");
		amz.getpassword().sendKeys("4444#SUPI");
		Thread.sleep(1000);
		amz.continue1().click();
		Thread.sleep(1000);
		System.out.println("===========TC3==========");
		
		Thread.sleep(2000);
		
		
		
	}
	

}

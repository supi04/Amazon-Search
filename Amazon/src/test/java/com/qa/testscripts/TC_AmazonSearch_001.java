package com.qa.testscripts;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPage;

public class TC_AmazonSearch_001 extends TestBase{
	//public static void main(String args[]) {
	AmazonPage amzpg;
	@Parameters({"Browser","Url"})
@Test
public void search(String browser,String Url) throws InterruptedException
{
	amzpg = new AmazonPage(driver);
	amzpg.getSearchbox().sendKeys("da vince code"+Keys.ENTER);
	//amzpg.GetMagnButton().click();
	Thread.sleep(5000);
	String title=driver.getTitle();
	if(title.contains("da vince code"))
		System.out.println("Landed on da vince code page");
	else
		System.out.println("Not landed on da vince code page");
}
}

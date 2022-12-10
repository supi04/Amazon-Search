package com.qa.testscripts;

/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[]args) {
		ChromeDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver","/Users/supithaadhakshinamurthi/ECLIPSEpg/Amazon/target/chromedriver 1");
		driver =new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.findElement(By.xpath(")))
		
	}

}*/

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Gmail {
public static void main(String[]args) throws InterruptedException {
EdgeDriver driver=null;

//System.setProperty("webdriver.chrome.driver","/Users/supithaadhakshinamurthi/ECLIPSEpg/Amazon/target/msedgedriver" );
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();
driver.get("https://mail.google.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("19p244@kce.ac.in");
driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("XXXYYY..");
driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/span")).click();
Thread.sleep(5000);
}
}

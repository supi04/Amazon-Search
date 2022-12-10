package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AmazonLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = null;
    String browser="Chrome";
    if(browser.equalsIgnoreCase("chrome")) 
    {
 	   WebDriverManager.chromedriver().setup();
 	   driver=new ChromeDriver();
    }
    driver.get("http://www.amazon.in");
    Thread.sleep(5000);
    String title=driver.getTitle();
    System.out.println(title);
    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("Samsung Mobile Phone");
    WebElement mgnbtn=driver.findElement(By.id("nav-search-submit-button"));
    mgnbtn.click();
    Thread.sleep(5000);
    title=driver.getTitle();
    System.out.println(title);
    driver.close();
    
    
   
    String browser1="edge";
    EdgeDriver driver1 = null;
    if(browser1.equalsIgnoreCase("edge")) 
    {
    	WebDriverManager.edgedriver().setup();
  	   driver1=new EdgeDriver();
    
    }
    driver1.get("http://www.amazon.in");
    Thread.sleep(5000);
    String title1=driver1.getTitle();
    System.out.println(title1);
    WebElement search1=driver1.findElement(By.id("twotabsearchtextbox"));
   search1.sendKeys("Samsung Mobile Phone");
    WebElement mgnbtn1=driver1.findElement(By.id("nav-search-submit-button"));
    mgnbtn1.click();
    Thread.sleep(5000);
    title1=driver1.getTitle();
    System.out.println(title1);

    driver1.close();
    
    
    
   
    String browser11="firefox";
    FirefoxDriver driver11 = null;
    if(browser11.equalsIgnoreCase("firefox")) 
    {
    System.setProperty("webdriver.gecko.driver", "D:\\Google drivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");
driver11=new FirefoxDriver();
    
    }
    driver11.get("http://www.amazon.in");
    
    String title11=driver11.getTitle();
    System.out.println(title11);
    WebElement search11=driver11.findElement(By.id("twotabsearchtextbox"));
   search11.sendKeys("Samsung Mobile Phone");
    WebElement mgnbtn11=driver11.findElement(By.id("nav-search-submit-button"));
    mgnbtn11.click();
    
    title11=driver11.getTitle();
    System.out.println(title11);

    driver11.close();


}
}
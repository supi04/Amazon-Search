package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonhomepage {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           WebDriver driver = null;
           String browser="Chrome";
           if(browser.equalsIgnoreCase("chrome")) {
        	   WebDriverManager.chromedriver().setup();
        	   driver=new ChromeDriver();
           }
           else if(browser.equalsIgnoreCase("Edge"))
           {
        	   WebDriverManager.edgedriver().setup();
        	   driver=new EdgeDriver();
        	   
           }
           
           driver.get("https://www.google.com/");
           driver.manage().window().maximize();
           //driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
           //Thread.sleep(1000);
           
           driver.findElement(By.name("q")).sendKeys("Samsung mobiles");
           //Object s;
           Select s=new Select(driver.findElement(By.id("")));
		   List<WebElement> dd_options= s.getOptions();
		   for(WebElement e : dd_options) {
			   System.out.println(e.getText());
		   }
           driver.close();
           
	}
}

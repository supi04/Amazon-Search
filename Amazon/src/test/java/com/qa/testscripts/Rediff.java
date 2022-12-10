package com.qa.testscripts;

/*import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver=null;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath(null)))
}
}*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {
public static void main(String[] args) throws InterruptedException {

ChromeDriver driver=null;
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
/*String browser="Chrome";

if(browser.equalsIgnoreCase("Chrome"))
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
}
else if(browser.equalsIgnoreCase("Edge"))
{
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();
}*/
driver.get("https://www.rediff.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("Supithaa");
driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("supithaa");
driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[2]")).click();
driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("Supithaa#4444");
driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("Supithaa#4444");
driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).sendKeys("supidhakshin@gmail.com");
driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9500980239");
driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("India");
Thread.sleep(5000);
//driver.quit();
//WebElement city=driver.findElement(By.xpath(""));
 //city.sendKeys("coimbatore");
}









}


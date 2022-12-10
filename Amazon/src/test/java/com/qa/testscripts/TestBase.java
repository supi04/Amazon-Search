package com.qa.testscripts;



//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import com.qa.pages.AmazonPage;
import com.qa.pages.AmazonSignIn;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	AmazonSignIn r;
	WebDriver driver;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void SetUp(String Browser,String Url) throws  InterruptedException
	{
		if(Browser.equalsIgnoreCase("Chrome")) 
		{
     	   WebDriverManager.chromedriver().setup();
     	   driver=new ChromeDriver();
        }
        else  if(Browser.equalsIgnoreCase("Edge"))
        {
     	   WebDriverManager.edgedriver().setup();
     	   driver=new EdgeDriver();
     	}
        else if(Browser.equalsIgnoreCase("Firefox"))
        {
           WebDriverManager.firefoxdriver().setup();
      	   driver=new FirefoxDriver();
        }
		r=new AmazonSignIn(driver);
		Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.get(Url); 
	}
	
	// Loc for post conditions
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		driver.close();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		String Browser=sc.nextLine();
		
		WebDriver driver=null;
		if(Browser.equalsIgnoreCase("Chrome")) 
		{
     	   WebDriverManager.chromedriver().setup();
     	   driver=new ChromeDriver();
        }
        else if(Browser.equalsIgnoreCase("Edge"))
        {
     	   WebDriverManager.edgedriver().setup();
     	   driver=new EdgeDriver();
     	}
        else if(Browser.equalsIgnoreCase("Firefox"))
        {
           WebDriverManager.iedriver().setup();
      	   driver=new FirefoxDriver();
        }
        
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
        AmazonPages pages=new AmazonPages();
        pages.SearchBox();
        sc.close();
	}

}*/

/*package com.qa.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonSignIn;
//import com.qa.pages.Newregistration;

public class TC_AmazonSignIn extends TestBase {
	
	AmazonSignIn pages;
	
	@Parameters({"Browser","Url"})
	@Test
	public void Test() throws InterruptedException
	{
		
		 pages=new AmazonSignIn(driver);
		 //pages.searchbox().sendKeys("amazon.in"+Keys.ENTER);
		 pages.signup().click();
		 //Thread.sleep(1000);
		// pages.amzpage().click();
		 Thread.sleep(2000);
		 pages.createAccount().click();
		 Thread.sleep(2000);
		 pages.Fname().sendKeys("Supithaa");
		 pages.Mobileno().sendKeys("9500980239");
         pages.Email().sendKeys("19p244@kce.ac.in");
		 pages.password().sendKeys("Supi#2001");
		 Thread.sleep(2000);
		 pages.continue1().click();
		 Thread.sleep(2000);

		 

}
}*/

/*package com.qa.testscripts;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.AmazonSignIn;
public class TC_AmazonSignIn  extends TestBase{

AmazonSignIn pages;
@Parameters({"browser","url"})
@Test
public void Search(String browser,String Url) throws InterruptedException
{
pages = new AmazonSignIn(driver);
pages.getSearchBox().sendKeys("Da Vince Code"+Keys.ENTER);
Thread.sleep(5000);
String title=driver.getTitle();
System.out.println("==========TEST CASE 001=========");
if(title.contains("Da Vince Code"))
System.out.println("User Landed on Da Vince Code page");
else
System.out.println("User NOT Landed on Da Vince Code page"); 
}

@Parameters({"browser","url"})
@Test
public void signIn(String browser,String url)
{

pages = new AmazonSignIn(driver);
Actions action = new Actions(driver);
action.moveToElement(pages.getcursorTouch()).build().perform();
pages.getclickLink().click();
pages.getname().sendKeys("vijay");
pages.getphoneNumber().sendKeys("9361334647");
pages.getpassword().sendKeys("12636Vijay");
pages.getsubmit().click();
System.out.println("==========TEST CASE 002=========");
String title = driver.getTitle();
if(title.contains("required"))
{
System.out.println("can not move here after");
}
else
{
System.out.println("phone no in use plz use alternate phn no");
}
 
}
@Parameters({"browser","url"})
@Test
public void amazonSuggestions(String browser,String url) throws InterruptedException
{
pages = new AmazonSignIn(driver);
pages.getSearchBox().clear();
pages.getSearchBox().sendKeys("samsung");
Thread.sleep(5000);
List <WebElement>suggestions=pages.getSearchSugesstions();
for(WebElement result:suggestions)
{
System.out.println(result.getText());
String text = result.getText();
if(text.contains("ultra"))
{
result.click();
break;
}
}
String title = driver.getTitle();
System.out.println("==========TEST CASE 003=========");
System.out.println(title);
if(title.contains("ultra"))
{
System.out.println("page is on samsung ultra");
}
else
{
System.out.println("plz choose another option");
}
System.out.println("================TEXT OF THE PAGE==================");
System.out.println(pages.getallText());
}
    
}
*/



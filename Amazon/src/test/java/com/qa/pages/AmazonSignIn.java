/*package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignIn {
	WebDriver driver;
	 
	 
	/* @FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	 WebElement searchbox;
	 public WebElement searchbox() {
		return searchbox;
		 
	 }
	
	 @FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/*[1]")
	 WebElement amzpage;
	 public WebElement amzpage() {
		return amzpage;
		 
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"nav-signin-tooltip\"]/a/span")
	 WebElement signup;
	 public WebElement signup() {
		return signup;
		 
	 }
	 
	 
	 @FindBy(id="createAccountSubmit")
	 WebElement createAccount;
	 public WebElement createAccount() {
		return createAccount;
		 
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	 WebElement Fname;
	 public WebElement Fname() {
		return Fname;
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_phone_number\"]")
	 WebElement Mobileno;
	 public WebElement Mobileno() {
		return Mobileno;
	 }
		
	 @FindBy(xpath="//*[@id=\"ap_email\"]")
	 WebElement Email;
	 public WebElement Email() {
		return Email;
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_password\"]")
	 WebElement password;
	 public WebElement password() {
		return password;
	 }
		 
	 @FindBy(id="continue")
	 WebElement continue1;
	 public WebElement continue1() {
		return continue1;
	 }

	 public AmazonSignIn (WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver,this); 
	 }
	}*/


package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignIn {
	WebDriver Driver;
	
	 @FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	 WebElement searchbox;
	 public WebElement SearchBox1()
	 {
		 return searchbox;
	 }
	 
	 
	 @FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]")
	 List <WebElement> dropdown;
	 public  List <WebElement> Dropdown1()
	 {
		 return dropdown;
	 } 
	 /*@FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	 WebElement searchbox2;
	 public WebElement SearchBox2()
	 {
		 return searchbox2;
	 }
	 @FindBy(xpath="//h3[contains(text(),'Amazon.in')]")
	 WebElement amazon;
	 public WebElement amznpg1()
	 {
		 return amazon;
    }*/
	 @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	 WebElement amzsearch;
	 public WebElement amznsearch()
	 {
		 return amzsearch;
     }
	 @FindBy(xpath="//*[@id=\"nav-flyout-searchAjax\"]")
	 //WebElement amzdrop;
	 List<WebElement> amzdrop;
	 public List<WebElement> Dropdown2()
	 {
		 return amzdrop;
	 }
	/* @FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	 WebElement searchbox3;
	 public WebElement SearchBox3()
	 {
		 return searchbox3;
	 }
	 @FindBy(xpath="//h3[contains(text(),'Amazon.in')]")
	 WebElement amazonpg;
	 public WebElement amznpg2()
	 {
		 return amazonpg;
     }*/
	 @FindBy(xpath="//*[@id=\"nav-signin-tooltip\"]/a/span")
	 WebElement signup;
	 public WebElement signup()
	 {
		return signup;
	 }
	 @FindBy(id="createAccountSubmit")
	 WebElement createAccount;
	 public WebElement createAccount()
	 {
		return createAccount;
		 
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	 WebElement Fname;
	 public WebElement fname() 
	 {
		return Fname;
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_phone_number\"]")
	 WebElement Mobileno;
	 public WebElement mobno() {
		return Mobileno;
	 }
		
	 @FindBy(xpath="//*[@id=\"ap_email\"]")
	 WebElement Email;
	 public WebElement email() {
		return Email;
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_password\"]")
	 WebElement password;
	 public WebElement getpassword() {
		return password;
	 }
		 
	 @FindBy(xpath="//*[@id=\"continue\"]")
	 WebElement continue1;
	 public WebElement continue1() {
		return continue1;
	 }
	 public AmazonSignIn(WebDriver Driver)
	 {
		 this.Driver=Driver;
		PageFactory.initElements(Driver,this); 
	 }

}
	




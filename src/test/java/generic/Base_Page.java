package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public abstract class Base_Page {
	
	public WebDriver driver;
	
 public Base_Page(WebDriver driver){
	 this.driver=driver;
}

 public void pageTitle(String title){
	 WebDriverWait wait=new WebDriverWait(driver,30);
	 Reporter.log("The Title of the Page is matching",true);
	 try{
	 wait.until(ExpectedConditions.titleContains(title));
	 }
	 catch(Exception e){
		 Reporter.log("The Title of the Page is not matching",true);
		 SoftAssert a=new SoftAssert();
			a.fail();
			a.assertAll();
	 }
	 
 }
 
 
 public void elementIsPresent(WebElement ele){
	 WebDriverWait wait=new WebDriverWait(driver,30);
	 try{
	 wait.until(ExpectedConditions.visibilityOf(ele));
	 Reporter.log("The Element is present",true);
	 }
	 catch(Exception e){
		 Reporter.log("The Element is not present",true);
		 SoftAssert a=new SoftAssert();
			a.fail();
			a.assertAll();
	 }
 }
 
 
 
 public void validemailInvalidPassword(){
	 
	 WebDriverWait wait=new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.alertIsPresent());
		Alert pop = driver.switchTo().alert();
		String text = pop.getText();
		if(text.equalsIgnoreCase("Failure")){
			Reporter.log("Displayed Valid Email and Invalid pop up",true);
			pop.accept();
		}
		
		else{
			Reporter.log("Inavild mail or password pop up not generated");
			SoftAssert a=new SoftAssert();
			a.fail();
			a.assertAll();
		}
	}
 
 
 public void invalidEmailFormat(){
	 WebDriverWait wait=new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.alertIsPresent());
		Alert pop = driver.switchTo().alert();
		String text = pop.getText();
		if(text.equalsIgnoreCase("Please enter a valid email or phone number")){
			Reporter.log("Displayed Invalid Email and Invalid password pop up",true);
			pop.accept();
		}
		
		else{
			Reporter.log("Inavild mail or password pop up not generated");
			SoftAssert a=new SoftAssert();
			a.fail();
			a.assertAll();
		}
	}
 
 public void SuccesSignupPopMsg(){
	  WebDriverWait wait=new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.alertIsPresent());
		Alert pop = driver.switchTo().alert();
		String text = pop.getText();
		if(text.contains("Congrats ! Welcome to Smart Parent Family.")){
			Reporter.log("Displayed Successfull pop up",true);
			pop.accept();
		}
		
		else{
			Reporter.log("SignUp Faild due to some invalid data");
			SoftAssert a=new SoftAssert();
			a.fail();
			a.assertAll();
		}
 }
 
 
}

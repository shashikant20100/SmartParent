package generic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
 
 
 
 public void popmesg(String msg){
	 
	 WebDriverWait wait=new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.alertIsPresent());
		Alert pop = driver.switchTo().alert();
		String text = pop.getText();
		
		if(text.equalsIgnoreCase(msg)){
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
 
 /*
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
 */
 
 
 
 /*public void linksTest(){
	 List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The Total links are "+links.size());
		int count=1;
		for(int i=0;i<links.size();i++){
			
			if(links.get(i).getAttribute("href")!=null){
				
				try {
					HttpURLConnection con=(HttpURLConnection) new URL(links.get(i).getAttribute("href")).openConnection();
					con.connect();
				String res=con.getResponseMessage();
				System.out.println(count+" The Response of "+links.get(i).getAttribute("href")+" is "+res);
				con.disconnect();
				count++;
				
				} catch (Exception e) {
					
				
			}}
		}
		}*/
 }
 


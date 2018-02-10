package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements AutoConst{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication(){
		System.setProperty(Gecko_key,Gecko_Value);
		driver=new FirefoxDriver();
		driver.get("http://optime.in/apps/smartparent/smartparent_web/smart2/");
		//driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void closeApp(){
		driver.quit();
	}

}

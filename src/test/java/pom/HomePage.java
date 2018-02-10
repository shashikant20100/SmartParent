package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class HomePage extends Base_Page{

	
	@FindBy(xpath="//li[contains(.,'Logout')]")
	private WebElement logoutlink;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickLogoutlink(){
		logoutlink.click();
	}

	public void verifyLogoutele(){
		elementIsPresent(logoutlink);
	}
}

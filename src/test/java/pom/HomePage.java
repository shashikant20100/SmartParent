package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class HomePage extends Base_Page{

	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

}

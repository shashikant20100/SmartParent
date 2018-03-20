package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class UploadMarkSheetPage extends Base_Page{

	@FindBy(xpath="//center[contains(.,'Upload Mark Sheet')]")
	private WebElement uploadmarksheetTitle;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement calander;
	
	@FindBy(xpath="//a[.='15']")
	private WebElement date;
	
	@FindBy(xpath="(//input[@id='title' and @name='title'])[1]")
	private WebElement remarks;
	
	@FindBy(xpath="(//input[@id='title' and @name='title'])[2]")
	private WebElement title;
	
	@FindBy(xpath="(//select[@name='school_grade'])[1]")
	private WebElement grade;
	
	@FindBy(xpath="(//input[@name='file'])[1]")
	private WebElement browsemarks;
	
	
	
	
	
	
	
	public UploadMarkSheetPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

}

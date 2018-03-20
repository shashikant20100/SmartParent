package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Base_Page;

public class UploadMarkSheetPage extends Base_Page {

	@FindBy(xpath = "//center[contains(.,'Upload Mark Sheet')]")
	private WebElement uploadmarksheetTitle;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement calendar;

	@FindBy(xpath = "//a[.='15']")
	private WebElement date;

	@FindBy(xpath = "(//input[@id='title' and @name='title'])[1]")
	private WebElement remarks;

	@FindBy(xpath = "(//input[@id='title' and @name='title'])[2]")
	private WebElement title;

	@FindBy(xpath = "(//select[@name='school_grade'])[1]")
	private WebElement grade;

	@FindBy(xpath = "(//input[@name='file'])[1]")
	private WebElement browsemarks;

	@FindBy(xpath = "//button[.='UPLOAD']")
	private WebElement uploadbtn;
	

	public UploadMarkSheetPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void uploadMarksTITLE() {
		elementIsPresent(uploadmarksheetTitle);
	}

	public void calendar() {
		calendar.sendKeys();
	}

	public void selectDate() {
		date.click();
	}

	public void remarkS(String remark) {
		remarks.clear();
		remarks.sendKeys(remark);
	}

	public void titlE(String titLE) {
		title.clear();
		title.sendKeys(titLE);
	}

	public void gradE(int value) {
		Select g = new Select(grade);
		g.selectByIndex(value);
	}

	public void browseMarks(String markspath) {
		browsemarks.sendKeys(markspath);
	}

	public void uploadBtn() {
		uploadbtn.click();
	}

	public void alertMsg() {
		alertPop();
	}
	
}

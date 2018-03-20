package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Base_Page;

public class SchoolDetailPage extends Base_Page {

	@FindBy(xpath = "//center[contains(.,'Let')]")
	private WebElement popText;

	@FindBy(xpath = "//button[contains(.,'OK')]")
	private WebElement ok;

	@FindBy(xpath = "//h2[contains(.,'School Details')]")
	private WebElement schoolTitle;
	
	@FindBy(xpath = "(//input[@ng-model='searchParam'])[1]")
	private WebElement schoolname;

	@FindBy(xpath = "(//input[@ng-model='searchParam'])[2]")
	private WebElement location;

	@FindBy(xpath = "//select[@name='school_grade']")
	private WebElement grade;

	@FindBy(xpath = "//select[@name='school_curr']")
	private WebElement curriculum;

	@FindBy(xpath = "//button[contains(.,'Next')]")
	private WebElement nextbtn;

	public SchoolDetailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void popPagetext() {

		elementIsPresent(popText);
	}

	public void popOKbtn() {

		ok.click();
	}

	public void schoolTitle() {
	
		elementIsPresent(schoolTitle);
	}
	
	public void schoolName(String Schoolname) {
		schoolname.clear();
		schoolname.sendKeys(Schoolname);
	}
	
	public void location(String Location) {
		location.clear();
		location.sendKeys(Location);
	}
	
	public void grade(int value) {
		Select g=new Select(grade);
		g.selectByIndex(value);
	}
	
	public void Curriculumm(int value) {
		Select g=new Select(curriculum);
		g.selectByIndex(value);
	}

	public void nextButton() {
		nextbtn.click();
		nextbtn.click();
	}
	
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Base_Page;

public class ChildProfilePage extends Base_Page{

	
	@FindBy(xpath="//span[contains(.,'Keep Ready Child')]")
	private WebElement poptitle;
	
	@FindBy(xpath="//button[contains(.,'OK')]")
	private WebElement ok;
	
	@FindBy(xpath="//center[contains(.,'Create your child profile')]")
	private WebElement childprofiletitle;
	
	@FindBy(xpath="//img[@id='camera_ph']")
	private WebElement profileimage;
	
	@FindBy(xpath="//input[@placeholder='Enter First Name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Enter Last Name']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@id='gender1']")
	private WebElement gender;
	
	@FindBy(xpath="//select[@name='DD']")
	private WebElement day;
	
	@FindBy(xpath="//select[@name='MM']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='YYYY']")
	private WebElement year;
	
	@FindBy(xpath="//button[@id='NEXT']")
	private WebElement nextbtn;
	
	public ChildProfilePage(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver,this);
	}

	public void childPoptitle() {
		elementIsPresent(poptitle);
	}
	
	public void popOKBtn() {
		ok.click();
	}
	
	public void childprofileTitle() {
		elementIsPresent(childprofiletitle);
	}
	
	public void childImage(String imgpath) {
		profileimage.sendKeys(imgpath);
	}
	
	public void childFname(String FirstName) {
		firstname.clear();
		firstname.sendKeys(FirstName);
	}
	
	public void childLname(String LastName) {
		Lastname.clear();
		Lastname.sendKeys(LastName);
	}
	
    public void childGender() {
		gender.click();
	}
    
    public void bithDay() {
		Select d=new Select(day);
		d.selectByIndex(5);
	}
	public void bithMM() {
		Select d=new Select(month);
		d.selectByIndex(1);
	}
	
	public void birthYear() {
		Select d=new Select(year);
		d.selectByVisibleText("1994");;
	}
	
	public void nextBtn() {
		nextbtn.click();
	}
	
	
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Base_Page;

public class First_Time_Login_HomePage extends Base_Page {

	@FindBy(xpath="//h2[contains(.,'Profile Details')]")
	private WebElement homeTitle;
	
	@FindBy(xpath="//select[@name='parent_role']")
	private WebElement relation1;
	
	@FindBy(xpath="//input[@id='email' and @ng-model='parent_name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@name='email' and @ng-model='parent_phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@ng-model='parent_email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@ng-model='parent_company']")
	private WebElement company;
	
	@FindBy(xpath="//button[@id='NEXT']")
	private WebElement nextbtn;
	
	public First_Time_Login_HomePage(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver,this);	
	}
	
	
	public void verifyhomeFirst() {
		elementIsPresent(homeTitle);
	}
	
	
	public void relation() {
		Select s=new Select(relation1);
		s.selectByVisibleText("Father");
	}
	
	public void parentName(String Name) {
		name.clear();
		name.sendKeys(Name);
	}
	
	public void parentPhone(String Phone) {
		phone.clear();
		phone.sendKeys(Phone);
	}
	
	public void parentEmail(String Email) {
		email.clear();
		email.sendKeys(Email);
	}
	
	public void parentCompany(String Comapny) {
		company.clear();
		company.sendKeys(Comapny);
	}
	
	public void nextBtn() {
		nextbtn.click();
	}
	
	
	
	
}

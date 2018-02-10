package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Base_Page;;

public class LoginPage extends Base_Page{

	
//Login Pop elements
	@FindBy(xpath="//a[.='Login']")
	private WebElement loginlink;
	
	@FindBy(xpath="//p[.='Sign Into your account here']")
	private WebElement loginpoptitle;
	
	@FindBy(xpath="(//button[.='Sign In'])[1]")
	private WebElement singinbtn;
	
	@FindBy(xpath="(//input[@id='email'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	
	@FindBy(xpath="(//a[contains(.,'Facebook')])[1]")
	private WebElement facebook;
	
	@FindBy(xpath="(//a[contains(.,'Google+')])[1]")
	private WebElement google;
	
	@FindBy(xpath="//button[contains(.,'Forgot Password?')]")
	private WebElement forgotpasswordlink;
	
	@FindBy(xpath="//input[@name='remember']")
	private WebElement remembercheckbox;
	
	@FindBy(xpath=".//*[@id='login-form']/div[2]/p/button")
	private WebElement SignUplink;
	
	@FindBy(xpath=".//*[@id='login-form']/div[3]/button")
	private WebElement TermsAndCondition;

	
	//Forgot pop up elements 
	
	
	@FindBy(xpath="//p[.='Forgot Password']")
	private WebElement Forgotpopup;
	
	@FindBy(xpath="(//input[@id='newemail'])[2]")
	private WebElement forgottextbox;
	
	@FindBy(xpath="(//button[.='Sign In'])[2]")
	private WebElement forgotsignInlink;
	
	@FindBy(xpath="(.//*[@id='sub'])[3]")
	private WebElement sinInBtnInForgotPage;
	
	
	//Sign Up Pop elements
	

	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firtNametxtbox;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastNametxtbox;
	
	@FindBy(xpath="(//input[@placeholder='Password'])[2]")
	private WebElement passtxtbox;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	private WebElement confirmpasstxtbox;
	
	@FindBy(xpath="//input[@placeholder='Email/Phone']")
	private WebElement email_phonetxtbox;
	
	@FindBy(xpath="(.//*[@id='sub'])[2]")
	private WebElement Singupbtn;
	
	@FindBy(xpath="//p[.='Sign Up']")
	private WebElement Signuptitle;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void verifySignUpPop(){
		elementIsPresent(Signuptitle);
	}
	
	public void signUplink(){
		SignUplink.click();
	}
	
	public void clickSignUpbtn(){
		Singupbtn.click();
	}
	
	public void setFirstName(String fname){
		firtNametxtbox.clear();
		firtNametxtbox.sendKeys(fname);
	}
	
	public void setLastName(String lname){
		lastNametxtbox.clear();
		lastNametxtbox.sendKeys(lname);
	}
	
	public void setemailORphonet(String email_phone){
		email_phonetxtbox.clear();
		email_phonetxtbox.sendKeys(email_phone);
	}
	
	public void setConfirmPassword(String confirm){
		confirmpasstxtbox.clear();
		confirmpasstxtbox.sendKeys(confirm);
	}
	
	public void setPassword(String confPass){
		passtxtbox.clear();
		passtxtbox.sendKeys(confPass);
	}
	
	
	
	
	
	public void sinInBtnInForgot(){
		sinInBtnInForgotPage.click();
	}
	
	public void forgotTosignInPage(){
		forgotsignInlink.click();
	}
	
	public void enterForgotEmail(String forgotemail){
		forgottextbox.clear();
		forgottextbox.sendKeys(forgotemail);
	}
	
	public void forgotlink(){
		forgotpasswordlink.click();
	}
	
	public void verifyForgotPopup(){
		elementIsPresent(Forgotpopup);
	}
	
	public void openLoginPopup(){
		loginlink.click();
	}
	
	public void verifyloginpopup(){
		elementIsPresent(loginpoptitle);
	}
	
	public void verifyTitle(){
		pageTitle("Smart Parent");
	}
	
	
	public void enterEmail(String emailid){
		email.clear();
		email.sendKeys(emailid);
	}
	
	public void enterPassword(String pass){
		password.clear();
		password.sendKeys(pass);
	}
	
	public void Facebooklink(){
		facebook.click();
	}
	
	public void VerifyFacebookLogin(){
		pageTitle("Facebook");
	}
	
	
	public void googlelink(){
		google.click();
	}
	
	public void VerifygooleLogin(){
		pageTitle("Sign in");
	}
	
	public void testTermConditionPage(){
		
	}
	
//	public void invalidEmailFormat(){
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Alert pop = driver.switchTo().alert();
//		String text = pop.getText();
//		if(text.equalsIgnoreCase("Please enter a valid email or phone number")){
//			Reporter.log("Displayed error pop up",true);
//			pop.accept();
//		}
//		
//		else{
//			Reporter.log("Inavild mail or password pop up not generated");
//			Assert.fail();
//		}
//	}
	
	
//	public void validemailInvalidPassword(){
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Alert pop = driver.switchTo().alert();
//		String text = pop.getText();
//		if(text.equalsIgnoreCase("Failure")){
//			Reporter.log("Displayed error pop up",true);
//			pop.accept();
//		}
//		
//		else{
//			Reporter.log("Inavild mail or password pop up not generated");
//			Assert.fail();
//		}
//	}
	
	public void sinInBtn(){
		singinbtn.click();		
	}
	
	public void verifyLoginpage(){
		elementIsPresent(loginlink);
		
	}
}

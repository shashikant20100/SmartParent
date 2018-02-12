package scripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom.LoginPage;

public class AlreadyRegisteredUserPop extends Base_Test{

	@Test
	public void SignUp(){
		LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//lp.verifyTitle();
	//	lp.openLoginPopup();
		lp.verifyloginpopup();
		lp.signUplink();
		lp.verifySignUpPop();
		lp.setFirstName("Shashi");
		lp.setLastName("Sharma");
		lp.setemailORphonet("9639195752");
		lp.setPassword("12345");
		lp.setConfirmPassword("12345");
		lp.clickSignUpbtn();
		lp.popmesg("Phone or Username already in use");
	}
}

package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom.LoginPage;

public class ForgotPasswordTest extends Base_Test{

	@Test
	public void ForgotPassword() throws InterruptedException{
		
		LoginPage lp=new LoginPage(driver);
		lp.loginLinkOpen();
		lp.forgotlink();
		lp.verifyForgotPopup();
		lp.enterForgotEmail("shashikant20100@gmail.com");
		lp.sinInBtnInForgot();
		Thread.sleep(1000);
		lp.forgotTosignInPage();
		lp.verifyElement();
	}
	
}

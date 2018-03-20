package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excelfile;
import pom.LoginPage;

public class ForgotPasswordTest extends Base_Test{

	@Test(priority=5)
	public void ForgotPassword() throws InterruptedException{
		String email=Excelfile.getexcelData(Excel_Path,"ForgotPassword",1,0);
		LoginPage lp=new LoginPage(driver);
		//lp.openLoginPopup();
		lp.verifyloginpopup();
		lp.forgotlink();
		lp.verifyForgotPopup();
		lp.enterForgotEmail(email);
		lp.sinInBtnInForgot();
		Thread.sleep(1000);
		lp.forgotTosignInPage();
		lp.verifyloginpopup();
	}
	
}

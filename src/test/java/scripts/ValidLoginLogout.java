package scripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excelfile;
import pom.LoginPage;

public class ValidLoginLogout extends Base_Test{

	@Test(priority=3)
	public void LoginTest(){
		String un=Excelfile.getexcelData(Excel_Path,"Login",3, 0);
		String pass=Excelfile.getexcelData(Excel_Path,"Login",3, 1);
		
		LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//lp.verifyTitle();
		//lp.openLoginPopup();
		lp.verifyloginpopup();
		lp.enterEmail(un);
		lp.enterPassword(pass);
		lp.sinInBtn();
		
//		HomePage hp=new HomePage(driver);
//		hp.verifyLogoutele();
//		hp.clickLogoutlink();
//		
//		lp.verifyLoginpage();
	}
	
}

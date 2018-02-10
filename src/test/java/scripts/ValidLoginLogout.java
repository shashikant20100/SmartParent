package scripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excelfile;
import pom.LoginPage;

public class ValidLoginLogout extends Base_Test{

	@Test
	public void LoginTest(){
		String un=Excelfile.getexcelData(Excel_Path,"Login",3, 0);
		String pass=Excelfile.getexcelData(Excel_Path,"Login",3, 1);
		
		LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		lp.verifyTitle();
		lp.loginLinkOpen();
		lp.verifyElement();
		lp.enterEmail(un);
		lp.enterPassword(pass);
		lp.sinInBtn();
	}
	
}

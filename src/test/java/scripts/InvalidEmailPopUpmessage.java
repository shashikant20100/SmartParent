package scripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excelfile;
import pom.LoginPage;

public class InvalidEmailPopUpmessage extends Base_Test {
	
	@Test(priority=6)
	public void InvalidEmailPopUptest() throws InterruptedException{
//		String invaliun=Excelfile.getexcelData(Excel_Path,"Login",1, 0);
//		String invalipass1=Excelfile.getexcelData(Excel_Path,"Login",1, 1);
//		String validun=Excelfile.getexcelData(Excel_Path,"Login",2, 0);
//		String invalidpass2=Excelfile.getexcelData(Excel_Path,"Login",2, 1);
//		
		
		LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	lp.verifyTitle();
		//lp.openLoginPopup();
		lp.verifyLoginpage();
//		lp.enterEmail("shashikant20100");
//		lp.enterPassword("23456789");
//		lp.sinInBtn();
//		lp.popmesg("Please enter a valid email or phone number");
		lp.enterEmail("sharmakantshashi01@gmail.com");
		lp.enterPassword("qwerr");
		lp.sinInBtn();
		Thread.sleep(1000);
		lp.popmesg("Failure");
	}

}

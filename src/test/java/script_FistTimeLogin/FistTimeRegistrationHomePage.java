package script_FistTimeLogin;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Base_Test;
import pom.ChildProfilePage;
import pom.First_Time_Login_HomePage;
import pom.LoginPage;
import pom.SchoolDetailPage;
import pom.UploadMarkSheetPage;

public class FistTimeRegistrationHomePage extends Base_Test{
	
	@Test(priority=2)
	public void fisrtlogin() throws InterruptedException {
	
//			String un=Excelfile.getexcelData(Excel_Path,"Login",3, 0);
//			String pass=Excelfile.getexcelData(Excel_Path,"Login",3, 1);
			
			LoginPage lp=new LoginPage(driver);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			lp.verifyloginpopup();
			lp.enterEmail("s.har.makantshashi01@gmail.com");
			lp.enterPassword("12345");
			lp.sinInBtn();
			First_Time_Login_HomePage f=new First_Time_Login_HomePage(driver);
			f.verifyhomeFirst();
			f.relation();
			f.parentName("Tester");
			f.parentPhone("9639195752");
			f.parentEmail("shashikant20100@gmail.com");
			f.parentCompany("Business");
			f.nextBtn();
			
			Reporter.log("Child Profile Page",true);
			ChildProfilePage ch=new ChildProfilePage(driver);
			ch.childPoptitle();
			ch.popOKBtn();
			ch.childprofileTitle();
			ch.childImage("C:\\Users\\Optime Technologies\\Downloads\\user.png");
			ch.childFname("Ayash");
			ch.childLname("Sharma");
			ch.childGender();
			ch.bithDay();
			ch.bithMM();
			ch.birthYear();
			ch.nextBtn();
			
			Reporter.log("School Detail Page",true);
			SchoolDetailPage sc=new SchoolDetailPage(driver);
			sc.popPagetext();
			sc.popOKbtn();
			sc.schoolTitle();
			sc.schoolName("Delhi Public School");
			sc.location("65 Rt Nagar South Bnaglore");
			sc.grade(2);
			sc.Curriculumm(2);
			sc.nextButton();
			
			Reporter.log("Upload Marks Card Page",true);
			UploadMarkSheetPage um=new UploadMarkSheetPage(driver);
			um.uploadMarksTITLE();
			um.calendar();
			um.selectDate();
			um.remarkS("Testing");
			um.titlE("10th");
			um.gradE(2);
			um.browseMarks("C:\\Users\\Optime Technologies\\Downloads\\markscard.jpg");
			um.uploadBtn();
			um.alertMsg();	
			
		}
		
	}

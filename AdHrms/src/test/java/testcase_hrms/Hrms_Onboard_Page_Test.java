package testcase_hrms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import actions.Hrms_Onboard_Page_Actions;


public class Hrms_Onboard_Page_Test extends BaseTest {

	Hrms_Onboard_Page_Actions hrms_onboardPage_Actions;
	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public void Dashboard_Page() throws InterruptedException {
		
		logger.assignAuthor("rohit");
		logger.assignCategory("Catalog Page Hrms Portal Juidco");
		hrms_onboardPage_Actions = new Hrms_Onboard_Page_Actions(BaseTest.driver);
		logger.log(Status.INFO, "User opens Dashboard then Employee Management");
		hrms_onboardPage_Actions.ClickonEmpmangPage();
		logger.log(Status.INFO, "User Performs Click on Employee Management");
		Thread.sleep(2000);
		hrms_onboardPage_Actions.ClickOnBoardPage();
		logger.log(Status.INFO, "User Click on Onboard Page");
		Thread.sleep(2000);
		hrms_onboardPage_Actions.GetText_OnBoardPage();
		logger.log(Status.INFO, "User validates the page displayed");
		Thread.sleep(2000);
		
		/*  logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
	}

}

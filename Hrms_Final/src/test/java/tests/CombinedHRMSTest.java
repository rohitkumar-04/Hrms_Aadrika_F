
package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import base.DriverManage;
import pages.*;
import utils.*;

import java.util.Scanner;

public class CombinedHRMSTest {

	WebDriver driver;
	SoftAssert softAssert;
	WaitHelper waitHelper;
	Click_Button clickButton;
	String[] data;

	@BeforeMethod
	public void setup() throws Exception {
		driver = DriverManage.launchDriver();
		softAssert = new SoftAssert();
		waitHelper = new WaitHelper();
		clickButton = new Click_Button(driver);
		data = Excel_Reader.readData("C:\\Users\\aadrika\\Desktop\\HRMS\\Onboard_data1.xlsx");

		// Perform login
		new LoginPage_TestLink(driver).loginWebPage();
		waitHelper.waitTime();
	}

	@Test(priority = 1)
	public void onboardEmployeeAndManagePension() throws Exception {

		// Onboard Employee
		new OnboardNew(driver).onboard_New(driver);
		waitHelper.waitTime();

		new Emp_Off_Details(driver).emp_Ofc_Details(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Details(driver).emp_details(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Prsnl_Details(driver).emp_prsnl_details(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Prnt_Add(driver).emp_prnt_add(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Edu_Train_Details(driver).emp_edu_train_details(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Join_Inform(driver).emp_join_inform(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Service_History(driver).emp_service_history(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Family_Details(driver).emp_Family_Details(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Sal_Info(driver).emp_sal_info(driver, data);
		waitHelper.waitTime();
		clickButton.click_button();
		waitHelper.waitTime();

		new Emp_Time_Bound_Details(driver).emp_time_bound_details(driver, data);
		waitHelper.waitTime();

		new Disappear_Element_Handler(driver).captureTransient(driver);
		ScreenshotTake.takeScreenshot(driver, "Employee_Boarded");
		waitHelper.waitTime();
	}

	@Test(priority = 2)
	public void GoDashboard() throws Exception {
		Dashboard dsb = new Dashboard(driver);
		dsb.onboard_New(driver);
		waitHelper.waitTime();
	}

	@Test(priority = 3)
	public void GoPension() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value 1:View and 2:Edit");
		int data_Action = sc.nextInt();
		Pension_Management pm = new Pension_Management(driver, data_Action);
		pm.pension_manag(driver);
		waitHelper.waitTime();

		Emp_Pension_Details emppd = new Emp_Pension_Details(driver);
		emppd.pension_details(driver);
		waitHelper.waitTime();

		sc.close();
	}

	@AfterMethod
	public void tearDown() {
		Tear_Down.teardown(driver);
	}
}

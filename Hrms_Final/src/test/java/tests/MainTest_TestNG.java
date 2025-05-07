package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


import pages.*;
import utils.*;

public class MainTest_TestNG {

	WebDriver driver;
	WaitHelper wt;
	String[] data;

	@BeforeClass
	public void setup() throws Exception {
		wt = new WaitHelper();
		data = Excel_Reader.readData("C:\\Users\\aadrika\\Desktop\\HRMS\\Onboard_data1.xlsx");
		
		
		driver = BaseTest.driver;
		wt.waitTime();

		// Login
		LoginPage_TestLink lt = new LoginPage_TestLink(driver);
		lt.loginWebPage();
	}

	@Test(priority = 1)
	public void onboardEmployee() throws Exception {
		new OnboardNew(driver).onboard_New(driver);
		wt.waitTime();
	}

	@Test(priority = 2)
	public void step1_OffDetails() throws Exception {
		new Emp_Off_Details(driver).emp_Ofc_Details(driver, data);
		clickNext();
	}

	@Test(priority = 3)
	public void step2_EmpDetails() throws Exception {
		new Emp_Details(driver).emp_details(driver, data);
		clickNext();
	}

	@Test(priority = 4)
	public void step3_PersonalDetails() throws Exception {
		new Emp_Prsnl_Details(driver).emp_prsnl_details(driver, data);
		clickNext();
	}

	@Test(priority = 5)
	public void step4_PermanentAddress() throws Exception {
		new Emp_Prnt_Add(driver).emp_prnt_add(driver, data);
		clickNext();
	}

	@Test(priority = 6)
	public void step5_EduTrainDetails() throws Exception {
		new Emp_Edu_Train_Details(driver).emp_edu_train_details(driver, data);
		clickNext();
	}

	@Test(priority = 7)
	public void step6_JoinInfo() throws Exception {
		new Emp_Join_Inform(driver).emp_join_inform(driver, data);
		clickNext();
	}

	@Test(priority = 8)
	public void step7_ServiceHistory() throws Exception {
		new Emp_Service_History(driver).emp_service_history(driver, data);
		clickNext();
	}

	@Test(priority = 9)
	public void step8_FamilyDetails() throws Exception {
		new Emp_Family_Details(driver).emp_Family_Details(driver, data);
		clickNext();
	}

	@Test(priority = 10)
	public void step9_SalaryInfo() throws Exception {
		new Emp_Sal_Info(driver).emp_sal_info(driver, data);
		clickNext();
	}

	@Test(priority = 11)
	public void step10_TimeBoundDetails() throws Exception {
		new Emp_Time_Bound_Details(driver).emp_time_bound_details(driver, data);
		wt.waitTime();
	}

	@Test(priority = 12)
	public void captureTransientElement() throws Exception {
		new Disappear_Element_Handler(driver).captureTransient(driver);
	}

	@Test(priority = 13)
	public void captureScreenshot() throws Exception {
		ScreenshotTake.takeScreenshot(driver, "Employee_Boarded");
		wt.waitTime();
	}

	@Test(priority = 14)
	public void GoDashboard() throws Exception {
		Dashboard dsb = new Dashboard(driver);
		dsb.onboard_New(driver);
		wt.waitTime();
	}

	@Test(priority = 15)
	public void GoPension() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value 1:View and 2:Edit");
		int data_Action = sc.nextInt();
		Pension_Management pm = new Pension_Management(driver, data_Action);
		pm.pension_manag(driver);
		wt.waitTime();

		Emp_Pension_Details emppd = new Emp_Pension_Details(driver);
		emppd.pension_details(driver);
		wt.waitTime();

		sc.close();
	}

	@AfterClass
	public void tearDown() {
		Tear_Down.teardown(driver);
		System.out.println("✅ Test completed.");
	}

	private void clickNext() throws Exception {
		new Click_Button(driver).click_button();
		wt.waitTime();
	}

}

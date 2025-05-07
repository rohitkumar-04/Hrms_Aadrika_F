
package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverManage;
import pages.Click_Button;
import pages.Dashboard;
import pages.Emp_Details;
import pages.Emp_Edu_Train_Details;
import pages.Emp_Family_Details;
import pages.Emp_Join_Inform;
import pages.Emp_Off_Details;
import pages.Emp_Pension_Details;
import pages.Emp_Prnt_Add;
import pages.Emp_Prsnl_Details;
import pages.Emp_Sal_Info;
import pages.Emp_Service_History;
import pages.Emp_Time_Bound_Details;
import pages.LoginPage_TestLink;
import pages.OnboardNew;
import pages.Pension_Management;
import utils.Disappear_Element_Handler;
import utils.Excel_Reader;
import utils.ScreenshotTake;
import utils.Tear_Down;
import utils.WaitHelper;

public class FilNext {

	WebDriver driver;
	SoftAssert softAssert;
	WaitHelper waitHelper;
	Click_Button clicker;
	String[] data;

	@BeforeMethod
	public void setup() throws Exception {
		driver = DriverManage.launchDriver();
		softAssert = new SoftAssert();
		waitHelper = new WaitHelper();
		clicker = new Click_Button(driver);
		data = Excel_Reader.readData("C:\\Users\\aadrika\\Desktop\\HRMS\\Onboard_data1.xlsx");

		// Perform login before each test
		new LoginPage_TestLink(driver).loginWebPage();
		waitShort();
	}

	@Test(priority = 1)
	public void onboardEmployee() throws Exception {
		new OnboardNew(driver).onboard_New(driver);
		waitShort();

		fillAndNextStep(new Emp_Off_Details(driver));
		fillAndNextStep(new Emp_Details(driver));
		fillAndNextStep(new Emp_Prsnl_Details(driver));
		fillAndNextStep(new Emp_Prnt_Add(driver));
		fillAndNextStep(new Emp_Edu_Train_Details(driver));
		fillAndNextStep(new Emp_Join_Inform(driver));
		fillAndNextStep(new Emp_Service_History(driver));
		fillAndNextStep(new Emp_Family_Details(driver));
		fillAndNextStep(new Emp_Sal_Info(driver));

		new Emp_Time_Bound_Details(driver).emp_time_bound_details(driver, data);

		new Disappear_Element_Handler(driver).captureTransient(driver);
		ScreenshotTake.takeScreenshot(driver, "Employee_Boarded");
		waitShort();
	}

	@Test(priority = 2)
	public void openDashboard() throws Exception {
		new Dashboard(driver).onboard_New(driver);
		waitShort();
	}

	@Test(priority = 3)
	public void managePension() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to View or 2 to Edit:");
		int action = sc.nextInt();

		new Pension_Management(driver, action).pension_manag(driver);
		new Emp_Pension_Details(driver).pension_details(driver);
		waitShort();
		sc.close();
	}

	@AfterMethod
	public void tearDown() {
		Tear_Down.teardown(driver);
	}

	// Helper methods
	private void waitShort() throws Exception {
		try {
			waitHelper.waitTime();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void fillAndNextStep(Object stepPage) throws Exception {
		if (stepPage instanceof Emp_Off_Details)
			((Emp_Off_Details) stepPage).emp_Ofc_Details(driver, data);
		else if (stepPage instanceof Emp_Details)
			((Emp_Details) stepPage).emp_details(driver, data);
		else if (stepPage instanceof Emp_Prsnl_Details)
			((Emp_Prsnl_Details) stepPage).emp_prsnl_details(driver, data);
		else if (stepPage instanceof Emp_Prnt_Add)
			((Emp_Prnt_Add) stepPage).emp_prnt_add(driver, data);
		else if (stepPage instanceof Emp_Edu_Train_Details)
			((Emp_Edu_Train_Details) stepPage).emp_edu_train_details(driver, data);
		else if (stepPage instanceof Emp_Join_Inform)
			((Emp_Join_Inform) stepPage).emp_join_inform(driver, data);
		else if (stepPage instanceof Emp_Service_History)
			((Emp_Service_History) stepPage).emp_service_history(driver, data);
		else if (stepPage instanceof Emp_Family_Details)
			((Emp_Family_Details) stepPage).emp_Family_Details(driver, data);
		else if (stepPage instanceof Emp_Sal_Info)
			((Emp_Sal_Info) stepPage).emp_sal_info(driver, data);

		waitShort();
		clicker.click_button();
		waitShort();
	}
}

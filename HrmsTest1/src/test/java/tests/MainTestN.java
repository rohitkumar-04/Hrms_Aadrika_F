package tests;

import java.util.Scanner;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import pages.Click_Button;
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
import pages.OnboardNew;
import pages.Pension_Management;
import utils.Disappear_Element_Handler;
import utils.Excel_Reader;
import utils.ScreenshotTake;
import utils.WaitHelper;

public class MainTestN extends BaseTest {

	SoftAssert softAssert = new SoftAssert();
	WaitHelper wt = new WaitHelper();

	@Test(priority = 1)
	public void Onboard_Emp() throws Exception {
		logger.assignAuthor("rohit");
		logger.assignCategory("Catalog Page Hrms Portal Juidco");

		String[] data = Excel_Reader.readData("C:\\Users\\aadrika\\Desktop\\HRMS\\Onboard_data1.xlsx");

		Scanner sc = new Scanner(System.in);

		// Do onboarding steps here...
		OnboardNew on = new OnboardNew(BaseTest.driver);
		on.onboard_New(BaseTest.driver);
		wt.waitTime();

		// Step-1
		Emp_Off_Details ep1 = new Emp_Off_Details(BaseTest.driver);
		ep1.emp_Ofc_Details(BaseTest.driver, data);
		wt.waitTime();
		Click_Button ct = new Click_Button(BaseTest.driver);
		ct.click_button();
		wt.waitTime();

		// Step-2
		Emp_Details ep2 = new Emp_Details(BaseTest.driver);
		ep2.emp_details(BaseTest.driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-3
		Emp_Prsnl_Details ep3 = new Emp_Prsnl_Details(BaseTest.driver);
		ep3.emp_prsnl_details(BaseTest.driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-4
		Emp_Prnt_Add ep4 = new Emp_Prnt_Add(BaseTest.driver);
		ep4.emp_prnt_add(BaseTest.driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		Emp_Edu_Train_Details ep5 = new Emp_Edu_Train_Details(BaseTest.driver);
		ep5.emp_edu_train_details(BaseTest.driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-6
		Emp_Join_Inform ep6 = new Emp_Join_Inform(BaseTest.driver);
		ep6.emp_join_inform(BaseTest.driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-7
		Emp_Service_History ep7 = new Emp_Service_History(BaseTest.driver);
		ep7.emp_service_history(BaseTest.driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-8
		Emp_Family_Details ep8 = new Emp_Family_Details(BaseTest.driver);
		ep8.emp_Family_Details(BaseTest.driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-9
		Emp_Sal_Info ep9 = new Emp_Sal_Info(BaseTest.driver);
		ep9.emp_sal_info(BaseTest.driver, data);
		wt.waitTime();
		ct.click_button();
		wt.waitTime();

		// Step-10
		Emp_Time_Bound_Details ep10 = new Emp_Time_Bound_Details(BaseTest.driver);
		ep10.emp_time_bound_details(BaseTest.driver, data); // wt.waitTime();

		// Wait and caputure Transient Element
		Disappear_Element_Handler ep11 = new Disappear_Element_Handler(BaseTest.driver);
		ep11.captureTransient(BaseTest.driver);

		// Wait and take screenshot
		ScreenshotTake.takeScreenshot(BaseTest.driver, "Employee_Boarded");
		wt.waitTime();

		System.out.println("Enter the value 1:View and 2:Edit");

		int data_Action = sc.nextInt();
		Pension_Management pm = new Pension_Management(BaseTest.driver, data_Action);
		pm.pension_manag(BaseTest.driver);
		wt.waitTime();

		Emp_Pension_Details emppd = new Emp_Pension_Details(BaseTest.driver);
		emppd.pension_details(BaseTest.driver);
		wt.waitTime();

		sc.close();
	}
}

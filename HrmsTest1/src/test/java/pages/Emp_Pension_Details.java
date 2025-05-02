package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Emp_Pension_Details {

	public WebDriver driver;

	public Emp_Pension_Details(WebDriver driver) {
		this.driver = driver;
	}

	public void pension_details(WebDriver driver) throws Exception {

		driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/pension-management/edit/EMP912e47");
		
		String t3 = driver.findElement(By.xpath("//h2[normalize-space()='Pension Management']")).getText();
		System.out.println(t3);
		Assert.assertEquals("Pension Management", t3);

		String t4 = driver.findElement(By.xpath("//h5[normalize-space()='Pension Details:']")).getText();
		System.out.println(t4);
		Assert.assertEquals("Pension Details:", t4);

		Click_Button ct = new Click_Button(driver);

		// Single
		// Choose File
				System.out.println("Choose File");
				driver.findElement(By
						.xpath("//div[@class='flex  justify-between pl-[5rem]']//h3[text()='Single-']/following-sibling::input")).sendKeys("C:\\Users\\aadrika\\Desktop\\Test.pdf");
						

				// Upload
				System.out.println("Upload File");
				driver.findElement(By
						.xpath("//div[@class='flex  justify-between pl-[5rem]']//h3[text()='Single-']/following-sibling::button"))
						.click();

		// Joint
		// Choose File
		System.out.println("Choose File");
		driver.findElement(By
				.xpath("//div[@class='flex  justify-between pl-[5rem]']//h3[text()='Joint']/following-sibling::input")).sendKeys("C:\\Users\\aadrika\\Desktop\\Test.pdf");

		// Upload
		System.out.println("Upload File");
		driver.findElement(By
				.xpath("//div[@class='flex  justify-between pl-[5rem]']//h3[text()='Joint']/following-sibling::button"))
				.click();

		// Checkbox Decleration
		System.out.println("Check Decleration Checkbox ");
		driver.findElement(By.xpath("//input[@type='checkbox']")).sendKeys("");

		// Button Next
		// Button Back
		ct.click_button();

		// Page-2
		// Decleration For Refund
		String Edr = driver.findElement(By.xpath(
				"//h2[@class='text-secondary text-mid_head font-medium flex items-center gap-2 text-[20px] py-4']"))
				.getText();
		System.out.println(Edr);

		// Name of Employee
		System.out.println("Enter the Name of Employee");
		driver.findElement(By.xpath("id_emp_name")).sendKeys("");

		// Parent Department Dropdown
		WebElement e_pd = driver.findElement(By.id("id_department_id"));
		System.out.println("Start Parent Department Dropdown Selection");
		Select srs1 = new Select(e_pd);
		srs1.selectByVisibleText("");
		Thread.sleep(3000);

		// Designation Dropdown
		WebElement e_dd = driver.findElement(By.id("id_designation_id"));
		System.out.println("Start Designation Dropdown Selection");
		Select srdd1 = new Select(e_dd);
		srdd1.selectByVisibleText("");
		Thread.sleep(3000);

		// Father's Name/Husband
		System.out.println("Enter the Father's Name/Husband");
		driver.findElement(By.xpath("id_emp_name")).sendKeys("");

		// Present Address
		System.out.println("Enter the Present Address");
		driver.findElement(By.xpath("id_address_primary")).sendKeys("");

		// Name Of Department under working Dropdown
		System.out.println("Enter the Name Of Department under working");
		WebElement e_pdw = driver.findElement(By.id("id_department_id"));
		System.out.println("Start Parent Department Dropdown Selection");
		Select se_pw = new Select(e_pdw);
		se_pw.selectByVisibleText("");
		Thread.sleep(3000);

		// Date of Birth
		System.out.println("Enter the Date of Birth");
		driver.findElement(By.xpath("id_dob")).sendKeys("");

		// Permanent address
		System.out.println("Enter Permanent address");
		driver.findElement(By.xpath("id_address_primary_permanent")).sendKeys("");

		// Retiring From Service
		System.out.println("Enter Retiring From Service");
		driver.findElement(By.xpath("id_retiring_from_service")).sendKeys("");

		// Date of Joining Service
		System.out.println("Enter Date of Joining Service");
		driver.findElement(By.xpath("id_doj")).sendKeys("");

		// Last Pay Drawn: Basic Pay + Grade Pay
		System.out.println("Enter Last Pay Drawn: Basic Pay + Grade Pay");
		driver.findElement(By.xpath("id_last_pay_drawn")).sendKeys("");

		// Cause of leaving Service
		System.out.println("Enter Cause of leaving Service");
		driver.findElement(By.xpath("id_cause_of_leaving_service")).sendKeys("");

		// Mark Of Identification
		System.out.println("Enter Mark Of Identification");
		driver.findElement(By.xpath("id_identification_marks")).sendKeys("");

		// Decleration Checkbox
		System.out.println("Check Decleration Checkbox ");
		driver.findElement(By.xpath("//input[@type='checkbox']")).sendKeys("");

		// Button next
		// Button back
		ct.click_button();

		// Page-3
		// Statement Text to display
		String Etd = driver
				.findElement(By.xpath("//h3[@class='text-secondary text-xl flex items-center gap-2 undefined']"))
				.getText();
		System.out.println(Etd);

		// Remarks Textbox
		System.out.println("Enter the Remarks");
		driver.findElement(By.xpath("//input[@placeholder='Please Enter Remarks']")).sendKeys("");

		// Button next
		// Button Back
		ct.click_button();

		// Page-4
		// get text Nomination for unpaid amount on pension
		String Egt = driver.findElement(By.xpath(
				"//h3[@class='text-secondary text-xl flex items-center gap-2 justify-center items-center mb-10']"))
				.getText();
		System.out.println(Egt);

		// Decleration checkbox
		System.out.println("Enter the ");
		driver.findElement(By.xpath("//input[@type='checkbox']")).sendKeys("");

		// Home Address of Nominee
		System.out.println("Check the Decleration checkbox");
		driver.findElement(By.id("id_nominee_address")).sendKeys("");

		// Relationship with corporation Employee
		System.out.println("Enter the Relationship with corporation Employee");
		driver.findElement(By.id("id_relation")).sendKeys("");

		// Age
		System.out.println("Enter the Age");
		driver.findElement(By.id("id_nominee_age")).sendKeys("");

		// Remarks
		System.out.println("Enter the Remarks");
		driver.findElement(By.id("id_remarks")).sendKeys("");

		// Date This
		System.out.println("Enter the Date This");
		driver.findElement(By.id("id_date_this")).sendKeys("");

		// Day of
		System.out.println("Enter the Day of");
		driver.findElement(By.id("id_day_of")).sendKeys("");

		// (At Place)
		System.out.println("Enter the At Place");
		driver.findElement(By.id("id_at_place")).sendKeys("");

		// Button Reset,Next,Back
		ct.click_button();

		// Page-5
		// Text -Calculations sheet of pensioner and family
		String Csp = driver.findElement(By.xpath("//div[@class='shadow-md p-6 rounded-md']//h2")).getText();
		System.out.println(Csp);

		// Date of appointment
		System.out.println("Enter the Date of appointment ");
		driver.findElement(By.id("id_date_of_appointment")).sendKeys("");

		// Date of Retirement/Death
		System.out.println("Enter the Date of Retirement/Death");
		driver.findElement(By.id("id_date_of_retirement")).sendKeys("");

		// Total Length Service in Year(s)
		System.out.println("Enter the Total Length Service in Year(s)");
		driver.findElement(By.id("id_total_lenght_service")).sendKeys("");

		// Last Pay Drawn
		System.out.println("Enter the Last Pay Drawn");
		driver.findElement(By.id("id_last_pay_drawn")).sendKeys("");

		// Pension admissible
		System.out.println("Enter the 50% of Last Gross pay");
		driver.findElement(By.id("id_pension_admissible")).sendKeys("");

		// 50% of Last Gross pay
		System.out.println("Enter the 50% of Last Gross pay");
		driver.findElement(By.id("id_last_gross_pay")).sendKeys("");

		// Check box (Family Pension admissible)
		System.out.println("Click on Checkbox Answer Yes");
		driver.findElement(By.xpath("//input[@id='yes']"));

		System.out.println("Click on Checkbox Answer No");
		driver.findElement(By.xpath("//input[@id='no']"));

		// Checkbox Decleration
		System.out.println("Click on checkbox of Decleration");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// Button next/Back
		ct.click_button();

		// Page-6
		// Decleration to the cheif Account Officer
		String Dca = driver.findElement(By.xpath(
				"(//h3[@class='text-secondary text-xl flex items-center gap-2 justify-center items-center mt-5 mb-5'])[1]"))
				.getText();
		System.out.println(Dca);
		// h3[normalize-space()='Declaration to the Chief Account Officer']

		// Name of Pensioner
		System.out.println("Enter the DOB");
		driver.findElement(By.id("id_pensioner_name")).sendKeys();
		Thread.sleep(3000);

		// Guardian Name
		System.out.println("Enter the DOB");
		driver.findElement(By.id("id_guardian_name")).sendKeys();
		Thread.sleep(3000);

		// Name of Post from which he retired
		WebElement e_retd_post = driver.findElement(By.id("id_post_retired"));
		System.out.println("Start Training Type Dropdown Selection");
		Select s1 = new Select(e_retd_post);
		s1.selectByVisibleText("Enter"); // Enter the post
		Thread.sleep(3000);

		// DOB
		System.out.println("Enter the DOB");
		driver.findElement(By.id("id_dob")).sendKeys();
		Thread.sleep(3000);

		// Class of Pension And No. & Date of Sanction order
		System.out.println("Enter the Class of Pension And No. & Date of Sanction order");
		driver.findElement(By.id("id_class_of_pension")).sendKeys();
		Thread.sleep(3000);

		// Full permanent address
		System.out.println("Enter the Full permanent address");
		driver.findElement(By.id("id_permanent_address")).sendKeys("");

		// Cash
		System.out.println("Enter the Cash");
		driver.findElement(By.id("id_remarks")).sendKeys("");

		// Remarks
		System.out.println("Enter the Remarks");
		driver.findElement(By.id("id_remarks")).sendKeys("");

		// Amount
		System.out.println("Enter the Amount");
		driver.findElement(By.id("id_amount")).sendKeys("");

		// Button Next & Button
		System.out.println("Enter the Button Next/Back");
		ct.click_button();

		// Page-7
		// Pension Payment order No.
		System.out.println("Enter thePension Payment order No.");
		driver.findElement(By.id("id_pay_order_no")).sendKeys("");

		// Date of Pension
		System.out.println("Enter the Date of Pension");
		driver.findElement(By.id("id_pension_date")).sendKeys();
		Thread.sleep(3000);

		// Net Amount
		System.out.println("Enter the Net Amount");
		driver.findElement(By.id("id_net_amount")).sendKeys("");

		// Decleration checkbox
		System.out.println("Click on checkbox of Decleration");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// Button Back/Next
		ct.click_button();

		// Page-8
		// Upload 3 copies of signature with preview of employee
		System.out.println("Fetching the text value");
		String u3 = driver
				.findElement(By.xpath("//h3[contains(text(),'Upload 3 copies of signature with preview of the e')]"))
				.getText();
		System.out.println(u3);

		// Upload file1
		System.out.println("Upload the file in the Step-1");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='signature1']")));
		elementi.sendKeys();
		Thread.sleep(2000);

		// Upload file2
		System.out.println("Upload the file in the Step-2");
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi2 = wait2
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='signature2']")));
		elementi2.sendKeys();
		Thread.sleep(2000);

		// Upload file3
		System.out.println("Upload the file in the Step-3");
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi3 = wait3
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='signature3']")));
		elementi3.sendKeys();
		Thread.sleep(2000);

		// Upload 3 copies of photo of employee
		System.out.println("Fetching the text value");
		String up3 = driver.findElement(By.xpath("//h3[contains(text(),'Upload 3 copies of photo of the employee')]"))
				.getText();
		System.out.println(up3);

		// Upload file1
		System.out.println("Upload the Photo in the Step-1");
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi4 = wait4
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='photo1']")));
		elementi4.sendKeys();
		Thread.sleep(2000);

		// Upload file2
		System.out.println("Upload the Photo in the Step-2");
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi5 = wait5
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='photo2']")));
		elementi5.sendKeys();
		Thread.sleep(2000);

		// Upload file3
		System.out.println("Upload the Photo in the Step-3");
		WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementi6 = wait6
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='photo3']")));
		elementi6.sendKeys();
		Thread.sleep(2000);

		// Decleration of Beneficiary
		System.out.println("Click on checkbox of Decleration");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// Button Next,Back
		ct.click_button();

		// Page-9
		// Emoployee Family Details

		// Text of Certificate Due
		System.out.println("Fetching the Text");
		String Tc = driver.findElement(By.xpath("//div[@class='p-10 shadow-lg mb-10 mt-5']//h3")).getText();
		System.out.println(Tc);

		// CheckBox
		System.out.println("Click on checkbox of Decleration");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// Click Back button
		System.out.println("Click on Back button");
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		// Click Save/Back button
		System.out.println("Click on Save Button");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

	}
}

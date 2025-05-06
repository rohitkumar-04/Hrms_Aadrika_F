package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Search_Emp {

	public WebDriver driver;

	public Search_Emp(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_sal_info(WebDriver driver, String[] data) throws Exception {

		// Step-1
		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/payroll-management");

		String p1 = driver.findElement(By.xpath("//h2[normalize-space()='Payroll Management']")).getText();
		System.out.println(p1);
		Assert.assertEquals("Payroll Management", p1);

		// Search Employee
		System.out.println("Search the Employee in the company");
		WebElement emp_search = driver.findElement(By.xpath("//input[@placeholder='E.g. Bineet kumar, EMP912e44']"));
		emp_search.clear();
		emp_search.sendKeys("");
		String td = ("td value");

		// Search Button
		System.out.println("Click on Search Button");
		driver.findElement(By.xpath("//button[normalize-space()='Search record']")).click();

		// Validate data in search box and displayed
		System.out.println("Validate the Data");
		WebElement emp_val = driver.findElement(By.xpath(
				"//section[@class='mx-16 mt-2']//td[@class='py-3 text-xl text-zinc-600 font-light']//div[@class='pl-5']//p[contains(text(),'E. ID - ')]"));
		String emp_id = emp_val.getText();
		if (td.contains(emp_id)) {

			// Payroll management
			// section[@class='mx-16 mt-2']//td[@class='py-3 text-xl text-zinc-600
			// font-light']//div[@class='pl-5']//p[@class='text-2xl font-medium
			// text-[#0E9D4A] ']
			System.out.println("Displaying Net Salary amount in here");
			WebElement emp_netSal = driver.findElement(By.xpath("//p[@class='text-2xl font-medium text-[#0E9D4A] ']"));
			System.out.println(emp_netSal.getText());

			// Status
			System.out.println("Displayed Status check for It");

			// Approve
			driver.findElement(By.xpath(
					"(//div[@class='pl-5 flex flex-col  gap-2 w-full'])[1]//button//span[normalize-space(text())='Approve']"));

			// Reject
			driver.findElement(By.xpath(
					"(//div[@class='pl-5 flex flex-col  gap-2 w-full'])[1]//button//span[normalize-space(text())='Reject']"));

			// Edit
			driver.findElement(By.xpath(
					"(//div[@class='pl-5 flex flex-col  gap-2 w-full'])[1]//button//span[normalize-space(text())='Edit']"));
			String emp_pay = driver.findElement(By.xpath("//h2[normalize-space()='Payroll Management']")).getText();
			System.out.println(emp_pay);
			Assert.assertEquals("Payroll Management", emp_pay);

			// Attendance Details
			// div[normalize-space()='Attendance Details']/..

			// Total no present days in text
			String emp_present_days_text = driver.findElement(By.xpath("// h3[text()='Total No. of Present Days']"))
					.getText();
			System.out.println(emp_present_days_text);

			// To no of present days in figure
			String emp_present_days_fig = driver.findElement(By.xpath(
					"//div[@class='w-full md:w-[48.5%] flex flex-col items-center justify-center relative border-r-2 border-[#C1C9EB] ']"))
					.getText();
			System.out.println(emp_present_days_fig);

			// Total No. of Absent Days in text
			String emp_absent_days_text = driver.findElement(By.xpath("//h3[text()='Total No. of Absent Days']"))
					.getText();
			System.out.println(emp_absent_days_text);

			// Total No. of Absent Days in figure
			String emp_absent_days_fig = driver
					.findElement(By.xpath(
							"//div[@class='w-full md:w-[48.5%]  flex flex-col items-center justify-center relative']"))
					.getText();
			System.out.println(emp_absent_days_fig);

			// permissible Leave
			WebElement emp_pl = driver.findElement(By.xpath("(//h3[@class='text-secondary text-xl flex items-center gap-2 text-xl flex items-center justify-between'])//div[normalize-space()='Permissible Leave']"));
			System.out.println(emp_pl.getText());

			// Date Range From
			System.out.println("Enter the date from");
			driver.findElement(By.xpath("(//input[@class='border mx-4 p-3'])[1]")).sendKeys("04-05-2025");

			// Date Range To
			System.out.println("Enter the date To");
			driver.findElement(By.xpath("(//input[@class='border mx-4 p-3'])[2]")).sendKeys("08-05-2025");

			// Total no of days
			System.out.println("Fetching data of number of days permissible leave requested");
			String s = driver.findElement(By.xpath("//div[normalize-space()='Total: days']")).getText();
			System.out.println("Value = " + s);

			// Enter Button
			System.out.println("Enter the button to proceed");
			driver.findElement(By.xpath("//button[contains(text(),'Enter')]")).click();
			
			

		}

	}
}

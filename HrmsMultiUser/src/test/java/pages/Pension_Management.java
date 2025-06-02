package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.WaitHelper;

public class Pension_Management {

	WebDriver driver;
	int data_Action;

	public Pension_Management(WebDriver driver, int data_Action) {
		this.driver = driver;
		this.data_Action = data_Action;
	}

	public void pension_manag(WebDriver driver) throws Exception {
		// Onboarding the Employee
		// employee Management left side

		WaitHelper wt = new WaitHelper();
		wt.waitTime();
		driver.findElement(By.xpath("//span[normalize-space()='Pension Management']")).click();
		wt.waitTime();

		driver.findElement(By.xpath("(//span[normalize-space()='Pension Management'])[2]")).click();
		wt.waitTime();
		/*
		 * driver.findElement(By.
		 * xpath("(//span[normalize-space()='Pension Management'])[2]")).click();
		 * wt.waitTime();
		 */

		String t2 = driver.findElement(By.xpath("//span[normalize-space()='Pension Management']")).getText();
		System.out.println(t2);
		Assert.assertEquals("Pension Management", t2);

		//driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/pension-management");

		// Process initialed by HR
		String s = ("//div[@class='w-auto md:w-6/12 sm:w-full h-auto mx-5 my-5 flex flex-col relative bg-[#ffffff] p-5 shadow-lg']//div[.='Process initiated by HR']");
		String sp = driver.findElement(By.xpath(s)).getText();
		System.out.println(sp);

		// String s1 =
		// driver.findElement(By.xpath("//div[@id='apexcharts5cehzslh']")).getText();
		// System.out.println(s1);

		// Disbursement
		String s2 = ("//div[@class='w-auto md:w-6/12 sm:w-full h-auto mx-5 my-5 flex flex-col relative bg-[#ffffff] p-5 shadow-lg']/..//div[.='Disbursement']");
		String sp2 = driver.findElement(By.xpath(s2)).getText();
		System.out.println(sp2);

		// String s3 =
		// driver.findElement(By.xpath("//div[@id='apexchartsl5p03zzth']")).getText();
		// System.out.println(s3);

		System.out.println("Enter the value 1:View and 2:Edit");
		if (data_Action == 1) {
			// Action View
			System.out.println("Action to be taken of Viewing");
			//WebElement vi =	driver.findElement(By.xpath("(//div[@class='flex items-center justify-around']//a[@class=' scale-125'])[2]"));
			WebElement vi = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[3]/section[1]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[1]/a[1]/*[name()='svg'][1]"));
			//("//button[@class=' scale-125']//a[@class=' scale-125']//*[name()='svg']");
			vi.click();

		}
		else {
		// Action Edit
		System.out.println("Action to be taken of Edit");
		driver.findElement(By.xpath("(//div[@class='flex items-center justify-around']//a[@class=' scale-125'])[1]")).click();
		}
		
		Thread.sleep(2000);

		// Pension Edit Page

	}

}

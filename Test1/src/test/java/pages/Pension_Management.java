package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.WaitHelper;

public class Pension_Management {

	WebDriver driver;

	public Pension_Management(WebDriver driver) {
		this.driver = driver;
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

		driver.findElement(By.xpath("(//span[normalize-space()='Pension Management'])[2]")).click();
		wt.waitTime();

		String t2 = driver.findElement(By.xpath("//span[normalize-space()='Pension Management']")).getText();
		System.out.println(t2);
		Assert.assertEquals("Pension Management", t2);

		driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/pension-management");

		// Process initialed by HR
		String s = ("//div[@class='w-auto md:w-6/12 sm:w-full h-auto mx-5 my-5 flex flex-col relative bg-[#ffffff] p-5 shadow-lg']//div[.='Process initiated by HR']");
		String sp = driver.findElement(By.xpath(s)).getText();
		System.out.println(sp);

		String s1 = driver.findElement(By.xpath("//div[@id='apexcharts5cehzslh']")).getText();
		System.out.println(s1);

		// Disbursement
		String s2 = ("//div[@class='w-auto md:w-6/12 sm:w-full h-auto mx-5 my-5 flex flex-col relative bg-[#ffffff] p-5 shadow-lg']/..//div[.='Disbursement']");
		String sp2 = driver.findElement(By.xpath(s2)).getText();
		System.out.println(sp2);

		String s3 = driver.findElement(By.xpath("//div[@id='apexchartsl5p03zzth']")).getText();
		System.out.println(s3);

		// Action Edit
		System.out.println("Action to be taken of Edit");
		driver.findElement(By.xpath("(//div[@class='flex items-center justify-around']//a[@class=' scale-125'])[1]"))
				.click();

		// Action View
		System.out.println("Action to be taken of Viewing");
		driver.findElement(By.xpath("(//div[@class='flex items-center justify-around']//a[@class=' scale-125'])[2]"))
				.click();

	}

}

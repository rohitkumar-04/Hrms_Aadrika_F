package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.WaitHelper;

public class Payroll_Management {

	WebDriver driver;	

	public Payroll_Management(WebDriver driver) {
		this.driver = driver;
	}

	public void payroll_manag(WebDriver driver) throws Exception {
		// Onboarding the Employee
		// employee Management left side

		WaitHelper wt = new WaitHelper();
		wt.waitTime();
		driver.findElement(By.xpath("//span[normalize-space()='Payroll Management']")).click();
		wt.waitTime();

		driver.findElement(By.xpath("//span[normalize-space()='Payroll']")).click();
		wt.waitTime();

		String t2 = driver.findElement(By.xpath("//h2[normalize-space()='Payroll Management']")).getText();
		System.out.println(t2);
		Assert.assertEquals("Payroll Management", t2);

	}

	
}

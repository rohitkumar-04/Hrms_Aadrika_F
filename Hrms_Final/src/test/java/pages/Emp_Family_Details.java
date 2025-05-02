package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Emp_Family_Details {
	public WebDriver driver;
	
	public Emp_Family_Details(WebDriver driver) {
		this.driver=driver;
	}
	
	public void emp_Family_Details(WebDriver driver, String[] data) throws Exception {
		// Step-8

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=8");

		String t8 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Family Details']")).getText();
		System.out.println(t8);
		Assert.assertEquals("Employee Family Details", t8);

		// Nominee name
		System.out.println("Enter Nominee name");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Nominee Name\"]")).sendKeys(data[68]);
		Thread.sleep(3000);

		// Relation
		System.out.println("Enter Relation");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Relation'])[2]")).sendKeys(data[69]);
		Thread.sleep(3000);

		// Percentage
		System.out.println("Enter Percentage");
		WebElement ep = driver.findElement(By.xpath("//input[@placeholder=\"Enter Percentage\"]"));
		ep.clear();
		Thread.sleep(1000);
		ep.sendKeys(data[70]);
		Thread.sleep(3000);

		// Address
		System.out.println("Enter Address");
		WebElement ea = driver.findElement(By.xpath("//input[@placeholder=\"Enter Address\"]"));
		ea.clear();
		Thread.sleep(1000);
		ea.sendKeys(data[71]);
		Thread.sleep(3000);

		// Minor
		String inp = data[72], val = "Yes";
		System.out.println("data minor is =" + inp);
		if (val.equalsIgnoreCase(inp)) {
			System.out.println("Choose Minor Status");
			driver.findElement(By.xpath("(//input[@value='Yes'])[2]")).click();
			Thread.sleep(3000);
		} else {
			System.out.println("Choose Minor Status");
			driver.findElement(By.xpath("(//input[@value='No'])[2]")).click();
			Thread.sleep(3000);
		}
		
	}

}

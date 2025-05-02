package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Emp_Service_History {
	public WebDriver driver;

	public Emp_Service_History(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_service_history(WebDriver driver, String[] data) throws Exception {

		// Step-7

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=7");

		String t7 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Service History']")).getText();
		System.out.println(t7);
		Assert.assertEquals("Employee Service History", t7);

		// Scale
		System.out.println("Enter Scale");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Scale\"]")).sendKeys(data[62]);
		Thread.sleep(3000);

		// Increment Date
		System.out.println("Enter Increment Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("//input[@name='inc_date']")).sendKeys(data[63]);
		Thread.sleep(3000);

		// Increment Amount
		System.out.println("Enter Increment Amount");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Increment Amount\"]")).sendKeys(data[64]);
		Thread.sleep(3000);

		// Basic Pay After Increment
		System.out.println("Enter Basic Pay After Increment");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Basic Pay After Increment\"]")).sendKeys(data[65]);
		Thread.sleep(3000);

		// Vide Order No
		System.out.println("Enter Vide Order No");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Vide Order No.\"]")).sendKeys(data[66]);

		// Vide Order Date
		System.out.println("Enter Vide Order Date");
		// String fsed = sc.nextLine();
		driver.findElement(By.xpath("//input[@name=\"vide_order_date\"]")).sendKeys(data[67]);
		Thread.sleep(3000);

	}

}

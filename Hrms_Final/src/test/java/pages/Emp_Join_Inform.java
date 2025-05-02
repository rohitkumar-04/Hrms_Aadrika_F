package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Emp_Join_Inform {
	public WebDriver driver;

	public Emp_Join_Inform(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_join_inform(WebDriver driver, String[] data) throws Exception {
		// Step-6

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=6");

		Thread.sleep(3000);
		String t6 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Joining Information']")).getText();
		System.out.println(t6);
		Assert.assertEquals("Employee Joining Information", t6);

		// Pay Scale
		System.out.println("Enter Pay Scale");
		WebElement eps = driver.findElement(By.id("id_pay_scale"));
		System.out.println(eps.isSelected());
		Select seps = new Select(eps);
		seps.selectByVisibleText(data[59]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Grade Pay
		System.out.println("Enter Grade Pay");
		WebElement egp = driver.findElement(By.id("id_grade_pay"));
		System.out.println(egp.isSelected());
		Select segp = new Select(egp);
		segp.selectByVisibleText(data[60]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Date Of Joining
		/*
		 * System.out.println("Enter the date picker"); String dob = new
		 * SimpleDateFormat(data[61]).format(new Date()); // or any date
		 * driver.findElement(By.id("id_dob")).sendKeys(dob);
		 */

		System.out.println("Enter Date Of Joining");
		// String fsed = sc.nextLine();
		WebElement dj = driver.findElement(By.id("id_doj"));
		dj.clear();
		dj.sendKeys(data[61]);
		Thread.sleep(3000);

	}

}

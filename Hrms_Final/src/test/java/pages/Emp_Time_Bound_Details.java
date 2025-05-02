package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Emp_Time_Bound_Details {
	
	public WebDriver driver;
	public Emp_Time_Bound_Details(WebDriver driver) {
		this.driver = driver;
	}
	

	public void emp_time_bound_details(WebDriver driver, String[] data) throws Exception {
		
		// Step-10

				// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=10");

				String t10 = driver
						.findElement(By.xpath("(//h2[normalize-space()='Time Bound Promotion/ACP/MACP details'])[1]"))
						.getText();
				System.out.println(t10);
				Assert.assertEquals("Time Bound Promotion/ACP/MACP details", t10);

				// Click Save button
				driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

	}

}

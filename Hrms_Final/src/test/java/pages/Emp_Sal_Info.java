package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Emp_Sal_Info {
	public WebDriver driver;
	public Emp_Sal_Info(WebDriver driver) {
		this.driver = driver;
	}
	

	public void emp_sal_info(WebDriver driver, String[] data) throws Exception{
		
		// Step-9
				// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=9");

				String t9 = driver.findElement(By.xpath("//h2[normalize-space()='Employee Salary Information']")).getText();
				System.out.println(t9);
				Assert.assertEquals("Employee Salary Information", t9);

				// Allowances
				System.out.println("Choose Allowances Status");
				driver.findElement(By.id("accounting")).click();
				Thread.sleep(3000);

				// Name Dropdown
				System.out.println("Enter Allowances Name");
				WebElement ean = driver
						.findElement(By.xpath("//select[@class=\"w-[20rem] border rounded-xl p-2 mt-2 bg-transparent\"]"));
				System.out.println(ean.isSelected());
				Select sean = new Select(ean);
				sean.selectByVisibleText(data[73]);
				// sed.selectByIndex(1);
				Thread.sleep(3000);

				// WEF Date
				System.out.println("Enter Allowances WEF Date");
				// String fsed = sc.nextLine();
				WebElement ead = driver.findElement(By.xpath("//input[@placeholder=\"Enter Date\"]"));
				ead.clear();
				ead.sendKeys(data[74]);
				Thread.sleep(3000);

				// Amount
				System.out.println("Enter Allowances Amount");
				driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys(data[75]);
				Thread.sleep(3000);

				// Deductions
				System.out.println("Choose Deductions Status");
				driver.findElement(By.id("function")).click();
				Thread.sleep(3000);

				// Name
				System.out.println("Enter Deductions Name");
				WebElement edn = driver
						.findElement(By.xpath("//select[@class=\"w-[20rem] border rounded-xl p-2 mt-2 bg-transparent\"]"));
				System.out.println(edn.isSelected());
				Select sedn = new Select(edn);
				sedn.selectByVisibleText(data[76]);
				// sed.selectByIndex(1);
				Thread.sleep(3000);

				// WEF Date
				System.out.println("Enter Deductions WEF Date");
				// String fsed = sc.nextLine();
				WebElement edd = driver.findElement(By.xpath("//input[@placeholder=\"Enter Date\"]"));
				edd.clear();
				edd.sendKeys(data[77]);
				Thread.sleep(3000);

				// A/C No
				System.out.println("Enter Deductions A/C No");
				driver.findElement(By.xpath("//input[@placeholder=\"Enter Accnt No \"]")).sendKeys(data[78]);
				Thread.sleep(3000);

				// Amount
				System.out.println("Enter Deductions Amount");
				WebElement sa = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
				sa.click();
				sa.clear();
				System.out.println("Amt = " + data[79]);
				sa.sendKeys(data[79]);
				Thread.sleep(3000);

		
	}

}

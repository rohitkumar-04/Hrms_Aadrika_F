package pages;

import java.util.List;

//import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import utils.WaitHelper;

public class Emp_Off_Details {

	public WebDriver driver;
	public String[] data;
	public static final int idx = 0;

	/*
	 * public Emp_Off_Details(WebDriver driver) { this.driver = driver; // this.data
	 * =data; }
	 */

	public Emp_Off_Details(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_Ofc_Details(WebDriver driver, List<String[]> data) throws Exception {
		// WaitHelper wt = new WaitHelper();
		System.out.println("Employee Office  Details");
		driver.findElement(By.xpath("// span[normalize-space()='Office Details']")).click();
		
		Thread.sleep(1000);

		System.out.println("Enter the value you want to choose\n" + "1:Existing Employee\n" + "2:New Employee\n");
		// Scanner sc = new Scanner(System.in);
		// int emp_type = sc.nextInt();
		int emp_type = 2;
		if (emp_type == 1) {
			driver.findElement(By.xpath("//label[normalize-space()='Existing Employee']")).click();
			Thread.sleep(2000);
		} else {
			driver.findElement(By.xpath("//label[normalize-space()='New Employee']")).click();
		}

		// District
		WebElement e_district = driver.findElement(By.id("id_district"));
		System.out.println("Start District Dropdown Selection");
		Select s1 = new Select(e_district);
		s1.selectByVisibleText(data.get(idx)[0]);
		Thread.sleep(3000);

		// Treasury Name
		System.out.println("Select the value from Treasury Name");
		WebElement inputField = driver.findElement(By.xpath("//input[@placeholder=\"Select Treasury Name\"]"));
		inputField.sendKeys(data.get(idx)[1]);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		// DDO Code
		System.out.println("Select DDO Code Dropdown");
		WebElement inputField2 = driver.findElement(By.xpath("//input[@placeholder=\"Select DDO Code\"]"));
		inputField2.sendKeys(data.get(idx)[2]);
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		// sc.close();
	}

}

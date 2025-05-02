package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Emp_Prsnl_Details {
	public WebDriver driver;
	public Emp_Prsnl_Details(WebDriver driver) {
		this.driver = driver;
	}
	

	public void emp_prsnl_details(WebDriver driver, String[] data) throws Exception {
		Thread.sleep(3000);
		// Step-3

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=3");

		String t3 = driver
				.findElement(By.xpath(
						"//h2[@class='text-secondary text-mid_head font-medium flex items-center gap-2 undefined']"))
				.getText();
		System.out.println(t3);
		Assert.assertEquals("Employee Personal Details", t3);

		// Married status
		WebElement em = driver.findElement(By.id("id_married_status"));
		System.out.println(em.isSelected());
		System.out.println("Start Married status Dropdown Selection");
		Select sm = new Select(em);
		sm.selectByVisibleText(data[18]);
		Thread.sleep(3000);

		// Identification Marks
		System.out.println("Enter the Identification Marks");
		// String fseg = sc.nextLine(); // Cut
		driver.findElement(By.id("id_identification_marks")).sendKeys(data[19]);
		Thread.sleep(3000);

		// Religion
		WebElement re = driver.findElement(By.id("id_religion"));
		System.out.println(re.isSelected());
		System.out.println("Start Religion Dropdown Selection");
		Select sre = new Select(re);
		sre.selectByVisibleText(data[20]);
		// sre.selectByIndex(2);
		Thread.sleep(3000);

		// Categories
		WebElement ec = driver.findElement(By.id("id_emp_categories"));
		System.out.println(ec.isSelected());
		System.out.println("Start Categories Dropdown Selection");
		Select sec = new Select(ec);
		sec.selectByVisibleText(data[21]);
		Thread.sleep(3000);

		// State
		System.out.println("Enter the state");
		WebElement inputField_state = driver.findElement(By.xpath("//button[@aria-label='Open']"));
		inputField_state.click();
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
		options.get(13).click();

		Thread.sleep(5000);

		// District
		WebElement ed = driver.findElement(By.id("id_emp_district"));
		System.out.println(ed.isSelected());
		System.out.println("Start District Dropdown Selection");
		Select sed = new Select(ed);
		sed.selectByVisibleText(data[22]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Blood Group
		WebElement ebg = driver.findElement(By.id("id_emp_blood_group"));
		System.out.println(ebg.isSelected());
		System.out.println("Start Blood Group Dropdown Selection");
		Select sebg = new Select(ebg);
		sebg.selectByVisibleText(data[23]);
		Thread.sleep(3000);

		// Health Status
		WebElement ehs = driver.findElement(By.id("id_emp_health_status"));
		System.out.println(ehs.isSelected());
		System.out.println("Start Health Status Dropdown Selection");
		Select sehs = new Select(ehs);
		sehs.selectByVisibleText(data[24]);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementg = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"emp_health_file\"]")));
		elementg.sendKeys(data[25]);
		Thread.sleep(2000);

		// LTC Home Town
		System.out.println("Enter the LTC Home Town");
		// String fseg = sc.nextLine(); // namkum lodge
		driver.findElement(By.id("id_emp_ltc_home_town")).sendKeys(data[26]);
		Thread.sleep(3000);

		// Nearest Railway Station
		System.out.println("Nearest Railway Station");
		// String fseg = sc.nextLine(); // Ranchi
		driver.findElement(By.id("id_emp_nearest_railway_station")).sendKeys(data[27]);
		Thread.sleep(3000);

		// Physical Health Type
		WebElement eph = driver.findElement(By.id("id_emp_phy_health_type"));
		System.out.println(eph.isSelected());
		System.out.println("Start Physical Health Type Dropdown Selection");
		Select seph = new Select(eph);
		seph.selectByVisibleText(data[28]);
		Thread.sleep(3000);

		// Family/Guardian
		WebElement efm = driver.findElement(By.id("id_emp_family"));
		System.out.println(efm.isSelected());
		System.out.println("Start Family/Guardian Dropdown Selection");
		Select sefm = new Select(efm);
		sefm.selectByVisibleText(data[29]);
		Thread.sleep(3000);
		driver.findElement(By.id("id_emp_family_name")).sendKeys(data[30]); // Name = Abc
		/*
		 * // Language WebElement elan = driver.findElement(By.id("id_emp_lang"));
		 * System.out.println(elan.isSelected());
		 * System.out.println("Start Language Dropdown Selection"); Select selan = new
		 * Select(elan); selan.selectByVisibleText("English"); Thread.sleep(3000);
		 */
	}

}

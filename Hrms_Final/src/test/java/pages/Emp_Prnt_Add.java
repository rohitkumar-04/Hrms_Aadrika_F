package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Emp_Prnt_Add {

	public WebDriver driver;

	public Emp_Prnt_Add(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_prnt_add(WebDriver driver, String[] data) throws Exception {

		// driver.navigate().to("https://test.aadrikainfomedia.com/hrms/ems/onboard?page=4");

		String t4 = driver
				.findElement(By.xpath(
						"//h2[@class='text-secondary text-mid_head font-medium flex items-center gap-2 undefined']"))
				.getText();
		System.out.println(t4);
		Assert.assertEquals("Employee Present Address", t4);

		// Address-1* text
		System.out.println("Please Enter the Correct Primary Address");
		// String add1 = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_address_primary")).sendKeys(data[31]);
		Thread.sleep(3000);

		// Address-2 text
		System.out.println("Please Enter the Correct Secondary Address");
		// String add2 = sc.nextLine(); // Ranchi
		driver.findElement(By.id("id_address_secondary")).sendKeys(data[32]);
		Thread.sleep(3000);

		// Village/Town/City text
		System.out.println("Enter Village/Town/City text  ");
		// String ev = sc.nextLine(); // Ranchi gao
		driver.findElement(By.id("id_village")).sendKeys(data[33]);
		Thread.sleep(3000);

		// Post Office text
		System.out.println("Enter Post Office text");
		// String fseg = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_post_office")).sendKeys(data[34]);
		Thread.sleep(3000);

		// State
		System.out.println("Enter the state");
		WebElement inputField_state = driver.findElement(By.xpath("//button[@aria-label='Open']"));
		inputField_state.click();
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
		options.get(13).click();

		Thread.sleep(5000);

		// District
		WebElement ed = driver.findElement(By.id("id_district"));
		System.out.println(ed.isSelected());
		System.out.println("Start District Dropdown Selection");
		Select sed = new Select(ed);
		sed.selectByVisibleText(data[35]);
		// sed.selectByIndex(1);
		Thread.sleep(3000);

		// Block ULB Dropdown
		WebElement eblck = driver.findElement(By.id("id_block_ulb"));
		System.out.println(eblck.isSelected());
		System.out.println("Start Block ULB Dropdown Selection");
		Select seblck = new Select(eblck);
		seblck.selectByVisibleText(data[36]); // Ranchi (Nagar Nigam)
		Thread.sleep(3000);

		// Pin Code text
		System.out.println("Enter Pin Code text");
		// String fseg = sc.nextLine(); // 834450
		driver.findElement(By.id("id_pin_code")).sendKeys(data[37]);
		Thread.sleep(3000);

		// Police Station text
		System.out.println("Enter Police Station text");
		// String fseg = sc.nextLine(); // Namkum
		driver.findElement(By.id("id_police_station")).sendKeys(data[38]);
		Thread.sleep(3000);

	}
}
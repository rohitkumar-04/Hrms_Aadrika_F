package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Emp_Edu_Train_Details {

	public WebDriver driver;

	public Emp_Edu_Train_Details(WebDriver driver) {
		this.driver = driver;
	}

	public void emp_edu_train_details(WebDriver driver, String[] data) throws Exception {
		String t5 = driver.findElement(By.xpath("//h2[text()='Employee Education & Training Details']")).getText();
		System.out.println(t5);
		Assert.assertEquals("Employee Education & Training Details", t5);

		matric(driver, data);
		inter(driver, data);
		graduate(driver, data);
		postgraduate(driver, data);

		// Training Information
		// Name of Training
		// Training Type
		// Name of Institution
		// Starting From (Date)
		// End to (Date)
		// Enter Total Days of Training
		// Upload document

		Thread.sleep(3000);
		validte(driver);

		Thread.sleep(3000);

	}

	public static void validte(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Education Level Matric Details click and delete n");
		WebElement val = driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[1]"));
		val.clear();
		val.sendKeys("Matriculation");
		/*
		 * Actions av = new Actions(driver);
		 * av.sendKeys(Keys.END).sendKeys(Keys.BACK_SPACE).build().perform();
		 */
		Thread.sleep(3000);
		/*
		 * inputField_state.sendKeys("Jharkhand"); // Actions actions2 = new
		 * Actions(driver);
		 * actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 * Thread.sleep(3000);
		 */

	}

	public static void matric(WebDriver driver, String[] data) throws InterruptedException {
		// TODO Auto-generated method stub
		// Education Level
		// Matric
		String mat = data[39];
		if (mat == null || mat.trim().isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");

			System.out.println("Matric Details");
			// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[1]")).sendKeys("");
			// Thread.sleep(2000);

			// Subject Matric
			System.out.println("Subject Matric");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[2]")).sendKeys(data[39]);
			Thread.sleep(2000);

			// Board Matric
			System.out.println("Board Matric");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[3]")).sendKeys(data[40]);
			Thread.sleep(2000);

			// Passing Year Matric
			System.out.println("Passing Year Matric");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[4]")).sendKeys(data[41]);
			Thread.sleep(2000);

			// Marks in % Matric
			System.out.println("Marks in % Matric");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[5]")).sendKeys(data[42]);
			Thread.sleep(2000);

			// Grade/Division
			System.out.println("Grade Auto given");
			// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[6]")).sendKeys("");
			// Thread.sleep(2000);

			// Upload Documnent
			System.out.println("Upload Documnent");
			// WebElement el = driver.findElement(By.xpath("//label[@for=\"xyz-0\"]"));
			Thread.sleep(2000);
			// el.sendKeys("C:\\Users\\aadrika\\Desktop\\Test.pdf");
			// el.sendKeys("/TestSample/Test.pdf");
			// element.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-0")));
			element.sendKeys(data[43]);
			Thread.sleep(2000);
		}

	}

	public static void inter(WebDriver driver, String[] data) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Intermediate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[7]")).sendKeys("");
		// Thread.sleep(2000);
		String inter = data[44];
		if (inter == null || inter.trim().isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");
			// Subject Intermediate
			System.out.println("Subject Intermediate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[8]")).sendKeys(data[44]);
			Thread.sleep(2000);

			// Board Intermediate
			System.out.println("Board Intermediate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[9]")).sendKeys(data[45]);
			Thread.sleep(2000);

			// Passing Year Intermediate
			System.out.println("Passing Year Intermediate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[10]")).sendKeys(data[46]);
			Thread.sleep(2000);

			// Marks in % Intermediate
			System.out.println("Marks in % Intermediate");
			driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[11]")).sendKeys(data[47]);
			Thread.sleep(2000);

			// Grade/Division
			System.out.println("Grade Auto given");
			// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[6]")).sendKeys("");
			// Thread.sleep(2000);

			// Upload Documnent
			/*
			 * System.out.println("Upload Documnent");
			 * driver.findElement(By.xpath("//label[@for=\"xyz-1\"]")).sendKeys(
			 * "C:\\Users\\aadrika\\Desktop\\Test.pdf"); Thread.sleep(2000);
			 */
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement elementi = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-1")));
			elementi.sendKeys(data[48]);
			Thread.sleep(2000);
		}
	}

	public static void graduate(WebDriver driver, String[] data) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Graduate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[13]")).sendKeys("");
		// Thread.sleep(2000);
		String gr = data[49];
		if (gr == null || gr.trim().isEmpty()) {
			System.out.println("Data Empty");
		} else {

			System.out.println("Data Present");
			// Subject Intermediate
			System.out.println("Subject Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[14]")).sendKeys(data[49]);
			Thread.sleep(2000);

			// Board Intermediate
			System.out.println("Board Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[15]")).sendKeys(data[50]);
			Thread.sleep(2000);

			// Passing Year Intermediate
			System.out.println("Passing Year Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[16]")).sendKeys(data[51]);
			Thread.sleep(2000);

			// Marks in % Intermediate
			System.out.println("Marks in % Graduate");
			driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[17]")).sendKeys(data[52]);
			Thread.sleep(2000);

			// Grade/Division
			System.out.println("Grade Auto given");
			// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[6]")).sendKeys("");
			// Thread.sleep(2000);

			// Upload Documnent
			/*
			 * System.out.println("Upload Documnent");
			 * driver.findElement(By.xpath("//label[@for='xyz-2']")).sendKeys(
			 * "C:\\Users\\aadrika\\Desktop\\Test.pdf"); Thread.sleep(2000);
			 */
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement elementg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-2")));
			elementg.sendKeys(data[53]);
			Thread.sleep(2000);
		}

	}

	public static void postgraduate(WebDriver driver, String[] data) throws InterruptedException {

		// Education Level
		// Intermediate Marks
		System.out.println("Post Graduate Marks Details");
		// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[19]")).sendKeys("");
		// Thread.sleep(2000);
			String pg = data[54];
			System.out.println(pg);
			if (pg == null || pg.isEmpty()) {
				System.out.println("Data Empty");
			} else {


			System.out.println("Data Present");
			System.out.println("Subject Post Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[20]")).sendKeys(data[54]);
			Thread.sleep(2000);

			// Board Intermediate
			System.out.println("Board Post Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[21]")).sendKeys(data[55]);
			Thread.sleep(2000);

			// Passing Year Intermediate
			System.out.println("Passing Year Post Graduate");
			driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[22]")).sendKeys(data[56]);
			Thread.sleep(2000);

			// Marks in % Intermediate
			System.out.println("Marks in % Post Graduate");
			driver.findElement(By.xpath("(//input[@placeholder=\"Enter \"])[23]")).sendKeys(data[57]);
			Thread.sleep(2000);

			// Grade/Division
			System.out.println("Post Graduate Grade Auto given");
			// driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter')])[24]")).sendKeys("");
			// Thread.sleep(2000);

			// Upload Documnent
			/*
			 * System.out.println("Upload Documnent");
			 * driver.findElement(By.xpath("//label[@for='xyz-3']")).sendKeys(
			 * "C:\\Users\\aadrika\\Desktop\\Test.pdf"); Thread.sleep(2000);
			 */
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement elementg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("xyz-3")));
			elementg.sendKeys(data[58]);
			Thread.sleep(2000);
		}

	}

}

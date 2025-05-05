package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import locators.Hrms_Onboard_Page_Locators;

public class Hrms_Onboard_Page_Actions {

	WebDriver driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Hrms_Onboard_Page_Locators onboardPageLocators;

	public Hrms_Onboard_Page_Actions(WebDriver driver) {
		this.driver = driver;
		onboardPageLocators = new Hrms_Onboard_Page_Locators();
		PageFactory.initElements(driver, onboardPageLocators);

	}

	public void ClickonEmpmangPage() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(onboardPageLocators.Emp_Mangemnt)).click();

	}

	public void ClickOnBoardPage() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(onboardPageLocators.Emp_Onboard)).click();
	}

	public void GetText_OnBoardPage() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(onboardPageLocators.Emp_On_emp)).getText();
		// System.out.println(t2);
		// Assert.assertEquals("Onboarding the Employee", t2);

		if (driver.getPageSource().contains("Onboarding the Employee")) {
			System.out.println("Pop up msg is correct for Onboarding the Employee");
			softassert.assertTrue(true);

		} else {
			System.out.println("Pop up msg is Wrong for Onboarding the Employee");
			softassert.assertFalse(true);

		}
		softassert.assertAll();
	}

}

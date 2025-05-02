package stepDefinations;

import org.openqa.selenium.WebDriver;

import Locators.BasePage;

public class BaseTest {
	public static WebDriver driver;
	public BaseTest(WebDriver driver) {
		BasePage.driver=driver;
	}
}

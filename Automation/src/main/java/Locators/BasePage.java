package Locators;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public static WebDriver driver;
	public BasePage(WebDriver driver) {
		BasePage.driver=driver;
	}

}

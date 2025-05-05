package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hrms_Onboard_Page_Locators {

	/*
	 * @FindBy(how = How.XPATH,using =
	 * "//span[normalize-space()='Employee Management']") public WebElement
	 * Catalog_Page;
	 */

	@FindBy(xpath = "//span[normalize-space()='Employee Management']")
	public WebElement Emp_Mangemnt;

	@FindBy(xpath = "//span[normalize-space()='Onboard']")
	public WebElement Emp_Onboard;

	@FindBy(xpath = "//h2[normalize-space()='Onboarding the Employee']")
	public WebElement Emp_On_emp;

	@FindBy(xpath = "")
	public WebElement Emp_V;

}

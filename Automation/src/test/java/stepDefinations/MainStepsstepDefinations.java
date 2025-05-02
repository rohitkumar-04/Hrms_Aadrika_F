package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.MainSteps;
import utils.TestContextSetup;

public class MainStepsstepDefinations {
	TestContextSetup textContextSetup;

	public MainStepsstepDefinations(TestContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
	}

	@Given("User login into application")
	public void user_login_into_application() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Landing Page");
		textContextSetup.driver = new ChromeDriver();
		textContextSetup.driver.get("https://www.saucedemo.com/v1/");
		textContextSetup.driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@When("I complete action")
	public void i_complete_action() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebDriver driver = textContextSetup.driver;
		MainSteps mainSt = new MainSteps(driver);
		
		mainSt.user_name(); 	//Username
		Thread.sleep(3000);
		
		mainSt.pass_word();			//Password
		Thread.sleep(3000);
		
		mainSt.button_click();			//Button
		Thread.sleep(3000);

	}

}

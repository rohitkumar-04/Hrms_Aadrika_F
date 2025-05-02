package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;
import utils.BaseP;

public class LoginstepDefinations {

	BaseP basep;
	
	public LoginstepDefinations(BaseP basep) {
		this.basep= basep;
	}
	
	
	@Given("I want to write a open url in aadrika")
	public void i_want_to_write_a_open_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Enter the url");
	  basep.driver = new ChromeDriver();
	  Login lg = new Login(basep.driver);	  
	  basep.driver.get(lg.url);
	  basep.driver.manage().window().maximize();
	  Thread.sleep(5000);
	}

	@Then("some check login page")
	public void some_check_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter Username Password");
		WebDriver driver = basep.driver;
		Login lg1 = new Login(driver);
		
		lg1.user_name(); 	  // Username
		Thread.sleep(3000);
		
		lg1.pass_word();			//Password
		Thread.sleep(3000);
		
		lg1.button_click();			//Button
		Thread.sleep(3000);

	}

	   

	@When("I complete close browser")
	public void i_complete_close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Close the tab");
		 basep.driver.close();
	   
	}
	
	
}

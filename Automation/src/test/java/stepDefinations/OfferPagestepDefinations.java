package stepDefinations;

import io.cucumber.java.en.Then;

import utils.TestContextSetup;

public class OfferPagestepDefinations {
	TestContextSetup textContextSetup;

	public OfferPagestepDefinations(TestContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("End");
		Thread.sleep(2000);
		textContextSetup.driver.quit();
		System.out.println("Stop");
	}
}

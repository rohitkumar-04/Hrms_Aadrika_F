package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class MainSteps {
	public WebDriver driver;
	//TestContextSetup textContextSetup;
	
	public MainSteps(WebDriver driver) {
		this.driver = driver;
	}
	

	By search = By.id("user-name");
	
	By search1 = By.id("password") ;
	By search2 = By.id("login-button");
	
	

	public void user_name() {
		// TODO Auto-generated method stub
		driver.findElement(search).sendKeys("standard_user");

		
	}
	public void pass_word() {
		// TODO Auto-generated method stub
		driver.findElement( search1).sendKeys("secret_sauce");
		
	}

	public void button_click() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("login-button")).click();
		
	}



}

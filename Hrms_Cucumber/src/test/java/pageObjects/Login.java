package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {
	public WebDriver driver;	


	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	public String url= ("https://test.aadrikainfomedia.com/hrms/auth/login");

	By search = By.id("id_user_id");
	
	By search1 = By.id("id_password") ;

	By search2 = By.xpath("//button[type='submit']");
	
	

	public void user_name() {
		// TODO Auto-generated method stub
	driver.findElement(search).sendKeys("hradminrmc@gmail.com");

		
	}
	public void pass_word() {
		// TODO Auto-generated method stub
		driver.findElement( search1).sendKeys("Admin1#");
		
	}

	public void button_click() {
		// TODO Auto-generated method stub
	
	driver.findElement(search2).click();
	}

	

}

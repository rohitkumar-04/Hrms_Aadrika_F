package HrmsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import TestData.Login;



public class hrms {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter the url");
		  WebDriver driver = new ChromeDriver();
		   
		  driver.get("https://test.aadrikainfomedia.com/hrms/auth/login");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		  
		  Login lg1 = new Login(driver);
			
			lg1.user_name(); 	  // Username
			Thread.sleep(3000);
			
			lg1.pass_word();			//Password
			Thread.sleep(3000);
			
			lg1.button_click();			//Button
			Thread.sleep(3000);
			
			String t1 = driver.getTitle();
			System.out.println(t1);
			
			Assert.assertEquals("Juidco HRMS",t1);
			
			//employee Management left side
			driver.findElement(By.xpath("//span[normalize-space()='Employee Management']")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//span[normalize-space()='Onboard']")).click();
			
			Thread.sleep(2000);
			
			
			String t2 = driver.findElement(By.xpath("//h2[normalize-space()='Onboarding the Employee']")).getText();
			System.out.println(t2);
			Assert.assertEquals("Onboarding the Employee",t2);
			
			
			
			System.out.println("Enter the Quick link to get directly to employee");
			
			
			{
				
			//driver.findElement()	
				
			
			}
			
			//span[normalize-space()='Office Details']
			
			//span[normalize-space()='Employee Details']
			
			//span[normalize-space()='Personal Details']
			
			//span[normalize-space()='Address Details']
			
			//span[normalize-space()='Education & Training']
			
			//span[normalize-space()='Joining Information']
			
			//span[normalize-space()='Service History']
			
			//span[normalize-space()='Family & Nominee']
			
			//span[normalize-space()='Salary Information']
			
			//span[normalize-space()='Time Bound Details']
			
			
			
			
			System.out.println("True");
			
			
			
			driver.close();
			System.out.println("End the task");

		}
		
		
		
	}

	 

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class citizenLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");

		String ns = "https://aadrikainfomedia.com/citizen";
		driver.get(ns);
		String s = driver.getTitle();
		System.out.println(s);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Citizen Login']"));
		ele1.click();

		System.out.println("Title of page : " + driver.getTitle());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String s1 = ("//input[@placeholder='Enter Your mobile']");
		WebElement ele2 = driver.findElement(By.xpath(s1));
		// WebElement ele2 = driver.findElement(By.name("mobile")); ele2.clear();
		ele2.sendKeys("0123456789");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s2 = ("//input[@name='password']");
		WebElement ele3 = driver.findElement(By.xpath(s2));
		// WebElement ele3 = driver.findElement(By.name("mobile"));
		ele3.clear();
		System.out.println("enter Password");
		String ps = sc.nextLine();
		ele3.sendKeys(ps);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * String v = driver.getTitle(); String v2 = "Password Must Contains";
		 * 
		 * String g =
		 * "Password Must Contains (Capital, Smail, Number, Special) eg - Abc123#.";
		 * String g2 = "Minimum six character !";
		 * 
		 * if (v2.contains(g)) { String s3 = "//span[text()='Forgot Password']";
		 * driver.findElement(By.xpath(s3)).click();
		 * 
		 * } else {
		 * 
		 * System.out.println("3" + v);
		 * 
		 * }
		 */

		driver.quit();
		sc.close();
		System.out.println("Stop");

	}

}

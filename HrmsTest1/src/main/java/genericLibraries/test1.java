package genericLibraries;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String ns = "https://aadrikainfomedia.com/citizen";
		driver.get(ns);
		String s = driver.getTitle();
		System.out.println(s);
		Thread.sleep(3000);
		System.out.println("Enter the value to  enter 1.Citizen , 2.Admin, 3.Agency");
		int opt = sc.nextInt();
		// int opt = 1;
		switch (opt) {
		case 1:
			WebElement ele1 = driver.findElement(By.xpath("//span[text()='Citizen Login']"));
			ele1.click();
			break;
		case 2:
			WebElement ele2 = driver.findElement(By.xpath("//span[text()='Admin Log In']"));
			ele2.click();
			break;
		case 3:
			WebElement ele3 = driver.findElement(By.xpath("//span[text()='Agency Log In']"));
			ele3.click();

			break;

		default:
			System.out.println("Wrong Input Try Again");
			break;
		}

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ns1 = "https://aadrikainfomedia.com/citizen";
		js.executeScript("window.open()");

		for (String hd : driver.getWindowHandles()) {
			driver.switchTo().window(hd);
		}
		driver.get(ns1);
		System.out.println("Title of new page: " + driver.getTitle());

		System.out.println("Enter the value to  enter 1.Citizen , 2.Admin, 3.Agency");
		int opt1 = sc.nextInt();
		// int opt1 = 2;
		switch (opt1) {
		case 1:
			WebElement ele1 = driver.findElement(By.xpath("//span[text()='Citizen Login']"));
			ele1.click();
			break;
		case 2:
			WebElement ele2 = driver.findElement(By.xpath("//span[text()='Admin Log In']"));
			ele2.click();
			break;
		case 3:
			WebElement ele3 = driver.findElement(By.xpath("//span[text()='Agency Log In']"));
			ele3.click();

			break;

		default:
			System.out.println("Wrong Input Try Again");
			break;
		}

		// Close the Browser
		Thread.sleep(3000);
		//driver.quit();

		System.out.println("Stop");
		sc.close();

	}

}

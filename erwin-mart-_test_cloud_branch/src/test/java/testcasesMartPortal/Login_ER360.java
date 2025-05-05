package testcasesMartPortal;

import Utilities.Constants;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import static testcasesMartPortal.BaseTest.driver;
import static testcasesMartPortal.BaseTest.logger;

public class Login_ER360
{
    SoftAssert softAssert = new SoftAssert();
    WebDriverWait wait;

    public void loginER() throws InterruptedException {
        System.out.println("User Clicks on ER360 Icon");
        logger.log(Status.INFO,"User Clicks on ER360 Icon");
        driver.findElement(By.xpath("//a[@href='/ER360/main/home']")).click();
        Thread.sleep(4000);
        Set<String> allwindows = driver.getWindowHandles();
        Iterator<String> iterator = allwindows.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();
        driver.switchTo().window(childwindow);

        try {
            if (driver.getCurrentUrl().contains("ER360")) {
                System.out.println("ER360 url is loaded");
                logger.log(Status.INFO, "ER360 url is loaded");
                wait = new WebDriverWait(driver, Duration.ofSeconds(40));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']"))).clear();
                driver.findElement(By.xpath("//input[@type='text']")).clear();
                driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Constants.USERNAME);

                driver.findElement(By.xpath("//input[@type='password']")).click();
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys((Constants.PASSWORD));
                logger.log(Status.INFO, "Entering ER360 Username and Password");
                Thread.sleep(4000);
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                try {
                    wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"))).click();
                    Thread.sleep(4000);
                } catch (Exception e)
                {
                    System.out.println(" OK Pop up msg not found ");
                    logger.log(Status.INFO,"OK Pop up msg not found");
                }
                //driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]")).click();
                System.out.println("Successfully logged into ER360");
                logger.log(Status.INFO, "Successfully logged into ER360");
                softAssert.assertTrue(true);
            } else {
                softAssert.assertFalse(true);
                System.out.println("Error in loading ER360 URL. Kindly check ER360 URL");
                logger.log(Status.INFO, "Error in loading ER360 URL. Kindly check ER360 URL");
                Assertion hardAssert = new Assertion();
                hardAssert.assertFalse(true, "Skipping ER360 test cases as there is problem logging in ER360");

            }
            softAssert.assertAll();
        }catch (Exception e)
        {
            logger.log(Status.INFO, "Skipping ER360 test cases as there is problem logging in ER360");
            Assertion hardAssert = new Assertion();
            hardAssert.assertFalse(true, "Skipping ER360 test cases as there is problem logging in ER360");
        }

    }
}

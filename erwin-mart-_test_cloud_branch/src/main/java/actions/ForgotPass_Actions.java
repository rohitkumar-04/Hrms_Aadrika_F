package actions;


import locators.ForgotPass_Locators;
import locators.Settings_Page_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class ForgotPass_Actions {
    WebDriver driver;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();


    public ForgotPass_Locators forgotPassLocators;


    public ForgotPass_Actions(WebDriver driver) {
        this.driver = driver;
        forgotPassLocators =  new ForgotPass_Locators();
        PageFactory.initElements(driver,forgotPassLocators);

    }

    public void ClickOnProfilePicIcon()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassLocators.ProfilePicIcon)).click();

    }

    public void ClickOnLogout()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassLocators.Logout)).click();
    }
    public void ClickOnForgotPassword()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassLocators.ForgotPassword)).click();
    }
    public void EnterUsername()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassLocators.EnterUsername)).click();
        forgotPassLocators.EnterUsername.sendKeys("test");
    }
    public void EnterEmail()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassLocators.EnterEmailAddress)).click();
        forgotPassLocators.EnterEmailAddress.sendKeys("prabhat.kumar@quest.com");
    }

    public void ClickOnSubmitButtonForForgotPass()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassLocators.SubmitButtonForForgotPassword)).click();
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("Password is being sent to the registered email address") || driver.getPageSource().contains("Password has been sent to your email")) {
            System.out.println("Password is sent successfully");
            softAssert.assertTrue(true);

        } else {
            System.out.println("Error in sending the password");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }




}


















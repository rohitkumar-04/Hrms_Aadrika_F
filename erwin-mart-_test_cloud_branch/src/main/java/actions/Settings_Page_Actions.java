package actions;


import locators.EG_Locators;
import locators.Settings_Page_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class Settings_Page_Actions {
    WebDriver driver;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();


    public Settings_Page_Locators settingsPageLocators;


    public Settings_Page_Actions(WebDriver driver) {
        this.driver = driver;
        settingsPageLocators = new Settings_Page_Locators();
        PageFactory.initElements(driver, settingsPageLocators);


    }

    public void ClickOnSettingsPage() {


        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.Settings_Page)).click();



    }
    public void Zoomout() throws AWTException {
        Robot robot =  new Robot();
        for(int i = 0; i < 4; i++)
        {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SUBTRACT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SUBTRACT);
        }

    }

    public void ClickSmtpCheckbox() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.ResetButton)).click();
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.SmtpCheckbox2)).click();

    }

    public void Enter_SMTP_HostName(String SMTP) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.EnterSmtpHostname)).click();
        settingsPageLocators.EnterSmtpHostname.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        settingsPageLocators.EnterSmtpHostname.sendKeys(SMTP);
    }

    public void Enter_Port_Number(String PortNumber) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.EnterPortNumber)).click();
        settingsPageLocators.EnterPortNumber.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        settingsPageLocators.EnterPortNumber.sendKeys(PortNumber);
    }

    public void click_AuthenticateCheckbox() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.AuthenticateCheckbox2)).click();

    }

    public void Enter_SMTP_UserName(String Username) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.SmtpUsername)).click();
        settingsPageLocators.SmtpUsername.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        settingsPageLocators.SmtpUsername.sendKeys(Username);
    }

    public void Enter_SMTP_Password(String Password) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.SmtpPass)).click();
        settingsPageLocators.SmtpPass.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        settingsPageLocators.SmtpPass.sendKeys(Password);
    }

    public void Enter_Admin_Email(String Email) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.AdminEmail)).click();
        settingsPageLocators.AdminEmail.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        settingsPageLocators.AdminEmail.sendKeys(Email);
    }

    public void Enter_No_Reply_Email(String NoReplyEmail) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.NoReplyEmail)).click();
        settingsPageLocators.NoReplyEmail.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        settingsPageLocators.NoReplyEmail.sendKeys(NoReplyEmail);
    }

    public void SavingSettings() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(settingsPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("success")) {
            System.out.println("SMTP is successfully configured in Settings page of Mart Portal");
            softAssert.assertTrue(true);

        } else {
            System.out.println("Error in setting up smtp. please check the notification msg when click on save");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }


}


















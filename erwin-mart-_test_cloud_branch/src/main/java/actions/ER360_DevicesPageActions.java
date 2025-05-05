package actions;



import locators.ER360_Devices_Page_Locators;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;


public class ER360_DevicesPageActions {
    WebDriver driver;
    public ER360_Devices_Page_Locators er360DevicesPageLocators = new ER360_Devices_Page_Locators();
    WebDriverWait wait;

    public ER360_DevicesPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360DevicesPageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void clickOnDevices() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(25));
            wait.until(ExpectedConditions.elementToBeClickable(er360DevicesPageLocators.devicesIcon)).click();

    }

    public void searchField() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360DevicesPageLocators.searchField)).sendKeys("adminer360");



    }
    public void checkBox() throws InterruptedException {

         wait = new WebDriverWait(driver, Duration.ofSeconds(40));
         wait.until(ExpectedConditions.elementToBeClickable(er360DevicesPageLocators.lastLogin)).click();
            Thread.sleep(1000);
            er360DevicesPageLocators.lastLogin.click();
            Thread.sleep(1000);
            er360DevicesPageLocators.checkBox.click();

    }



    public void logOut() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360DevicesPageLocators.logOutButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360DevicesPageLocators.ConfirmLogout)).click();
        Thread.sleep(7000);
        String loginPageTitle = driver.getTitle();
        Assert.assertEquals("Login | erwin ER360", loginPageTitle);

    }

}


















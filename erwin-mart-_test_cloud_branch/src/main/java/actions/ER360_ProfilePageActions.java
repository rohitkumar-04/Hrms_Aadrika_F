package actions;


import locators.ER360_Profile_Page_Locators;
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


public class ER360_ProfilePageActions {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    public ER360_Profile_Page_Locators er360ProfilePageLocators = new ER360_Profile_Page_Locators();



    WebDriverWait wait;

    public ER360_ProfilePageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360ProfilePageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void ClickonProfilepage() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.ProfilePage)).click();




    }
    public void ClickonAddProfile() throws AWTException {

            Robot robot =  new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            er360ProfilePageLocators.AddProfile.click();




    }
    public void ClickonProfileName() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.ProfileName)).click();
            er360ProfilePageLocators.ProfileName.sendKeys("Test Profile");



    }
    public void ClickonProfileDesc() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.ProfileDescription)).click();
            er360ProfilePageLocators.ProfileDescription.sendKeys("Test Description");



    }
    public void ClickonCloneProfile() throws InterruptedException {

            Actions actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.DropdownforClone)).click();
            /* profile_page_locators.CloneProfile.click();
            profile_page_locators.CloneProfile.sendKeys("Admin");*/
            actions.keyDown(Keys.ARROW_DOWN).build().perform();

            actions.keyDown(Keys.ARROW_DOWN).build().perform();

            actions.keyDown(Keys.ENTER).build().perform();
            Thread.sleep(5000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.ExpandAll)).click();
        Thread.sleep(3000);



    }
    public void ClickonSaveProfile() throws InterruptedException {


        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.SaveProfile)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.Notification_pop_up)).click();
            er360ProfilePageLocators.Notification_pop_up.click();
            if(driver.getPageSource().contains("created"))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
                Thread.sleep(3000);
            }
            else
            {
                System.out.println("Pop up msg is Wrong. Please verify adding profile in ER 360 ");
                softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify adding profile in ER 360");
            }
            softAssert.assertAll();
        Thread.sleep(3000);



    }
    public void ClickonSaveProfile2() {
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.SaveProfile2)).click();
            er360ProfilePageLocators.SaveProfile2.click();
            wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.Notification_pop_up)).click();
            if (driver.getPageSource().contains("updated")) {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
                Thread.sleep(3000);
            } else {
                System.out.println("Pop up msg is Wrong. Please verify creating Profile in ER360 ");
                softAssert.assertFalse(true, "Pop up msg is Wrong. Please verify creating Profile in ER360 ");
            }
            softAssert.assertAll();
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println("Pop up msg is Wrong. Please verify creating Profile in ER360 ");
            softAssert.assertFalse(true, "Pop up msg is Wrong. Please verify creating Profile in ER360 ");
        }



    }
    public void ClickonThreeDots() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.Threedots)).click();



    }
    public void ClickonProfile() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.Test_Profile)).click();



    }
    public void ClickonDeleteProfile() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.DeleteProfile)).click();



    }
    public void ClickonDeleteProfile2() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.DeleteProfile2)).click();



    }
    public void ClickonConfirmDelete() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.ConfirmDelete)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.Notification_pop_up)).click();
            if(driver.getPageSource().contains("deleted"))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
                Thread.sleep(3000);
            }
            else
            {
                System.out.println("Pop up msg is Wrong. Please verify creating Profile in ER360 ");
                softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify creating Profile in ER360 ");
            }
            softAssert.assertAll();
            Thread.sleep(3000);




    }
    public void ClickonEditProfile2() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.EditProfile2)).click();




    }
    public void ClickOnPermissionReportTab() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.PermissionReportTAB)).click();






    }

    public void ClickOnDownloadExcel() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.DownloadExcel)).click();
            if(er360ProfilePageLocators.DownloadExcel.isEnabled()){
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("File Download is not working");
                softAssert.assertFalse(true,"Download excel is not working on the Profile Permission");
            }
            softAssert.assertAll();



    }

    public void VerifyEditProfile() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.ProfilePage)).click();
            //er360ProfilePageLocators.Threedots.click();
            er360ProfilePageLocators.Test_Profile.click();
            Thread.sleep(4000);
            er360ProfilePageLocators.PermissionReportTAB.click();
            Thread.sleep(4000);

           /* if(profile_page_locators.OpenVerification.isDisplayed())
            {
                System.out.println("Edit Profile is not working properly");
                softAssert.assertFalse(true,"Edit Profile is not working properly");

            }
            else
            {

                softAssert.assertTrue(true);
            }
            softAssert.assertAll();*/



    }
    public void ClickonDropdownForCatalog() throws InterruptedException {

            Thread.sleep(4000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ProfilePageLocators.DropdownForCatalog)).click();





    }
    public void RemovingPermissionFromCatalog() throws InterruptedException {

            Actions actions = new Actions(driver);
            Thread.sleep(4000);
            er360ProfilePageLocators.CatalogTextField.click();
            actions.keyDown(Keys.BACK_SPACE).build().perform();



    }
}


















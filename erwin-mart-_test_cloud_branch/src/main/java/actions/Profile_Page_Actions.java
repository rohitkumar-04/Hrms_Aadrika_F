package actions;


import com.aventstack.extentreports.ExtentTest;
import locators.Profile_Page_Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class Profile_Page_Actions
{
    WebDriver driver ;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();

    public Profile_Page_Locators profilePageLocators;

    public Profile_Page_Actions(WebDriver driver)
    {
        this.driver = driver ;
        profilePageLocators = new Profile_Page_Locators();
        PageFactory.initElements(driver,profilePageLocators);

    }

    public void ClickOnProfilePage()
    {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Profile_Page)).click();




    }
    public void ClickonCreateProfile()
    {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.CreateProfileButton)).click();

        }


    public void EnterNameforProfile(){

            wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.ProfileNameTextBox)).sendKeys("AAMartTestProfile");


    }
    public void EnterNameforProfile2(){

            wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.ProfileNameTextBox)).sendKeys("AADeleteTestProfile");

    }

    public void ClickOnAdminCloneProfile() throws InterruptedException {

            wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.CloneTextBox)).click();
            profilePageLocators.CloneTextBox.sendKeys("Admin");
            Thread.sleep(4000);
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.ARROW_DOWN).build().perform();
            actions.keyDown(Keys.ENTER).build().perform();
            Thread.sleep(4000);

    }
    public void ClickOnSaveButton(){


            wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.SaveButton)).click();
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Notification_PopUp)).click();
            if (driver.getPageSource().contains("successfully!")){
                System.out.println("Pop up msg is correct for adding a profile");
                softAssert.assertTrue(true);
               /* profilePageLocators.Notification_Close.click();*/
            }
            else
            {
                System.out.println("Pop up msg is Wrong for adding a profile. Please verify Pop up msg ");
                softAssert.assertFalse(true);
                /*profilePageLocators.Notification_Close.click();*/
            }
            softAssert.assertAll();

        }


    public void ClickOnViewerCloneProfile() throws InterruptedException {

            wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.CloneTextBox)).click();
            profilePageLocators.CloneTextBox.sendKeys("Viewer");
            Thread.sleep(4000);
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.ARROW_DOWN).build().perform();
            actions.keyDown(Keys.ENTER).build().perform();
            Thread.sleep(4000);

    }
    public void ClickOnDeleteButton(){

            wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.AADeleteTestProfile_Profile)).click();
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Delete_Button)).click();
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Confirm_Delete_Button)).click();
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Notification_PopUp)).click();
            if (driver.getPageSource().contains("deleted")){
                System.out.println("Pop up msg is correct for Deleting a profile");
                softAssert.assertTrue(true);
                /* profilePageLocators.Notification_Close.click();*/
            }
            else
            {
                System.out.println("Pop up msg is Wrong for Deleting a profile. Please verify Pop up msg ");
                softAssert.assertFalse(true);
                /*profilePageLocators.Notification_Close.click();*/
            }
            softAssert.assertAll();


    }
    public void ClickOnDeleteButton2(){

        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.AAMart_Test_Profile)).click();
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Delete_Button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Confirm_Delete_Button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")){
            System.out.println("Pop up msg is correct for Deleting a profile");
            softAssert.assertTrue(true);
            /* profilePageLocators.Notification_Close.click();*/
        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deleting a profile. Please verify Pop up msg ");
            softAssert.assertFalse(true);
            /*profilePageLocators.Notification_Close.click();*/
        }
        softAssert.assertAll();


    }

    public void CancelButton()
    {

            wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.ClickONCancelButton)).click();



    }
    public void ClickingOnProfileToEditORDelete()
    {
        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.AAMart_Test_Profile)).click();
    }

    public void ClickingOnExpandPermissionButton()
    {
        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Expand_Permission)).click();
    }

    public void ClickingOnEditPermissionButton()
    {
        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Edit_Button)).click();
    }

    public void ClearingPermissionfromCatalog()
    {
        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.CatalogMgmtPermission)).click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.BACK_SPACE).build().perform();

    }

    public void EnterProfileDescription()
    {
        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.ProfileDescription_TxtBox)).click();
        profilePageLocators.ProfileDescription_TxtBox.sendKeys("Edited Profile");
    }

    public void ClickPermissionReport(){
        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.Permission_Report)).click();

    }











}

package actions;


import locators.UserManagement_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.time.Duration;


public class UserManagement_Actions {
    WebDriver driver;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();


    public UserManagement_Locators userManagementLocators;




    public UserManagement_Actions(WebDriver driver) {
        this.driver = driver;
        userManagementLocators = new UserManagement_Locators();
        PageFactory.initElements(driver, userManagementLocators);


    }

    public void ClickOnUserManagementPage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.UserManagementPage)).click();

    }



    public void ClickOnAddUser() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.AddUserButton)).click();

    }

    public void EnterUsername() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.UsernameTextbox)).click();
        userManagementLocators.UsernameTextbox.sendKeys("mart_user");

    }

    public void EnterDisplayName() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.DisplayName_TextBox)).click();
        userManagementLocators.DisplayName_TextBox.sendKeys("mart_user");

    }

    public void EnterEmailAddress() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.EmailAddress_TextBox)).click();
        userManagementLocators.EmailAddress_TextBox.sendKeys("prabhat.kumar@quest.com");

    }

    public void EnterConfirmEmailAddress() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Confirm_EmailAddressTextbox)).click();
        userManagementLocators.Confirm_EmailAddressTextbox.sendKeys("prabhat.kumar@quest.com");

    }

    public void EnterPassword() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Password_Textbox)).click();
        userManagementLocators.Password_Textbox.sendKeys("Erwin123");

    }

    public void ClickOnSave()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Save_Button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("sent")) {
            System.out.println("Server user created Successfully");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Error in creating Server user");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }

    public void ClickOnSearchUserTextbox() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.SearchUser_Textbox)).click();

    }
    public void Enter_Username_toSearch() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.SearchUser_Textbox)).sendKeys("mart_user");
        Thread.sleep(4000);

    }
    public void ClickOnThreeDots() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.ThreeDots)).click();

    }

    public void ClickOnEditUserButton() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Edit_User)).click();

    }

    public void Editing_DisplayName() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Edit_DisplayName_Textbox)).click();
        userManagementLocators.Edit_DisplayName_Textbox.sendKeys(Keys.CONTROL + "A"+ Keys.BACK_SPACE);
        userManagementLocators.Edit_DisplayName_Textbox.sendKeys("Edited_user");

    }

    public void ClickOnSaveButtonToUpdate()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Save_Button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("updated")) {
            System.out.println("Successfully edited the user details");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Error in updating the user details");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }

    public void ClickOnResetPasswordButton() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Reset_Password)).click();

    }
    public void EnterNewPassword() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.NewPassword_textbox)).click();
        userManagementLocators.NewPassword_textbox.sendKeys("Erwin1234");

    }
    public void ClickOnResetButtonToResetPassword()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Reset_Button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully")) {
            System.out.println("Reset Password Successful");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Error in Reset Password");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }

    public void ClickOnDeleteUserOption() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Delete_User)).click();

    }
    public void ClickOnConfirmDeleteUserOption() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Delete_confirmButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(userManagementLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")) {
            System.out.println("User has been deleted from Mart Successfully");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Error in Deleting user from the Mart");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }



}
























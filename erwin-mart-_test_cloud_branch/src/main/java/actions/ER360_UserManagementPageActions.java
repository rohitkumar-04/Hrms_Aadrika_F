package actions;
import locators.ER360_UserManagement_Page_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
public class ER360_UserManagementPageActions {

    WebDriver driver;
    public ER360_UserManagement_Page_Locators er360UserManagementPageLocators = new ER360_UserManagement_Page_Locators();
    WebDriverWait wait;
    SoftAssert softAssert = new SoftAssert();

    public ER360_UserManagementPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360UserManagementPageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void clickOnERUserManagementPage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.UserManagementPage)).click();

    }

    public void ClickOnERAddUser() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.AddServerUserButton)).click();

    }

    public void ER_EnterUsername() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.UsernameTextboxER)).click();
        er360UserManagementPageLocators.UsernameTextboxER.sendKeys("ER_user");

    }

    public void ER_EnterDisplayName() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.DisplayName_TextBoxER)).click();
        er360UserManagementPageLocators.DisplayName_TextBoxER.sendKeys("ER_user");

    }

    public void ER_EnterEmailAddress() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.EmailAddress_TextBoxER)).click();
        er360UserManagementPageLocators.EmailAddress_TextBoxER.sendKeys("prabhat.kumar@quest.com");

    }

    public void ER_EnterConfirmEmailAddress() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Confirm_EmailAddressTextboxER)).click();
        er360UserManagementPageLocators.Confirm_EmailAddressTextboxER.sendKeys("prabhat.kumar@quest.com");

    }

    public void ER_EnterPassword() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Password_TextboxER)).click();
        er360UserManagementPageLocators.Password_TextboxER.sendKeys("Erwin123");


    }

    public void ClickOnSave_ER()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Save_ButtonER)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("sent")) {
            System.out.println("ER360 Server user created Successfully");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Error in creating ER 360 Server user");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }


    public void ClickOnSearchUserTextbox_ER() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.SearchUser_Textbox_ER)).click();

    }

    public void Enter_Username_toSearch() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.SearchUser_Textbox_ER)).sendKeys("er_user");
        Thread.sleep(2000);

    }


    public void ClickOnThreeDots_ER() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.ThreeDots_ER)).click();

    }

    public void ClickOnEditUserButton_ER() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Edit_User_ER)).click();

    }

    public void Editing_DisplayName_ER() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Edit_DisplayName_Textbox_ER)).click();
        er360UserManagementPageLocators.Edit_DisplayName_Textbox_ER.sendKeys(Keys.CONTROL + "A"+ Keys.BACK_SPACE);
        er360UserManagementPageLocators.Edit_DisplayName_Textbox_ER.sendKeys("Edited_er_user");

    }

    public void ClickOnSaveButtonToUpdate()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Save_UserButtonER)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("updated")) {
            System.out.println("Successfully edited the ER 360 user details");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Error in updating the ER360 user details");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }



    public void ClickOnResetPasswordButton_ER() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Reset_Password_ER)).click();

    }
    public void EnterNewPassword() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.NewPassword_textbox_ER)).click();
        er360UserManagementPageLocators.NewPassword_textbox_ER.sendKeys("Erwin1234");

    }
    public void ClickOnResetButtonToResetPassword()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Reset_Button_ER)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully")) {
            System.out.println("Reset Password Successful for ER360");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Error in Reset Password for ER360");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }

    public void ClickOnDeleteUserOption_ER() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Delete_User_ER)).click();

    }
    public void ClickOnConfirmDeleteUserOption() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Delete_confirmButton_ER)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360UserManagementPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")) {
            System.out.println("User has been deleted from ER360 Successfully");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Error in Deleting user from the ER360");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }
}

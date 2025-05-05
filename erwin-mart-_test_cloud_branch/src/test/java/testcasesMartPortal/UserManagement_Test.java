package testcasesMartPortal;


import actions.UserManagement_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class UserManagement_Test extends BaseTest
{

    UserManagement_Actions userManagementActions;
    SoftAssert softAssert = new SoftAssert();


    @Test(priority = 1)
    public void Creating_ServerUser() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("User Management page");
        logger.assignCategory("Mart Portal");
        userManagementActions = new UserManagement_Actions(driver);
        logger.log(Status.INFO,"User Open User Management page");
        userManagementActions.ClickOnUserManagementPage();
        logger.log(Status.INFO,"User Clicks on Add User Button");
        userManagementActions.ClickOnAddUser();
        logger.log(Status.INFO,"Enters Username");
        userManagementActions.EnterUsername();
        logger.log(Status.INFO,"Enters Display name");
        userManagementActions.EnterDisplayName();
        logger.log(Status.INFO,"Enters Email Address");
        userManagementActions.EnterEmailAddress();
        logger.log(Status.INFO,"Enters Confirm Email Address");
        userManagementActions.EnterConfirmEmailAddress();
        logger.log(Status.INFO,"Enters Password");
        userManagementActions.EnterPassword();
        logger.log(Status.INFO,"Users Clicks on Save");
        userManagementActions.ClickOnSave();

    }

    @Test(priority = 2,dependsOnMethods = { "Creating_ServerUser"})
    public void Editing_ServerUser() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("User Management page");
        logger.assignCategory("Mart Portal");
        userManagementActions = new UserManagement_Actions(driver);
        logger.log(Status.INFO,"User Open User Management page");
        userManagementActions.ClickOnUserManagementPage();
        logger.log(Status.INFO,"User search for the user");
        userManagementActions.ClickOnSearchUserTextbox();
        userManagementActions.Enter_Username_toSearch();
        logger.log(Status.INFO,"User Clicks on three dots for edit option");
        userManagementActions.ClickOnThreeDots();
        logger.log(Status.INFO,"User Clicks on Edit user ");
        userManagementActions.ClickOnEditUserButton();
        logger.log(Status.INFO,"User Edits the display name to Edited user ");
        userManagementActions.Editing_DisplayName();
        logger.log(Status.INFO,"User updates the changes");
        userManagementActions.ClickOnSaveButtonToUpdate();

    }

    @Test(priority = 3,dependsOnMethods = { "Creating_ServerUser"})
    public void Verifying_Reset_Password() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("User Management page");
        logger.assignCategory("Mart Portal");
        userManagementActions = new UserManagement_Actions(driver);
        logger.log(Status.INFO,"User Open User Management page");
        userManagementActions.ClickOnUserManagementPage();
        logger.log(Status.INFO,"User search for the user");
        userManagementActions.ClickOnSearchUserTextbox();
        userManagementActions.Enter_Username_toSearch();
        logger.log(Status.INFO,"User Clicks on three dots for Reset Password option");
        userManagementActions.ClickOnThreeDots();
        logger.log(Status.INFO,"User Clicks on Reset password option ");
        userManagementActions.ClickOnResetPasswordButton();
        logger.log(Status.INFO,"User enters new password ");
        userManagementActions.EnterNewPassword();
        logger.log(Status.INFO,"User updates the changes");
        userManagementActions.ClickOnResetButtonToResetPassword();

    }


    @Test(priority = 4,dependsOnMethods = { "Creating_ServerUser"})
    public void Deleting_ServerUser() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("User Management page");
        logger.assignCategory("Mart Portal");
        userManagementActions = new UserManagement_Actions(driver);
        logger.log(Status.INFO,"User Open User Management page");
        userManagementActions.ClickOnUserManagementPage();
        logger.log(Status.INFO,"User search for the user");
        userManagementActions.ClickOnSearchUserTextbox();
        userManagementActions.Enter_Username_toSearch();
        logger.log(Status.INFO,"User Clicks on three dots for deleting user option");
        userManagementActions.ClickOnThreeDots();
        logger.log(Status.INFO,"user tries to delete a mart user ");
        userManagementActions.ClickOnDeleteUserOption();
        userManagementActions.ClickOnConfirmDeleteUserOption();


    }





}

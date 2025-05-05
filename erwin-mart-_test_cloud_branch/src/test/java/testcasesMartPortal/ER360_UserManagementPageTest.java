package testcasesMartPortal;
import actions.ER360_UserManagementPageActions;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class ER360_UserManagementPageTest extends BaseTest {
    ER360_UserManagementPageActions er360UserManagementPageActions;
    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }

    @Test(priority = 1)
    public void Adding_Server_User_ER360() throws InterruptedException {
        LoginCheck();
        er360UserManagementPageActions = new ER360_UserManagementPageActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("User Management ER360");
        logger.assignCategory("ER360");
        logger.log(Status.INFO,"User Open User Management page");
        er360UserManagementPageActions.clickOnERUserManagementPage();
        logger.log(Status.INFO,"User clicks on Add User");
        er360UserManagementPageActions.ClickOnERAddUser();
        logger.log(Status.INFO,"User Enters Username");
        er360UserManagementPageActions.ER_EnterUsername();
        logger.log(Status.INFO,"User Enters Display Name");
        er360UserManagementPageActions.ER_EnterDisplayName();
        logger.log(Status.INFO,"User Enters Email Address");
        er360UserManagementPageActions.ER_EnterEmailAddress();
        logger.log(Status.INFO,"User Enters Confirm Email Address");
        er360UserManagementPageActions.ER_EnterConfirmEmailAddress();
        logger.log(Status.INFO,"User Open User Management page");
        er360UserManagementPageActions.ER_EnterPassword();
        logger.log(Status.INFO,"User Open User Management page");
        er360UserManagementPageActions.ClickOnSave_ER();


    }

    @Test(priority = 2)
    public void Editing_ServerUser_ER360() throws InterruptedException {
        LoginCheck();
        er360UserManagementPageActions = new ER360_UserManagementPageActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("User Management ER360");
        logger.assignCategory("ER360");
        logger.log(Status.INFO,"User Open User Management page");
        er360UserManagementPageActions.clickOnERUserManagementPage();
        logger.log(Status.INFO,"User search for the user");
        er360UserManagementPageActions.ClickOnSearchUserTextbox_ER();
        logger.log(Status.INFO,"User Enters Username");
        er360UserManagementPageActions.Enter_Username_toSearch();
        logger.log(Status.INFO,"User Clicks on three dots for edit option");
        er360UserManagementPageActions.ClickOnThreeDots_ER();
        logger.log(Status.INFO,"User clicks on Edit Option");
        er360UserManagementPageActions.ClickOnEditUserButton_ER();
        logger.log(Status.INFO,"User Edits the display name to Edited_er_user ");
        er360UserManagementPageActions.Editing_DisplayName_ER();
        logger.log(Status.INFO,"User updates the changes");
        er360UserManagementPageActions.ClickOnSaveButtonToUpdate();

    }

    @Test(priority = 3)
    public void Verifying_Reset_Password_ER360() throws InterruptedException {
        LoginCheck();
        er360UserManagementPageActions = new ER360_UserManagementPageActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("User Management ER360");
        logger.assignCategory("ER360");
        logger.log(Status.INFO,"User Open User Management page");
        er360UserManagementPageActions.clickOnERUserManagementPage();
        logger.log(Status.INFO,"User search for the user");
        er360UserManagementPageActions.ClickOnSearchUserTextbox_ER();
        logger.log(Status.INFO,"User Enters Username");
        er360UserManagementPageActions.Enter_Username_toSearch();
        logger.log(Status.INFO,"User Clicks on three dots for Reset Password option");
        er360UserManagementPageActions.ClickOnThreeDots_ER();
        logger.log(Status.INFO,"User clicks on Reset Password Option");
        er360UserManagementPageActions.ClickOnResetPasswordButton_ER();
        logger.log(Status.INFO,"User enters new password ");
        er360UserManagementPageActions.EnterNewPassword();
        logger.log(Status.INFO,"User updates the changes");
        er360UserManagementPageActions.ClickOnResetButtonToResetPassword();

    }

    @Test(priority = 4)
    public void Deleting_ServerUser() throws InterruptedException {
        LoginCheck();
        er360UserManagementPageActions = new ER360_UserManagementPageActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("User Management ER360");
        logger.assignCategory("ER360");
        logger.log(Status.INFO,"User Open User Management page");
        er360UserManagementPageActions.clickOnERUserManagementPage();
        logger.log(Status.INFO,"User search for the user");
        er360UserManagementPageActions.ClickOnSearchUserTextbox_ER();
        logger.log(Status.INFO,"User Enters Username");
        er360UserManagementPageActions.Enter_Username_toSearch();
        logger.log(Status.INFO,"User Clicks on three dots for Delete User option");
        er360UserManagementPageActions.ClickOnThreeDots_ER();
        logger.log(Status.INFO,"User tries to delete the ER360 user");
        er360UserManagementPageActions.ClickOnDeleteUserOption_ER();
        logger.log(Status.INFO,"User enters new password ");
        er360UserManagementPageActions.ClickOnConfirmDeleteUserOption();


    }

}

package testcasesMartPortal;

import Utilities.ExcelReader;
import actions.ForgotPass_Actions;
import actions.Settings_Page_Actions;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;


public class ForgotPass_Test extends BaseTest
{

    ForgotPass_Actions forgotPassActions;


    @Test(priority = 1)
    public void Verify_ForgotPassword()
    {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Forgot Password-  Mart Portal 14.0");
        forgotPassActions =  new ForgotPass_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Clicks on Profile Pic icon");
        forgotPassActions.ClickOnProfilePicIcon();
        logger.log(Status.INFO,"User Clicks on Logout");
        forgotPassActions.ClickOnLogout();
        logger.log(Status.INFO,"User Clicks on Forgot Password");
        forgotPassActions.ClickOnForgotPassword();
        logger.log(Status.INFO,"User Enters Username and email address for Forgot password");
        forgotPassActions.EnterUsername();
        forgotPassActions.EnterEmail();
        logger.log(Status.INFO,"User clicks on Send Request");
        forgotPassActions.ClickOnSubmitButtonForForgotPass();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }













}

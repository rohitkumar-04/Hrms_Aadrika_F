package testcasesMartPortal;

import Utilities.ExcelReader;
import actions.EG_Actions;
import actions.Settings_Page_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;


public class Settings_Test extends BaseTest
{


    Settings_Page_Actions settingsPageActions;
    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Verify_SMTP(String SMTP,String PortNumber,String Username, String Password,String Email, String NoReplyEmail) throws InterruptedException, AWTException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Settings Page- Mart Portal 14.0");
        settingsPageActions = new Settings_Page_Actions(BaseTest.driver);

        logger.log(Status.INFO,"User Open Settings page");
        settingsPageActions.ClickOnSettingsPage();
        //settingsPageActions.Zoomout();
        settingsPageActions.ClickSmtpCheckbox();
        logger.log(Status.INFO,"User clicks on Smtp Checkbox ");
        settingsPageActions.Enter_SMTP_HostName(SMTP);
        logger.log(Status.INFO,"User Enters Hostname");
        settingsPageActions.Enter_Port_Number(PortNumber);
        logger.log(Status.INFO,"User Enters Port No ");
        settingsPageActions.click_AuthenticateCheckbox();
        logger.log(Status.INFO,"User clicks on Authenticate Checkbox ");
        settingsPageActions.Enter_SMTP_UserName(Username);
        logger.log(Status.INFO,"User Enters Username ");
        settingsPageActions.Enter_SMTP_Password(Password);
        logger.log(Status.INFO,"User Enters Password ");
        settingsPageActions.Enter_Admin_Email(Email);
        logger.log(Status.INFO,"User Enters Admin Email ");
        settingsPageActions.Enter_No_Reply_Email(NoReplyEmail);
        logger.log(Status.INFO,"User Enters No reply Email ");
        settingsPageActions.SavingSettings();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }













}

package testcasesMartPortal;

import Utilities.Constants;
import actions.ER360_DevicesPageActions;
import actions.ER360_PermissionPageActions;
import actions.ER360_ProfilePageActions;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import java.awt.*;


public class ER360_ProfilePageTest extends BaseTest
{
    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }
    ER360_ProfilePageActions er360ProfilePageActions;

    @Test(priority = 1)
    public void Opening_Profile_page_ER360() throws InterruptedException {
        LoginCheck();
        er360ProfilePageActions = new ER360_ProfilePageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page");
        er360ProfilePageActions.ClickonProfilepage();
        Thread.sleep(4000);
        logger.log(Status.INFO,"Opening profile page works fine in ER 360 ");

    }
    @Test(priority = 2)
    public void Adding_Profile_in_ER360() throws AWTException, InterruptedException {
        LoginCheck();
        er360ProfilePageActions = new ER360_ProfilePageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page");
        er360ProfilePageActions.ClickonProfilepage();
        logger.log(Status.INFO,"User Clicks on Profile page");
        er360ProfilePageActions.ClickonAddProfile();
        logger.log(Status.INFO,"User Clicks on Add Profile ");
        er360ProfilePageActions.ClickonProfileName();
        logger.log(Status.INFO,"User enters Profile Name ");
        er360ProfilePageActions.ClickonProfileDesc();
        logger.log(Status.INFO,"User enters Profile Description ");
        er360ProfilePageActions.ClickonCloneProfile();
        logger.log(Status.INFO,"User clones Admin ");
        er360ProfilePageActions.ClickonSaveProfile();
        logger.log(Status.INFO,"User created a profile by cloning Admin ");
        logger.log(Status.INFO,"Adding profile In ER360 works fine ");

    }
    @Test(priority = 3)
    public void Deleting_Profile_in_ER360() throws InterruptedException {
        LoginCheck();
        er360ProfilePageActions = new ER360_ProfilePageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page");
        er360ProfilePageActions.ClickonProfilepage();
        logger.log(Status.INFO,"User Clicks on Profile page");
        er360ProfilePageActions.ClickonProfile();
        logger.log(Status.INFO,"User Clicks on More(Three Dots))");
        er360ProfilePageActions.ClickonDeleteProfile2();
        logger.log(Status.INFO,"User Clicks on Delete Button");
        er360ProfilePageActions.ClickonConfirmDelete();
        logger.log(Status.INFO,"User Clicks on Confirm Button to Delete");
        logger.log(Status.INFO,"Deleting profile In ER360 works fine ");

    }
    @Test(priority = 4)
    public void Editing_Profile_in_ER360() throws AWTException, InterruptedException {
        LoginCheck();
        er360ProfilePageActions = new ER360_ProfilePageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page");
        er360ProfilePageActions.ClickonProfilepage();
        logger.log(Status.INFO,"User Clicks on Profile page");
        er360ProfilePageActions.ClickonAddProfile();
        logger.log(Status.INFO,"User Clicks on Add Profile ");
        er360ProfilePageActions.ClickonProfileName();
        logger.log(Status.INFO,"User enters Profile Name ");
        er360ProfilePageActions.ClickonProfileDesc();
        logger.log(Status.INFO,"User enters Profile Description ");
        er360ProfilePageActions.ClickonCloneProfile();
        logger.log(Status.INFO,"User clones Admin ");
        er360ProfilePageActions.ClickonSaveProfile();
        logger.log(Status.INFO,"User created a profile by cloning Admin ");
        er360ProfilePageActions.ClickonProfile();
       // er360ProfilePageActions.ClickonThreeDots();
        logger.log(Status.INFO,"User Clicks on the profile to Open the profile");
        er360ProfilePageActions.ClickonEditProfile2();
        logger.log(Status.INFO,"User Clicks on Edit Profile");
        er360ProfilePageActions.ClickonDropdownForCatalog();
        logger.log(Status.INFO,"User Clicks on Catalog dropdown visible on Profile page on RHS Side");
        er360ProfilePageActions.RemovingPermissionFromCatalog();
        logger.log(Status.INFO,"User Removes all the permission from the catalog page which is created above");
        er360ProfilePageActions.ClickonSaveProfile2();

        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");

        logger.log(Status.INFO,"User Clicks on Save profile ");
        er360ProfilePageActions.VerifyEditProfile();
        logger.log(Status.INFO,"Verify in the image if Catalog -> Open permission is removed . ");
        logger.log(Status.INFO,"Edit profile In ER360 works fine ");
    }

    @Test(priority = 5)
    public void Verifying_Permission_Report_for_Profile() throws InterruptedException {
        LoginCheck();
        er360ProfilePageActions = new ER360_ProfilePageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page");
        er360ProfilePageActions.ClickonProfilepage();
        logger.log(Status.INFO,"User Clicks on Profile page");
        er360ProfilePageActions.VerifyEditProfile();
        Thread.sleep(5000);
        //er360ProfilePageActions.ClickOnPermissionReportTab();
        er360ProfilePageActions.ClickOnDownloadExcel();
        logger.log(Status.INFO,"Permission Report works fine In ER360 ");
    }


}

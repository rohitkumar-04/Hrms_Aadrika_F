package testcasesMartPortal;

import actions.Profile_Page_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Profile_Page_Test extends BaseTest {

    Profile_Page_Actions profilePageActions;

    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void Adding_Profile() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page- Mart Portal 14.0");
       profilePageActions = new Profile_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Profile Page");
        profilePageActions.ClickOnProfilePage();
        logger.log(Status.INFO,"User Clicks on Create Profile");
        profilePageActions.ClickonCreateProfile();
        logger.log(Status.INFO,"User Enters the profile Name");
        profilePageActions.EnterNameforProfile();
        logger.log(Status.INFO,"User Clones Admin");
        profilePageActions.ClickOnAdminCloneProfile();
        logger.log(Status.INFO,"User Clicks on Save Button");
        profilePageActions.ClickOnSaveButton();
        logger.log(Status.INFO,"Verifying the Popup msg after Clicking on Save");
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 2)
    public void Deleting_Profile() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page- Mart Portal 14.0");
        profilePageActions = new Profile_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Profile Page");
        profilePageActions.ClickOnProfilePage();
        logger.log(Status.INFO,"User Clicks on Create Profile");
        profilePageActions.ClickonCreateProfile();
        logger.log(Status.INFO,"User Enters the profile Name AADeleteTestProfile");
        profilePageActions.EnterNameforProfile2();
        logger.log(Status.INFO,"User Clones Viewer");
        profilePageActions.ClickOnViewerCloneProfile();
        logger.log(Status.INFO,"User Clicks on Save Button");
        profilePageActions.ClickOnSaveButton();
        logger.log(Status.INFO,"Verifying the Popup msg after Clicking on Save");
        logger.log(Status.INFO,"Deleting the profile Test 2");
        profilePageActions.ClickOnDeleteButton();
        logger.log(Status.INFO,"Verifying the pop up msg after deleting the profile");
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 3)
    public void Editing_Profile() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page- Mart Portal 14.0");
        profilePageActions = new Profile_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Profile Page");
        profilePageActions.ClickOnProfilePage();
        profilePageActions.ClickingOnProfileToEditORDelete();
        logger.log(Status.INFO,"User Clicks on AAMartTestProfile to Edit");
        profilePageActions.ClickingOnExpandPermissionButton();
        logger.log(Status.INFO,"User Clicks Expand Permission Button");
        profilePageActions.ClickingOnEditPermissionButton();
        logger.log(Status.INFO,"User Clicks on Edit Permission Button");
        profilePageActions.ClearingPermissionfromCatalog();
        Thread.sleep(4000);
        logger.log(Status.INFO,"User Clicks on Catalog Permission and Clears all the Catalog permission");
        profilePageActions.EnterProfileDescription();
        logger.log(Status.INFO,"User Clicks Enters Profile Description");
        profilePageActions.ClickOnSaveButton();
        logger.log(Status.INFO,"User Clicks on Save after editing the Catalog permission and enter Profile Description");
        logger.log(Status.INFO,"Verifying the pop up msg after Editing the profile");
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 4)
    public  void VerifyPermissionReports(){
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Profile Page- Mart Portal 14.0");
        profilePageActions =  new Profile_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Profile Page");
        profilePageActions.ClickOnProfilePage();
        logger.log(Status.INFO,"User Clicks on AAMartTestProfile to View Permission Report");
        profilePageActions.ClickingOnProfileToEditORDelete();
        logger.log(Status.INFO,"User Clicks on Permission Report");
        profilePageActions.ClickPermissionReport();
        logger.log(Status.INFO,"Verifying Catalog Permissions are displayed or not after edit");
        Verifying_PermissionReport();
        profilePageActions.ClickingOnProfileToEditORDelete();
        profilePageActions.ClickOnDeleteButton2();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/

    }
    public void Verifying_PermissionReport() {

        try {
            if (driver.findElement(By.xpath("//p[text()='Catalog Management']")).isDisplayed()) {
                System.out.println("The Catalog Permissions are still displayed even after editing the permission");
                softAssert.fail("The Catalog Permissions are still displayed even after editing the permission");
                logger.log(Status.INFO,"The Catalog Permissions are still displayed even after editing the permission");
            } else {
                System.out.println("The permission report looks fine. The permissions are successfully edited");
                logger.log(Status.INFO,"The permission report looks fine. The permissions are successfully edited");
            }
        } catch (NoSuchElementException e) {
            System.out.println("The permission report looks fine. The permissions are successfully edited");
            logger.log(Status.INFO,"The permission report looks fine. The permissions are successfully edited");
        }

        softAssert.assertAll();
    }

}

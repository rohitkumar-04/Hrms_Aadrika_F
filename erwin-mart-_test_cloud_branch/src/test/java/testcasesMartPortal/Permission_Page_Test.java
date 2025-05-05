package testcasesMartPortal;

import actions.Permission_Page_Actions;
import actions.Profile_Page_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class Permission_Page_Test extends BaseTest {


    Permission_Page_Actions permissionPageActions;

    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void Assigning_Admin_to_Model () throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page- Mart Portal 14.0");
        permissionPageActions= new Permission_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Permission Page");
        permissionPageActions.ClickOnPermissionPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        permissionPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Model");
        permissionPageActions.SendingDataToSearchCatalogForModel();
        logger.log(Status.INFO,"User assign New Model to Admin Permissions");
        permissionPageActions.SendingDataToAdminProfile();
        logger.log(Status.INFO,"Verifying the Permission change done above by validating Review Changes data");
        VerifyingReviewChanges_Assign();
        permissionPageActions.ClickingOnSavePermissions();
        logger.log(Status.INFO,"Verifying the Popup msg after Clicking on Save Permissions");
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 2)
    public void Assigning_Architect_to_Library () throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page- Mart Portal 14.0");
        permissionPageActions= new Permission_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Permission Page");
        permissionPageActions.ClickOnPermissionPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        permissionPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Library");
        permissionPageActions.SendingDataToSearchCatalogForLibrary();
        logger.log(Status.INFO,"User assign New Library to Architect Permissions");
        permissionPageActions.SendingDataToArchitectProfile();
        logger.log(Status.INFO,"Verifying the Permission change done above by validating Review Changes data");
        VerifyingReviewChanges_Assign();
        permissionPageActions.ClickingOnSavePermissions();
        logger.log(Status.INFO,"Verifying the Popup msg after Clicking on Save Permissions");
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 3)
    public void Assigning_Viewer_to_MartRootNode () throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page- Mart Portal 14.0");
        permissionPageActions= new Permission_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Permission Page");
        permissionPageActions.ClickOnPermissionPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        permissionPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for Mart Root Node");
        permissionPageActions.SendingDataToSearchCatalogForMartRootNode();
        logger.log(Status.INFO,"User assign Mart Root Node to Viewer Permissions");
        permissionPageActions.SendingDataToViewerProfile();
        logger.log(Status.INFO,"Verifying the Permission change done above by validating Review Changes data");
        VerifyingReviewChanges_Assign();
        permissionPageActions.ClickingOnSavePermissions();
        logger.log(Status.INFO,"Verifying the Popup msg after Clicking on Save Permissions");
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 4 )
    public void Removing_Admin_Permission() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page- Mart Portal 14.0");
        permissionPageActions= new Permission_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Permission Page");
        permissionPageActions.ClickOnPermissionPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        permissionPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Model");
        permissionPageActions.SendingDataToSearchCatalogForModel();
        logger.log(Status.INFO,"User UnAssign New Model from Admin Permissions");
        permissionPageActions.SendingDataToAdminProfile();
        logger.log(Status.INFO,"Verifying the Permission change done above by validating Review Changes data");
        VerifyingReviewChanges_UnAssign();
        permissionPageActions.ClickingOnSavePermissions();
        logger.log(Status.INFO,"Verifying the Popup msg after Clicking on Save Permissions");
      /*  logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 5 )
    public void Removing_Architect_Permission() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page- Mart Portal 14.0");
        permissionPageActions= new Permission_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Permission Page");
        permissionPageActions.ClickOnPermissionPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        permissionPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Model");
        permissionPageActions.SendingDataToSearchCatalogForLibrary();
        logger.log(Status.INFO,"User UnAssign New Library to Architect Permissions");
        permissionPageActions.SendingDataToArchitectProfile();
        logger.log(Status.INFO,"Verifying the Permission change done above by validating Review Changes data");
        VerifyingReviewChanges_UnAssign();
        permissionPageActions.ClickingOnSavePermissions();
        logger.log(Status.INFO,"Verifying the Popup msg after Clicking on Save Permissions");
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 6 )
    public void Removing_Viewer_Permission() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page- Mart Portal 14.0");
        permissionPageActions= new Permission_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Permission Page");
        permissionPageActions.ClickOnPermissionPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        permissionPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for Mart Root Node");
        permissionPageActions.SendingDataToSearchCatalogForMartRootNode();
        logger.log(Status.INFO,"User UnAssign Mart Root Node to Viewer Permissions");
        permissionPageActions.SendingDataToViewerProfile();
        logger.log(Status.INFO,"Verifying the Permission change done above by validating Review Changes data");
        VerifyingReviewChanges_UnAssign();
        permissionPageActions.ClickingOnSavePermissions();
        logger.log(Status.INFO,"Verifying the Popup msg after Clicking on Save Permissions");
      /*  logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    public void VerifyingReviewChanges_Assign()
    {
        WebDriverWait wait;
        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Review Changes']"))).click();
        try {
            if (driver.findElement(By.xpath("//span[@aria-label='assign']")).isDisplayed())
            {
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"The permission changes are done successfully");
            }
            else {
                softAssert.fail("Error in assigning Permissions - The permission is not applied properly");
            }
        }
        catch (NoSuchElementException e)
        {
            softAssert.fail("Error in assigning Permissions - The permission is not applied properly");
            System.out.println("Error in assigning Permissions - The permission is not applied properly");
            logger.log(Status.INFO,"Error in assigning Permissions - The permission is not applied properly");
        }

        softAssert.assertAll();

    }
    public void VerifyingReviewChanges_UnAssign()
    {
        WebDriverWait wait;
        wait =  new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Review Changes']"))).click();
        try {
            if (driver.findElement(By.xpath("//span[@aria-label='unassign']")).isDisplayed())
            {
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"The permission are removed successfully");
            }
            else {
                softAssert.fail("Error in UnAssigning Permissions - The permission are not removed properly");
            }
        }
        catch (NoSuchElementException e)
        {
            softAssert.fail("Error in UnAssigning Permissions - The permission are not removed properly");
            System.out.println("Error in UnAssigning Permissions - The permission are not removed properly");
            logger.log(Status.INFO,"Error in UnAssigning Permissions - The permission are not removed properly");
        }

        softAssert.assertAll();

    }







}

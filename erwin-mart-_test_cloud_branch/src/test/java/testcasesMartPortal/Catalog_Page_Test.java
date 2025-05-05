package testcasesMartPortal;

import actions.Catalog_Page_Actions;
import actions.Permission_Page_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class Catalog_Page_Test extends BaseTest {

    Catalog_Page_Actions catalogPageActions;

    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void Creating_Library() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Clicks on Create Library Button");
        Thread.sleep(2000);
        catalogPageActions.CreateLibrary();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 2)
    public void Deleting_Library() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        Thread.sleep(2000);
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Library");
        Thread.sleep(2000);
        catalogPageActions.SendingDataToSearchCatalogForLibraryDeletion();
        logger.log(Status.INFO,"User selects New Library (1) and Clicks on Delete button");
        Thread.sleep(2000);
        catalogPageActions.ClickOnDeleteButton();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 3)
    public void CreatingSub_Library_RenamingIt() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Library");
        Thread.sleep(2000);
        catalogPageActions.SendingDataToSearchCatalogForSubLibraryCreation();
        logger.log(Status.INFO,"User selects New Library and add a sub library");
        Thread.sleep(2000);
        catalogPageActions.CreateLibrary2();
        logger.log(Status.INFO,"User Renames the newly created library and clicks on Save");
        Thread.sleep(2000);
        catalogPageActions.RenamingLibrary();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 4)
    public void Deleting_Sub_Library() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Library");
        Thread.sleep(2000);
        catalogPageActions.SendingDataToSearchCatalogForSubLibraryDeletion();
        logger.log(Status.INFO,"User selects Sub Library and Clicks on Delete button");
        Thread.sleep(8000);
        catalogPageActions.ClickOnDeleteButton();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 5)
    public void Verifying_Copy_Paste_forModel() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Model for Copy Paste ");
        Thread.sleep(2000);
        catalogPageActions.SendingDataToSearchCatalogForCopyPaste();
        logger.log(Status.INFO,"User copies New Model and paste it to Mart Root node");
        Thread.sleep(2000);
        catalogPageActions.Copy_Paste_Model();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 6)
    public void Verifying_Mark_Version() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Expands New Model - Copy  ");
        Thread.sleep(2000);
        catalogPageActions.Clicking_and_ExpandingModel();
        logger.log(Status.INFO,"User Marks Version 1 of the Model");
        Thread.sleep(5000);
        catalogPageActions.MarkingVersion();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 7)
    public void Verifying_Hide_Version() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Expands New Model - Copy  ");
        catalogPageActions.Clicking_and_ExpandingModel();
        logger.log(Status.INFO,"User Hides Version 1 of the Model  ");

        catalogPageActions.HidingVersion();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for Hiding Version Image");*/
    }
    @Test(priority = 8)
    public void Verifying_UnHide_Version() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Un-Hides Version 1 of the Model ");
        Thread.sleep(3000);
        catalogPageActions.UnHidingVersion();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for Image");*/
    }

    @Test(priority = 9)
    public void Verifying_Locks() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User selects the model and clicks on Existence Lock");
        Thread.sleep(5000);
        catalogPageActions.ApplyingLocks();
        logger.log(Status.INFO,"Applying Locks and checking the pop up msg");
        String error2 = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error2, "please click above for Applying Locks Image");
        Thread.sleep(5000);
        catalogPageActions.RemovingLocks();
        logger.log(Status.INFO,"Removing Locks and checking the pop up msg");
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for Removing Locks Image");*/
    }
    @Test(priority = 10)
    public void Deleting_Model() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Catalog Page Mart Portal 14.0");
        catalogPageActions =  new Catalog_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Catalog Page");
        catalogPageActions.ClickOnCatalogPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        catalogPageActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Search for New Model Copy");
        Thread.sleep(2000);
        catalogPageActions.SelectingModelToDelete();
        logger.log(Status.INFO,"User Selects the Model and clicks on Delete");
        Thread.sleep(5000);
        catalogPageActions.ClickOnDeleteButton();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for Image");*/
    }










}

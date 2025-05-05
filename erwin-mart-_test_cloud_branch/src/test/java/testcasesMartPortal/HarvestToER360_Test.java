package testcasesMartPortal;

import actions.HarvestToER360_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HarvestToER360_Test extends BaseTest {

    HarvestToER360_Actions harvestToER360Actions;

    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void Creating_OnceJob() throws InterruptedException {
        try {
            logger.assignAuthor("Prabhat");
            logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
            harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
            logger.log(Status.INFO,"User opens Home Page");
            //harvestToER360Actions.ClickOnHomePage();
            logger.log(Status.INFO,"User opens Harvest To ER360 page");
            harvestToER360Actions.OpenHarvestToER360page();
            harvestToER360Actions.ClickOnAddJobButton();
            logger.log(Status.INFO,"User performs Lazy loading");
            harvestToER360Actions.PerformLazyLoading();
            logger.log(Status.INFO,"User Selects the Catalog and the Libraries");
            harvestToER360Actions.ClickOnCatalogAndLibrary();
            logger.log(Status.INFO,"User Enters the Job Information");
            harvestToER360Actions.EnteringJobInformation_OnceJob();
            logger.log(Status.INFO,"User Clicks on Save");
            harvestToER360Actions.ClickOnSave();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
        }
        catch(Exception e)
        {
            System.out.println("Unable to create Harvest to ER 360 JOB - So, skipping test cases of Harvest to ER360");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Unable to create Harvest to ER 360 JOB - So, skipping test cases of Harvest to ER360");
        }
        softAssert.assertAll();

    }
    @Test(priority = 2,dependsOnMethods = { "Creating_OnceJob" })
    public void Creating_DailyJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
        harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Home Page");
        //harvestToER360Actions.ClickOnHomePage();
        logger.log(Status.INFO,"User opens Harvest To ER360 page");
        harvestToER360Actions.OpenHarvestToER360page();
        harvestToER360Actions.ClickOnAddJobButton();
        logger.log(Status.INFO,"User performs Lazy loading");
        harvestToER360Actions.PerformLazyLoading();
        logger.log(Status.INFO,"User Selects the Catalog and the Libraries");
        harvestToER360Actions.ClickOnCatalogAndLibrary();
        logger.log(Status.INFO,"User Enters the Job Information");
        harvestToER360Actions.EnteringJobInformation_DailyJob();
        logger.log(Status.INFO,"User Clicks on Save");
        harvestToER360Actions.ClickOnSave();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 3,dependsOnMethods = { "Creating_OnceJob" })
    public void Creating_WeeklyJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
        harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Home Page");
        //harvestToER360Actions.ClickOnHomePage();
        logger.log(Status.INFO,"User opens Harvest To ER360 page");
        harvestToER360Actions.OpenHarvestToER360page();
        harvestToER360Actions.ClickOnAddJobButton();
        logger.log(Status.INFO,"User performs Lazy loading");
        harvestToER360Actions.PerformLazyLoading();
        logger.log(Status.INFO,"User Selects the Catalog and the Libraries");
        harvestToER360Actions.ClickOnCatalogAndLibrary();
        logger.log(Status.INFO,"User Enters the Job Information");
        harvestToER360Actions.EnteringJobInformation_WeeklyJob();
        logger.log(Status.INFO,"User Clicks on Save");
        harvestToER360Actions.ClickOnSave();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 4,dependsOnMethods = { "Creating_OnceJob" })
    public void Creating_MonthlyJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
        harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Home Page");
        //harvestToER360Actions.ClickOnHomePage();
        logger.log(Status.INFO,"User opens Harvest To ER360 page");
        harvestToER360Actions.OpenHarvestToER360page();
        harvestToER360Actions.ClickOnAddJobButton();
        logger.log(Status.INFO,"User performs Lazy loading");
        harvestToER360Actions.PerformLazyLoading();
        logger.log(Status.INFO,"User Selects the Catalog and the Libraries");
        harvestToER360Actions.ClickOnCatalogAndLibrary();
        logger.log(Status.INFO,"User Enters the Job Information");
        harvestToER360Actions.EnteringJobInformation_MonthlyJob();
        logger.log(Status.INFO,"User Clicks on Save");
        harvestToER360Actions.ClickOnSave();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 5,dependsOnMethods = { "Creating_OnceJob" })
    public void Creating_YearlyJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
        harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Home Page");
        //harvestToER360Actions.ClickOnHomePage();
        logger.log(Status.INFO,"User opens Harvest To ER360 page");
        harvestToER360Actions.OpenHarvestToER360page();
        harvestToER360Actions.ClickOnAddJobButton();
        logger.log(Status.INFO,"User performs Lazy loading");
        harvestToER360Actions.PerformLazyLoading();
        logger.log(Status.INFO,"User Selects the Catalog and the Libraries");
        harvestToER360Actions.ClickOnCatalogAndLibrary();
        logger.log(Status.INFO,"User Enters the Job Information");
        harvestToER360Actions.EnteringJobInformation_YearlyJob();
        logger.log(Status.INFO,"User Clicks on Save");
        harvestToER360Actions.ClickOnSave();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 6,dependsOnMethods = { "Creating_OnceJob" })
    public void EditingORManaging_Job() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
        harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Harvest To ER360 page");
        harvestToER360Actions.OpenHarvestToER360page();
        logger.log(Status.INFO,"User Selects a job to Edit");
        harvestToER360Actions.SelectingJobToEdit();
        logger.log(Status.INFO,"User edits the Job name and time");
        harvestToER360Actions.Entering_JobInformation_EditJob();
        logger.log(Status.INFO,"User clicks on Save after editing the job");
        harvestToER360Actions.ClickOnEditJobSave();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 7,dependsOnMethods = { "Creating_OnceJob" })
    public void Cancelling_Job() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
        harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Harvest To ER360 page");
        harvestToER360Actions.OpenHarvestToER360page();
        logger.log(Status.INFO,"User Selects a job to Cancel");
        harvestToER360Actions.SelectingJobToCancel();
        logger.log(Status.INFO,"Verifying the Cancelled label on the page ");
        try {
            if (driver.findElement(By.xpath("//div[@title='Cancelled']")).isDisplayed() ){
                System.out.println("Pop up msg is correct for Cancelling a job in Harvest to ER 360");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"The Job is cancelled Successfully");
            }
            else
            {
                System.out.println("Error in cancelling the job");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in cancelling the job");
            }

        }
        catch (Exception e){
            System.out.println("Error in cancelling the job");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in cancelling the job");
        }
        softAssert.assertAll();

       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 8)
    public void Verifying_CalendarJobs() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
        harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Harvest To ER360 page");
        harvestToER360Actions.OpenHarvestToER360page();
        logger.log(Status.INFO,"User Clicks on Calendar view");
        harvestToER360Actions.ClickOnCalendarView();
        logger.log(Status.INFO,"Verifying the Daily Job label on the page ");
        try {
            if (driver.findElement(By.xpath("//h6[text()=\" DailyJob\"]")).isDisplayed() ){
                System.out.println("Daily Jobs on Calendar view is displayed successfully");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Daily Jobs on Calendar view is displayed successfully");
            }
            else
            {
                System.out.println("Calendar jobs are not displayed ");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Calendar jobs are not displayed ");
            }

        }
        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Calendar jobs are not displayed ");
        }
        softAssert.assertAll();

        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 9,dependsOnMethods = { "Creating_OnceJob" })
    public void DeletingJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Harvest To ER360- Mart Portal 14.0");
        harvestToER360Actions = new HarvestToER360_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User opens Home Page");
        //harvestToER360Actions.ClickOnHomePage();
        logger.log(Status.INFO,"User opens Harvest To ER360 page");
        harvestToER360Actions.OpenHarvestToER360page();
        logger.log(Status.INFO,"User selects the Root Checkbox");
        harvestToER360Actions.SelectingOnceJobToDelete();
        logger.log(Status.INFO,"User Deletes the Job");
        harvestToER360Actions.ClickOnDelete();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }











}

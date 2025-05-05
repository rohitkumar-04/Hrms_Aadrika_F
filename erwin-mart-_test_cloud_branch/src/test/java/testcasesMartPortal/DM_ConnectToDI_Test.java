package testcasesMartPortal;

import Utilities.ExcelReader;
import actions.DM_ConnectToDI_Actions;
import actions.HarvestToER360_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class DM_ConnectToDI_Test extends BaseTest
{
    DM_ConnectToDI_Actions dmConnectToDIActions;

    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Configuring_DI_Details(String ConfigurationName, String ServerName, String AppName, String PortNo, String Username, String Password) throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect To DI Mart Portal 14.0");
        dmConnectToDIActions = new DM_ConnectToDI_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open Settings page");
        dmConnectToDIActions.ClickOnSettingsPage();
        logger.log(Status.INFO,"User Clicks On DI Configuration Tab");
        dmConnectToDIActions.ClickOnDIConfigurationTab();
        logger.log(Status.INFO,"User Enters all the DI credentials");
        dmConnectToDIActions.Enter_ConfigName(ConfigurationName);
        dmConnectToDIActions.Enter_ServerName(ServerName);
        dmConnectToDIActions.Enter_ApplicationName(AppName);
        dmConnectToDIActions.Enter_PortNo(PortNo);
        dmConnectToDIActions.Enter_DIUsername(Username);
        dmConnectToDIActions.Enter_DIPassword(Password);
        logger.log(Status.INFO,"User Clicks On Save for Saving the DI details");
        dmConnectToDIActions.SavingDIDetails();
      /*  logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 2,dependsOnMethods = { "Configuring_DI_Details" })
    public void CreatingDIJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect To DI Mart Portal 14.0");
        dmConnectToDIActions = new DM_ConnectToDI_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR DI page");
        dmConnectToDIActions.OpenDMConnectForDIPage();
        logger.log(Status.INFO,"User Clicks on Import DI Job");
        dmConnectToDIActions.ClickOnImportDIJOB();
        logger.log(Status.INFO,"User Enters all the information to create the job");
        dmConnectToDIActions.EnteringDIInformation_Connectors();
        dmConnectToDIActions.ClickOnCatalogAndLibrary();
        dmConnectToDIActions.EnteringDIJobInformation_OnceJob();
        logger.log(Status.INFO,"User Clicks on Save and creates a once JOB");
        dmConnectToDIActions.ClickOnSave();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 3,dependsOnMethods = { "Configuring_DI_Details" })
    public void Verifying_Success_Status() throws InterruptedException {
        dmConnectToDIActions = new DM_ConnectToDI_Actions(BaseTest.driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect To DI Mart Portal 14.0");
        logger.log(Status.INFO,"User Open DM CONNECT FOR DI page");
        dmConnectToDIActions.OpenDMConnectForDIPage();
        logger.log(Status.INFO,"Verifying Success Status for the job created");

        try {

            for(int i = 1; i <= 5; i++)
            {
                dmConnectToDIActions.ClickOnRefreshJobs();
                if (driver.findElements(By.xpath("//div[@title='Success']")).size() > 0)
                {
                    System.out.println("The Job is successfully run in DM CONNECT FOR DI PAGE");
                    softAssert.assertTrue(true);
                    logger.log(Status.INFO, "The Job is successfully run in DM CONNECT FOR DI PAGE");
                    break;
                } else
                {
                    System.out.println("Unable to see the success label. Refreshing the job and retrying again.");
                    Thread.sleep(10000);
                }

            }

        }
        catch (Exception e)
        {
            System.out.println("The job is not successfull in DM CONNECT FOR DI page");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"The job is not successfull in DM CONNECT FOR DI page");
        }
        softAssert.assertAll();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 4,dependsOnMethods = { "Configuring_DI_Details" })
    public void EditingORManaging_DIJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect To DI Mart Portal 14.0");
        dmConnectToDIActions = new DM_ConnectToDI_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR DI page");
        dmConnectToDIActions.OpenDMConnectForDIPage();
        logger.log(Status.INFO,"User Selects a job to Edit");
        dmConnectToDIActions.SelectingJobToEdit();
        logger.log(Status.INFO,"User edits the Job name and time");
        dmConnectToDIActions.Entering_JobInformation_EditJob();
        logger.log(Status.INFO,"User clicks on Save after editing the job");
        dmConnectToDIActions.ClickOnEditJobSave();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 5,dependsOnMethods = { "Configuring_DI_Details" })
    public void Cancelling_DIJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect To DI Mart Portal 14.0");
        dmConnectToDIActions = new DM_ConnectToDI_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR DI page");
        dmConnectToDIActions.OpenDMConnectForDIPage();
        logger.log(Status.INFO,"User Selects a job to Edit");
        dmConnectToDIActions.SelectingJobToCancel();
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
    @Test(priority = 6,dependsOnMethods = { "Configuring_DI_Details" })
    public void Verifying_DI_CalendarJobs() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect To DI Mart Portal 14.0");
        dmConnectToDIActions = new DM_ConnectToDI_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR DI page");
        dmConnectToDIActions.OpenDMConnectForDIPage();
        logger.log(Status.INFO,"User Selects a job to Cancel");
        dmConnectToDIActions.ClickOnCalendarView();
        logger.log(Status.INFO,"Verifying the Cancelled label on the page ");
        try {
            if (driver.findElement(By.xpath("(//div[text()='DIOnceJob'])")).isDisplayed() ){
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
            System.out.println("Calendar jobs are not displayed ");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Calendar jobs are not displayed ");
        }
        softAssert.assertAll();

        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 7,dependsOnMethods = { "Configuring_DI_Details" })
    public void Deleting_DIJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect To DI Mart Portal 14.0");
        dmConnectToDIActions = new DM_ConnectToDI_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR DI page");
        dmConnectToDIActions.OpenDMConnectForDIPage();
        logger.log(Status.INFO,"User selects the First Job");
        dmConnectToDIActions.SelectingEditedJobToDelete();
        logger.log(Status.INFO,"User Deletes the Job");
        dmConnectToDIActions.ClickOnDelete();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }








}

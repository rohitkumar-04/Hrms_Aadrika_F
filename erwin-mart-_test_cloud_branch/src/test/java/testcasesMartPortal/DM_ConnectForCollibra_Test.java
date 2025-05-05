package testcasesMartPortal;

import Utilities.Constants;
import Utilities.ExcelReader;
import actions.DM_ConnectForCollibra_Actions;
import actions.DM_ConnectToDI_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class DM_ConnectForCollibra_Test extends BaseTest
{

    DM_ConnectForCollibra_Actions dmConnectForCollibraActions;

    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void Verifying_CollibraLicense() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect For Collibra Mart Portal 14.0");
        dmConnectForCollibraActions = new DM_ConnectForCollibra_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open Settings page");
        dmConnectForCollibraActions.ClickOnSettingsPage();
        logger.log(Status.INFO,"User Clicks on Mart Connector License Field");
        dmConnectForCollibraActions.EnterCollibraLicense();
        logger.log(Status.INFO,"User Enters Collibra License");
        driver.findElement(By.xpath("//input[@placeholder='Enter Mart Connector License']")).sendKeys(Constants.Collibra_License);
        dmConnectForCollibraActions.Click_Test_Connection();
        logger.log(Status.INFO,"User Clicks on Test Connection and saves the Connection");
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 2, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Configuring_Collibra_Details(String ConfigurationName, String ServerName,String SSL, String Username, String Password) throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect For Collibra Mart Portal 14.0");
        dmConnectForCollibraActions = new DM_ConnectForCollibra_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open Settings page");
        dmConnectForCollibraActions.ClickOnSettingsPage();
        logger.log(Status.INFO,"User Clicks On Collibra Configuration Tab");
        dmConnectForCollibraActions.ClickOnCollibraConfigurationTab();
        logger.log(Status.INFO,"User Enters all the Collibra credentials");
        dmConnectForCollibraActions.Enter_ConfigName(ConfigurationName, ServerName, SSL, Username, Password);
        logger.log(Status.INFO,"User Clicks On Save for Saving the Collibra details");
        dmConnectForCollibraActions.SavingCollibraDetails();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 3)
    public void CreatingCollibraJobs() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect For Collibra Mart Portal 14.0");
        dmConnectForCollibraActions = new DM_ConnectForCollibra_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR Collibra page");
        dmConnectForCollibraActions.OpenDMConnectForCollibraPage();
        logger.log(Status.INFO,"User Clicks on Import DI Job");
        dmConnectForCollibraActions.ClickOnImportDIJOB();
        logger.log(Status.INFO,"User Enters all the information to create the job");
        dmConnectForCollibraActions.Entering_CollibraInformation_Connectors();
        dmConnectForCollibraActions.ClickOnCatalogAndLibrary();
        dmConnectForCollibraActions.EnteringCollibraJobInformation_OnceJob();
        logger.log(Status.INFO,"User Clicks on Save and creates a once JOB");
        dmConnectForCollibraActions.ClickOnSave();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 4)
    public void Verifying_Success_Status() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect For Collibra Mart Portal 14.0");
        dmConnectForCollibraActions = new DM_ConnectForCollibra_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR Collibra page");
        dmConnectForCollibraActions.OpenDMConnectForCollibraPage();

        try {

            for(int i = 1; i <= 10; i++)
            {
                dmConnectForCollibraActions.ClickOnRefreshJobs();
                if (driver.findElements(By.xpath("//div[@title='Success']")).size() > 0)
                {
                    System.out.println("The Job is successfully run in DM CONNECT FOR Collibra PAGE");
                    softAssert.assertTrue(true);
                    logger.log(Status.INFO, "The Job is successfully run in DM CONNECT FOR Collibra PAGE");
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
            System.out.println("The job is not successfull in DM CONNECT FOR Collibra page");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"The job is not successfull in DM CONNECT FOR Collibra page");
        }
        softAssert.assertAll();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 5)
    public void EditingORManaging_CollibraJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect For Collibra Mart Portal 14.0");
        dmConnectForCollibraActions = new DM_ConnectForCollibra_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR Collibra page");
        dmConnectForCollibraActions.OpenDMConnectForCollibraPage();
        logger.log(Status.INFO,"User Selects a job to Edit");
        dmConnectForCollibraActions.SelectingJobToEdit();
        logger.log(Status.INFO,"User edits the Job name and time");
        dmConnectForCollibraActions.Entering_JobInformation_EditJob();
        logger.log(Status.INFO,"User clicks on Save after editing the job");
        dmConnectForCollibraActions.ClickOnEditJobSave();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 6)
    public void Cancelling_CollibraJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect For Collibra Mart Portal 14.0");
        dmConnectForCollibraActions = new DM_ConnectForCollibra_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR Collibra page");
        dmConnectForCollibraActions.OpenDMConnectForCollibraPage();
        logger.log(Status.INFO,"User Selects a job to Cancel");
        dmConnectForCollibraActions.SelectingJobToCancel();
        logger.log(Status.INFO,"Verifying the Cancelled label on the page ");
        try {
            if (driver.findElement(By.xpath("//div[@title='Cancelled']")).isDisplayed() ){
                System.out.println("Pop up msg is correct for Cancelling a job in DM Connect for Collibra page");
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
    @Test(priority = 7)
    public void Verifying_Collibra_CalendarJobs() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect For Collibra Mart Portal 14.0");
        dmConnectForCollibraActions = new DM_ConnectForCollibra_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR Collibra page");
        dmConnectForCollibraActions.OpenDMConnectForCollibraPage();
        logger.log(Status.INFO,"User Clicks on Calendar View");
        dmConnectForCollibraActions.ClickOnCalendarView();

        try {
            if (driver.findElement(By.xpath("(//div[text()='CollibraOnceJob'])")).isDisplayed() ){
                System.out.println(" Jobs on Calendar view is displayed successfully");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Jobs on Calendar view is displayed successfully");
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
    @Test(priority = 7)
    public void Deleting_Collibra_Job() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("DM Connect For Collibra Mart Portal 14.0");
        dmConnectForCollibraActions = new DM_ConnectForCollibra_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open DM CONNECT FOR Collibra page");
        dmConnectForCollibraActions.OpenDMConnectForCollibraPage();
        logger.log(Status.INFO,"User selects the First Job");
        dmConnectForCollibraActions.SelectingEditedJobToDelete();
        logger.log(Status.INFO,"User Deletes the Job");
        dmConnectForCollibraActions.ClickOnDelete();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }


   /*










*/




}

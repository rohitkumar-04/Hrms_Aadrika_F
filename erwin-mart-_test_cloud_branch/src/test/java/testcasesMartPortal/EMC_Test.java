package testcasesMartPortal;

import Utilities.Constants;
import Utilities.ExcelReader;
import actions.DM_ConnectForCollibra_Actions;
import actions.EMC_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class EMC_Test extends BaseTest
{

    EMC_Actions emcActions;
    boolean jobSuccess = false;


    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void Adding_EMC_Policy() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on Add Policy Icon");
        emcActions.ClickOnAddPolicy();
        logger.log(Status.INFO,"User Enters Policy details");
        emcActions.EnterPolicyName();
        emcActions.EnterPolicyDesc();
        emcActions.ClickOnAppliedRules();
        emcActions.EnterObjectTypeandRule();
        logger.log(Status.INFO,"User Clicks on save button to save the policy");
        emcActions.SavingPolicyAndRule();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 2,dependsOnMethods = { "Adding_EMC_Policy" })
    public void Verifying_Policy_Status() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();

        try {

            for(int i = 1; i <= 5; i++)
            {
                    emcActions.ClickOnRefreshPolicy();
                if (driver.findElements(By.xpath("//span[text()='Test Policy']")).size() > 0)
                {
                    System.out.println("The newly created EMC Policy is present on the EMC page");
                    softAssert.assertTrue(true);
                    logger.log(Status.INFO, "The newly created EMC Policy is present on the EMC page");
                    break;
                } else
                {
                    System.out.println("The newly created EMC Policy is not present on the EMC page. Please check");
                    Thread.sleep(5000);
                }

            }

        }
        catch (Exception e)
        {
            System.out.println("he newly created EMC Policy is not present on the EMC page. Please check");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"The newly created EMC Policy is not present on the EMC page. Please check");
        }
        softAssert.assertAll();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 3)
    public void Adding_EMC_Rule() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Rule Tab");
        emcActions.ClickOnRulesTab();
        logger.log(Status.INFO,"User Clicks on Add Rule Icon");
        emcActions.ClickOnAddRule();
        logger.log(Status.INFO,"User Enters Rule details");
        emcActions.EnterRuleDetails();
        logger.log(Status.INFO,"User Clicks on save button to save the EMC Rule");
        emcActions.SavingPolicyAndRule();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 4,dependsOnMethods = { "Adding_EMC_Rule" })
    public void Verifying_Rule_Status() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        emcActions.ClickOnRulesTab();

        try {

            for(int i = 1; i <= 5; i++)
            {
                emcActions.ClickOnRefreshRules();
                if (driver.findElements(By.xpath("//span[text()='A Test Rule']")).size() > 0)
                {
                    System.out.println("The newly created EMC Rule is present on the EMC page");
                    softAssert.assertTrue(true);
                    logger.log(Status.INFO, "The newly created EMC Rule is present on the EMC page");
                    break;
                } else
                {
                    System.out.println("The newly created EMC Rule is not present on the EMC page. Please check");
                    Thread.sleep(5000);
                }

            }

        }
        catch (Exception e)
        {
            System.out.println("he newly created EMC Rule is not present on the EMC page. Please check");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"The newly created EMC Rule is not present on the EMC page. Please check");
        }
        softAssert.assertAll();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 5)
    public void Cloning_EMC_Rule() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Rule Tab");
        emcActions.ClickOnRulesTab();
        logger.log(Status.INFO,"User Clicks on an Existing Rule");
        emcActions.ClickonExistingRule();
        logger.log(Status.INFO,"User Clicks on Clone Rule Button");
        emcActions.ClickonCloneRule();
        logger.log(Status.INFO,"User changes the rule name to -----> Cloned Rule");
        emcActions.EditingRuleName();
        logger.log(Status.INFO,"User Saves the cloned Rule");
        emcActions.SavingPolicyAndRule();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 6,dependsOnMethods = { "Adding_EMC_Rule" })
    public void Deleting_EMC_Rule() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Rule Tab");
        emcActions.ClickOnRulesTab();
        logger.log(Status.INFO,"User Clicks on an Existing Rule");
        emcActions.ClickonRuletoDelete();
        logger.log(Status.INFO,"User Clicks on Delete Rule Button");
        emcActions.ClickOnDelete();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 7)
    public void Creating_EMC_Job() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Generate Report Tab");
        emcActions.ClickOnGenerateReportTab();
        logger.log(Status.INFO,"User Clicks on  Add Job button");
        emcActions.ClickonAddJobButton();
        logger.log(Status.INFO,"User performs Lazy Loading");
        emcActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Enters Emc Job details");
        emcActions.EnterEMCReportInfo();
        emcActions.Entering_EMCJobInformation_OnceJob();
        logger.log(Status.INFO,"User Saves the job");
        emcActions.ClickOnSave();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 8,dependsOnMethods = { "Creating_EMC_Job" })
    public void Verifying_Run_Job_Option() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Generate Report Tab");
        emcActions.ClickOnGenerateReportTab();
        logger.log(Status.INFO,"User Selects the job ");
        emcActions.SelectJobtoRun();
        logger.log(Status.INFO,"User Clicks on Run Job");
        emcActions.ClickonRunJobButton();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 9,dependsOnMethods = { "Creating_EMC_Job" })
    public void Verifying_Success_Status() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Generate Report Tab");
        emcActions.ClickOnGenerateReportTab();
        Thread.sleep(10000);

        try {

            for(int i = 1; i <= 5; i++)
            {
                emcActions.ClickOnRefreshJobs();
                Thread.sleep(4000);
                if (driver.findElements(By.xpath("//div[@title='Success']")).size() > 0)
                {
                    System.out.println("The Job is successfully run in Emc Page");
                    softAssert.assertTrue(true);
                    logger.log(Status.INFO, "The Job is successfully run in EMC page");
                    jobSuccess = true;
                    break;
                } else
                {
                    System.out.println("Unable to see the success label. Refreshing the job and retrying again.");
                    Thread.sleep(5000);
                }

            }

        }
        catch (Exception e)
        {
            System.out.println("The job is not successful in EMC page");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"The job is not successful in EMC page");
        }
        if (!jobSuccess) {
            softAssert.assertFalse(true, "The job did not succeed after 2 retries.");
            logger.log(Status.INFO,"The job did not succeed after 2 retries.");
        }
        softAssert.assertAll();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 10,dependsOnMethods = { "Creating_EMC_Job" })
    public void EditingORManaging_EMCJob() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Generate Report Tab");
        emcActions.ClickOnGenerateReportTab();
        emcActions.SelectingJobToEdit();
        logger.log(Status.INFO,"User edits the Job name and time");
        emcActions.Entering_JobInformation_EditJob();
        logger.log(Status.INFO,"User clicks on Save after editing the job");
        emcActions.ClickOnEditJobSave();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 11,dependsOnMethods = { "Creating_EMC_Job" })
    public void Cancelling_EMC_Job() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Generate Report Tab");
        emcActions.ClickOnGenerateReportTab();
        logger.log(Status.INFO,"User Selects a job to Cancel");
        emcActions.SelectingJobToCancel();
        logger.log(Status.INFO,"Verifying the Cancelled label on the page ");
        try {
            if (driver.findElement(By.xpath("//div[@title='Cancelled']")).isDisplayed() ){
                System.out.println("Pop up msg is correct for Cancelling a job in EMC page");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"The Job is cancelled Successfully in EMC page");
            }
            else
            {
                System.out.println("Error in cancelling the job");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in cancelling the job in EMC page");
            }

        }
        catch (Exception e){
            System.out.println("Error in cancelling the job");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in cancelling the job in EMC page");
        }
        softAssert.assertAll();

        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 12,dependsOnMethods = { "Creating_EMC_Job" })
    public void Deleting_EMC_Job() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("EMC -  Mart Portal 14.0");
        emcActions = new EMC_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EMC page");
        emcActions.ClickOnEMCPage();
        logger.log(Status.INFO,"User Clicks on  Generate Report Tab");
        emcActions.ClickOnGenerateReportTab();
        logger.log(Status.INFO,"User Selects a job to Edit");
        emcActions.SelectingEditedJobToDelete();
        logger.log(Status.INFO,"User Deletes the Job");
        emcActions.ClickOnDeleteJob();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }







}

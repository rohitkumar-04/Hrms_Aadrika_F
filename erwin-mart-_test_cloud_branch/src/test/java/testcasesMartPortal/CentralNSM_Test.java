package testcasesMartPortal;

import actions.CentralNSM_Actions;
import actions.ForgotPass_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;


public class CentralNSM_Test extends BaseTest
{


    CentralNSM_Actions centralNSMActions;
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)
    public void Adding_NSMfile() throws InterruptedException, AWTException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Central NSM Page Mart Portal 14.0");
        centralNSMActions = new CentralNSM_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Clicks on Central NSM Page");
        centralNSMActions.ClickOnCentralNsmPage();
        logger.log(Status.INFO,"User Clicks on Add file ");
        centralNSMActions.ClickOnAddFile();
        logger.log(Status.INFO,"User Enters NSM details such as Name and Language ");
        centralNSMActions.EnterNSMName();
        centralNSMActions.EnterNSMLanguage();
        logger.log(Status.INFO,"User uploads the csv file");
        centralNSMActions.ClickOnBrowse();
        logger.log(Status.INFO,"User Clicks on Save NSM");
        centralNSMActions.ClickOnSave();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 2,dependsOnMethods = { "Adding_NSMfile" })
    public void Adding_Glossary_In_Central_NSM() throws InterruptedException, AWTException {
        centralNSMActions = new CentralNSM_Actions(BaseTest.driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Central NSM Page Mart Portal 14.0");
        logger.log(Status.INFO,"User Clicks on Central NSM Page");
        centralNSMActions.ClickOnCentralNsmPage();
        logger.log(Status.INFO,"User Select NSM file to apply NSM ");
        centralNSMActions.Select_Nsmfile();
        logger.log(Status.INFO,"User Clicks on Add Glossary");
        centralNSMActions.Click_AddGlossary();
        logger.log(Status.INFO,"User Enters NSM glossary details");
        centralNSMActions.EnterNSMGlossaryDetails();
        logger.log(Status.INFO,"User Clicks on Save to Add Glossary in Central NSM page");
        centralNSMActions.ClickOnSave_ToAddGlossary();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 3,dependsOnMethods = { "Adding_NSMfile" })
    public void Editing_Glossary_In_Central_NSM() throws InterruptedException, AWTException {
        centralNSMActions = new CentralNSM_Actions(BaseTest.driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Central NSM Page Mart Portal 14.0");
        logger.log(Status.INFO,"User Clicks on Central NSM Page");
        centralNSMActions.ClickOnCentralNsmPage();
        logger.log(Status.INFO,"User Select NSM file to apply NSM ");
        centralNSMActions.Select_Nsmfile();
        logger.log(Status.INFO,"User Clicks on Edit Glossary");
        centralNSMActions.Click_EditGlossary();
        logger.log(Status.INFO,"User Edits the Glossary name");
        centralNSMActions.Changes_GlossaryName();
        logger.log(Status.INFO,"User Clicks on Save Glossary button");
        centralNSMActions.ClickOnSaveGlossaryButton();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 4,dependsOnMethods = { "Adding_NSMfile" })
    public void Deleting_Glossary_In_Central_NSM() throws InterruptedException, AWTException {
        centralNSMActions = new CentralNSM_Actions(BaseTest.driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Central NSM Page Mart Portal 14.0");
        logger.log(Status.INFO,"User Clicks on Central NSM Page");
        centralNSMActions.ClickOnCentralNsmPage();
        logger.log(Status.INFO,"User Select NSM file to apply NSM ");
        centralNSMActions.Select_Nsmfile();
        logger.log(Status.INFO,"User Clicks on Delete Glossary");
        centralNSMActions.Click_DeleteGlossary();
      /*  logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 5,dependsOnMethods = { "Adding_NSMfile" })
    public void APPLYING_NSMFile_ToModels() throws InterruptedException, AWTException {
        centralNSMActions = new CentralNSM_Actions(BaseTest.driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Central NSM Page Mart Portal 14.0");
        logger.log(Status.INFO,"User Clicks on Central NSM Page");
        centralNSMActions.ClickOnCentralNsmPage();
        logger.log(Status.INFO,"User Select NSM file to apply NSM ");
        centralNSMActions.Select_Nsmfile();
        logger.log(Status.INFO,"User Clicks on Apply/Remove NSM Button ");
        centralNSMActions.ClickOnApply_Remove_NSM_Button();
        logger.log(Status.INFO,"User Select Mart Root Node");
        centralNSMActions.Select_MartRootNode();
        logger.log(Status.INFO,"User Clicks on Save to Apply NSM");
        centralNSMActions.ClickOnSaveButtonToApplyNSM();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 6,dependsOnMethods = { "Adding_NSMfile" })
    public void Verifying_NSMReports() throws InterruptedException, AWTException {
        centralNSMActions = new CentralNSM_Actions(BaseTest.driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Central NSM Page Mart Portal 14.0");
        logger.log(Status.INFO,"User Clicks on Central NSM Page");
        centralNSMActions.ClickOnCentralNsmPage();
        logger.log(Status.INFO,"User Select NSM file to View Reports ");
        centralNSMActions.Select_Nsmfile();
        logger.log(Status.INFO,"User Clicks on View Reports");
        centralNSMActions.Click_ViewReport();
        try {
                if (driver.findElements(By.xpath("(//span[text()='Test_NSM'])[2]")).size() > 0)
                {
                    System.out.println("The NSM is successfully applied to the model");
                    softAssert.assertTrue(true);
                    logger.log(Status.INFO, "The NSM is successfully applied to the model");
                } else
                {
                    System.out.println("Error in Central NSM Reports");
                    Thread.sleep(5000);
                }

        }
        catch (Exception e)
        {
            System.out.println("Error in Central NSM Reports");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in Central NSM Reports");
        }
        softAssert.assertAll();

        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 7,dependsOnMethods = { "Adding_NSMfile" })
    public void Deleting_NSMFile() throws InterruptedException, AWTException {
        centralNSMActions = new CentralNSM_Actions(BaseTest.driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Central NSM Page Mart Portal 14.0");
        logger.log(Status.INFO,"User Clicks on Central NSM Page");
        centralNSMActions.ClickOnCentralNsmPage();
        logger.log(Status.INFO,"User Select NSM file to apply NSM ");
        centralNSMActions.Select_Nsmfile();
        logger.log(Status.INFO,"User Clicks on Apply/Remove NSM Button ");
        centralNSMActions.Click_DeleteNSM();
      /*  logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }













}

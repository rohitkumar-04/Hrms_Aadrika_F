package testcasesMartPortal;

import actions.EG_Actions;
import actions.EMC_Actions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;


public class EG_Test extends BaseTest
{

    EG_Actions egActions;


    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 1)
    public void Adding_Glossary() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Glossary -  Mart Portal 14.0");
        egActions = new EG_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EG page");
        egActions.ClickOnEGPage();
        logger.log(Status.INFO,"User Clicks on Add Glossary Icon");
        egActions.ClickOnAddGlossary();
        logger.log(Status.INFO,"User Enters Glossary details");
        egActions.EnterGlossaryDetails();
        logger.log(Status.INFO,"User Clicks on save button to save the Glossary");
        egActions.SavingGlossary();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 2,dependsOnMethods = { "Adding_Glossary"})
    public void Adding_BusinessTerm() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Glossary -  Mart Portal 14.0");
        egActions = new EG_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EG page");
        egActions.ClickOnEGPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        egActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Clicks on Existing Glossary");
        egActions.ClickonExistingGlossary();
        logger.log(Status.INFO,"User Clicks on Add Business Term Button");
        egActions.ClickonAddBusinessTerm();
        logger.log(Status.INFO,"User Enters all the business term details");
        egActions.EnterBusinessTermDetails1();
        logger.log(Status.INFO,"User Clicks on save button to save the Business Term");
        egActions.SavingGlossary();
        egActions.ClickonExistingGlossary();
        logger.log(Status.INFO,"User adds 2nd business term");
        egActions.ClickonAddBusinessTerm();
        logger.log(Status.INFO,"User Enters all the business term 2 details");
        egActions.EnterBusinessTermDetails2();
        logger.log(Status.INFO,"User Clicks on save button to save the Business Term 2");
        egActions.SavingGlossary();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 3,dependsOnMethods = { "Adding_BusinessTerm"})
    public void Editing_BusinessTerm() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Glossary -  Mart Portal 14.0");
        egActions = new EG_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EG page");
        egActions.ClickOnEGPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        egActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Clicks on Existing Glossary");
        egActions.ClickonExistingGlossary();
        logger.log(Status.INFO,"User Clicks on Edit Business Term Button");
        egActions.EditBusinessTerm();
        logger.log(Status.INFO,"User Clicks on save button to save the edited BT");
        egActions.ClickOnSaveBT();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 4,dependsOnMethods = { "Adding_BusinessTerm"})
    public void Deleting_BusinessTerm() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Glossary -  Mart Portal 14.0");
        egActions = new EG_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EG page");
        egActions.ClickOnEGPage();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        egActions.PerformLazyLoading();
        logger.log(Status.INFO,"User Clicks on Existing Glossary");
        egActions.ClickonExistingGlossary();
        logger.log(Status.INFO,"User Clicks on Delete button to delete the BT");
        egActions.ClickOnDeleteBT();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 5)
    public void Applying_Associations() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Glossary -  Mart Portal 14.0");
        egActions = new EG_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EG page");
        egActions.ClickOnEGPage();
        logger.log(Status.INFO,"User Clicks on Existing Glossary");
        egActions.ClickonExistingGlossary();
        logger.log(Status.INFO,"User Clicks on Associations Tab");
        egActions.ClickonAssociatiosTab();
        logger.log(Status.INFO,"User Performs Lazy Loading");
        egActions.PerformLazyLoading_Associations();
        logger.log(Status.INFO,"User Clicks on Expand All button to expand the Library");
        egActions.ClickonExpandAll();
        logger.log(Status.INFO,"User Clicks on Mart Root Node to apply association at Mart Root Node level");
        egActions.ClickonMartRootNodeLabel();
        egActions.SavingAssociations();
        Thread.sleep(9000);
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 6)
    public void Mapping_BusinessTerm() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Glossary -  Mart Portal 14.0");
        egActions = new EG_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EG page");
        egActions.ClickOnEGPage();
        logger.log(Status.INFO,"User Clicks on Existing Glossary");
        egActions.ClickonExistingGlossary();
        logger.log(Status.INFO,"User Clicks on Mappings Tab");
        egActions.ClickonMappingsTab();
        logger.log(Status.INFO,"User Selects the Model to Map the Business Term");
        egActions.ClickonSelectModel();
        Thread.sleep(4000);
        egActions.ClickonEditMapping();
        egActions.ClickonGlossaryDropdown();
        logger.log(Status.INFO,"User Maps the business term to the model and saves it");
        egActions.ClickOnSaveEdit();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }

    @Test(priority = 7)
    public void Verifying_EG_Reports() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Glossary -  Mart Portal 14.0");
        egActions = new EG_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EG page");
        egActions.ClickOnEGPage();
        logger.log(Status.INFO,"User Clicks on Existing Glossary");
        egActions.ClickonExistingGlossary();
        logger.log(Status.INFO,"User Clicks on Reports Tab");
        egActions.ClickonReportsTab();
        logger.log(Status.INFO,"User Clicks on Reports Mapping ");
        egActions.ClickonMappings_ReportsTab();
        logger.log(Status.INFO,"User Selects the Model and verify the Business Term mapped with the Model ");
        egActions.ClickonSelectModel();
        try {
            if (driver.findElement(By.xpath("//span[text()='BT2']")).isDisplayed() ){
                System.out.println("Business Term is successfully mapped with the Business Term and is reflected in the EG Report");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Business Term is successfully mapped with the Business Term and is reflected in the EG Report");
            }
            else
            {
                System.out.println("EG report issue- Business term is not mapped ");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"EG report issue- Business term is not mapped ");
            }

        }
        catch (Exception e){
            System.out.println("EG report issue- Business term is not mapped ");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"EG report issue- Business term is not mapped ");
        }
        softAssert.assertAll();
        /*logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }
    @Test(priority = 8)
    public void Deleting_Glossaries() throws InterruptedException {
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Glossary -  Mart Portal 14.0");
        egActions = new EG_Actions(BaseTest.driver);
        logger.log(Status.INFO,"User Open EG page");
        egActions.ClickOnEGPage();
        logger.log(Status.INFO,"User Clicks on Existing Glossary");
        egActions.ClickonExistingGlossary();
        logger.log(Status.INFO,"User Deletes the Glossary");
        egActions.ClickOnDeleteGlossary();
       /* logger.log(Status.INFO,"Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");*/
    }




}

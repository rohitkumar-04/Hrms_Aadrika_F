package testcasesMartPortal;


import actions.WorksheetsPageActions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class WorksheetsPageTest extends BaseTest {

    WorksheetsPageActions worksheetsPageActions;
    SoftAssert softAssert = new SoftAssert();


    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }


    @Test(priority = 1)
    public void Create_New_Worksheet() throws InterruptedException {

        LoginCheck();
        worksheetsPageActions = new WorksheetsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Worksheet Page");
        logger.assignCategory("ER360");
        worksheetsPageActions.ClickOnWorksheetPage();
        logger.log(Status.INFO,"User Clicks on Worksheet page");
        worksheetsPageActions.Click_AddWorksheet();
        logger.log(Status.INFO,"User Clicks on Add Worksheet Button");
        worksheetsPageActions.Enter_WorksheetName();
        logger.log(Status.INFO,"Enters Worksheet name");
        worksheetsPageActions.Enter_WorksheetDesc();
        logger.log(Status.INFO,"Enters Worksheet Description");
        worksheetsPageActions.Click_Create_Worksheet();
        logger.log(Status.INFO,"User Clicks on Submit Button");
        logger.log(Status.INFO,"Verifying Worksheet Creation");
        try {
            if (driver.findElement(By.xpath("//h6[text()='test_worksheet']")).isDisplayed() ){
                System.out.println("Worksheet created Successfully");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Worksheet created Successfully");
            }
            else
            {
                System.out.println("Error in Creating Worksheet");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in Creating Worksheet");
            }

        }
        catch (Exception e){
            System.out.println("Error in Creating Worksheet");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in Creating Worksheet");
        }
        softAssert.assertAll();


    }


    @Test(priority = 2 ,dependsOnMethods = { "Create_New_Worksheet" })
    public void Searching_Keyword_in_Worksheet_and_SavingIt() throws InterruptedException {
        LoginCheck();
        worksheetsPageActions = new WorksheetsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Worksheet Page");
        logger.assignCategory("ER360");
        worksheetsPageActions.ClickOnWorksheetPage();
        logger.log(Status.INFO, "User Clicks on Worksheet page");
        worksheetsPageActions.Click_test_Worksheet();
        logger.log(Status.INFO, "User Clicks on the Worksheet");
        worksheetsPageActions.Enter_Keyword();
        logger.log(Status.INFO, "User Enters keyword to search");
        worksheetsPageActions.Enter_Categories();
        logger.log(Status.INFO, "User Selects Categories filter");
        worksheetsPageActions.Enter_Model();
        logger.log(Status.INFO, "User Selects Models filter and Hits Enter");
        Thread.sleep(4000);
        worksheetsPageActions.Click_SaveWorksheetButton();
        logger.log(Status.INFO, "User Clicks on Save Worksheet Button");
        logger.log(Status.INFO,"Verifying Search Result is displayed or not");
        try {
            if (driver.findElement(By.xpath("//a[text()='CUST_address']")).isDisplayed() ){
                System.out.println("Searching Operation works fine");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Searching Operation works fine");
            }
            else
            {
                System.out.println("Error when tried searching in worksheets");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error when tried searching in worksheets");
            }

        }
        catch (Exception e){
            System.out.println("Error when tried searching in worksheets");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error when tried searching in worksheets");
        }
        softAssert.assertAll();


    }

    @Test(priority = 3,dependsOnMethods = { "Searching_Keyword_in_Worksheet_and_SavingIt" })
    public void Worksheet_SearchResult_redirectsTo_Metadata() throws InterruptedException {
        LoginCheck();
        worksheetsPageActions = new WorksheetsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Worksheet Page");
        logger.assignCategory("ER360");
        worksheetsPageActions.ClickOnWorksheetPage();
        logger.log(Status.INFO, "User Clicks on Worksheet page");
        worksheetsPageActions.Click_test_Worksheet();
        logger.log(Status.INFO, "User Clicks on  the Worksheet Search Result to verify if it is redirecting to Metadata Browser or not ");
        Thread.sleep(4000);
        logger.log(Status.INFO, "Verifying the Redirection to Metadata Browser");
        try {
            driver.findElement(By.xpath("//a[text()='CUST_address']")).click();
            Thread.sleep(4000);
            if (driver.getTitle().contains("Metadata"))
            {
                if (driver.findElement(By.xpath("(//span[@aria-label='CUST_address'])[2]")).isDisplayed() ){
                    System.out.println("Search Result Redirects to Metadata Browser successfully");
                    softAssert.assertTrue(true);
                    logger.log(Status.INFO,"Search Result Redirects to Metadata Browser successfully");
                }
                else
                {
                    System.out.println("Search Result fails to Redirect to Metadata Browser");
                    softAssert.assertFalse(true);
                    logger.log(Status.INFO,"Search Result fails to Redirect to Metadata Browser");
                }
            }
            else
            {
                System.out.println("Search Result fails to Redirect to Metadata Browser");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Search Result fails to Redirect to Metadata Browser");

            }
        }
        catch (Exception e){
            System.out.println("Error when tried searching in worksheets");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error when tried searching in worksheets");
        }
        softAssert.assertAll();


    }
  /*  @Test(priority = 4)
    public void Verifying_Advance_Filter() throws InterruptedException {
        worksheetsPageActions = new WorksheetsPageActions(driver);
        LoginCheck();
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Worksheet Page");
        logger.assignCategory("ER360");
        worksheetsPageActions.ClickOnWorksheetPage();
        logger.log(Status.INFO, "User Clicks on Worksheet page");
        worksheetsPageActions.Click_test_Worksheet();
        logger.log(Status.INFO, "User Clicks on the Worksheet");
        worksheetsPageActions.Click_Advance_Filter();
        logger.log(Status.INFO, "User Clicks on Advance Filter");
        worksheetsPageActions.Select_AdvanceFilter_Options();
        logger.log(Status.INFO, "Selects Advance filter options -----> Name");
        worksheetsPageActions.Select_AdvanceFilter_Value();
        logger.log(Status.INFO, "Selects Advance filter value");
        worksheetsPageActions.Click_SaveWorksheetButton();
        logger.log(Status.INFO, "User Clicks on Save Worksheet Button");
    }*/

    @Test(priority = 5,dependsOnMethods = { "Create_New_Worksheet" })
    public void Verifying_Share_Worksheet() throws InterruptedException {
        LoginCheck();
        worksheetsPageActions = new WorksheetsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Worksheet Page");
        logger.assignCategory("ER360");
        worksheetsPageActions.ClickOnWorksheetPage();
        logger.log(Status.INFO, "User Clicks on Worksheet page");
        worksheetsPageActions.Click_test_Worksheet();
        logger.log(Status.INFO, "User Clicks on the Worksheet");
        worksheetsPageActions.Click_Share_Button();
        logger.log(Status.INFO, "User Clicks on Share Button");
        worksheetsPageActions.Select_All_ShareCheckbox();
        logger.log(Status.INFO, "User Clicks Select All option");
        worksheetsPageActions.Click_ShareToUsers_Button();
        logger.log(Status.INFO, "User Clicks Share Button to share the worksheet");
    }

    @Test(priority = 6,dependsOnMethods = { "Create_New_Worksheet" })
    public void Edit_Worksheet() throws InterruptedException {
        LoginCheck();
        worksheetsPageActions = new WorksheetsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Worksheet Page");
        logger.assignCategory("ER360");
        worksheetsPageActions.ClickOnWorksheetPage();
        logger.log(Status.INFO, "User Clicks on Worksheet page");
        worksheetsPageActions.Click_test_Worksheet();
        logger.log(Status.INFO, "User Clicks on the Worksheet");
        worksheetsPageActions.Click_Edit_Worksheet();
        logger.log(Status.INFO, "User Clicks on Edit Worksheet");
        worksheetsPageActions.Enter_EditedWorksheetName_Desc();
        logger.log(Status.INFO, "User edits name and description of the worksheet");
        worksheetsPageActions.Click_SaveWorksheetButton_Update();
        logger.log(Status.INFO, "User Saves the worksheet after editing the worksheet");
    }

    @Test(priority = 7,dependsOnMethods = { "Create_New_Worksheet" })
    public void Delete_Worksheet() throws InterruptedException {
        LoginCheck();
        worksheetsPageActions = new WorksheetsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Worksheet Page");
        logger.assignCategory("ER360");
        worksheetsPageActions.ClickOnWorksheetPage();
        logger.log(Status.INFO, "User Clicks on Worksheet page");
        Thread.sleep(3000)  ;
        worksheetsPageActions.Click_Random_Worksheet();
        logger.log(Status.INFO, "User Clicks on Random worksheet");
        worksheetsPageActions.Click_Delete_Worksheet();
        logger.log(Status.INFO, "User Clicks Delete button and tries deleting the worksheet");
        Thread.sleep(4000);
        logger.log(Status.INFO, "Verifying the worksheet is deleted or not");
        try {
            if (driver.getTitle().contains("worksheets"))
            {
                if (driver.findElement(By.xpath("//h6[text()='test_worksheet']")).isDisplayed()) {
                    System.out.println("Error in deleting the worksheet");
                    softAssert.assertFalse(true);
                    logger.log(Status.INFO, "Error in deleting the worksheet");
                }

            }
            else
            {
                System.out.println("Worksheet Deleted Successfully");
                softAssert.assertTrue(true);
                logger.log(Status.INFO, "Worksheet Deleted Successfully");
            }
            softAssert.assertAll();

        }
        catch (Exception e){
            System.out.println("Worksheet page is not available");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Worksheet page is not available");
        }
        softAssert.assertAll();

    }








}

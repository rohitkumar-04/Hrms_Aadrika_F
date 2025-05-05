package testcasesMartPortal;

import Utilities.Constants;
import actions.ER360_GlobalSearchActions;
import actions.ER360_UserManagementPageActions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class ER360_GlobalSearchTest extends BaseTest{
    ER360_GlobalSearchActions er360GlobalSearchActions;
    SoftAssert softAssert = new SoftAssert();

    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }

    @Test(priority = 1)
    public void Search_Operation_GlobalSearch() throws InterruptedException {
        LoginCheck();
        er360GlobalSearchActions = new ER360_GlobalSearchActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("Global Search");
        logger.assignCategory("ER360");
        er360GlobalSearchActions.clickOnGlobalSearchTextBox();
        er360GlobalSearchActions.searchField();

        try {
            if (driver.findElement(By.xpath("//span[text()='CUST_address']")).isDisplayed() ){
                System.out.println("Search Results are reflected when Global Search is performed");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Search Results are reflected when Global Search is performed");
            }
            else
            {
                System.out.println("No results displayed Or Wrong Result is displayed when Global Search is performed");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"No results displayed Or Wrong Result is displayed when Global Search is performed");
            }

        }
        catch (Exception e){
            System.out.println("No results displayed Or Wrong Result is displayed when Global Search is performed");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"No results displayed Or Wrong Result is displayed when Global Search is performed");
        }
        softAssert.assertAll();

    }

    @Test(priority = 2)
    public void Search_Result_RedirectToMetaData() throws InterruptedException {
        LoginCheck();
        er360GlobalSearchActions = new ER360_GlobalSearchActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("Global Search");
        logger.assignCategory("ER360");
        er360GlobalSearchActions.clickOnGlobalSearchTextBox();
        er360GlobalSearchActions.searchField();
        er360GlobalSearchActions.ClickOnTheResult();
        Thread.sleep(15000);
        try {
            if (driver.getTitle().contains("Metadata"))
            {
                if (driver.findElement(By.xpath("(//span[@aria-label='CUST_address'])[2]")).isDisplayed() )
                {
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
            System.out.println("Error when tried redirecting to MetaData Browser");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error when tried redirecting to MetaData Browser");
        }
        softAssert.assertAll();


    }

    @Test(priority = 3,dependsOnMethods = { "Search_Operation_GlobalSearch" })
    public void Verifying_AdvanceFilter_GlobalSearch() throws InterruptedException {
        LoginCheck();
        er360GlobalSearchActions = new ER360_GlobalSearchActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("Global Search");
        logger.assignCategory("ER360");
        er360GlobalSearchActions.clickOnGlobalSearchTextBox();
        er360GlobalSearchActions.ClickOnAdvanceFilter();
        er360GlobalSearchActions.ClickOnCategoriesTextBox();
        er360GlobalSearchActions.EnterCategories();
        er360GlobalSearchActions.ClickOnColumnText();
        er360GlobalSearchActions.ClickOnCategoriesText();

        er360GlobalSearchActions.ClickOnModelsTextBox();
        er360GlobalSearchActions.ExpandModels();
        er360GlobalSearchActions.ClickOnModelsRootNode();
        er360GlobalSearchActions.ClickOnModelsText();
        er360GlobalSearchActions.ClickOnSubmitButton();
        er360GlobalSearchActions.clickOnGlobalSearchTextBox();
        er360GlobalSearchActions.searchField();
        Thread.sleep(15000);
        try {
            if (driver.findElement(By.xpath("//span[text()='CUST_address']")).isDisplayed() ){
                System.out.println("Advance Filter for Global Search is working fine");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Advance Filter for Global Search is working fine");
            }
            else
            {
                System.out.println("No results displayed when advance filter is applied and Global Search is performed");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"No results displayed when advance filter is applied and Global Search is performed");
            }

        }
        catch (Exception e){
            System.out.println("No results displayed when advance filter is applied and Global Search is performed");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"No results displayed when advance filter is applied and Global Search is performed");
        }
        softAssert.assertAll();

    }

}

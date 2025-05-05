package testcasesMartPortal;
import Utilities.Constants;
import actions.ER360_DevicesPageActions;
import actions.ER360_MetaDataBrowserPageActions;
import actions.WorksheetsPageActions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
public class ER360_MetaDataBrowserTest extends  BaseTest {
    ER360_MetaDataBrowserPageActions er360MetaDataBrowserPageActions;
    SoftAssert softAssert = new SoftAssert();

    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }

    @Test(priority = 1)
    public void Loading_All_Catalogs_MetadataBrowser() throws InterruptedException {
        LoginCheck();
        er360MetaDataBrowserPageActions = new ER360_MetaDataBrowserPageActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("MetaData Browser Page");
        logger.assignCategory("ER360");
        logger.log(Status.INFO,"User Open Metadata Browser page");
        er360MetaDataBrowserPageActions.clickOnMetadataPage();
        logger.log(Status.INFO,"User clicks on All catalogs to load the Entire Catalog");
        er360MetaDataBrowserPageActions.Load_AllCatalog();
        logger.log(Status.INFO,"Verifying the Catalog is loaded properly or not");
        Thread.sleep(15000);
        try {

            if (driver.findElement(By.xpath("//p[@aria-label='eMovies']")).isEnabled() ){
                System.out.println("All catalog loaded successfully in Metadata Browser ");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"All catalog loaded successfully in Metadata Browser ");
            }
            else
            {
                System.out.println("Error in loading the entire Catalog ");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in loading the entire Catalog");
            }

        }
        catch (Exception e){
            System.out.println("Error in loading the entire Catalog");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in loading the entire Catalog");
        }
        softAssert.assertAll();

    }

    @Test(priority = 2)
    public void Searching_Model_in_MetadataBrowser() throws InterruptedException {
        LoginCheck();
        er360MetaDataBrowserPageActions = new ER360_MetaDataBrowserPageActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("MetaData Browser Page");
        logger.assignCategory("ER360");
        logger.log(Status.INFO,"User Open Metadata Browser page");
        er360MetaDataBrowserPageActions.clickOnMetadataPage();
        logger.log(Status.INFO,"User clicks on All catalogs to load the Entire Catalog");
        er360MetaDataBrowserPageActions.Load_AllCatalog();
        logger.log(Status.INFO,"User click on search icon to search the model");
        Thread.sleep(15000);
        er360MetaDataBrowserPageActions.clickOnSearchModelIcon();
        logger.log(Status.INFO,"Entering eMovies to search the eMovies Model");
        er360MetaDataBrowserPageActions.EnterModel_toSearch();
        logger.log(Status.INFO,"Verifying the Model is getting displayed when search action is performed in Metadata Browser");
        Thread.sleep(5000);
        try {

            if (driver.findElement(By.xpath("/html/body/div/div[3]/main/div[1]/div/section[2]/aside/div/div/div[1]/div[2]/div/ul/li/ul/li/div/div/div")).isDisplayed())
            {
                System.out.println("eMovies Model found");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"eMovies Model found");
            }
            else
            {
                System.out.println("Search Model in Metadata Browser failed");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Search Model in Metadata Browser failed");
            }

        }
        catch (Exception e){
            System.out.println("Search Model in Metadata Browser failed");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Search Model in Metadata Browser failed");
        }
        softAssert.assertAll();

    }

    @Test(priority = 3)
    public void Verifying_Data_under_Model() throws InterruptedException {
        LoginCheck();
        er360MetaDataBrowserPageActions = new ER360_MetaDataBrowserPageActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("MetaData Browser Page");
        logger.assignCategory("ER360");
        logger.log(Status.INFO,"User Open Metadata Browser page");
        er360MetaDataBrowserPageActions.clickOnMetadataPage();
        logger.log(Status.INFO,"User clicks on All catalogs to load the Entire Catalog");
        er360MetaDataBrowserPageActions.Load_AllCatalog();
        logger.log(Status.INFO,"User click on eMovies");
        Thread.sleep(15000);
        er360MetaDataBrowserPageActions.clickOn_eMovies();
        er360MetaDataBrowserPageActions.clickOn_Tables();
        logger.log(Status.INFO,"Tables are successfully displayed under the Model");
        er360MetaDataBrowserPageActions.clickOn_CUST();
        er360MetaDataBrowserPageActions.clickOn_Columns();
        er360MetaDataBrowserPageActions.clickOn_CUST_address();
        logger.log(Status.INFO,"Columns are successfully displayed under the Model");
        logger.log(Status.INFO,"Verifying the object properties data under Column");
        try {

            if (driver.findElement(By.xpath("//span[@aria-label='customer address']")).isDisplayed())
            {
                System.out.println("Verifying Data under Model is successful");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Verifying Data under Model is successful");
            }


        }
        catch (Exception e){
            System.out.println("Error in Displaying data under the model");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in Displaying data under the model");
        }
        softAssert.assertAll();

    }

    @Test(priority = 4)
    public void Verifying_ER_Diagram() throws InterruptedException {
        LoginCheck();
        er360MetaDataBrowserPageActions = new ER360_MetaDataBrowserPageActions(driver);
        logger.assignAuthor("prabhat");
        logger.assignCategory("MetaData Browser Page");
        logger.assignCategory("ER360");
        logger.log(Status.INFO, "User Open Metadata Browser page");
        er360MetaDataBrowserPageActions.clickOnMetadataPage();
        logger.log(Status.INFO, "User clicks on All catalogs to load the Entire Catalog");
        er360MetaDataBrowserPageActions.Load_AllCatalog();
        logger.log(Status.INFO, "User click on eMovies");
        Thread.sleep(15000);
        er360MetaDataBrowserPageActions.clickOn_eMovies();
        er360MetaDataBrowserPageActions.clickOn_ER_Diagram();
        logger.log(Status.INFO, "Tables are successfully displayed under the Model");
        er360MetaDataBrowserPageActions.clickOn_Drawing_Objects();
        er360MetaDataBrowserPageActions.clickOn_DiagramViewMode();
        er360MetaDataBrowserPageActions.clickOn_Physical_DiagramView();
        er360MetaDataBrowserPageActions.clickOn_Search_in_ERDiagram();
        er360MetaDataBrowserPageActions.EnterDataTo_Search_in_ERDiagram();
        /*Thread.sleep(3000);
        Dimension web = driver.findElement(By.xpath("//div[@id='diagramDiv']")).getSize();
        String str = driver.findElement(By.xpath("//div[@id='diagramDiv']")).getText();
        System.out.println(web);
        System.out.println(str);*/




        // /html/body/div/div[3]/main/div[1]/div/section[2]/section/main/div/div/div[3]/div[1]/div/canvas
        //div[@id='diagramDiv']
    }

}

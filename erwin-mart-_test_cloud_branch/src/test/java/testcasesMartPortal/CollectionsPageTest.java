package testcasesMartPortal;


import actions.CollectionsPageActions;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class CollectionsPageTest extends BaseTest {

    CollectionsPageActions collectionsPageActions;
    SoftAssert softAssert = new SoftAssert();

    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }

    @Test(priority = 1)
    public void Create_New_Collection() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page");
        collectionsPageActions.Click_AddCollections();
        logger.log(Status.INFO,"User Clicks on Add Collection Button");
        collectionsPageActions.Enter_CollectionName();
        logger.log(Status.INFO,"Enters Collection name");
        collectionsPageActions.Enter_CollectionDesc();
        logger.log(Status.INFO,"Enters Collection Description");
        collectionsPageActions.Click_Create_Collection();
        logger.log(Status.INFO,"User Clicks on Submit Button");
        logger.log(Status.INFO,"Verifying Collection Creation");
        try {
            if (driver.findElement(By.xpath("//h6[text()='test_collection']")).isDisplayed() ){
                System.out.println("Collection created Successfully");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Collection created Successfully");
            }
            else
            {
                System.out.println("Error in Creating Collection");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in Creating Collection");
            }

        }
        catch (Exception e){
            System.out.println("Error in Creating Collection");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in Creating Collection");
        }
        softAssert.assertAll();


    }

    @Test(priority = 2 ,dependsOnMethods = { "Create_New_Collection" })
    public void Add_Object_to_Collection() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page");
        collectionsPageActions.Click_test_Collection();
        logger.log(Status.INFO, "User Clicks on the Collection");
        collectionsPageActions.Click_Edit_Object();
        logger.log(Status.INFO, "User Clicks Edit button for adding object");
        collectionsPageActions.Click_Add_Object();
        logger.log(Status.INFO, "User Clicks Add button for adding object");
        collectionsPageActions.Enter_Keyword();
        logger.log(Status.INFO, "User Enters keyword to search");
        collectionsPageActions.Enter_Categories();
        logger.log(Status.INFO, "User Selects Categories filter");
        collectionsPageActions.Enter_Model();
        logger.log(Status.INFO, "User Selects Models filter and Hits Enter");
        Thread.sleep(4000);
        collectionsPageActions.Click_ResultFirstCheckbox();
        collectionsPageActions.Click_AddToCollectionButton();
        Thread.sleep(4000);
        try {
            if (driver.findElement(By.xpath("//a[text()='CUST_address']")).isDisplayed() ){
                System.out.println("Object Successfully added to Collection");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Object Successfully added to Collection");
            }
            else
            {
                System.out.println("Error in adding object to the Collection");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in adding object to the Collection");
            }

        }
        catch (Exception e){
            System.out.println("Error when tried adding objects to Collections");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error when tried adding objects to Collections");
        }
        softAssert.assertAll();


    }

    @Test(priority = 3,dependsOnMethods = { "Add_Object_to_Collection" })
    public void Collection_SearchResult_redirectsTo_Metadata() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page");
        collectionsPageActions.Click_test_Collection();
        logger.log(Status.INFO, "User Clicks on added Collection object to verify if it is redirecting to Metadata Browser or not ");
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
            System.out.println("Error when tried redirecting to MetaData Browser");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error when tried redirecting to MetaData Browser");
        }
        softAssert.assertAll();


    }

    @Test(priority = 4,dependsOnMethods = { "Add_Object_to_Collection" })
    public void Verifying_Advance_Filter() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page");
        collectionsPageActions.Click_test_Collection();
        logger.log(Status.INFO, "User Clicks on the Collection");
        collectionsPageActions.Click_Edit_Object();
        logger.log(Status.INFO, "User Clicks Edit button for adding object");
        collectionsPageActions.Click_Add_Object();
        logger.log(Status.INFO, "User Clicks Add button for adding object");
        collectionsPageActions.Click_Advance_Filter();
        logger.log(Status.INFO, "User Clicks on Advance Filter");
        collectionsPageActions.Select_AdvanceFilter_Options();
        logger.log(Status.INFO, "Selects Advance filter options -----> Name");
        collectionsPageActions.Select_AdvanceFilter_Value();
        logger.log(Status.INFO, "Selects Advance filter value");
        collectionsPageActions.Click_AddToCollectionButton();
        logger.log(Status.INFO, "User Clicks on Save Collection Button");
    }

    @Test(priority = 5  ,dependsOnMethods = { "Create_New_Collection" })
    public void Verifying_Share_Collections() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page");
        collectionsPageActions.Click_test_Collection();
        logger.log(Status.INFO, "User Clicks on the Collection");
        collectionsPageActions.Click_Share_Button();
        logger.log(Status.INFO, "User Clicks on Share Button");
        collectionsPageActions.Select_All_ShareCheckbox();
        logger.log(Status.INFO, "User Clicks Select All option");
        collectionsPageActions.Click_ShareToUsers_Button();
        logger.log(Status.INFO, "User Clicks Share Button to share the Collections");
    }
    @Test(priority = 6,dependsOnMethods = { "Create_New_Collection" })
    public void Edit_Collections() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page");
        collectionsPageActions.Click_test_Collection();
        logger.log(Status.INFO, "User Clicks on the Collection");
        collectionsPageActions.Click_Edit_Collection();
        logger.log(Status.INFO, "User Clicks on Edit Collections");
        collectionsPageActions.Enter_EditedCollectionName_Desc();
        logger.log(Status.INFO, "User edits name and description of the worksheet");
        collectionsPageActions.Click_SaveCollectionButton_Update();
        logger.log(Status.INFO, "User Saves the worksheet after editing the worksheet");
    }

    @Test(priority = 7,dependsOnMethods = { "Create_New_Collection" })
    public void Deleting_Object_from_Collection() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page");
        collectionsPageActions.Click_Edited_Collection();
        logger.log(Status.INFO, "User Clicks on the Collection");
        collectionsPageActions.Click_Edit_Object();
        logger.log(Status.INFO, "User Clicks Edit button for adding object");
        collectionsPageActions.Click_DeleteObject();
        logger.log(Status.INFO, "User Clicks on Selects All objects and deletes it");


    }
    @Test(priority = 8,dependsOnMethods = { "Create_New_Collection" })
    public void Delete_Collections() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page");
        collectionsPageActions.Click_Random_Collection();
        logger.log(Status.INFO, "User Clicks on Random Collection");
        collectionsPageActions.Click_Delete_Collection();
        logger.log(Status.INFO, "User Clicks Delete button and tries deleting the Collection");

        logger.log(Status.INFO, "Verifying the worksheet is deleted or not");
        try {
            if (driver.findElement(By.xpath("//h6[text()='test_collection']")).isDisplayed() ){
                System.out.println("Error in deleting the Collections");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in deleting the Collections");
            }

        }
        catch (Exception e){
            System.out.println("Collections Deleted Successfully");
            softAssert.assertTrue(true);
            logger.log(Status.INFO,"Collections Deleted Successfully");
        }
        softAssert.assertAll();

    }
    @Test(priority = 9)
    public void Create_New_Collection_From_MetadataBrowser() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnMetaDataBrowserPage();
        logger.log(Status.INFO,"User Clicks on MetadataBrowser page");
        collectionsPageActions.ClickOnModel();
        logger.log(Status.INFO,"User Clicks on a Model");
        collectionsPageActions.Click_CollectionTextBox();
        logger.log(Status.INFO,"User Clicks Collection Text Box");
        collectionsPageActions.Enter_NewCollectionName();
        logger.log(Status.INFO,"Enters New Collection Name");
        collectionsPageActions.Click_AddNewCollection();
        logger.log(Status.INFO,"User Clicks on Add Collection");
        logger.log(Status.INFO,"Verifying Collection Creation");
        collectionsPageActions.ClickOnCollectionPage();
        logger.log(Status.INFO,"User Clicks on Collection page and search for test_collection_Metadata");

        try {
            if (driver.findElement(By.xpath("//h6[text()='test_collection_Metadata']")).isDisplayed() ){
                System.out.println("Collection created Successfully via Metadata Browser");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Collection created Successfully via Metadata Browser");
            }
            else
            {
                System.out.println("Error in Creating Collection via Metadata Browser");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in Creating Collection via Metadata Browser");
            }

        }
        catch (Exception e){
            System.out.println("Error in Creating Collection via Metadata Browser");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in Creating Collection via Metadata Browser");
        }
        softAssert.assertAll();

    }

    @Test(priority = 10,dependsOnMethods = { "Create_New_Collection_From_MetadataBrowser" })
    public void Add_Diff_Object_to_Collection_via_MetaDataBrowser() throws InterruptedException {
        LoginCheck();
        collectionsPageActions = new CollectionsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Collections Page");
        logger.assignCategory("ER360");
        collectionsPageActions.ClickOnMetaDataBrowserPage();
        logger.log(Status.INFO, "User Clicks on MetadataBrowser page");
        collectionsPageActions.ClickOnModel();
        logger.log(Status.INFO, "User Clicks on a Model");
        collectionsPageActions.ExpandModel();

        collectionsPageActions.Click_Tables();
        collectionsPageActions.Click_FirstObject();
        collectionsPageActions.Click_CollectionTextBox();
        collectionsPageActions.Enter_NewCollectionName();

        collectionsPageActions.Click_Relationships();
        collectionsPageActions.Click_FirstObject();
        collectionsPageActions.Click_CollectionTextBox();
        collectionsPageActions.Enter_NewCollectionName();
        collectionsPageActions.ClickOnCollectionPage();
        collectionsPageActions.Click_test_collection_Metadata();
        logger.log(Status.INFO, "User Clicks on the Collection");
        logger.log(Status.INFO,"User Clicks on Collection page and search for the Added Object");

        try {
            if (driver.findElement(By.xpath("//div[@title='Table']")).isDisplayed() ){
                System.out.println("Table is added to Collection Successfully");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Table is added to Collection Successfully");
            }
            else
            {
                System.out.println("Table is not added to Collection ");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Table is not added to Collection ");
            }


            if (driver.findElement(By.xpath("//div[@title='Model']")).isDisplayed() ){
                System.out.println("Model is added to Collection Successfully");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Model is added to Collection Successfully");
            }
            else
            {
                System.out.println("Model is not added to Collection ");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Model is not added to Collection ");
            }


            if (driver.findElement(By.xpath("//div[@title='Relationship']")).isDisplayed() ){
                System.out.println("Relationship is added to Collection Successfully");
                softAssert.assertTrue(true);
                logger.log(Status.INFO,"Relationship is added to Collection Successfully");
            }
            else
            {
                System.out.println("Relationship is not added to Collection ");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Relationship is not added to Collection ");
            }


        }
        catch (Exception e){
            System.out.println("Error in Adding Object to Collection via Metadata Browser");
            softAssert.assertFalse(true);
            logger.log(Status.INFO,"Error in Adding Object to Collection via Metadata Browser");
        }
        softAssert.assertAll();




    }

}

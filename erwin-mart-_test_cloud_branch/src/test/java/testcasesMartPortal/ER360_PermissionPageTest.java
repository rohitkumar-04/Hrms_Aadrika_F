package testcasesMartPortal;

import Utilities.Constants;
import Utilities.ExcelReader;
import actions.ER360_DevicesPageActions;
import actions.ER360_PermissionPageActions;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;


public class ER360_PermissionPageTest extends BaseTest
{
    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }
    ER360_PermissionPageActions er360PermissionPageActions;


    @Test(priority = 1)
    public void Opening_permissionPage() throws InterruptedException {
        LoginCheck();
        er360PermissionPageActions =  new ER360_PermissionPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page");
        logger.assignCategory("ER360");
        er360PermissionPageActions.ClickonPermissionPage();
        logger.log(Status.INFO,"Clicking On Permission page is working fine ");


    }
    @Test(priority = 2, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Assign_Admin_at_ER360RootLevel(String Username) throws InterruptedException {
        LoginCheck();
        er360PermissionPageActions =  new ER360_PermissionPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page");
        logger.assignCategory("ER360");
        er360PermissionPageActions.ClickonPermissionPage();
        logger.log(Status.INFO,"User Clicks on Permission page ");
        er360PermissionPageActions.ClickonER360root();
        logger.log(Status.INFO,"User Clicks on ER360 root node on permission page ");
        er360PermissionPageActions.ClickonAdminProfile();
        logger.log(Status.INFO,"User Clicks on Admin profile ");
        er360PermissionPageActions.SendingDatatoAdminProfile(Username);
        logger.log(Status.INFO,"User is assigning user to the Admin profile at ER360 Root Node");
        er360PermissionPageActions.ClickonSavePermission();
        logger.log(Status.INFO,"User clicks on Save Permission");
        logger.log(Status.INFO,"Assigning Admin permissions at ER 360 Root node is working fine");
    }

    @Test(priority = 3, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Assign_Admin_at_ER360LibraryLvl(String Username) throws InterruptedException {
        LoginCheck();
        er360PermissionPageActions =  new ER360_PermissionPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page");
        logger.assignCategory("ER360");
        er360PermissionPageActions.ClickonPermissionPage();
        logger.log(Status.INFO,"User Clicks on Permission page ");
        er360PermissionPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO,"User Clicks on SearchIcon ");
        er360PermissionPageActions.ClickOnThreeDots();
        logger.log(Status.INFO,"User Clicks on Three dots (More) ");
        er360PermissionPageActions.ClickOnGetAllCatalogs();
        logger.log(Status.INFO,"User Clicks Get all Catalogs ");
        er360PermissionPageActions.ClickOnYes();
        logger.log(Status.INFO,"User Clicks on YES");
        er360PermissionPageActions.ClickOnSearchCatalogs();
        logger.log(Status.INFO,"User Clicks on Search Catalog field for searching the desired library");
        er360PermissionPageActions.SendingDatatoSearchCatalog();
        logger.log(Status.INFO,"User enter library name in search field");
        er360PermissionPageActions.ClickOnLibrary();
        Thread.sleep(4000);
        er360PermissionPageActions.ClickOnLibrary();
        logger.log(Status.INFO,"User Clicks on the library");
        er360PermissionPageActions.SendingDatatoAdminProfileatLibraryLevel(Username);
        logger.log(Status.INFO,"User is assigning user to the Admin profile at Library Level");
        er360PermissionPageActions.ClickonSavePermission();
        logger.log(Status.INFO,"User clicks on Save Permission");
        logger.log(Status.INFO,"Assigning Admin permissions at ER360 Library level is working fine");
    }
    @Test(priority = 4, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Assign_Admin_at_ER360ModelLvl(String Username) throws InterruptedException {
        LoginCheck();
        er360PermissionPageActions =  new ER360_PermissionPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page");
        logger.assignCategory("ER360");
        er360PermissionPageActions.ClickonPermissionPage();
        logger.log(Status.INFO,"User Clicks on Permission page ");
        er360PermissionPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO,"User Clicks on SearchIcon ");
        er360PermissionPageActions.ClickOnThreeDots();
        logger.log(Status.INFO,"User Clicks on Three dots (More) ");
        er360PermissionPageActions.ClickOnGetAllCatalogs();
        logger.log(Status.INFO,"User Clicks Get all Catalogs ");
        er360PermissionPageActions.ClickOnYes();
        logger.log(Status.INFO,"User Clicks on YES");
        er360PermissionPageActions.ClickOnSearchCatalogs();
        logger.log(Status.INFO,"User Clicks on Search Catalog field for searching the desired Model");
        er360PermissionPageActions.SendingDatatoSearchCatalogForModel();
        logger.log(Status.INFO,"User enter Model name in search field");
        er360PermissionPageActions.ClickOnModel();
        Thread.sleep(4000);
        er360PermissionPageActions.ClickOnModel();
        logger.log(Status.INFO,"User Clicks on the Model");
        er360PermissionPageActions.SendingDatatoAdminProfileatLibraryLevel(Username);
        logger.log(Status.INFO,"User is assigning user to the Admin profile at Model Level");
        er360PermissionPageActions.ClickonSavePermission();
        logger.log(Status.INFO,"User clicks on Save Permission");
        logger.log(Status.INFO,"Assigning Admin permissions at ER360 Model level is working fine");
    }
    @Test(priority = 4, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Remove_Admin_at_EveryLevel(String Username) throws InterruptedException {
        LoginCheck();
        er360PermissionPageActions =  new ER360_PermissionPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page");
        logger.assignCategory("ER360");
        er360PermissionPageActions.ClickonPermissionPage();
        logger.log(Status.INFO,"User Clicks on Permission page ");
        er360PermissionPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO,"User Clicks on SearchIcon ");
        er360PermissionPageActions.ClickOnThreeDots();
        logger.log(Status.INFO,"User Clicks on Three dots (More) ");
        er360PermissionPageActions.ClickOnGetAllCatalogs();
        logger.log(Status.INFO,"User Clicks Get all Catalogs ");
        er360PermissionPageActions.ClickOnYes();
        logger.log(Status.INFO,"User Clicks on YES");

        er360PermissionPageActions.ClickonER360root();
        logger.log(Status.INFO,"User Clicks on ER360 root node on permission page ");
        Thread.sleep(4000);
        er360PermissionPageActions.ClickonAdminProfile();
        logger.log(Status.INFO,"User Clicks on Admin profile ");
        er360PermissionPageActions.SendingDatatoAdminProfile(Username);
        logger.log(Status.INFO,"User is removing user from the Admin profile at ER360 Root Node");


        er360PermissionPageActions.SendingDatatoSearchCatalog();
        logger.log(Status.INFO,"User enter library name in search field");
        er360PermissionPageActions.ClickOnLibrary();
        Thread.sleep(4000);
        er360PermissionPageActions.ClickOnLibrary();
        logger.log(Status.INFO,"User Clicks on the library");
        er360PermissionPageActions.SendingDatatoAdminProfileatLibraryLevel(Username);
        logger.log(Status.INFO,"User is removing user form the Admin profile at Library Level");



        er360PermissionPageActions.SendingDatatoSearchCatalogForModel();
        logger.log(Status.INFO,"User enter Model name in search field");
        er360PermissionPageActions.ClickOnModel();
        Thread.sleep(4000);
        er360PermissionPageActions.ClickOnModel();
        logger.log(Status.INFO,"User Clicks on the Model");
        er360PermissionPageActions.SendingDatatoAdminProfileatLibraryLevel(Username);
        logger.log(Status.INFO,"User is removing user from the Admin profile at Model Level");
        er360PermissionPageActions.ClickonSavePermission();
        logger.log(Status.INFO,"User clicks on Save Permission");
        logger.log(Status.INFO,"Removing Admin permissions from ER360 at Every level is working fine");
    }

    @Test(priority = 5, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Assign_Viewer_at_EveryLevel(String Username) throws InterruptedException {
        LoginCheck();
        er360PermissionPageActions =  new ER360_PermissionPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page");
        logger.assignCategory("ER360");
        er360PermissionPageActions.ClickonPermissionPage();
        logger.log(Status.INFO,"User Clicks on Permission page ");
        er360PermissionPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO,"User Clicks on SearchIcon ");
        er360PermissionPageActions.ClickOnThreeDots();
        logger.log(Status.INFO,"User Clicks on Three dots (More) ");
        er360PermissionPageActions.ClickOnGetAllCatalogs();
        logger.log(Status.INFO,"User Clicks Get all Catalogs ");
        er360PermissionPageActions.ClickOnYes();
        logger.log(Status.INFO,"User Clicks on YES");

        er360PermissionPageActions.ClickonER360root();
        Thread.sleep(4000);
        logger.log(Status.INFO,"User Clicks on ER360 root node on permission page ");
        er360PermissionPageActions.SendingDatatoViewerProfileatEveryLevel(Username);
        logger.log(Status.INFO,"User is Assinging Viewer permission at ER360 Root Node");

        er360PermissionPageActions.SendingDatatoSearchCatalog();
        logger.log(Status.INFO,"User enter library name in search field");
        er360PermissionPageActions.ClickOnLibrary();
        Thread.sleep(4000);
        er360PermissionPageActions.ClickOnLibrary();
        logger.log(Status.INFO,"User Clicks on the library");
        er360PermissionPageActions.SendingDatatoViewerProfileatEveryLevel(Username);
        logger.log(Status.INFO,"User assign Viewer profile at Library Level");



        er360PermissionPageActions.SendingDatatoSearchCatalogForModel();
        logger.log(Status.INFO,"User enter Model name in search field");
        er360PermissionPageActions.ClickOnModel();
        Thread.sleep(4000);
        er360PermissionPageActions.ClickOnModel();
        logger.log(Status.INFO,"User Clicks on the Model");
        er360PermissionPageActions.SendingDatatoViewerProfileatEveryLevel(Username);
        logger.log(Status.INFO,"User assign Viewer profile at Model Level");
        er360PermissionPageActions.ClickonSavePermission();
        logger.log(Status.INFO,"User clicks on Save Permission");
        logger.log(Status.INFO,"Assigning Viewer permissions at every level is working fine");
    }

    @Test(priority = 6, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Verify_Review_Changes(String Username) throws InterruptedException {
        LoginCheck();
        er360PermissionPageActions =  new ER360_PermissionPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page");
        logger.assignCategory("ER360");
        er360PermissionPageActions.ClickonPermissionPage();
        logger.log(Status.INFO,"User Clicks on Permission page ");
        er360PermissionPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO,"User Clicks on SearchIcon ");
        er360PermissionPageActions.ClickOnThreeDots();
        logger.log(Status.INFO,"User Clicks on Three dots (More) ");
        er360PermissionPageActions.ClickOnGetAllCatalogs();
        logger.log(Status.INFO,"User Clicks Get all Catalogs ");
        er360PermissionPageActions.ClickOnYes();
        logger.log(Status.INFO,"User Clicks on YES");
        er360PermissionPageActions.ClickonER360root();
        Thread.sleep(4000);
        logger.log(Status.INFO,"User Clicks on ER360 root node on permission page ");
        er360PermissionPageActions.SendingDatatoViewerProfileatEveryLevel(Username);
        logger.log(Status.INFO,"User is Assigning/Removing Viewer permission at ER360 Root Node");
        er360PermissionPageActions.ClickOnReviewChanges();
        logger.log(Status.INFO,"User Clicks on Review Changes");
        er360PermissionPageActions.SendingDatatoSearchCataloginReviewChanges(Username);
        logger.log(Status.INFO,"User is searching in Review Changes");
        er360PermissionPageActions.ClickonSavePermissioninReviewChanges();
        logger.log(Status.INFO,"User Clicks on Save Permission");
    }
    @Test(priority = 7, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Verify_Permission_Reports(String Username) throws InterruptedException {
        LoginCheck();
        er360PermissionPageActions =  new ER360_PermissionPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Permission Page");
        logger.assignCategory("ER360");
        er360PermissionPageActions.ClickonPermissionPage();
        logger.log(Status.INFO,"User Clicks on Permission page ");
        er360PermissionPageActions.ClickOnUserPermissionReport();
        logger.log(Status.INFO,"User Clicks on Permission Report Page ");
        er360PermissionPageActions.SendingDatatoSearchUserinReports(Username);
        logger.log(Status.INFO,"Searching for the user who's permission needs to be fetched");
        er360PermissionPageActions.ClickonDownloadExcel();
        er360PermissionPageActions.ClickonDownloadExcel();
        logger.log(Status.INFO,"User Clicks on Download Excel Icon ");
        er360PermissionPageActions.ClickonExpandAll();
        Thread.sleep(5000);
        logger.log(Status.INFO,"User Click on Expand All Icon");
        logger.log(Status.INFO,"User takes the screenshot of the entire permissions for the particular user");
        logger.log(Status.INFO,"Verify the permission of the user from the above screenshot- The user should have only viewer permission for New Model and New Library");
    }





}

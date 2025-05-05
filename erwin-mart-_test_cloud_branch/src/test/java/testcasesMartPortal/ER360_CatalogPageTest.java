package testcasesMartPortal;

import Utilities.ExcelReader;
import actions.Catalog_Page_Actions;
import actions.ER_360_CatalogPageActions;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ER360_CatalogPageTest extends BaseTest {

    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }

    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 3)
    public void Adding_Library_and_Sub_Library() throws InterruptedException {
        LoginCheck();
       ER_360_CatalogPageActions er360CatalogPageActions = new ER_360_CatalogPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("CatalogPage");
        logger.assignCategory("ER360");
        er360CatalogPageActions.clickonCatalogPage();
        logger.log(Status.INFO, "Clicking On Catalog Page");
        er360CatalogPageActions.CreateLibrary();
        logger.log(Status.INFO, "Creating library at mart root level");
        er360CatalogPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO, "Clicking on Search icon");
        er360CatalogPageActions.ClickOnSearchCatalogs();
        logger.log(Status.INFO, "Clicking on Search field");
        er360CatalogPageActions.CreateNestedLibrary();
        logger.log(Status.INFO, "Creating a nested library under the new library");
        logger.log(Status.INFO, "Adding Sub Library in ER 360 is Passed");

    }

    @Test(priority = 4)
    public void LazyLoading() throws InterruptedException {
        LoginCheck();
        ER_360_CatalogPageActions er360CatalogPageActions = new ER_360_CatalogPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("CatalogPage");
        logger.assignCategory("ER360");
        er360CatalogPageActions.clickonCatalogPage();
        logger.log(Status.INFO,"Clicking On Catalog Page");
        er360CatalogPageActions.clickonDropdown();
        logger.log(Status.INFO,"Clicking On Dropdown");
        er360CatalogPageActions.clickonAllcatalogs();
        logger.log(Status.INFO,"Clicking On All catalogs");
        er360CatalogPageActions.clickonYES();
        logger.log(Status.INFO,"Users Clicks on YES");
        logger.log(Status.INFO, "Lazy loading is passed in ER 360 Catalog page");
    }

    @Test(priority = 1)
    public void Deleting_Library() throws InterruptedException {
        LoginCheck();
        ER_360_CatalogPageActions er360CatalogPageActions = new ER_360_CatalogPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("CatalogPage");
        logger.assignCategory("ER360");
        er360CatalogPageActions.clickonCatalogPage();
        logger.log(Status.INFO,"Clicking On Catalog Page");
        er360CatalogPageActions.clickonDropdown();
        logger.log(Status.INFO,"Clicking On Dropdown");
        er360CatalogPageActions.clickonAllcatalogs();
        logger.log(Status.INFO,"Clicking On All catalogs");
        er360CatalogPageActions.clickonYES();
        logger.log(Status.INFO,"Users Clicks on YES");
        er360CatalogPageActions.clickonExpandAll();
        logger.log(Status.INFO,"User clicks on Expand icon");
        er360CatalogPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO, "Clicking on Search icon");
        er360CatalogPageActions.ClickOnSearchCatalogs();
        logger.log(Status.INFO, "Clicking on Search field");
        er360CatalogPageActions.SendingDatatoSearchCatalogs1();
        logger.log(Status.INFO, "Searching for the library which has to be renamed");
        er360CatalogPageActions.ClickOnlibrarytoRename();
        logger.log(Status.INFO, "Clicking on the library Name");
        er360CatalogPageActions.clickonDelete();
        er360CatalogPageActions.clickonYESDelete();
    }
    @Test(priority = 5)
    public void Expand_Collapse() throws InterruptedException {
        LoginCheck();
        ER_360_CatalogPageActions er360CatalogPageActions = new ER_360_CatalogPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("CatalogPage");
        logger.assignCategory("ER360");
        er360CatalogPageActions.clickonCatalogPage();
        logger.log(Status.INFO,"Clicking On Catalog Page");
        er360CatalogPageActions.clickonDropdown();
        logger.log(Status.INFO,"Clicking On Dropdown");
        er360CatalogPageActions.clickonAllcatalogs();
        logger.log(Status.INFO,"Clicking On All catalogs");
        er360CatalogPageActions.clickonYES();
        logger.log(Status.INFO,"Users Clicks on YES");
        er360CatalogPageActions.clickonExpandAll();
        logger.log(Status.INFO,"User clicks on Expand icon");
        er360CatalogPageActions.clickonCollapseAll();
        logger.log(Status.INFO,"User clicks on Collapse icon");
        logger.log(Status.INFO, "Expand and Collapse is working fine");

    }
    @Test(priority = 6, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Rename_ER360_Root_Node(String newRootName) throws InterruptedException {
        LoginCheck();
        ER_360_CatalogPageActions er360CatalogPageActions = new ER_360_CatalogPageActions(driver);
        String rootvalue = newRootName;
        logger.assignAuthor("Prabhat");
        logger.assignCategory("CatalogPage");
        logger.assignCategory("ER360");
        er360CatalogPageActions.clickonCatalogPage();
        logger.log(Status.INFO,"Clicking On Catalog Page");
        er360CatalogPageActions.clickonDropdown();
        logger.log(Status.INFO,"Clicking On Dropdown");
        er360CatalogPageActions.clickonAllcatalogs();
        logger.log(Status.INFO,"Clicking On All catalogs");
        er360CatalogPageActions.clickonYES();
        logger.log(Status.INFO,"Users Clicks on YES");
        er360CatalogPageActions.clickonExpandAll();
        logger.log(Status.INFO,"User clicks on Expand icon");
        er360CatalogPageActions.ClickOnLibraryName();
        logger.log(Status.INFO,"User clicks on ER360 Root node");
        er360CatalogPageActions.SendingNewDatatoER360rootnode(newRootName);
        logger.log(Status.INFO,"User modified the root name to---------->> "+ rootvalue);
        logger.log(Status.INFO,"User Renamed ER 360 root node");
        er360CatalogPageActions.ClickOnSaveCatalog();
        logger.log(Status.INFO,"User clicks on Save Catalog icon");
        logger.log(Status.INFO, "Rename ER 360 root node works fine");
    }


    @Test(priority = 7, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Rename_library_and_Description(String newLibraryName, String newDescriptionName) throws InterruptedException {
        LoginCheck();
        ER_360_CatalogPageActions er360CatalogPageActions = new ER_360_CatalogPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("CatalogPage");
        logger.assignCategory("ER360");
        er360CatalogPageActions.clickonCatalogPage();
        logger.log(Status.INFO,"Clicking On Catalog Page");
        er360CatalogPageActions.clickonDropdown();
        logger.log(Status.INFO,"Clicking On Dropdown");
        er360CatalogPageActions.clickonAllcatalogs();
        logger.log(Status.INFO,"Clicking On All catalogs");
        er360CatalogPageActions.clickonYES();
        logger.log(Status.INFO,"Users Clicks on YES");
        er360CatalogPageActions.clickonExpandAll();
        logger.log(Status.INFO,"User clicks on Expand icon");
        er360CatalogPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO, "Clicking on Search icon");
        er360CatalogPageActions.ClickOnSearchCatalogs();
        logger.log(Status.INFO, "Clicking on Search field");
        er360CatalogPageActions.SendingDatatoSearchCatalogs1();
        logger.log(Status.INFO, "Searching for the library which has to be renamed");
        er360CatalogPageActions.ClickOnlibrarytoRename();
        logger.log(Status.INFO, "Clicking on the library Name");
        er360CatalogPageActions.SendingNewDatatoLibraryName(newLibraryName);
        logger.log(Status.INFO, "Sending new data to Library Name ");
        er360CatalogPageActions.ClickOnLibraryDescription();
        logger.log(Status.INFO, "Clicking on the library Description");
        er360CatalogPageActions.SendingNewDatatoLibraryDesc(newDescriptionName);
        logger.log(Status.INFO, "Sending new data to library Description");
        er360CatalogPageActions.ClickOnSaveCatalog();
        logger.log(Status.INFO,"User clicks on Save Catalog icon");
        logger.log(Status.INFO, "Rename Library and Description is working fine");
    }

    @Test(priority = 8, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Rename_Model_Name_Description_(String newModelName, String newDescriptionName, String CatalogStatus) throws InterruptedException {
        LoginCheck();
        ER_360_CatalogPageActions er360CatalogPageActions = new ER_360_CatalogPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("CatalogPage");
        logger.assignCategory("ER360");
        er360CatalogPageActions.clickonCatalogPage();
        logger.log(Status.INFO,"Clicking On Catalog Page");
        er360CatalogPageActions.clickonDropdown();
        logger.log(Status.INFO,"Clicking On Dropdown");
        er360CatalogPageActions.clickonAllcatalogs();
        logger.log(Status.INFO,"Clicking On All catalogs");
        er360CatalogPageActions.clickonYES();
        logger.log(Status.INFO,"Users Clicks on YES");
        er360CatalogPageActions.clickonExpandAll();
        logger.log(Status.INFO,"User clicks on Expand icon");
        er360CatalogPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO, "Clicking on Search icon");
        er360CatalogPageActions.ClickOnSearchCatalogs();
        logger.log(Status.INFO, "Clicking on Search field");
        er360CatalogPageActions.SendingDatatoSearchCatalogs2();
        logger.log(Status.INFO, "Searching for the library which has to be renamed");
        er360CatalogPageActions.ClickOnModel();
        logger.log(Status.INFO, "Clicking on the Model Name");
        er360CatalogPageActions.SendingNewDatatoModelName(newModelName);
        logger.log(Status.INFO, "Sending new data to Model Name ");
        er360CatalogPageActions.ClickOnLibraryDescription();
        logger.log(Status.INFO, "Clicking on the Model Description");
        er360CatalogPageActions.SendingNewDatatoLibraryDesc(newDescriptionName);
        logger.log(Status.INFO, "Sending new data to Model Description");
        er360CatalogPageActions.ClicksonCatalogStatus();
        logger.log(Status.INFO, "Clicking on the Catalog Status");
        er360CatalogPageActions.SendingDatatoCatalogStatus(CatalogStatus);
        logger.log(Status.INFO, "Sending new data to Catalog Status");
        er360CatalogPageActions.ClickOnSaveCatalog();
        logger.log(Status.INFO,"User clicks on Save Catalog icon");
        logger.log(Status.INFO, "Rename Model and Description is working fine");
    }

    /* @Test(priority = 9)
     public void DragAndDrop(){
         catalogPageActions = new CatalogPageActions(driver);
         logger.assignAuthor("prabhat");
         logger.assignCategory("CatalogPage");
         logger.assignCategory("ER360");
         catalogPageActions.clickonCatalogPage();
         logger.log(Status.INFO, "Clicking On Catalog Page");
        catalogPageActions.CreateLibrary();
         logger.log(Status.INFO, "Creating library1 at ER 360 root level");
         catalogPageActions.ClicksonRootNode();
         logger.log(Status.INFO, "Clicking on ER 360 root node");
         catalogPageActions.CreateLibrary();
         logger.log(Status.INFO, "Creating library2 at ER 360 root level");
         catalogPageActions.ClickOnSearchIcon();
         logger.log(Status.INFO, "Clicking on Search icon");
         catalogPageActions.ClickOnSearchCatalogs();
         logger.log(Status.INFO, "Clicking on Search field");
         catalogPageActions.SendingDatatoSearchCatalogs1();
         logger.log(Status.INFO, "Searching for the new library which is created above");
         catalogPageActions.DragandDropLibrary();
         logger.log(Status.INFO, "Dragging one library to another");
         catalogPageActions.clickonDropdown();
         logger.log(Status.INFO,"Clicking On Dropdown");
         catalogPageActions.clickonAllcatalogs();
         logger.log(Status.INFO,"Clicking On All catalogs");
         catalogPageActions.clickonYES();
         logger.log(Status.INFO,"Users Clicks on YES");
         catalogPageActions.clickonExpandAll();
         logger.log(Status.INFO,"User clicks on Expand icon");
         catalogPageActions.DragandDropModel();
         logger.log(Status.INFO, "Dragging a model to a library");
         logger.log(Status.INFO, "Drag and Drop model is working for both model and library");
     }*/
    @Test(priority = 2)
    public void Verifying_SDI_Label() throws InterruptedException {
        LoginCheck();
        ER_360_CatalogPageActions er360CatalogPageActions = new ER_360_CatalogPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("CatalogPage");
        logger.assignCategory("ER360");
        er360CatalogPageActions.clickonCatalogPage();
        er360CatalogPageActions.clickonDropdown();
        logger.log(Status.INFO,"Clicking On Dropdown");
        er360CatalogPageActions.clickonAllcatalogs();
        logger.log(Status.INFO,"Clicking On All catalogs");
        er360CatalogPageActions.clickonYES();
        logger.log(Status.INFO,"Users Clicks on YES");
        er360CatalogPageActions.clickonExpandAll();
        logger.log(Status.INFO, "Clicking On Expand all");
        er360CatalogPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO, "Clicking on Search icon");
        er360CatalogPageActions.ClickOnSearchCatalogs();
        logger.log(Status.INFO, "Clicking on Search field");
        er360CatalogPageActions.SendingDatatoSearchCatalogs1();
        logger.log(Status.INFO, "Searching for New Model to verify SDI ");
        er360CatalogPageActions.ClickOnModel();
        logger.log(Status.INFO, "Clicking on New Model to verify SDI");
        er360CatalogPageActions.VerifyingSDIlabel();

    }








}

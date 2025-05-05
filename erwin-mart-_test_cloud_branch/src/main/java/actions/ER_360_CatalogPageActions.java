package actions;


import locators.Catalog_Page_Locators;
import locators.ER360_Catalog_Page_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class ER_360_CatalogPageActions
{
    WebDriver driver;

    SoftAssert softAssert = new SoftAssert();


    public ER360_Catalog_Page_Locators ER_catalog_page_locators = new ER360_Catalog_Page_Locators();
    WebDriverWait wait;

    public ER_360_CatalogPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, ER_catalog_page_locators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }


    public void clickonCatalogPage() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(ER_catalog_page_locators.CatalogPage)).click();


    }

    public void CreateLibrary() {

        ER_catalog_page_locators.CreateLibrary.click();
        ER_catalog_page_locators.Notification_pop_up.click();
            if(driver.getPageSource().contains("Library has been created."))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong. Please verify pop up msg after adding the library ");
                softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify pop up msg after adding the library ");
            }
            softAssert.assertAll();
        }



    public void CreateNestedLibrary()
    {

            ER_catalog_page_locators.CreateLibrary.click();
            ER_catalog_page_locators.Notification_pop_up.click();
            if(driver.getPageSource().contains("Library has been created."))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong. Please verify pop up msg after adding the library ");
                softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify pop up msg after adding the library ");
            }
            softAssert.assertAll();

    }

    public void clickonDropdown() {

            ER_catalog_page_locators.CatalogDropdown.click();

    }
    public void clickonAllcatalogs() {

            ER_catalog_page_locators.AllCatalogs.click();

    }
    public void clickonYES() {

            ER_catalog_page_locators.YES.click();
            ER_catalog_page_locators.Notification_pop_up.click();
            if(driver.getPageSource().contains("All Catalogs are loaded successfully!"))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong. Please verify pop up msg after lazy loading ");
                softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify pop up msg after Lazy loading ");
            }
            softAssert.assertAll();

    }
    public void clickonYESDelete() {

        ER_catalog_page_locators.YES.click();
        ER_catalog_page_locators.Notification_pop_up.click();
            if(driver.getPageSource().contains("deleted"))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong. Please verify pop up msg after delete ");
                softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify pop up msg after delete");
            }
            softAssert.assertAll();

    }
    public void clickonDelete() {

        ER_catalog_page_locators.Delete.click();

    }
    public void clickonExpandAll() {

        ER_catalog_page_locators.ExpandAll.click();

    }
    public void clickonCollapseAll() {

        ER_catalog_page_locators.CollapseAll.click();

    }
    public void ClickOnLibraryName() {

        ER_catalog_page_locators.LibraryName.click();

    }
    public void SendingNewDatatoModelName(String newModelName) {

            Actions actions = new Actions(driver);
            ER_catalog_page_locators.LibraryName.click();
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            ER_catalog_page_locators.LibraryName.sendKeys(newModelName);

    }
    public void SendingNewDatatoLibraryName(String newLibraryName) {

            Actions actions = new Actions(driver);
        ER_catalog_page_locators.LibraryName.click();
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        ER_catalog_page_locators.LibraryName.sendKeys(newLibraryName);

    }
    public void ClickOnLibraryDescription() {

        ER_catalog_page_locators.LibraryDescription.click();

    }
    public void SendingNewDatatoLibraryDesc(String newDescriptionName) {

            Actions actions = new Actions(driver);
        ER_catalog_page_locators.LibraryDescription.click();
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        ER_catalog_page_locators.LibraryDescription.sendKeys(newDescriptionName);

    }
    /*I am sending to catalog status and at the same time I am trying to save the catalog status in the field*/
    public void SendingDatatoCatalogStatus(String CatalogStatus) {

            Actions actions = new Actions(driver);
        ER_catalog_page_locators.CatalogStatusClick.click();
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        ER_catalog_page_locators.CatalogStatusClick.sendKeys(CatalogStatus);
            actions.keyDown(Keys.ARROW_DOWN).build().perform();
            actions.keyDown(Keys.ENTER).build().perform();
            actions.keyDown(Keys.TAB).build().perform();
            actions.keyDown(Keys.TAB).build().perform();
            actions.keyDown(Keys.ENTER).build().perform();



    }
    public void SendingNewDatatoER360rootnode(String newRootName)
    {

            Actions actions = new Actions(driver);
            ER_catalog_page_locators.LibraryName.click();
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            ER_catalog_page_locators.LibraryName.sendKeys(newRootName);

    }
    public void ClickOnSaveCatalog() {

        ER_catalog_page_locators.Save_Catalog.click();
        ER_catalog_page_locators.Notification_pop_up.click();
            if(driver.getPageSource().contains("updated"))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong.  ");
                softAssert.assertFalse(true,"Pop up msg is Wrong.  ");
            }
            softAssert.assertAll();

    }
    public void ClickOnSearchIcon() {

        ER_catalog_page_locators.Search_Icon.click();

    }
    public void ClickOnSearchCatalogs() {

        ER_catalog_page_locators.Search_Catalogs.click();

    }
    public void ClickOnModel() {

        ER_catalog_page_locators.ModelClick.click();

    }
    public void ClickOnlibrarytoRename() {

        ER_catalog_page_locators.libraryclick.click();

    }
    public void SendingDatatoSearchCatalogs1() {

        ER_catalog_page_locators.Search_Catalogs.clear();
        ER_catalog_page_locators.Search_Catalogs.sendKeys("New ");
        ER_catalog_page_locators.Search_Catalogs.sendKeys(Keys.ENTER);

    }
    public void SendingDatatoSearchCatalogs2() {

        ER_catalog_page_locators.Search_Catalogs.clear();
        ER_catalog_page_locators.Search_Catalogs.sendKeys("New Model");
        ER_catalog_page_locators.Search_Catalogs.sendKeys(Keys.ENTER);

    }

    public void DragandDropLibrary() {

            new Actions(driver).dragAndDrop(ER_catalog_page_locators.DraggableLibrary, ER_catalog_page_locators.DroppableLibrary).perform();
        ER_catalog_page_locators.Notification_pop_up.click();
            if(driver.getPageSource().contains("moved"))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong. Please verify pop up msg after drag and drop of a library ");
                softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify pop up msg after drag and drop of a library ");
            }
            softAssert.assertAll();

    }
    public void DragandDropModel() {

            new Actions(driver).dragAndDrop(ER_catalog_page_locators.DraggableModel, ER_catalog_page_locators.DroppableLibrary).perform();
            ER_catalog_page_locators.Notification_pop_up.click();
            if (driver.getPageSource().contains("moved")) {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
            } else {
                System.out.println("Pop up msg is Wrong. Please verify pop up msg after drag and drop of a Model ");
                softAssert.assertFalse(true, "Pop up msg is Wrong. Please verify pop up msg after drag and drop of a Model ");
            }
            softAssert.assertAll();

    }
    public void ClicksonRootNode()
    {

            ER_catalog_page_locators.ER360rootnode.click();

    }
    public void ClicksonCatalogStatus() {

        ER_catalog_page_locators.CatalogStatusClick.click();

    }
    public void VerifyingSDIlabel()
    {
        if(ER_catalog_page_locators.SDILabel.isDisplayed())
        {
            softAssert.assertTrue(true);
            System.out.println("SDI Label is successfully displayed at the Model");
        }
        else
        {
            System.out.println("SDI Label is not displayed at the Model");
            softAssert.assertFalse(true,"SDI Label is not displayed at the Model");
        }
        softAssert.assertAll();


    }
    public void Click_Notification_popup(){

        ER_catalog_page_locators.Notification_pop_up.click();


    }














}

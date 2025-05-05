package actions;


import locators.Catalog_Page_Locators;
import locators.Permission_Page_Locators;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class Catalog_Page_Actions
{
    WebDriver driver ;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();


    public Catalog_Page_Locators catalogPageLocators;



    public Catalog_Page_Actions(WebDriver driver)
    {
        this.driver = driver ;
        catalogPageLocators = new Catalog_Page_Locators();
        PageFactory.initElements(driver,catalogPageLocators);

    }

    public void ClickOnCatalogPage()
    {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Catalog_Page)).click();

    }
    public void PerformLazyLoading() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.LoadedCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.AllCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.ConfirmCatalogsLoading)).click();
        Thread.sleep(20000);

    }

    public void CreateLibrary() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.MartText)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.CreateLibraryButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("created")){
            System.out.println("Pop up msg is correct for Creating a Library");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Creating a Library");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
        Thread.sleep(4000);
    }
    public void CreateLibrary2()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.CreateLibraryButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("created")){
            System.out.println("Pop up msg is correct for Creating a Library");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Creating a Library");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();

    }


    public void SendingDataToSearchCatalogForLibraryDeletion()
    {

            Actions actions = new Actions(driver);
            wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.SearchTextBox)).click();
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            catalogPageLocators.SearchTextBox.sendKeys("New Library");
            actions.keyDown(Keys.ENTER).build().perform();
            wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.CreatedLibrary)).click();

    }
    public void SelectingModelToDelete()
    {

        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.NewModelCopy)).click();

    }

    public void SendingDataToSearchCatalogForSubLibraryCreation()
    {

        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.SearchTextBox)).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        catalogPageLocators.SearchTextBox.sendKeys("New Library");
        actions.keyDown(Keys.ENTER).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.NewLibrary)).click();

    }
    public void SendingDataToSearchCatalogForSubLibraryDeletion()
    {

        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.SearchTextBox)).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        catalogPageLocators.SearchTextBox.sendKeys("Sub Library");
        actions.keyDown(Keys.ENTER).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.SubLibrary)).click();

    }
    public void SendingDataToSearchCatalogForCopyPaste()
    {

        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.SearchTextBox)).click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        catalogPageLocators.SearchTextBox.sendKeys("New Model");
        actions.keyDown(Keys.ENTER).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.NewModel)).click();


    }
    public void Clicking_and_ExpandingModel() throws InterruptedException {

        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.NewModelnew)).click();
        actions.click(catalogPageLocators.NewModelnew);
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        Thread.sleep(2000);

    }
    public void MarkingVersion() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Version1)).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.MarkVersionButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("marked")){
            System.out.println("Pop up msg is correct for Marking a Version of a Model");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Marking a Version of a Model");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void HidingVersion() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.MarkedVersion)).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.HideVersionButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("hidden")){
            System.out.println("Pop up msg is correct for Hiding a Version of a Model");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Hiding a Version of a Model");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
    public void UnHidingVersion()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.NewModelnew)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.HiddenVersionTab)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.UnHideCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.UnHideVersionButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("unhidden")){
            System.out.println("Pop up msg is correct for Un-Hiding a Version of a Model");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Un-Hiding a Version of a Model");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void Copy_Paste_Model()
    {

        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        actions.contextClick(catalogPageLocators.NewModel).perform();

        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.CopyOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("copied")){
            System.out.println("Pop up msg is correct for Copying a Catalog");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Copying a Catalog");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
        actions.contextClick(catalogPageLocators.Mart).perform();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.PasteOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("copied")){
            System.out.println("Pop up msg is correct for pasting a Catalog");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for pasting a Catalog");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void ApplyingLocks() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.NewModelnew)).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.LocksTab)).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.ExistenceLockButton)).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("Existence")){
            System.out.println("Pop up msg is correct for Applying Lock");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Applying Lock");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
    public void RemovingLocks()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.UnHideCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.UnLockButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("removed")){
            System.out.println("Pop up msg is correct for Removing Lock");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Removing Lock");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
    public void RenamingLibrary() throws InterruptedException {

        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Library_Name_TextBox)).click();
        Thread.sleep(2000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        catalogPageLocators.Library_Name_TextBox.sendKeys("Sub Library");
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("updated")){
            System.out.println("Pop up msg is correct for Renaming a Library");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Renaming a Library");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void ClickOnDeleteButton()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.DeleteButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.ConfirmDeleteButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(catalogPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")){
            System.out.println("Pop up msg is correct for Deletion");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deletion");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();


    }


















}

package actions;


import locators.ER360_Devices_Page_Locators;
import locators.ER360_Permission_Page_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class ER360_PermissionPageActions {
    WebDriver driver;

    SoftAssert softAssert = new SoftAssert();
    public ER360_Permission_Page_Locators er360PermissionPageLocators = new ER360_Permission_Page_Locators();


    WebDriverWait wait;

    public ER360_PermissionPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360PermissionPageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }


    public void ClickonPermissionPage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.PermissionPage)).click();



    }

    public void ClickonER360root() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.ER360root)).click();



    }

    public void ClickonAdminProfile() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.AdminProfile)).click();






    }

    public void ClickonExpandAll() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.ExpandALL)).click();




    }

    public void ClickonDownloadExcel() {

        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.DownloadExcel));
        if ((er360PermissionPageLocators.DownloadExcel.isEnabled())) {
            er360PermissionPageLocators.DownloadExcel.click();
            System.out.println("Download Excel button for Permission Report is working");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Download Excel button for Permission Report is not working");
            softAssert.assertFalse(true, "Download Excel button for Permission Report is not working");
        }
        softAssert.assertAll();

    }

    public void ClickonSavePermission() {

        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.SavePermissions));
        er360PermissionPageLocators.SavePermissions.click();
        er360PermissionPageLocators.Notification_pop_up.click();
        if (driver.getPageSource().contains("Permissions updated successfully")) {
            System.out.println("Pop up msg is correct");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Pop up msg is Wrong. Please verify assigning permission to a user in permission page ");
            softAssert.assertFalse(true, "Pop up msg is Wrong. Please verify assigning permission to a user in permission page");
        }
        softAssert.assertAll();


    }

    public void SendingDatatoAdminProfile(String Username) {

        Actions actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.Admintext)).click();
        er360PermissionPageLocators.Admintext.sendKeys(Username);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

    }

    public void SendingDatatoAdminProfileatLibraryLevel(String Username) {

        Actions actions = new Actions(driver);
        er360PermissionPageLocators.Admintext.sendKeys(Username);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

    }

    public void SendingDatatoViewerProfileatEveryLevel(String Username) {

        Actions actions = new Actions(driver);
        er360PermissionPageLocators.Viewertextfield.sendKeys(Username);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

    }

    public void SendingDatatoSearchCatalog() {

        Actions actions = new Actions(driver);
        er360PermissionPageLocators.Search_Catalogs.click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        er360PermissionPageLocators.Search_Catalogs.sendKeys("New Library");
        actions.keyDown(Keys.ENTER).build().perform();

    }

    public void SendingDatatoSearchCatalogForModel() {

        Actions actions = new Actions(driver);
        er360PermissionPageLocators.Search_Catalogs.click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        er360PermissionPageLocators.Search_Catalogs.sendKeys("New Model");
        actions.keyDown(Keys.ENTER).build().perform();

    }

    public void SendingDatatoSearchCataloginReviewChanges(String Username) {

        Actions actions = new Actions(driver);
        er360PermissionPageLocators.Search_CatalogsinReviewChanges.click();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        er360PermissionPageLocators.Search_CatalogsinReviewChanges.sendKeys(Username);
        actions.keyDown(Keys.ENTER).build().perform();
        er360PermissionPageLocators.DeleteinReviewChanges.isEnabled();

    }

    public void SendingDatatoSearchUserinReports(String Username) throws InterruptedException {

        er360PermissionPageLocators.SelectUserinReports.click();
        Thread.sleep(4000);
        er360PermissionPageLocators.SelectUserinReports.sendKeys(Username);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();


    }

    public void ClickOnSearchIcon() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.SearchIcon)).click();





    }

    public void ClickOnSearchCatalogs() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.Search_Catalogs)).click();


    }

    public void ClickOnThreeDots() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.ThreeDots)).click();






    }

    public void ClickOnGetAllCatalogs() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.GetAllCatalogs)).click();







    }

    public void ClickOnYes() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.YES)).click();






    }

    public void ClickOnLibrary() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.LibraryClick)).click();



    }

    public void ClickOnModel() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.ModelClick)).click();



    }

    public void ClickOnReviewChanges() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.ReviewChanges)).click();



    }

    public void ClickOnUserPermissionReport() {

        Actions actions = new Actions(driver);
        // Perform CONTROL + SUBTRACT (minus) key press
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();

        er360PermissionPageLocators.UserPermissionReport.click();



    }

    public void ClickonSavePermissioninReviewChanges() {


        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.SavePermissioninReviewChanges)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360PermissionPageLocators.Notification_pop_up));
        er360PermissionPageLocators.Notification_pop_up.click();
        if (driver.getPageSource().contains("Permissions updated successfully")) {
            System.out.println("Pop up msg is correct");
            softAssert.assertTrue(true);
        } else {
            System.out.println("Pop up msg is Wrong. Please verify assigning permission to a user in permission page ");
            softAssert.assertFalse(true, "Pop up msg is Wrong. Please verify assigning permission to a user in permission page");
        }
        softAssert.assertAll();


    }
}


















package actions;


import com.aventstack.extentreports.Status;
import locators.Permission_Page_Locators;
import locators.Profile_Page_Locators;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class Permission_Page_Actions
{
    WebDriver driver ;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();

    public Permission_Page_Locators permissionPageLocators;



    public Permission_Page_Actions(WebDriver driver)
    {
        this.driver = driver ;
        permissionPageLocators = new Permission_Page_Locators();
        PageFactory.initElements(driver,permissionPageLocators);

    }

    public void ClickOnPermissionPage()
    {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.Permission_Page)).click();

    }
    public void PerformLazyLoading() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.LoadedCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.AllCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.ConfirmCatalogsLoading)).click();
        Thread.sleep(20000);

    }
    public void SendingDataToSearchCatalogForModel() throws InterruptedException {

            Actions actions = new Actions(driver);
            wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.SearchTextBox)).click();
            Thread.sleep(2000);
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            permissionPageLocators.SearchTextBox.sendKeys("New Model");
            Thread.sleep(2000);
            actions.keyDown(Keys.ENTER).build().perform();
            wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.NewModel)).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Collapse All']")));
            wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.CollapseAllButton)).click();


    }
    public void SendingDataToAdminProfile() throws InterruptedException {
            Actions actions = new Actions(driver);
            wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.AdminLabel)).click();
            Thread.sleep(2000);
            actions.keyDown(Keys.TAB).build().perform();
            Thread.sleep(2000);
            driver.switchTo().activeElement().sendKeys("mart_architect");
            Thread.sleep(2000);
            actions.keyDown(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(2000);
            actions.keyDown(Keys.ENTER).build().perform();
    }

    public void SendingDataToSearchCatalogForLibrary() throws InterruptedException {

        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.SearchTextBox)).click();
        Thread.sleep(2000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        permissionPageLocators.SearchTextBox.sendKeys("New Library");
        Thread.sleep(2000);
        actions.keyDown(Keys.ENTER).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.NewLibrary)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Collapse All']")));
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.CollapseAllButton)).click();

    }
    public void SendingDataToArchitectProfile() throws InterruptedException {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.ArchitectLabel)).click();
        Thread.sleep(2000);
        actions.keyDown(Keys.TAB).build().perform();
        Thread.sleep(2000);
        driver.switchTo().activeElement().sendKeys("mart_architect");
        Thread.sleep(2000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.ENTER).build().perform();
    }

    public void SendingDataToSearchCatalogForMartRootNode() throws InterruptedException {

        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.SearchTextBox)).click();
        Thread.sleep(2000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);
        permissionPageLocators.SearchTextBox.sendKeys("Mart");
        actions.keyDown(Keys.ENTER).build().perform();
       /* wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.MartRootNode)).click();*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Collapse All']")));
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.CollapseAllButton)).click();

    }
    public void SendingDataToViewerProfile() throws InterruptedException {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.ViewerLabel)).click();
        Thread.sleep(2000);
        actions.keyDown(Keys.TAB).build().perform();
        Thread.sleep(2000);
        driver.switchTo().activeElement().sendKeys("mart_architect");
        Thread.sleep(2000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.ENTER).build().perform();
    }

    public void ClickingOnSavePermissions()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.SavePermissions)).click();
        wait.until(ExpectedConditions.elementToBeClickable(permissionPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully")){
            System.out.println("Pop up msg is correct for Permission page");
            softAssert.assertTrue(true);
            /* profilePageLocators.Notification_Close.click();*/
        }
        else
        {
            System.out.println("Pop up msg is Wrong for Permission page. Please verify Pop up msg ");
            softAssert.assertFalse(true);
            
        }
        softAssert.assertAll();

    }















}

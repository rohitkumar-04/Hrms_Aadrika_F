package actions;


import locators.ER360_Devices_Page_Locators;
import locators.ER360_Views_Page_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class ER360_ViewPageActions {
    WebDriver driver;
    public ER360_Views_Page_Locators er360ViewsPageLocators = new ER360_Views_Page_Locators();

    WebDriverWait wait;
    SoftAssert softAssert = new SoftAssert();

    public ER360_ViewPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360ViewsPageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void viewPageClick() {
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(er360ViewsPageLocators.viewPageIcon)).click();
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void addView() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ViewsPageLocators.addView)).click();
        er360ViewsPageLocators.name.sendKeys("test");
        er360ViewsPageLocators.description.sendKeys("this is description");
        er360ViewsPageLocators.shareViewCheckBox.click();
        er360ViewsPageLocators.options.click();
        er360ViewsPageLocators.comboBox.sendKeys("copy");

      /*  Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ARROW_UP).build().perform();
        Thread.sleep(1000);
        actions.keyDown(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        er360ViewsPageLocators.comboBox.click();
        Thread.sleep(1000);*/
        er360ViewsPageLocators.aggregateCheckbox.click();
        er360ViewsPageLocators.saveViewButton.click();


        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ViewsPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully") ){
            System.out.println("Pop up msg is correct for Adding a View");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is wrong for Adding a View");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();


    }

    public void deleteView() throws InterruptedException
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ViewsPageLocators.searchView)).click();
        Thread.sleep(4000);
        er360ViewsPageLocators.searchView.sendKeys("test");
        er360ViewsPageLocators.checkBoxDelete.click();
        er360ViewsPageLocators.deleteButton.click();
        er360ViewsPageLocators.confirmDelete.click();
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360ViewsPageLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully") ){
            System.out.println("Pop up msg is correct for Deleting a View");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is wrong for Deleting a View");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
}



















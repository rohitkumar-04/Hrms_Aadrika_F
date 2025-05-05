package actions;

import locators.ER360_Global_Search_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ER360_GlobalSearchActions {
    WebDriver driver;
    public ER360_Global_Search_Locators er360GlobalSearchLocators = new ER360_Global_Search_Locators();
    WebDriverWait wait;

    public ER360_GlobalSearchActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360GlobalSearchLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void clickOnGlobalSearchTextBox() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.Global_Search_TextBox)).click();
        Thread.sleep(3000);

    }

    public void searchField() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.Global_Search_TextBox)).sendKeys("cust_address");
        Thread.sleep(3000);

    }

    public void ClickOnTheResult() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.keyword_Result)).click();
        Thread.sleep(3000);
    }

    public void ClickOnAdvanceFilter() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.Advanced_FilterButton)).click();
        Thread.sleep(2000);
    }

    public void ClickOnCategoriesTextBox() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.SelectCategories)).click();
        Thread.sleep(2000);
    }

    public void EnterCategories() {

       /* wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.SelectCategories)).click();*/
        driver.switchTo().activeElement().sendKeys("column");
        // er360GlobalSearchLocators.SelectCategories.sendKeys("column");

    }

    public void ClickOnColumnText() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.Column_text)).click();
        Thread.sleep(2000);
    }
    public void ClickOnCategoriesText() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.Categories_text)).click();
        Thread.sleep(2000);
    }



    public void ClickOnModelsTextBox() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.SelectModels)).click();
        Thread.sleep(2000);
    }

    public void ClickOnModelsRootNode() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.Model_RootNode)).click();
        Thread.sleep(2000);
    }


    public void ClickOnModelsText() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.Models_text)).click();
        Thread.sleep(2000);
    }

    public void ClickOnSubmitButton() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360GlobalSearchLocators.SubmitButton)).click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ESCAPE).build().perform();
    }

    public void ExpandModels() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.ARROW_RIGHT).build().perform();
        Thread.sleep(3000);
    }
}

package actions;

import locators.ER360_MetaData_Browser_Page_Locators;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ER360_MetaDataBrowserPageActions {
    WebDriver driver;
    public ER360_MetaData_Browser_Page_Locators er360MetaDataBrowserPageLocators = new ER360_MetaData_Browser_Page_Locators();
    WebDriverWait wait;

    public ER360_MetaDataBrowserPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360MetaDataBrowserPageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void clickOnMetadataPage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.Metadata_BrowserPageIcon)).click();

    }

    public void Load_AllCatalog() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.LoadedCatalogs_Metadata)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.All_Catalogs_Metadata)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.YES_load_AllCatalog)).click();
        Thread.sleep(1000);

    }

    public void clickOnSearchModelIcon() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.SearchModelIcon)).click();

    }
    public void EnterModel_toSearch() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.SearchModelTextBox)).click();
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.SearchModelTextBox)).sendKeys("emovies");
        Thread.sleep(1000);
        actions.keyDown(Keys.ENTER).build().perform();

    }
    public void clickOn_eMovies() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.EmoviesText)).click();
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.keyDown(Keys.ARROW_RIGHT).build().perform();

    }
    public void clickOn_Tables() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.TablesText)).click();
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.keyDown(Keys.ARROW_RIGHT).build().perform();

    }

    public void clickOn_CUST() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.CUST_Text)).click();
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.keyDown(Keys.ARROW_RIGHT).build().perform();

    }
    public void clickOn_Columns() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.Columns_Text)).click();
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.keyDown(Keys.ARROW_RIGHT).build().perform();

    }
    public void clickOn_CUST_address() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.CUST_address_Text)).click();

    }
    public void clickOn_ER_Diagram() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.ER_Diagram_Text)).click();
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.keyDown(Keys.ARROW_RIGHT).build().perform();

    }
    public void clickOn_Drawing_Objects() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.Drawing_Objects_Text)).click();

    }

    public void clickOn_DiagramViewMode() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.Logical_Text)).click();

    }
    public void clickOn_Physical_DiagramView() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.Physical_Text)).click();
        Thread.sleep(1000);

    }
    public void clickOn_Search_in_ERDiagram() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.Search_inER_Diagram_TextBox)).click();

    }
    public void EnterDataTo_Search_in_ERDiagram() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(er360MetaDataBrowserPageLocators.Search_inER_Diagram_TextBox)).sendKeys("CUST_address");

        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(1000);
        actions.keyDown(Keys.ENTER).build().perform();
        Thread.sleep(2000);
    }

}

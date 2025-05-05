package actions;


import locators.ER360_Catalog_Page_Locators;
import locators.ER360_Enterprise_Architecture_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class ER_360_EnterpriseArchitectureActions
{
    WebDriver driver;

    SoftAssert softAssert = new SoftAssert();




    public ER360_Enterprise_Architecture_Locators er360EnterpriseArchitectureLocators =  new ER360_Enterprise_Architecture_Locators();

    WebDriverWait wait;

    public ER_360_EnterpriseArchitectureActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360EnterpriseArchitectureLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void ClickonEAPage() throws InterruptedException {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.EApage)).click();
            Thread.sleep(5000);



    }
    public void ClickonEdit()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Edit)).click();





    }
    public void ClickonAdd() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Add)).click();






    }
    public void ClickonDelete() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Delete)).click();





    }
    public void ClickonAnnotate()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Annotate)).click();






    }
    public void ClickonClearDiagram()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.ClearDiagram)).click();
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.OkClearDiagram)).click();




    }
    public void ClickonUndo()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Undo)).click();


    }
    public void ClickonRedo()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Redo)).click();



    }
    public void ClickonSave() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Save)).click();




    }
    public void ClickonSubmit() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Submit)).click();





    }
    public void ClickonBullseye() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.Bullseye)).click();



    }
    public void ClickonModelDropdown() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360EnterpriseArchitectureLocators.ModelDropdown)).click();
            /*enterpriseArchitectureLocators.NEW.sendKeys("New Model");*/
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.ARROW_DOWN).build().perform();
            actions.keyDown(Keys.ENTER).build().perform();


    }










}

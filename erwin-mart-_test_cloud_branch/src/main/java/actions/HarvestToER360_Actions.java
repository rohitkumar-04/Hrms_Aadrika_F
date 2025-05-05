package actions;


import locators.Catalog_Page_Locators;
import locators.HarvestToER360_Locators;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class HarvestToER360_Actions
{
    WebDriver driver ;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();


    public HarvestToER360_Locators harvestToER360Locators;




    public HarvestToER360_Actions(WebDriver driver)
    {
        this.driver = driver ;
        harvestToER360Locators = new HarvestToER360_Locators();
        PageFactory.initElements(driver,harvestToER360Locators);

    }

    public void ClickOnHomePage()
    {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.Home_Page)).click();

    }
    public void OpenHarvestToER360page()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.Apps)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.HarvestToER360)).click();



    }
    public void ClickOnAddJobButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.AddJobButton)).click();
    }

    public void PerformLazyLoading()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.LoadedCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.AllCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.ConfirmCatalogsLoading)).click();

    }

    public void ClickOnCatalogAndLibrary() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='eMovies' or text()='EMOVIES' or text()='Emovies' or text()='emovies']"))).click();
        Thread.sleep(4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='New Model' or text()='new model' or text()='NEW MODEL' or text()='NewModel']"))).click();
        //wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.NewLibrary)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.MartText)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.MatchMartPathCheckbox)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.NewModel)).click();
    }

    public void EnteringJobInformation_OnceJob()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.EnterJobName)).click();
        harvestToER360Locators.EnterJobName.sendKeys("OnceJob");
       /* actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();*/
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.JobInterval)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.OnceJob)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.RunNowCheckbox)).click();

    }
    public void EnteringJobInformation_DailyJob()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.EnterJobName)).click();
        harvestToER360Locators.EnterJobName.sendKeys("DailyJob");
       /* actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();*/
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.JobInterval)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.DailyJOB)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.RunNowCheckbox)).click();

    }

    public void EnteringJobInformation_WeeklyJob()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.EnterJobName)).click();
        harvestToER360Locators.EnterJobName.sendKeys("WeeklyJob");
       /* actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();*/
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.JobInterval)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.WeeklyJOB)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.RunNowCheckbox)).click();

    }
    public void EnteringJobInformation_MonthlyJob()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.EnterJobName)).click();
        harvestToER360Locators.EnterJobName.sendKeys("MonthlyJob");
        /*actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();*/
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.JobInterval)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.MonthlyJOB)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.RunNowCheckbox)).click();

    }
    public void EnteringJobInformation_YearlyJob()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.EnterJobName)).click();
        harvestToER360Locators.EnterJobName.sendKeys("YearlyJob");
        /*actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();*/
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.JobInterval)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.YearlyJOB)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.RunNowCheckbox)).click();

    }
    public void SelectingOnceJobToDelete() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div/div[2]/main/div/div/div[1]/div/div/input")));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.FourthCheckbox)).click();

    }
    public void SelectingJobToEdit() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div/div[2]/main/div/div/div[1]/div/div/input")));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.SecondCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.ManageJobButton)).click();
    }

    public void Entering_JobInformation_EditJob() throws InterruptedException {


        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.EnterJobName)).click();
        harvestToER360Locators.EnterJobName.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        harvestToER360Locators.EnterJobName.sendKeys("Edited Job");
        harvestToER360Locators.CalendarButton.click();
        harvestToER360Locators.NextMonthButton.click();
        harvestToER360Locators.Date15.click();
        harvestToER360Locators.PMButton.click();

    }

    public void ClickOnSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully") ){
            System.out.println("Pop up msg is correct for Creating a job in Harvest to ER 360");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Creating a job in Harvest to ER 360");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
    public void ClickOnEditJobSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("scheduled") ){
            System.out.println("Pop up msg is correct for Editing a job in Harvest to ER 360");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Editing a job in Harvest to ER 360");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void ClickOnDelete() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.DeleteJobsButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.ConfirmDeleteJobsButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")){
            System.out.println("Pop up msg is correct for Deleting a job in Harvest to ER 360");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deleting a job in Harvest to ER 360");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void SelectingJobToCancel() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div/div[2]/main/div/div/div[1]/div/div/input")));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.SecondCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.CancelJobButton)).click();
    }

    public void ClickOnCalendarView() throws InterruptedException {
        Thread.sleep(3000);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(harvestToER360Locators.CalendarViewButton)).click();
        Thread.sleep(5000);
    }




}

package actions;


import locators.DM_ConnectToDI_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


import java.time.Duration;


public class DM_ConnectToDI_Actions
{
    WebDriver driver ;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();



    public DM_ConnectToDI_Locators dmConnectToDILocators;




    public DM_ConnectToDI_Actions(WebDriver driver)
    {
        this.driver = driver ;
        dmConnectToDILocators =  new DM_ConnectToDI_Locators();
        PageFactory.initElements(driver,dmConnectToDILocators);

    }

    public void ClickOnSettingsPage()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.Settings_Page)).click();

    }
    public void ClickOnDIConfigurationTab()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.DIConfigTab)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.AddConfigDetailsButton)).click();

    }

    public void Enter_ConfigName(String ConfigurationName){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.ConfigNameTextBox)).click();
        dmConnectToDILocators.ConfigNameTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectToDILocators.ConfigNameTextBox.sendKeys(ConfigurationName);

    }
    public void Enter_ServerName(String ServerName){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.ServerNameTextBox)).click();
        dmConnectToDILocators.ServerNameTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectToDILocators.ServerNameTextBox.sendKeys(ServerName);

    }
    public void Enter_ApplicationName(String AppName){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.ApplicationNameTextBox)).click();
        dmConnectToDILocators.ApplicationNameTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectToDILocators.ApplicationNameTextBox.sendKeys(AppName);

    }

    public void Enter_PortNo(String PortNo){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.PortTextBox)).click();
        dmConnectToDILocators.PortTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectToDILocators.PortTextBox.sendKeys(PortNo);

    }
    public void Enter_DIUsername(String Username){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.UsernameTextBox)).click();
        dmConnectToDILocators.UsernameTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectToDILocators.UsernameTextBox.sendKeys(Username);

    }

    public void Enter_DIPassword(String Password){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.PasswordTextBox)).click();
        dmConnectToDILocators.PasswordTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectToDILocators.PasswordTextBox.sendKeys(Password);

    }
    public void TestingDIDetails(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.TestConnectionButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("tested Successfully") ){
            System.out.println("Pop up msg is correct for testing a DI Configuration");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for testing a DI Configuration");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();


    }
    public void SavingDIDetails() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.SaveConnectionButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("added.") ){
            System.out.println("Pop up msg is correct for adding a DI Configuration Details");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for adding a DI Configuration Details");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void OpenDMConnectForDIPage()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.Apps)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.DMConnect_ForDI)).click();

    }
    public void ClickOnImportDIJOB(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.ImportJobButton)).click();
    }

    public void EnteringDIInformation_Connectors() throws InterruptedException {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.ConnectorsInput)).click();
        dmConnectToDILocators.ConnectorsInput.sendKeys("testDI");
        Thread.sleep(5000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("Successful") ){
            System.out.println("Pop up msg is correct for selecting DI Connector");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for DI Connector");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();


        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.SystemsInput)).click();
        dmConnectToDILocators.SystemsInput.sendKeys("tej");
        Thread.sleep(5000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.EnvironmentInput)).click();
        dmConnectToDILocators.EnvironmentInput.sendKeys("emovies");
        Thread.sleep(5000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();


    }

    public void ClickOnCatalogAndLibrary()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Mart']")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.MartRootNodeLabel)).click();

    }
    public void EnteringDIJobInformation_OnceJob()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.EnterJobName)).click();
        dmConnectToDILocators.EnterJobName.sendKeys("DIOnceJob");
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.OnceJob)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.RunNowCheckbox)).click();

    }
    public void ClickOnSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully") ){
            System.out.println("Pop up msg is correct for Creating a job in DM Connect for DI");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Creating a job in DM Connect for DI");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void ClickOnRefreshJobs()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.RefreshJobButton)).click();

    }

    public void SelectingJobToEdit() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.FirstCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.ManageJobButton)).click();
    }

    public void Entering_JobInformation_EditJob() throws InterruptedException {


        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.EnterJobName)).click();
        dmConnectToDILocators.EnterJobName.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        dmConnectToDILocators.EnterJobName.sendKeys("Edited Job");
        dmConnectToDILocators.CalendarButton.click();
        dmConnectToDILocators.NextMonthButton.click();
        dmConnectToDILocators.Date15.click();
        dmConnectToDILocators.PMButton.click();

    }
    public void ClickOnEditJobSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.Notification_PopUp)).click();
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

    public void SelectingJobToCancel() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.FirstCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.CancelJobButton)).click();
    }
    public void ClickOnCalendarView() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.CalendarViewButton)).click();
    }
    public void SelectingEditedJobToDelete() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.FirstCheckbox)).click();

    }
    public void ClickOnDelete() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.DeleteJobsButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.ConfirmDeleteJobsButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectToDILocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")){
            System.out.println("Pop up msg is correct for Deleting a job in DM Connect for DI JOB");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deleting a job in DM Connect for DI JOB");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }





}

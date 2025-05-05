package actions;


import locators.DM_ConnectForCollibra_Locators;
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


public class DM_ConnectForCollibra_Actions
{
    WebDriver driver ;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();



    public DM_ConnectForCollibra_Locators dmConnectForCollibraLocators;





    public DM_ConnectForCollibra_Actions(WebDriver driver)
    {
        this.driver = driver ;
        dmConnectForCollibraLocators =  new DM_ConnectForCollibra_Locators();
        PageFactory.initElements(driver,dmConnectForCollibraLocators);

    }

    public void ClickOnSettingsPage()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.Settings_Page)).click();

    }
    public void EnterCollibraLicense()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.MartConnectorTextBox)).click();

    }
    public void Click_Test_Connection()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.TestConnectionButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("Valid") ){
            System.out.println("Pop up msg is correct for Collibra License ");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Collibra License");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.SaveConnectionButton)).click();
    }


    public void ClickOnCollibraConfigurationTab()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.CollibraConfigTab)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.AddConfigDetailsButton)).click();

    }

    public void Enter_ConfigName(String ConfigurationName, String ServerName,String SSL,String Username, String Password)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.ConfigNameTextBox)).click();
        dmConnectForCollibraLocators.ConfigNameTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectForCollibraLocators.ConfigNameTextBox.sendKeys(ConfigurationName);

        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.ServerNameTextBox)).click();
        dmConnectForCollibraLocators.ServerNameTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectForCollibraLocators.ServerNameTextBox.sendKeys(ServerName);

        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.EnableSSLTextBox)).click();
        dmConnectForCollibraLocators.EnableSSLTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectForCollibraLocators.EnableSSLTextBox.sendKeys(SSL);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.UsernameTextBox)).click();
        dmConnectForCollibraLocators.UsernameTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectForCollibraLocators.UsernameTextBox.sendKeys(Username);

        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.PasswordTextBox)).click();
        dmConnectForCollibraLocators.PasswordTextBox.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        dmConnectForCollibraLocators.PasswordTextBox.sendKeys(Password);

    }



    public void SavingCollibraDetails() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.SaveConnectionButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("added.") ){
            System.out.println("Pop up msg is correct for adding a DM Connect for Collibra Details");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for adding a DM Connect for Collibra Details");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void OpenDMConnectForCollibraPage()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.Apps)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.DMConnect_ForCollibra)).click();

    }
    public void ClickOnImportDIJOB(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.ImportJobButton)).click();
    }
    public void Entering_CollibraInformation_Connectors() throws InterruptedException {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.ConnectorsInput)).click();
        dmConnectForCollibraLocators.ConnectorsInput.sendKeys("lorang");
        Thread.sleep(7000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("Successful") ){
            System.out.println("Pop up msg is correct for selecting Collibra Connector");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Collibra Connector");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();


        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.CommunityInput)).click();
        dmConnectForCollibraLocators.CommunityInput.sendKeys("erwin DM");
        Thread.sleep(5000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();


        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.PDDNameInput)).click();
        dmConnectForCollibraLocators.PDDNameInput.sendKeys("emovies");
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();


        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.LDDNameInput)).click();
        dmConnectForCollibraLocators.LDDNameInput.sendKeys("emovies");
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();



    }


    public void ClickOnCatalogAndLibrary()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Mart']")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.MartRootNodeLabel)).click();

    }

    public void EnteringCollibraJobInformation_OnceJob()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.EnterJobName)).click();
        dmConnectForCollibraLocators.EnterJobName.sendKeys("CollibraOnceJob");
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.OnceJob)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.RunNowCheckbox)).click();

    }
    public void ClickOnSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.Notification_PopUp)).click();
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
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.RefreshJobButton)).click();

    }
    public void SelectingJobToEdit() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.FirstCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.ManageJobButton)).click();
    }

    public void Entering_JobInformation_EditJob() throws InterruptedException {


        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.EnterJobName)).click();
        dmConnectForCollibraLocators.EnterJobName.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        dmConnectForCollibraLocators.EnterJobName.sendKeys("Edited Collibra Job");
        dmConnectForCollibraLocators.CalendarButton.click();
        dmConnectForCollibraLocators.NextMonthButton.click();
        dmConnectForCollibraLocators.Date15.click();
        dmConnectForCollibraLocators.PMButton.click();

    }
    public void ClickOnEditJobSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("scheduled") ){
            System.out.println("Pop up msg is correct for Editing a job in DM Connect for Collibra");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Editing a job in DM Connect for Collibra");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void SelectingJobToCancel() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.FirstCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.CancelJobButton)).click();
    }
    public void ClickOnCalendarView() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='Calendar View']")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.CalendarViewButton)).click();
    }
    public void SelectingEditedJobToDelete() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.FirstCheckbox)).click();

    }
    public void ClickOnDelete() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.DeleteJobsButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.ConfirmDeleteJobsButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dmConnectForCollibraLocators.Notification_PopUp)).click();
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
  /*


















*/


}

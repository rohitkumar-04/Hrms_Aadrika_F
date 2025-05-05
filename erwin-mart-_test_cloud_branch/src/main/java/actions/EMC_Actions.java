package actions;


import locators.EMC_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class EMC_Actions {
    WebDriver driver;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();


    public EMC_Locators emcLocators;



    public EMC_Actions(WebDriver driver) {
        this.driver = driver;
        emcLocators = new EMC_Locators();
        PageFactory.initElements(driver, emcLocators);


    }

    public void ClickOnEMCPage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EMC_Page)).click();

    }

    public void ClickOnAddPolicy() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.AddPolicyButton)).click();

    }

    public void ClickOnAddRule() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.AddRuleButton)).click();

    }

    public void ClickOnRulesTab() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.RulesTab)).click();

    }
    public void ClickOnGenerateReportTab() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.GenerateReportTab)).click();

    }

    public void ClickOnRefreshPolicy() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.RefreshPolicyButton)).click();

    }
    public void ClickOnRefreshRules() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.RefreshRuleButton)).click();

    }
    public void EnterPolicyName() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EnterPolicyNameTextBox)).click();
        emcLocators.EnterPolicyNameTextBox.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        emcLocators.EnterPolicyNameTextBox.sendKeys("Test Policy");
    }

    public void EnterPolicyDesc() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EnterDescNameTextBox)).click();
        emcLocators.EnterDescNameTextBox.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        emcLocators.EnterDescNameTextBox.sendKeys("Test Description");
    }

    public void ClickOnAppliedRules() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.AppliedRuleTab)).click();

    }

    public void EnterObjectTypeandRule() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.ObjectTypeTextbox)).click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.SearchTextboxinPolicy)).click();
        emcLocators.SearchTextboxinPolicy.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        emcLocators.SearchTextboxinPolicy.sendKeys("definition");
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.SelectAllRowsCheckbox)).click();

    }

    public void EnterRuleDetails()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EnterPolicyNameTextBox)).click();
        emcLocators.EnterPolicyNameTextBox.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        emcLocators.EnterPolicyNameTextBox.sendKeys("A Test Rule");


        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EnterRuleDescNameTextBox)).click();
        emcLocators.EnterRuleDescNameTextBox.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        emcLocators.EnterRuleDescNameTextBox.sendKeys("Test Description");


        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.SelectRuleProperty)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.DefinitionOption)).click();

        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.SelectValidateAction)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.IsPopulatedOption)).click();


    }

    public void SavingPolicyAndRule() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("added")) {
            System.out.println("Pop up msg is correct for adding a Policy in EMC page");
            softAssert.assertTrue(true);

        } else {
            System.out.println("Pop up msg is Wrong for adding a Policy in EMC page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }


    public void ClickonExistingRule() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.ExistingRule)).click();

    }
    public void ClickonCloneRule() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.CloneRuleButton)).click();

    }
    public void EditingRuleName() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EnterPolicyNameTextBox)).click();
        emcLocators.EnterPolicyNameTextBox.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        emcLocators.EnterPolicyNameTextBox.sendKeys("Cloned Rule");

    }
    public void ClickOnDelete() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.DeleteRuleButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.ConfirmDeleteButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")){
            System.out.println("Pop up msg is correct for Deleting a rule/policy in EMC page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deleting a rule/policy in EMC page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void ClickonRuletoDelete() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.ClonedRuletoDelete)).click();

    }
    public void ClickonAddJobButton() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.AddJobButton)).click();

    }
    public void PerformLazyLoading()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.LoadedCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.AllCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.ConfirmCatalogsLoading)).click();

    }
    public void EnterEMCReportInfo()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.MartRoot)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.SelectPolicy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.TestPolicyOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EnterReportNameTextBox)).click();
        emcLocators.EnterReportNameTextBox.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        emcLocators.EnterReportNameTextBox.sendKeys("EMC Test Report");


    }

    public void Entering_EMCJobInformation_OnceJob()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EnterJobName)).click();
        emcLocators.EnterJobName.sendKeys("EMC OnceJob");
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.TAB).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.OnceJob)).click();


    }

    public void ClickOnSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully") ){
            System.out.println("Pop up msg is correct for Creating a job in EMC page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Creating a job in EMC page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void SelectJobtoRun() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.FirstCheckbox)).click();

    }
    public void ClickonRunJobButton() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.RunJobButton)).click();

    }
    public void ClickOnRefreshJobs()
    {
        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.RefreshJobButton)).click();

    }

    public void SelectingJobToEdit() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.FirstCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.ManageJobButton)).click();
    }

    public void Entering_JobInformation_EditJob() throws InterruptedException {


        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.EnterJobName)).click();
        emcLocators.EnterJobName.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        emcLocators.EnterJobName.sendKeys("Edited EMC Job");
        emcLocators.CalendarButton.click();
        emcLocators.NextMonthButton.click();
        emcLocators.Date15.click();
        emcLocators.PMButton.click();

    }
    public void ClickOnEditJobSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("scheduled") ){
            System.out.println("Pop up msg is correct for Editing a job in Emc page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Editing a job in EMC page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void SelectingJobToCancel() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.FirstCheckbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.CancelJobButton)).click();
    }
    public void ClickOnCalendarView() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@aria-label='Calendar View']")));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.CalendarViewButton)).click();
    }
    public void SelectingEditedJobToDelete() throws InterruptedException {

        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/span")));
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.FirstCheckbox)).click();

    }
    public void ClickOnDeleteJob() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.DeleteJobsButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.ConfirmDeleteButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emcLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")){
            System.out.println("Pop up msg is correct for Deleting a job in EMC page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deleting a job in EMC page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
















}

package actions;


import locators.EG_Locators;
import locators.EMC_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class EG_Actions {
    WebDriver driver;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();


    public EG_Locators egLocators;



    public EG_Actions(WebDriver driver) {
        this.driver = driver;
        egLocators = new EG_Locators();
        PageFactory.initElements(driver, egLocators);


    }

    public void ClickOnEGPage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.EG_Page)).click();

    }

    public void ClickOnAddGlossary() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.AddGlossaryButton)).click();

    }

    public void EnterGlossaryDetails() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.EnterNameTextBox)).click();
        egLocators.EnterNameTextBox.sendKeys("Test Glossary 1");

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.EnterDescTextBox)).click();
        egLocators.EnterDescTextBox.sendKeys("Test Def");


    }
    public void SavingGlossary() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully")) {
            System.out.println("Pop up msg is correct for adding a Glossary/Business term in EG PAGE");
            softAssert.assertTrue(true);

        } else {
            System.out.println("Pop up msg is Wrong for adding a Glossary/BTerm in EG PAGE");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
        }
    public void SavingAssociations() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("applied")) {
            System.out.println("Pop up msg is correct for applying Association to the Model");
            softAssert.assertTrue(true);

        } else {
            System.out.println("Pop up msg is Wrong for applying Association to the Model");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void PerformLazyLoading()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.LoadedGlossaries)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.AllGlossaries)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.ConfirmCatalogsLoading)).click();

    }
    public void PerformLazyLoading_Associations()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.LoadedCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.AllCatalogs)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.ConfirmCatalogs)).click();

    }
    public void ClickonAssociatiosTab() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.AssociationsTab)).click();

    }
    public void ClickonMappingsTab() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.MappingsTab)).click();

    }
    public void ClickonReportsTab() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.ReportsTab)).click();

    }

    public void ClickonMappings_ReportsTab() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.MappingsTab_Reports)).click();

    }
    public void ClickonExistingGlossary() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.testglossary1label)).click();

    }
    public void ClickonExpandAll() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.ExpandAllCatalogs)).click();

    }
    public void ClickonAddBusinessTerm() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.AddBusinessTermButton)).click();

    }
    public void ClickonMartRootNodeLabel() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.MartRoot)).click();

    }

    public void ClickonSelectModel() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SelectModel_Association)).click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

    }
    public void ClickonEditMapping() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.EditMappingButton)).click();


    }

    public void ClickonGlossaryDropdown() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.GlossaryDropdown)).click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

    }
    public void EnterBusinessTermDetails1() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.BusinessTermNameTextBox)).click();
        egLocators.BusinessTermNameTextBox.sendKeys("BT1");

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.BusinessTermDefTextBox)).click();
        egLocators.BusinessTermDefTextBox.sendKeys("Test Def for BT1");

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SDIToggle)).click();

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SDIClassificationTextBox)).click();
        egLocators.SDIClassificationTextBox.sendKeys("Test_SDI");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SDIDescTextBox)).click();
        egLocators.SDIDescTextBox.sendKeys("Test_SDI_desc");


    }
    public void EnterBusinessTermDetails2() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.BusinessTermNameTextBox)).click();
        egLocators.BusinessTermNameTextBox.sendKeys("BT2");

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.BusinessTermDefTextBox)).click();
        egLocators.BusinessTermDefTextBox.sendKeys("Test Def for BT2");

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SDIToggle)).click();

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SDIClassificationTextBox)).click();
        egLocators.SDIClassificationTextBox.sendKeys("Test_SDI2");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SDIDescTextBox)).click();
        egLocators.SDIDescTextBox.sendKeys("Test_SDI_desc2");


    }
    public void EditBusinessTerm() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.EditBusinessTermIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.BT1Textbox)).click();
        egLocators.BT1Textbox.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        driver.switchTo().activeElement().sendKeys("Edited BT");

    }
    public void ClickOnSaveBT()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SaveBusinessTermIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully") ){
            System.out.println("Pop up msg is correct for Editing a Business Term in EG page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Editing a Business Term in EG page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
    public void ClickOnDeleteBT()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.DeleteBusinessTermIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.ConfirmDeleteButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully") ){
            System.out.println("Pop up msg is correct for deleting a Business Term in EG page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for deleting a Business Term in EG page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void ClickOnSaveEdit()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.SaveEditIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("saved") ){
            System.out.println("Pop up msg is correct for Mapping a Business Term in EG page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Mapping a Business Term in EG page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void ClickonImportGlossary() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.ImportGlossaryButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.ImportGlossaryOption)).click();
    }
    public void ClickonBrowseGlossaryButton() throws AWTException, InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.BrowseGlossaryButton)).click();
        Thread.sleep(4000);
        driver.switchTo().activeElement().sendKeys("Business Term");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();
        Thread.sleep(5000);
    }

    public void ClickOnDeleteGlossary() throws InterruptedException {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.DeleteGlossaryButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.ConfirmDeleteButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(egLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("deleted")){
            System.out.println("Pop up msg is correct for Deleting a Glossary in EG Page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deleting a Glossary in EG Page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

}

  /*  public void ClickOnSave()
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

    } public void ClickOnRulesTab() {

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


        public void ClickonRuletoDelete() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(emcLocators.ClonedRuletoDelete)).click();

        }*/
/*
        public void ClickonAddJobButton() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(emcLocators.AddJobButton)).click();

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
*/




















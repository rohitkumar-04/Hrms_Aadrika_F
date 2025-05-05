package actions;


import locators.CentralNSM_Locators;
import locators.ForgotPass_Locators;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
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


public class CentralNSM_Actions {
    WebDriver driver;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();



    public CentralNSM_Locators centralNSMLocators;

    public CentralNSM_Actions(WebDriver driver) {
        this.driver = driver;
        centralNSMLocators = new CentralNSM_Locators();
        PageFactory.initElements(driver,centralNSMLocators);

    }

    public void ClickOnCentralNsmPage()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.NSMpage)).click();

    }

    public void ClickOnAddFile()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.AddFile)).click();

    }

    public void ClickOnBrowse()
    {
        String csvPath = System.getProperty("user.dir") + ".\\testdata\\UserReport.csv";
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(csvPath);

    }

    public void EnterNSMName()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.NSM_Name_TextBox)).click();
        centralNSMLocators.NSM_Name_TextBox.sendKeys("Test_NSM");

    }

    public void EnterNSMLanguage()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Select_Language_TextBox)).click();
        centralNSMLocators.Select_Language_TextBox.sendKeys("English");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();

    }
    public void ClickOnSave()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("added") ){
            System.out.println("Pop up msg is correct Adding NSM File");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Adding a NSM File");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void ClickOnApply_Remove_NSM_Button()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Apply_RemoveNSM_Button)).click();

    }
    public void Select_Nsmfile()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Test_NSM_label)).click();

    }
    public void Select_MartRootNode()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.MartRoot_label)).click();

    }

    public void ClickOnSaveButtonToApplyNSM()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("successfully") ){
            System.out.println("Pop up msg is correct for Applying/Removing NSM to the Model");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Applying/Removing NSM to the Model");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
    public void Click_AddGlossary()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.AddGlossary)).click();

    }
    public void EnterNSMGlossaryDetails()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.EnterWord_TextBox)).click();
        centralNSMLocators.EnterWord_TextBox.sendKeys("Test Glossary");
        centralNSMLocators.EnterAbbreviation_TextBox.sendKeys("TG");
        centralNSMLocators.EnterAltAbbreviation_TextBox.sendKeys("TG1");
        centralNSMLocators.M2Checkbox_label.click();
        centralNSMLocators.EnterDefinition_TextBox.sendKeys("Test Definition for Glossary");
    }

    public void ClickOnSave_ToAddGlossary()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.SaveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("updated") ){
            System.out.println("Pop up msg is correct for adding a glossary in NSM page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is adding a glossary in NSM page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }

    public void Click_EditGlossary()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.EditGlossaryButton)).click();

    }

    public void Changes_GlossaryName()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.GlossaryNameTextBox)).click();
        centralNSMLocators.GlossaryNameTextBox.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        centralNSMLocators.GlossaryNameTextBox.sendKeys("Edited NSM Glossary");

    }
    public void ClickOnSaveGlossaryButton()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Saveglossarybutton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Notification_PopUp)).click();
        if (driver.getPageSource().contains("updated") ){
            System.out.println("Pop up msg is correct for editing a glossary in NSM page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is editing a glossary in NSM page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
    public void Click_DeleteGlossary()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.DeleteGlossaryButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.ConfirmDeleteGlossary)).click();
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Notification_PopUp)).click();

        if (driver.getPageSource().contains("updated")){
            System.out.println("Pop up msg is correct for Deleting a Glossary in Central NSM page");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deleting a Glossary in Central NSM page");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }
    public void Click_ViewReport()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.ViewReport)).click();

    }
    public void Click_DeleteNSM()
    {
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.DeleteNSM)).click();
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.ConfirmDeleteGlossary)).click();
        wait.until(ExpectedConditions.elementToBeClickable(centralNSMLocators.Notification_PopUp)).click();

        if (driver.getPageSource().contains("deleted")){
            System.out.println("Pop up msg is correct for Deleting a NSM");
            softAssert.assertTrue(true);

        }
        else
        {
            System.out.println("Pop up msg is Wrong for Deleting a NSM");
            softAssert.assertFalse(true);

        }
        softAssert.assertAll();
    }


}


















package actions;


import locators.Worksheet_Page_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


import java.time.Duration;

public class WorksheetsPageActions
{
    WebDriver driver;

    SoftAssert softAssert = new SoftAssert();


    public Worksheet_Page_Locators worksheetPageLocators = new Worksheet_Page_Locators();

    WebDriverWait wait;

    public WorksheetsPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, worksheetPageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void ClickOnWorksheetPage() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.WorkSheetsPage)).click();


    }
    public void Click_AddWorksheet() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.AddWorksheetButton)).click();


    }
    public void Enter_WorksheetName() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.EnterWorksheet_name)).click();
            worksheetPageLocators.EnterWorksheet_name.sendKeys("test_worksheet");



    }

    public void Enter_WorksheetDesc() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.EnterWorksheetDescription)).click();
            worksheetPageLocators.EnterWorksheetDescription.sendKeys("test_worksheet_description");



    }
    public void Click_Create_Worksheet() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.SaveButton)).click();



    }

    public void Click_test_Worksheet() throws InterruptedException {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.test_worksheet)).click();
            Thread.sleep(4000);


    }

    public void Enter_Keyword() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Search_box_Filter)).click();
            worksheetPageLocators.Search_box_Filter.sendKeys("cust_address");



    }
    public void Enter_Categories() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Categories_Filter)).click();
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Expand_Categories_Filter)).click();
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Columns_Option)).click();
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Close_Filter)).click();



    }
    public void Enter_Model() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Models_Filter)).click();
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.RootLevel_Filter)).click();
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Close_Filter)).click();



    }
    public void Click_SaveWorksheetButton() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.SaveWorksheet_Button)).click();
            worksheetPageLocators.Notification_pop_up.click();
            if(driver.getPageSource().contains("successfully!"))
            {
                System.out.println("Pop up msg is correct for worksheet filter");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong for worksheet filter ");
                softAssert.assertFalse(true,"Pop up msg is Wrong for worksheet filter ");
            }
            softAssert.assertAll();



    }

    public void Click_Advance_Filter() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.AdvanceFilterButton)).click();



    }
    public void Select_AdvanceFilter_Options() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Name_Options)).click();



    }
    public void Select_AdvanceFilter_Value() throws InterruptedException {


            Actions actions = new Actions(driver);
            wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Advance_filter_textbox)).click();
            Thread.sleep(4000);
            actions.keyDown(Keys.ARROW_DOWN).build().perform();
            actions.keyDown(Keys.ENTER).build().perform();




    }

    public void Click_Share_Button() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Share_Button)).click();


    }
    public void Select_All_ShareCheckbox() throws InterruptedException {

            Actions actions = new Actions(driver);
            wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.SelectUserTextbox)).click();
            Thread.sleep(4000);
            actions.keyDown(Keys.ARROW_DOWN).build().perform();
            actions.keyDown(Keys.ENTER).build().perform();



    }
    public void Click_ShareToUsers_Button() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.SaveButton)).click();
            worksheetPageLocators.Notification_pop_up.click();
            if(driver.getPageSource().contains("successfully"))
            {
                System.out.println("Pop up msg is correct for Sharing Worksheet");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong for Sharing Worksheet ");
                softAssert.assertFalse(true,"Pop up msg is Wrong for worksheet filter ");
            }
            softAssert.assertAll();



    }
    public void Click_Edit_Worksheet() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Three_Dots)).click();
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Edit_Worksheet)).click();



    }

    public void Click_Random_Worksheet() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Random_Worksheet)).click();



    }
    public void Click_Delete_Worksheet() throws InterruptedException {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Three_Dots)).click();
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.Delete_Worksheet)).click();
            Thread.sleep(1000);
            worksheetPageLocators.confirmDelete.click();
            Thread.sleep(4000);




    }
    public void Enter_EditedWorksheetName_Desc() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.EnterWorksheet_name)).click();
            worksheetPageLocators.EnterWorksheet_name.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
            worksheetPageLocators.EnterWorksheet_name.sendKeys("Edited_Worksheet");
            worksheetPageLocators.EnterWorksheetDescription.sendKeys("Edited Worksheet Description");




    }
    public void Click_SaveWorksheetButton_Update() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(worksheetPageLocators.SaveButton)).click();
            worksheetPageLocators.Notification_pop_up.click();
            if(driver.getPageSource().contains("successfully!"))
            {
                System.out.println("Pop up msg is correct for worksheet filter");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong for worksheet filter ");
                softAssert.assertFalse(true,"Pop up msg is Wrong for worksheet filter ");
            }
            softAssert.assertAll();


    }



}

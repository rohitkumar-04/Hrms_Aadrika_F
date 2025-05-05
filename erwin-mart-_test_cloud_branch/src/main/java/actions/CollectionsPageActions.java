package actions;



import locators.Collections_Page_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CollectionsPageActions
{
    WebDriver driver;

    SoftAssert softAssert = new SoftAssert();

    public Collections_Page_Locators collectionsPageLocators = new Collections_Page_Locators();


    WebDriverWait wait;

    public CollectionsPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, collectionsPageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void ClickOnCollectionPage() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.CollectionsPage)).click();
        Thread.sleep(4000);

    }
    public void Click_AddCollections() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.AddCollectionButton)).click();


    }

    public void Enter_CollectionName() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.EnterCollection_name)).click();
        collectionsPageLocators.EnterCollection_name.sendKeys("test_collection");



    }

    public void Enter_CollectionDesc() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.EnterCollectionDescription)).click();
        collectionsPageLocators.EnterCollectionDescription.sendKeys("test_collection_description");


    }
    public void Click_Create_Collection() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.SaveButton)).click();



    }


    public void Click_test_Collection() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.test_collection)).click();
        Thread.sleep(4000);


    }
    public void Click_test_collection_Metadata() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.test_collection_Metadata)).click();
        Thread.sleep(4000);

    }


    public void Enter_Keyword() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Search_box_Filter)).click();
        collectionsPageLocators.Search_box_Filter.sendKeys("cust_address");




    }


    public void Enter_Categories() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Categories_Filter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Expand_Categories_Filter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Columns_Option)).click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Close_Filter)).click();




    }
    public void Enter_Model() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Models_Filter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.RootLevel_Filter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Close_Filter)).click();



    }
    public void Click_SaveCollectionButton() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.SaveCollection_Button)).click();
        collectionsPageLocators.Notification_pop_up.click();
        if(driver.getPageSource().contains("successfully!"))
        {
            System.out.println("Pop up msg is correct for collection filter");
            softAssert.assertTrue(true);
        }
        else
        {
            System.out.println("Pop up msg is Wrong for collection filter ");
            softAssert.assertFalse(true,"Pop up msg is Wrong for collection filter ");
        }

        softAssert.assertAll();
    }

    public void Click_Edit_Object() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Edit_object)).click();



    }
    public void Click_Add_Object() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Add_object)).click();



    }

    public void Click_ResultFirstCheckbox() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Result_FirstCheckbox)).click();



    }
    public void Click_AddToCollectionButton() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Add_objectToCollections)).click();



    }

    public void Click_Advance_Filter() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.AdvanceFilterButton)).click();
        Thread.sleep(4000);


    }
    public void Select_AdvanceFilter_Options() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Name_Options)).click();



    }
    public void Select_AdvanceFilter_Value() throws InterruptedException {


        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Advance_filter_textbox)).click();
        Thread.sleep(4000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.SubmitButtonNew)).click();
        Thread.sleep(4000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Result_FirstCheckbox)).click();




    }

    public void Click_Share_Button() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Share_Button)).click();



    }
    public void Select_All_ShareCheckbox() throws InterruptedException {


        Actions actions = new Actions(driver);
        wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.SelectUserTextbox)).click();
        Thread.sleep(4000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();




    }
    public void Click_ShareToUsers_Button()
    {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.SaveButton)).click();
        collectionsPageLocators.Notification_pop_up.click();
        if(driver.getPageSource().contains("successfully"))
        {
            System.out.println("Pop up msg is correct for Sharing Collections");
            softAssert.assertTrue(true);
        }
        else
        {
            System.out.println("Pop up msg is Wrong for Sharing Collections ");
            softAssert.assertFalse(true,"Pop up msg is Wrong for Collections filter ");
        }
        softAssert.assertAll();



    }
    public void Click_Edit_Collection() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Three_Dots)).click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Edit_Collection)).click();



    }

    public void Click_Random_Collection() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Random_Collection)).click();



    }
    public void Click_DeleteObject() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Select_All_Object)).click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.DeleteObjectButton)).click();
        Thread.sleep(1000);
        collectionsPageLocators.confirmDelete.click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Notification_pop_up)).click();

        if(driver.getPageSource().contains("successfully"))
        {
            System.out.println("Pop up msg is correct for deleting collection object");
            softAssert.assertTrue(true);
        }
        else
        {
            System.out.println("Pop up msg is Wrong for deleting collection Object ");
            softAssert.assertFalse(true,"Pop up msg is Wrong for deleting collection Object ");
        }


        softAssert.assertAll();
    }

    public void Click_Delete_Collection() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Three_Dots)).click();
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Delete_Collection)).click();
        Thread.sleep(4000);
        collectionsPageLocators.confirmDelete.click();
        Thread.sleep(9000);




    }
    public void Enter_EditedCollectionName_Desc() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.EnterCollection_name)).click();
        collectionsPageLocators.EnterCollection_name.sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
        collectionsPageLocators.EnterCollection_name.sendKeys("Edited_Collection");
        collectionsPageLocators.EnterCollectionDescription.sendKeys("Edited Collection Description");




    }
    public void Click_SaveCollectionButton_Update() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.SaveButton)).click();
        collectionsPageLocators.Notification_pop_up.click();
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


    public void ClickOnMetaDataBrowserPage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.MetaDataBrowserPage)).click();


    }

    public void ClickOnModel() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.ModelClick_Meta)).click();


    }
    public void Click_CollectionTextBox() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.CollectionsTextBox)).click();



    }

    public void Enter_NewCollectionName() throws InterruptedException {

        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        collectionsPageLocators.CollectionsTextBox.sendKeys("test_collection_Metadata");
        Thread.sleep(3000);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(1000);
        actions.keyDown(Keys.ENTER).build().perform();
        Thread.sleep(5000);




    }
    public void Click_AddNewCollection() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Add_NewCollection)).click();
        Thread.sleep(2000);



    }
    public void ExpandModel() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_RIGHT).build().perform();
        Thread.sleep(4000);



    }

    public void Click_Tables() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Tables)).click();



    }
    public void Click_Relationships() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Relationships)).click();



    }

    public void Click_FirstObject() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.FirstObject)).click();



    }

    public void Click_Edited_Collection() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(collectionsPageLocators.Edited_Collection)).click();





    }


}

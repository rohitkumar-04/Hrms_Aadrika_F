package actions;



import locators.ER360_Settings_Page_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class ER360_SettingsPageActions {
    WebDriver driver;
    public ER360_Settings_Page_Locators er360SettingsPageLocators = new ER360_Settings_Page_Locators();
    WebDriverWait wait;
    SoftAssert softAssert = new SoftAssert();

    public ER360_SettingsPageActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, er360SettingsPageLocators);
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void ClickonSettingspage() {

            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.SettingsPage)).click();




    }
    int count;
    public void click_SmtpCheckbox(){

        if (er360SettingsPageLocators.SmtpCheckbox.isSelected())
        {
            count = 1;
            er360SettingsPageLocators.SmtpCheckbox.click();
            er360SettingsPageLocators.SmtpCheckbox.click();
        }
        else
        {
            er360SettingsPageLocators.SmtpCheckbox.click();
        }
    }
    public void Enter_SMTP_HostName(String SMTP){
        er360SettingsPageLocators.EnterSmtpHostname.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        er360SettingsPageLocators.EnterSmtpHostname.click();
        er360SettingsPageLocators.EnterSmtpHostname.sendKeys(SMTP);
    }
    public void Enter_Port_Number(String PortNumber){
        er360SettingsPageLocators.EnterPortNumber.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        er360SettingsPageLocators.EnterPortNumber.sendKeys(PortNumber);
    }
    public void click_AuthenticateCheckbox(){
        if (er360SettingsPageLocators.AuthenticateCheckBox.isSelected())
        {
            er360SettingsPageLocators.AuthenticateCheckBox.click();
            er360SettingsPageLocators.AuthenticateCheckBox.click();
        }
        else
        {
            er360SettingsPageLocators.AuthenticateCheckBox.click();
        }
    }
    public void Enter_SMTP_UserName(String Username){
        er360SettingsPageLocators.SmtpUsername.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        er360SettingsPageLocators.SmtpUsername.sendKeys(Username);
    }
    public void Enter_SMTP_Password(String Password){
        er360SettingsPageLocators.SmtpPass.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        er360SettingsPageLocators.SmtpPass.sendKeys(Password);
    }
    public void Enter_Admin_Email(String Email){
        er360SettingsPageLocators.AdminEmail.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        er360SettingsPageLocators.AdminEmail.sendKeys(Email);
    }
    public void Enter_No_Reply_Email(String NoReplyEmail){
        er360SettingsPageLocators.NoReplyEmail.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);
        er360SettingsPageLocators.NoReplyEmail.sendKeys(NoReplyEmail);
    }
    public void click_Save_Button()  {

        er360SettingsPageLocators.SaveButton.click();
        er360SettingsPageLocators.Notification_pop_up.click();
        if(driver.getPageSource().contains("Success"))
        {
            System.out.println("Pop up msg is correct");
            softAssert.assertTrue(true);
        }
        else
        {
            System.out.println("Pop up msg is Wrong. Please verify SMTP Details ");
            softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify SMTP Details");
        }
        softAssert.assertAll();


    }
    public void click_Logo_Tab()  {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.ChangeLogoTab)).click();


    }

    public void ClickOnBrowse()
    {
        String csvPath = System.getProperty("user.dir") + ".\\testdata\\pic3.png";
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(csvPath);

    }
    public void click_Crop_Button()  {


        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.CropButton)).click();


    }
    public void click_Save_Logo()  {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.SaveLogo)).click();



    }
    public void click_DropdownforLogotype()  {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.DropDownforLogo)).click();



    }
    public void SelectDropDownforOrganization(){
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();
    }
    public void SelectDropDownforOrganizationHeader(){
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ENTER).build().perform();
    }
    public void ClickIndexMetadataTab(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.IndexMetadataTab)).click();

    }

    public void ClickOnSearchIcon() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.SearchIcon)).click();





    }
    public void ClickOnSearchCatalogs() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.Search_Catalogs)).click();





    }
    public void ClickOnThreeDots() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.ThreeDots)).click();





    }
    public void ClickOnGetAllCatalogs() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.GetAllCatalogs)).click();




    }
    public void ClickOnYes() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.YES)).click();





    }
    public void SendingDatatoSearchCatalogForModel() {

            Actions actions = new Actions(driver);
        er360SettingsPageLocators.Search_Catalogs.click();
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        er360SettingsPageLocators.Search_Catalogs.sendKeys("eMovies");
            actions.keyDown(Keys.ENTER).build().perform();

    }
    public void ClickOnModel() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.ModelClick)).click();





    }
    public void ClickOnModelCheckbox() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.Checkbox)).click();



    }

    public void ClickOnIndexButton() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.Index)).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(er360SettingsPageLocators.Notification_pop_up)).click();

            if(driver.getPageSource().contains("added"))
            {
                System.out.println("Pop up msg is correct");
                softAssert.assertTrue(true);
            }
            else
            {
                System.out.println("Pop up msg is Wrong. Please verify Metadata Index ");
                softAssert.assertFalse(true,"Pop up msg is Wrong. Please verify Metadata Index ");
            }
            softAssert.assertAll();



    }


}


















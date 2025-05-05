package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_Settings_Page_Locators
{
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/settings']")
    public  WebElement SettingsPage;
    @FindBy(how = How.XPATH, using = "//input[@name='useSmtp']")
    public WebElement SmtpCheckbox;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='SMTP Hostname']")
    public WebElement EnterSmtpHostname;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Port Number']")
    public WebElement EnterPortNumber;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div[2]/div[2]/label[1]/span[1]/input")
    public WebElement AuthenticateCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
    public WebElement SmtpUsername;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    public WebElement SmtpPass;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Administrator Email']")
    public WebElement AdminEmail;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='No Reply Email']")
    public WebElement NoReplyEmail;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='License']")
    public WebElement EnterLicense;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[1]/div[1]/div[2]/div/button[1]")
    public WebElement RefreshButton;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[1]/div[1]/div[2]/div/button[2]")
    public WebElement SaveButton;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[1]/div[2]/div/button[2]")
    public WebElement ChangeLogoTab;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div[2]/p/span")
    public WebElement BrowsePicture;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div/button")
    public WebElement CropButton;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[1]/div[1]/div[2]/button")
    public WebElement SaveLogo;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div")
    public WebElement DropDownforLogo;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[1]/div[2]/div/button[3]")
    public WebElement IndexMetadataTab;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Search Catalogs']")
    public  WebElement SearchIcon;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='More']")
    public  WebElement ThreeDots;
    @FindBy(how = How.XPATH, using = "//*[@role='menuitem'][2]")
    public  WebElement GetAllCatalogs;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public  WebElement YES;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search across all models in ER360']")
    public  WebElement Search_Catalogs;
    @FindBy(how = How.XPATH, using = "//span[@title='New Model']")
    public  WebElement ModelClick;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[3]/div/div/div/div[1]/span[3]/span")
    public  WebElement Checkbox;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[1]/div[1]/div[2]/button")
    public  WebElement Index;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div")
    public  WebElement Notification_pop_up;


}

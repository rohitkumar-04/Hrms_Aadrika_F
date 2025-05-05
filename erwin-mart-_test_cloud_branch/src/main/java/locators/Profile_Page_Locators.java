package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Profile_Page_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/profiles']")
    public WebElement Profile_Page;

    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/profiles/create']")
    public WebElement CreateProfileButton;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Profile Name']")
    public WebElement ProfileNameTextBox;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Select existing profile to clone']")
    public WebElement CloneTextBox;

    @FindBy(how = How.XPATH,using = "//span[text()='AADeleteTestProfile']")
    public WebElement AADeleteTestProfile_Profile;

    @FindBy(how = How.XPATH,using = "//span[text()='AAMartTestProfile']")
    public WebElement AAMart_Test_Profile;
    @FindBy(how = How.XPATH,using = "//button[@aria-label='Expand All']")
    public WebElement Expand_Permission;

    @FindBy(how = How.XPATH,using = "//textarea[@placeholder='Enter Description']")
    public WebElement ProfileDescription_TxtBox;


    @FindBy(how = How.XPATH,using = "//button[@aria-label='Delete Profile']")
    public WebElement Delete_Button;

    @FindBy(how = How.XPATH,using = "/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public WebElement Confirm_Delete_Button;

    @FindBy(how = How.XPATH,using = "//button[text()='Edit']")
    public WebElement Edit_Button;

    @FindBy(how = How.XPATH,using = "//input[@id='catalogManagement']")
    public WebElement CatalogMgmtPermission;


    @FindBy(how = How.XPATH,using = "//button[text()='Save']")
    public WebElement SaveButton;


    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;
    @FindBy(how = How.XPATH,using = "//button[text()='Permissions Report']")
    public WebElement Permission_Report;

    @FindBy(how = How.XPATH,using = "(//button)[7]")
    public WebElement ClickONCancelButton;









}

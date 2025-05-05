package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Permission_Page_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/permissions']")
    public WebElement Permission_Page;

    @FindBy(how = How.XPATH,using = "//div[text()='Loaded Catalogs']")
    public WebElement LoadedCatalogs;

    @FindBy(how = How.XPATH,using = "//li[text()='All Catalogs']")
    public WebElement AllCatalogs;

    @FindBy(how = How.XPATH,using = "//button[text()='YES']")
    public WebElement ConfirmCatalogsLoading;

    @FindBy(how = How.XPATH,using = "//input[@class='MuiInputBase-input css-1jktamo']")
    public WebElement SearchTextBox;

    @FindBy(how = How.XPATH,using = "//span[text()='New Model']")
    public WebElement NewModel;
    @FindBy(how = How.XPATH,using = "//span[text()='New Library']")
    public WebElement NewLibrary;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Collapse All']")
    public WebElement CollapseAllButton;

    @FindBy(how = How.XPATH,using = "//p[text()='Admin']")
    public WebElement AdminLabel;

    @FindBy(how = How.XPATH,using = "//p[text()='Architect']")
    public WebElement ArchitectLabel;

    @FindBy(how = How.XPATH,using = "//p[text()='Viewer']")
    public WebElement ViewerLabel;

    @FindBy(how = How.XPATH,using = "//button[text()='Save Permissions']")
    public WebElement SavePermissions;
    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;


























}

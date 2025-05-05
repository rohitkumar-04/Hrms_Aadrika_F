package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Catalog_Page_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/catalogs']")
    public WebElement Catalog_Page;

    @FindBy(how = How.XPATH,using = "//div[text()='Loaded Catalogs']")
    public WebElement LoadedCatalogs;

    @FindBy(how = How.XPATH,using = "//li[text()='All Catalogs']")
    public WebElement AllCatalogs;

    @FindBy(how = How.XPATH,using = "//button[text()='YES']")
    public WebElement ConfirmCatalogsLoading;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Create Library']")
    public WebElement CreateLibraryButton;

    @FindBy(how = How.XPATH,using = "//input[@class='MuiInputBase-input css-1jktamo']")
    public WebElement SearchTextBox;

    @FindBy(how = How.XPATH,using = "//span[@title='New Library (1)']")
    public WebElement CreatedLibrary;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Delete Catalog']")
    public WebElement DeleteButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Delete']")
    public WebElement ConfirmDeleteButton;

    @FindBy(how = How.XPATH,using = "//span[@title='New Library']")
    public WebElement NewLibrary;

    @FindBy(how = How.XPATH,using = "//span[@title='Sub Library']")
    public WebElement SubLibrary;

    @FindBy(how = How.XPATH,using = "(//input[@value='New Library'])[2]")
    public WebElement Library_Name_TextBox;
    @FindBy(how = How.XPATH,using = "//button[text()='Save']")
    public WebElement SaveButton;

    @FindBy(how = How.XPATH,using = "//span[@title='New Model']")
    public WebElement NewModel;

    @FindBy(how = How.XPATH,using = "//p[text()='New Model - Copy']")
    public WebElement NewModelCopy;

    @FindBy(how = How.XPATH,using = "//p[text()='New Model']")
    public WebElement NewModelnew;

    @FindBy(how = How.XPATH,using = "//span[@title='Mart']")
    public WebElement Mart;
    @FindBy(how = How.XPATH,using = "//p[text()='Copy']")
    public WebElement CopyOption;

    @FindBy(how = How.XPATH,using = "//p[text()='Paste']")
    public WebElement PasteOption;

    @FindBy(how = How.XPATH,using = "//p[text()='Version 1']")
    public WebElement Version1;

    @FindBy(how = How.XPATH,using = "//p[text()='Named Version']")
    public WebElement MarkedVersion;

    @FindBy(how = How.XPATH,using = "//p[text()='Mart']")
    public WebElement MartText;











    @FindBy(how = How.XPATH,using = "//span[@aria-label='Collapse All']")
    public WebElement CollapseAllButton;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Hide Version']")
    public WebElement HideVersionButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Hidden Versions']")
    public WebElement HiddenVersionTab;

    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div[3]/main/div[1]/div/div[2]/div/main/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/div/div/div/table/thead/tr/th[1]/span")
    public WebElement UnHideCheckbox;

    @FindBy(how = How.XPATH,using = "//button[text()='Unhide']")
    public WebElement UnHideVersionButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Locks']")
    public WebElement LocksTab;

    @FindBy(how = How.XPATH,using = "//button[text()='Existence']")
    public WebElement ExistenceLockButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Unlock']")
    public WebElement UnLockButton;






    @FindBy(how = How.XPATH,using = "//span[@aria-label='Mark Version']")
    public WebElement MarkVersionButton;




    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;


























}

package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CentralNSM_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/nsm']")
    public WebElement NSMpage;

    @FindBy(how = How.XPATH, using = "//span[@aria-label='Add File']")
    public WebElement AddFile;

    @FindBy(how = How.XPATH, using = "//input[@type='file']")
    public WebElement uploadfile;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter NSM Name']")
    public WebElement NSM_Name_TextBox;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Select Language']")
    public WebElement Select_Language_TextBox;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    public WebElement SaveButton;


    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;

    @FindBy(how = How.XPATH,using = "//button[text()='Apply/Remove NSM']")
    public WebElement Apply_RemoveNSM_Button;


    @FindBy(how = How.XPATH,using = "//span[text()='Test_NSM']")
    public WebElement Test_NSM_label;

    @FindBy(how = How.XPATH,using = "//p[text()='Mart']")
    public WebElement MartRoot_label;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Add Glossary']")
    public WebElement AddGlossary;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Word/Words']")
    public WebElement EnterWord_TextBox;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Abbreviation']")
    public WebElement EnterAbbreviation_TextBox;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Alt Abbreviation']")
    public WebElement EnterAltAbbreviation_TextBox;

    @FindBy(how = How.XPATH,using = "//span[text()='M2']")
    public WebElement M2Checkbox_label;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Definition']")
    public WebElement EnterDefinition_TextBox;

    @FindBy(how = How.XPATH,using = "(//button[@aria-label='Edit'])[1]")
    public WebElement EditGlossaryButton;

    @FindBy(how = How.XPATH,using = "(//button[@aria-label='Delete'])[1]")
    public WebElement DeleteGlossaryButton;

    @FindBy(how = How.XPATH,using = "(//input[@type='text'])[1]")
    public WebElement GlossaryNameTextBox;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Save']")
    public WebElement Saveglossarybutton;
    @FindBy(how = How.XPATH,using = "//button[text()='Delete']")
    public WebElement ConfirmDeleteGlossary;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='View Report']")
    public WebElement ViewReport;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Delete File']")
    public WebElement DeleteNSM;

    @FindBy(how = How.XPATH,using = "(//span[text()='Test_NSM'])[2]")
    public WebElement TestNSMinReports;


















































}

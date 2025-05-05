package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EG_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/glossary']")
    public WebElement EG_Page;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Add Glossary']")
    public WebElement AddGlossaryButton;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Import Glossary']")
    public WebElement ImportGlossaryButton;

    @FindBy(how = How.XPATH,using = "//li[text()='Import Glossary']")
    public WebElement ImportGlossaryOption;

    @FindBy(how = How.XPATH,using = "//span[text()='browse']")
    public WebElement BrowseGlossaryButton;



    @FindBy(how = How.XPATH,using = "//button[@aria-label='Reimport Glossary']")
    public WebElement ReImportGlossaryButton;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Add Business Term']")
    public WebElement AddBusinessTermButton;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Delete Glossary']")
    public WebElement DeleteGlossaryButton;

    @FindBy(how = How.XPATH,using = "//a[@aria-label='Download']")
    public WebElement DownloadButton;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Delete All Glossaries']")
    public WebElement DeleteAllGlossariesButton;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Name']")
    public WebElement EnterNameTextBox;

    @FindBy(how = How.XPATH,using = "//textarea[@placeholder='Description']")
    public WebElement EnterDescTextBox;

    @FindBy(how = How.XPATH,using = "//button[text()='Save']")
    public WebElement SaveButton;
    @FindBy(how = How.XPATH,using = "//button[text()='Cancel']")
    public WebElement CancelButton;

    @FindBy(how = How.XPATH,using = "//p[text()='Test Glossary 1']")
    public WebElement testglossary1label;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Business Term']")
    public WebElement BusinessTermNameTextBox;

    @FindBy(how = How.XPATH,using = "//textarea[@placeholder='Definition']")
    public WebElement BusinessTermDefTextBox;

    @FindBy(how = How.XPATH,using = "//span[text()='SDI']")
    public WebElement SDIToggle;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='SDI Classification']")
    public WebElement SDIClassificationTextBox;

    @FindBy(how = How.XPATH,using = "//textarea[@placeholder='SDI Description']")
    public WebElement SDIDescTextBox;

    @FindBy(how = How.XPATH,using = "(//button[@aria-label='Edit'])[1]")
    public WebElement EditBusinessTermIcon;

    @FindBy(how = How.XPATH,using = "(//button[@aria-label='Delete'])[1]")
    public WebElement DeleteBusinessTermIcon;

    @FindBy(how = How.XPATH,using = "(//button[@aria-label='Save'])[1]")
    public WebElement SaveBusinessTermIcon;

    @FindBy(how = How.XPATH,using = "//input[@value='BT1']")
    public WebElement BT1Textbox;

    @FindBy(how = How.XPATH,using = "//button[text()='Associations']")
    public WebElement AssociationsTab;
    @FindBy(how = How.XPATH,using = "//button[text()='Mappings']")
    public WebElement MappingsTab;

    @FindBy(how = How.XPATH,using = "(//button[text()='Mappings'])[2]")
    public WebElement MappingsTab_Reports;


    @FindBy(how = How.XPATH,using = "//button[text()='Reports']")
    public WebElement ReportsTab;

    @FindBy(how = How.XPATH,using = "//button[text()='Details']")
    public WebElement DetailsTab;

    @FindBy(how = How.XPATH,using = "//div[text()='Loaded Glossaries']")
    public WebElement LoadedGlossaries;

    @FindBy(how = How.XPATH,using = "//li[text()='All Glossaries']")
    public WebElement AllGlossaries;

    @FindBy(how = How.XPATH,using = "//button[text()='Yes']")
    public WebElement ConfirmCatalogsLoading;

    @FindBy(how = How.XPATH,using = "//div[text()='Loaded Glossaries']")
    public WebElement LoadedCatalogs;

    @FindBy(how = How.XPATH,using = "//li[text()='All Glossaries']")
    public WebElement AllCatalogs;

    @FindBy(how = How.XPATH,using = "//button[text()='Yes']")
    public WebElement ConfirmCatalogs;

    @FindBy(how = How.XPATH,using = "(//button[@aria-label='Expand All'])[2]")
    public WebElement ExpandAllCatalogs;

    @FindBy(how = How.XPATH,using = "//p[text()='Mart']")
    public WebElement MartRoot;
    @FindBy(how = How.XPATH,using = "//div[@aria-label='Select Model']")
    public WebElement SelectModel_Association;

    @FindBy(how = How.XPATH,using = "//button[text()='Edit Mapping']")
    public WebElement EditMappingButton;

    @FindBy(how = How.XPATH,using = "(//button[@title='Open'])[2]")
    public WebElement GlossaryDropdown;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Save Edit']")
    public WebElement SaveEditIcon;














    @FindBy(how = How.XPATH,using = "//span[@aria-label='Refresh Policies']")
    public WebElement RefreshPolicyButton;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Refresh Rules']")
    public WebElement RefreshRuleButton;




    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Description']")
    public WebElement EnterRuleDescNameTextBox;




    @FindBy(how = How.XPATH,using = "//button[text()='Applied Rules']")
    public WebElement AppliedRuleTab;



    @FindBy(how = How.XPATH,using = "//input[@placeholder='Select Object Type']")
    public WebElement ObjectTypeTextbox;

    @FindBy(how = How.XPATH,using = "//input[@type='search']")
    public WebElement SearchTextboxinPolicy;

    @FindBy(how = How.XPATH,using = "/html/body/div[1]/div[3]/main/div[1]/div/div[3]/div/div/main/div/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]")
    public WebElement SelectAllRowsCheckbox;


    @FindBy(how = How.XPATH,using = "(//div[@aria-haspopup='listbox'])[1]")
    public WebElement SelectRuleProperty;

    @FindBy(how = How.XPATH,using = "//li[@data-value='Definition']")
    public WebElement DefinitionOption;

    @FindBy(how = How.XPATH,using = "(//div[@aria-haspopup='listbox'])[2]")
    public WebElement SelectValidateAction;

    @FindBy(how = How.XPATH,using = "//li[@data-value='is populated']")
    public WebElement IsPopulatedOption;

    @FindBy(how = How.XPATH,using = "//span[text()='Comment is populated']")
    public WebElement ExistingRule;

    @FindBy(how = How.XPATH,using = "//span[text()='Cloned Rule']")
    public WebElement ClonedRuletoDelete;

    @FindBy(how = How.XPATH,using = "//button[text()='Add Job']")
    public WebElement AddJobButton;





    @FindBy(how = How.XPATH,using = "(//div[@aria-haspopup='listbox'])[2]")
    public WebElement SelectPolicy;

    @FindBy(how = How.XPATH,using = "//li[text()='Test Policy']")
    public WebElement TestPolicyOption;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Report Name']")
    public WebElement EnterReportNameTextBox;





    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Job Name']")
    public WebElement EnterJobName;

    @FindBy(how = How.XPATH,using = "//li[@data-value='Once']")
    public WebElement OnceJob;



    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;



    @FindBy(how = How.XPATH,using = "//span[@aria-label='Refresh Jobs']")
    public WebElement RefreshJobButton;



    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/main/div[1]/div/div[3]/div/div/div[2]/div[2]/div/div/div[1]/div[1]/span")
    public WebElement FirstCheckbox;


    @FindBy(how = How.XPATH,using = "//span[@aria-label='Delete Jobs']")
    public WebElement DeleteJobsButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Delete']")
    public WebElement ConfirmDeleteButton;


    @FindBy(how = How.XPATH,using = "//span[@aria-label='Manage Job']")
    public WebElement ManageJobButton;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Run Job']")
    public WebElement RunJobButton;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Next month']")
    public WebElement NextMonthButton;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/main/div[1]/div/div[3]/div/div[3]/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/button")
    public WebElement CalendarButton;

    @FindBy(how = How.XPATH,using = "//button[text()='15']")
    public WebElement Date15;

    @FindBy(how = How.XPATH,using = "//li[@aria-label='PM']")
    public WebElement PMButton;

    @FindBy(how = How.XPATH,using = "//div[@title='Cancelled']")
    public WebElement CancelledLabel;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Cancel Job']")
    public WebElement CancelJobButton;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Calendar View']")
    public WebElement CalendarViewButton;

    @FindBy(how = How.XPATH,using = "//div[text()='DailyJob']")
    public WebElement DailyJobLabel;

















































}

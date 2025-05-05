package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EMC_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/emc']")
    public WebElement EMC_Page;

    @FindBy(how = How.XPATH,using = "//button[text()='Rules']")
    public WebElement RulesTab;

    @FindBy(how = How.XPATH,using = "//button[text()='Generate Report']")
    public WebElement GenerateReportTab;

    @FindBy(how = How.XPATH,using = "//button[text()='View Reports']")
    public WebElement ViewReportsTab;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Add Policy']")
    public WebElement AddPolicyButton;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Add Rule']")
    public WebElement AddRuleButton;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Clone Rule']")
    public WebElement CloneRuleButton;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Delete Rule']")
    public WebElement DeleteRuleButton;


    @FindBy(how = How.XPATH,using = "//span[@aria-label='Refresh Policies']")
    public WebElement RefreshPolicyButton;

    @FindBy(how = How.XPATH,using = "//span[@aria-label='Refresh Rules']")
    public WebElement RefreshRuleButton;


    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Name']")
    public WebElement EnterPolicyNameTextBox;

    @FindBy(how = How.XPATH,using = "//textarea[@placeholder='Enter Description']")
    public WebElement EnterDescNameTextBox;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Description']")
    public WebElement EnterRuleDescNameTextBox;



    @FindBy(how = How.XPATH,using = "//button[text()='Save']")
    public WebElement SaveButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Applied Rules']")
    public WebElement AppliedRuleTab;

    @FindBy(how = How.XPATH,using = "//button[text()='Cancel']")
    public WebElement CancelButton;

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

    @FindBy(how = How.XPATH,using = "//div[text()='Loaded Catalogs']")
    public WebElement LoadedCatalogs;

    @FindBy(how = How.XPATH,using = "//li[text()='All Catalogs']")
    public WebElement AllCatalogs;

    @FindBy(how = How.XPATH,using = "//button[text()='YES']")
    public WebElement ConfirmCatalogsLoading;

    @FindBy(how = How.XPATH,using = "//p[text()='Mart']")
    public WebElement MartRoot;

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

package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HarvestToER360_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/home']")
    public WebElement Home_Page;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Apps']")
    public WebElement Apps;

    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/harvest']")
    public WebElement HarvestToER360;

    @FindBy(how = How.XPATH,using = "//button[text()='Add Job']")
    public WebElement AddJobButton;

    @FindBy(how = How.XPATH,using = "//div[text()='Loaded Catalogs']")
    public WebElement LoadedCatalogs;

    @FindBy(how = How.XPATH,using = "//li[text()='All Catalogs']")
    public WebElement AllCatalogs;

    @FindBy(how = How.XPATH,using = "//button[text()='YES']")
    public WebElement ConfirmCatalogsLoading;

    @FindBy(how = How.XPATH,using = "//p[text()='New Library']")
    public WebElement NewLibrary;
    @FindBy(how = How.XPATH,using = "//p[text()='Mart']")
    public WebElement MartText;

    @FindBy(how = How.XPATH,using = "//p[text()='New Model']")
    public WebElement NewModel;

    @FindBy(how = How.XPATH,using = "//span[text()='Match Mart Path']")
    public WebElement MatchMartPathCheckbox;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Job Name']")
    public WebElement EnterJobName;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/main/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div/div/div/div[3]/div/div")
    public WebElement JobInterval;

    @FindBy(how = How.XPATH,using = "//li[@data-value='Once']")
    public WebElement OnceJob;
    @FindBy(how = How.XPATH,using = "//li[@data-value='Daily']")
    public WebElement DailyJOB;

    @FindBy(how = How.XPATH,using = "//li[@data-value='Weekly']")
    public WebElement WeeklyJOB;

    @FindBy(how = How.XPATH,using = "//li[@data-value='Monthly']")
    public WebElement MonthlyJOB;

    @FindBy(how = How.XPATH,using = "//li[@data-value='Yearly']")
    public WebElement YearlyJOB;

    @FindBy(how = How.XPATH,using = "//span[text()='Run Now']")
    public WebElement RunNowCheckbox;

    @FindBy(how = How.XPATH,using = "//button[text()='Save']")
    public WebElement SaveButton;

    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/main/div[1]/div/div/div[2]/main/div/div/div[2]/div[2]/div/div/div[2]/div[1]/span")
    public WebElement SecondCheckbox;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/main/div[1]/div/div/div[2]/main/div/div/div[2]/div[2]/div/div/div[4]/div[1]/span")
    public WebElement FourthCheckbox;



    @FindBy(how = How.XPATH,using = "//span[@aria-label='Delete Jobs']")
    public WebElement DeleteJobsButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Delete']")
    public WebElement ConfirmDeleteJobsButton;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/main/div[1]/div/div/div[2]/main/div/div/div[1]/div/div/input")
    public WebElement SearchTextBox;
    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/main/div[1]/div/div/div[2]/main/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/span")
    public WebElement SelectAllRows;





    @FindBy(how = How.XPATH,using = "//span[@aria-label='Manage Job']")
    public WebElement ManageJobButton;

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Next month']")
    public WebElement NextMonthButton;

    @FindBy(how = How.XPATH,using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/button")
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

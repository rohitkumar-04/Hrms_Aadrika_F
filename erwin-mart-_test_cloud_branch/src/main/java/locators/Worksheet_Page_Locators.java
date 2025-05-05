package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Worksheet_Page_Locators
{
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/worksheets']")
    public  WebElement WorkSheetsPage;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Worksheet']")
    public WebElement AddWorksheetButton;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
    public WebElement EnterWorksheet_name;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Description']")
    public WebElement EnterWorksheetDescription;

    @FindBy(how = How.XPATH, using = "(//button[text()='Save'])[2]")
    public WebElement SaveButton;

    @FindBy(how = How.XPATH, using = "//h6[text()='test_worksheet']")
    public WebElement test_worksheet;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search']")
    public WebElement Search_box_Filter;

    @FindBy(how = How.XPATH, using = "//div[text()='Select Categories']")
    public WebElement Categories_Filter;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Expand']")
    public WebElement Expand_Categories_Filter;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Close']")
    public WebElement Close_Filter;


    @FindBy(how = How.XPATH, using = "//p[@aria-label='Columns']")
    public WebElement Columns_Option;

    @FindBy(how = How.XPATH, using = "//div[text()='Select Models']")
    public WebElement Models_Filter;

    @FindBy(how = How.XPATH, using = "//p[@aria-label='ER360']")
    public WebElement RootLevel_Filter;


    @FindBy(how = How.XPATH, using = "//button[text()='Submit']")
    public WebElement Submit_Button;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    public WebElement SaveWorksheet_Button;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div")
    public  WebElement Notification_pop_up;

    @FindBy(how = How.XPATH, using = "//button[text()='Filter']")
    public  WebElement AdvanceFilterButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Name']")
    public  WebElement Name_Options;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/div/div/div[4]/div/div/p/div/div/div/div/input")
    public  WebElement Advance_filter_textbox;

    @FindBy(how = How.XPATH, using = "//button[text()='Export']")
    public  WebElement Export_Button;

    @FindBy(how = How.XPATH, using = "//li[text()='Download as CSV']")
    public  WebElement Download_CSV;

    @FindBy(how = How.XPATH, using = "//button[text()='Share']")
    public  WebElement Share_Button;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Select Users']")
    public  WebElement SelectUserTextbox;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div[2]/div[3]/div[1]/button[3]")
    public  WebElement Three_Dots;

    @FindBy(how = How.XPATH, using = "//li[text()='Edit']")
    public  WebElement Edit_Worksheet;

    @FindBy(how = How.XPATH, using = "//li[text()='Delete']")
    public  WebElement Delete_Worksheet;

    @FindBy(how = How.XPATH, using = "//h6[text()='test_worksheet']")
    public  WebElement Random_Worksheet;

    @FindBy(how=How.XPATH, using="//button[text()='Delete']")
    public WebElement confirmDelete;

}

package locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_MetaData_Browser_Page_Locators {
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/metadata-browser']")
    public WebElement Metadata_BrowserPageIcon;

    @FindBy(how=How.XPATH, using="//div[text()='Loaded Catalogs']")
    public WebElement LoadedCatalogs_Metadata;

    @FindBy(how=How.XPATH, using="//li[@tabindex='-1']")
    public WebElement All_Catalogs_Metadata;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public  WebElement YES_load_AllCatalog;

    @FindBy(how=How.XPATH, using="//button[@aria-label='Search']")
    public WebElement SearchModelIcon;

    @FindBy(how=How.XPATH, using="//input[@placeholder='Search catalogs...']")
    public WebElement SearchModelTextBox;

    @FindBy(how=How.XPATH, using="/html/body/div/div[3]/main/div[1]/div/section[2]/aside/div/div/div[1]/div[2]/div/ul/li/ul/li/div/div/div")
    public WebElement FirstModel;

    @FindBy(how=How.XPATH, using="//p[@aria-label='eMovies']")
    public WebElement EmoviesText;


    @FindBy(how=How.XPATH, using="/html/body/div/div[3]/main/div[1]/div/section[2]/aside/div/div/div[1]/div[1]/div[2]/button")
    public WebElement CloseSearchButton;

    @FindBy(how=How.XPATH, using="//p[@aria-label='Tables']")
    public WebElement TablesText;

    @FindBy(how=How.XPATH, using="//p[@aria-label='CUST']")
    public WebElement CUST_Text;

    @FindBy(how=How.XPATH, using="//p[@aria-label='Columns']")
    public WebElement Columns_Text;

    @FindBy(how=How.XPATH, using="//p[@aria-label='CUST_address']")
    public WebElement CUST_address_Text;

    @FindBy(how=How.XPATH, using="//p[@aria-label='ER Diagrams']")
    public WebElement ER_Diagram_Text;

    @FindBy(how=How.XPATH, using="//div[text()='Logical']")
    public WebElement Logical_Text;

    @FindBy(how=How.XPATH, using="//li[@data-value='physical']")
    public WebElement Physical_Text;


    @FindBy(how=How.XPATH, using="//p[@aria-label='Drawing Objects']")
    public WebElement Drawing_Objects_Text;

    @FindBy(how=How.XPATH, using="//input[@role='combobox']")
    public WebElement Search_inER_Diagram_TextBox;

    @FindBy(how=How.XPATH, using="//input[@role='combobox']")
    public WebElement ER_DIAGRAM;
}

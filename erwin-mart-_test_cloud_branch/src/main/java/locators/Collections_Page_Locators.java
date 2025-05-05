package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Collections_Page_Locators
{
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/collections']")
    public  WebElement CollectionsPage;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Collection']")
    public WebElement AddCollectionButton;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
    public WebElement EnterCollection_name;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Description']")
    public WebElement EnterCollectionDescription;

    @FindBy(how = How.XPATH, using = "(//button[text()='Save'])[2]")
    public WebElement SaveButton;

    @FindBy(how = How.XPATH, using = "//h6[text()='test_collection']")
    public WebElement test_collection;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Edit']")
    public WebElement Edit_object;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Add']")
    public WebElement Add_object;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/ul/div[1]/span[1]")
    public WebElement Result_FirstCheckbox;

    @FindBy(how = How.XPATH, using = "//button[text()='Add']")
    public WebElement Add_objectToCollections;



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
    public WebElement SaveCollection_Button;


    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div")
    public  WebElement Notification_pop_up;

    @FindBy(how = How.XPATH, using = "//button[text()='Filter']")
    public  WebElement AdvanceFilterButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Name']")
    public  WebElement Name_Options;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/div/div/div[4]/div/div/p/div/div/div/div/input")
    public  WebElement Advance_filter_textbox;

    @FindBy(how = How.XPATH, using = "//button[text()='Export']")
    public  WebElement Export_Button;

    @FindBy(how = How.XPATH, using = "//li[text()='Download as CSV']")
    public  WebElement Download_CSV;

    @FindBy(how = How.XPATH, using = "//button[text()='Share']")
    public  WebElement Share_Button;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Select Users']")
    public  WebElement SelectUserTextbox;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div[2]/div[3]/div[1]/div/button[3]")
    public  WebElement Three_Dots;

    @FindBy(how = How.XPATH, using = "//li[text()='Edit']")
    public  WebElement Edit_Collection;

    @FindBy(how = How.XPATH, using = "//li[text()='Delete']")
    public  WebElement Delete_Collection;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/ul[1]/div/div/h6")
    public  WebElement Random_Collection;

    @FindBy(how=How.XPATH, using="//button[text()='Delete']")
    public WebElement confirmDelete;

    @FindBy(how=How.XPATH, using="//button[text()='Submit']")
    public WebElement SubmitButtonNew;


    @FindBy(how=How.XPATH, using="/html/body/div/div[3]/main/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/span\n")
    public WebElement Select_All_Object;

    @FindBy(how=How.XPATH, using="//button[@aria-label='Delete']")
    public WebElement DeleteObjectButton;


    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/metadata-browser']")
    public  WebElement MetaDataBrowserPage;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/main/div[1]/div/section[2]/aside/div/div/div[1]/div[2]/div/ul/li/ul/li[1]/div/div/div/p")
    public  WebElement ModelClick_Meta;

    @FindBy(how = How.XPATH, using = "//input[@id='collections-list']")
    public  WebElement CollectionsTextBox;

    @FindBy(how = How.XPATH, using = "//button[text()='Add']")
    public WebElement Add_NewCollection;

    @FindBy(how = How.XPATH, using = "//p[@aria-label='Tables']")
    public WebElement Tables;

    @FindBy(how = How.XPATH, using = "//p[@aria-label='Relationships']")
    public WebElement Relationships;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/section[2]/section/main/div/div/div[2]/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td/span")
    public WebElement FirstObject;

    @FindBy(how = How.XPATH, using = "//h6[text()='test_collection_Metadata']")
    public WebElement test_collection_Metadata;


    @FindBy(how = How.XPATH, using = "//h6[text()='Edited_Collection']")
    public WebElement Edited_Collection;

}

package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_Catalog_Page_Locators
{
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/catalogs']")
    public  WebElement CatalogPage;


    @FindBy(how = How.XPATH, using = "//button[@aria-label='Create Library']")
    public  WebElement CreateLibrary;

    @FindBy(how = How.XPATH, using = "//div[@aria-haspopup='listbox']")
    public  WebElement CatalogDropdown;

    @FindBy(how=How.LINK_TEXT, using = "")
    public  WebElement forgot_password;


    @FindBy(how = How.XPATH, using = "//li[@tabindex='-1']")
    public  WebElement AllCatalogs;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public  WebElement YES;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/section[2]/aside/div/div/div[1]/div[2]/div/div[2]/span/button")
    public  WebElement Delete;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Expand All']")
    public  WebElement ExpandAll;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Collapse All']")
    public  WebElement CollapseAll;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/section[2]/section/main/div/div[2]/div[1]/div/input")
    public  WebElement LibraryName;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Description (maximum of 4000 characters)']")
    public  WebElement LibraryDescription;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Save Catalog']")
    public  WebElement Save_Catalog;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Search']")
    public  WebElement Search_Icon;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search catalogs...']")
    public  WebElement Search_Catalogs;
    @FindBy(how = How.XPATH, using = "//span[@title='New Library']")
    public  WebElement DraggableLibrary;
    @FindBy(how = How.XPATH, using = "//span[@title='New Model']")
    public  WebElement DraggableModel;
    @FindBy(how = How.XPATH, using = "//span[@title='New Library (1)']")
    public  WebElement DroppableLibrary;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[3]/main/div[1]/div/section[2]/aside/div/div/div[1]/div[3]/div/ul/li[2]/div/div")
    public  WebElement ER360rootnode;
    @FindBy(how = How.XPATH, using = "//span[@title='New Library']")
    public  WebElement libraryclick;

/*    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/section[2]/aside/div/div/div[1]/div[3]/div/ul/li[2]/ul/li[6]/div/div/p")
    public  WebElement libraryclick2;*/

    @FindBy(how = How.XPATH, using = "//span[@title='New Model']")
    public  WebElement ModelClick;
    @FindBy(how = How.XPATH, using = "//input[@role='combobox']")
    public  WebElement CatalogStatusClick;
    @FindBy(how = How.XPATH, using = "(//*[@id='Layer_1'])[2]")
    public  WebElement SDILabel;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div")
    public  WebElement Notification_pop_up;







}

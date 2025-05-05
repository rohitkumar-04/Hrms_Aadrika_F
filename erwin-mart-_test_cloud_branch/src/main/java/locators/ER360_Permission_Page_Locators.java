package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_Permission_Page_Locators
{
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/permissions']")
    public  WebElement PermissionPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[3]/main/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/h6")
    public  WebElement AdminProfile;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[3]/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[3]/div/div/div/div[1]/span[3]/span[2]/div/div/p")
    public  WebElement ER360root;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/input")
    public  WebElement Admintext;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/div/div/div/div/input")
    public  WebElement Viewertextfield;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[3]/main/div[1]/div/div[1]/div[1]/div[2]/div/button[1]")
    public  WebElement ReviewChanges;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[1]/div[1]/div[2]/div/button[2]")
    public  WebElement SavePermissions;


    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div")
    public  WebElement Notification_pop_up;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Search Catalogs']")
    public  WebElement SearchIcon;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='More']")
    public  WebElement ThreeDots;
    @FindBy(how = How.XPATH, using = "//*[@role='menuitem'][2]")
    public  WebElement GetAllCatalogs;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public  WebElement YES;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search across all models in ER360']")
    public  WebElement Search_Catalogs;


    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[3]/main/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/button")
    public  WebElement Dropdown;

    @FindBy(how = How.XPATH, using = "//span[@title='New Library']")
    public  WebElement LibraryClick;
    @FindBy(how = How.XPATH, using = "//span[@title='New Model']")
    public  WebElement ModelClick;

    /* @FindBy(how = How.XPATH, using = "//input[@placeholder='Search within models loaded from ER360']")
     public  WebElement Search_Catalogs2;
 */
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/button")
    public  WebElement ExpandALL;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search catalogs...']")
    public  WebElement Search_CatalogsinReviewChanges;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Delete']")
    public  WebElement DeleteinReviewChanges;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public  WebElement SavePermissioninReviewChanges;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[3]/main/div[1]/div/div[2]/div[1]/div[2]/div/button[2]")
    public  WebElement UserPermissionReport;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Select User']")
    public  WebElement SelectUserinReports;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Download Excel']")
    public  WebElement DownloadExcel;

    @FindBy(how = How.XPATH, using = "//a[@href='/MartPortal/home']")
    public  WebElement MartPortal;

}

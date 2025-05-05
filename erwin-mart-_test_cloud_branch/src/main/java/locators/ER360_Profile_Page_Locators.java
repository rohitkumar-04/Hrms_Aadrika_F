package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_Profile_Page_Locators
{
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/profiles']")
    public  WebElement ProfilePage;

    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/profiles/create']")
    public  WebElement AddProfile;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div/input")
    public  WebElement ProfileName;

    @FindBy(how = How.XPATH, using = " /html/body/div/div[3]/main/div[1]/div/div[2]/div[1]/div[3]/div/div[2]/div/textarea[1]")
    public  WebElement ProfileDescription;


    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[1]/div[1]/div[2]/button")
    public  WebElement SaveProfile;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[3]/button[2]")
    public  WebElement Threedots;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/li[3]")
    public  WebElement DeleteProfile;

    @FindBy(how = How.XPATH, using = "//button[@aria-label=\"Delete Profile\"]")
    public  WebElement DeleteProfile2;


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public  WebElement ConfirmDelete;

    @FindBy(how = How.XPATH, using = "//span[@aria-label=\"Test Profile\"]")
    public  WebElement Test_Profile;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/li[2]")
    public  WebElement EditProfile;
    @FindBy(how = How.XPATH, using = "//button[@aria-label=\"Edit Profile\"]")
    public  WebElement EditProfile2;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]")
    public  WebElement DropdownForCatalog;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/input")
    public  WebElement CatalogTextField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div")
    public  WebElement Notification_pop_up;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div[1]/button")
    public  WebElement SaveProfile2;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/button")
    public  WebElement ExpandAll;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[1]/div[3]/div/div[3]/div/div/div/button")
    public  WebElement DropdownforClone;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/li[1]")
    public  WebElement Permissionoption;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Expand All']")
    public  WebElement ExpandALLonPermission;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[1]")
    public  WebElement OpenVerification;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[1]/div[2]/div/button[2]")
    public  WebElement PermissionReportTAB;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Download Excel']")
    public  WebElement DownloadExcel;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div/span")
    public  WebElement PermissionCheckCatalog;


}

package locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_UserManagement_Page_Locators {
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/users']")
    public WebElement UserManagementPage;

    @FindBy(how = How.XPATH, using = "//button[text()='Server User']")
    public WebElement AddServerUserButton;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
    public WebElement UsernameTextboxER;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Display Name(Optional)']")
    public WebElement DisplayName_TextBoxER;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email Address']")
    public WebElement EmailAddress_TextBoxER;


    @FindBy(how = How.XPATH, using = "//input[@placeholder='Confirm Email Address']")
    public WebElement Confirm_EmailAddressTextboxER;


    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    public WebElement Password_TextboxER;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    public WebElement Save_ButtonER;

    @FindBy(how = How.XPATH, using = "//button[text()='Save User']")
    public WebElement Save_UserButtonER;

    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;

    @FindBy(how = How.XPATH, using = "(//input[@type='text'])[2]")
    public WebElement SearchUser_Textbox_ER;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[3]/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/button")
    public WebElement ThreeDots_ER;


    @FindBy(how = How.XPATH, using = "//li[text()='Edit']")
    public WebElement Edit_User_ER;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/input")
    public WebElement Edit_DisplayName_Textbox_ER;


    @FindBy(how = How.XPATH, using = "//li[text()='Reset']")
    public WebElement Reset_Password_ER;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    public WebElement NewPassword_textbox_ER;

    @FindBy(how = How.XPATH, using = "//button[text()='Reset']")
    public WebElement Reset_Button_ER;


    @FindBy(how = How.XPATH, using = "//li[text()='Delete']")
    public WebElement Delete_User_ER;

    @FindBy(how = How.XPATH, using = "//button[text()='Delete']")
    public WebElement Delete_confirmButton_ER;


}

package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserManagement_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/users']")
    public WebElement UserManagementPage;

    @FindBy(how = How.XPATH, using = "//button[text()='Add User']")
    public WebElement AddUserButton;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Username']")
    public WebElement UsernameTextbox;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter DisplayName']")
    public WebElement DisplayName_TextBox;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter EmailAddress']")
    public WebElement EmailAddress_TextBox;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Confirm email Address']")
    public WebElement Confirm_EmailAddressTextbox;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Password']")
    public WebElement Password_Textbox;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    public WebElement Checkbox_changePassword;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    public WebElement Save_Button;

    @FindBy(how = How.XPATH, using = "//input[@type='text']")
    public WebElement SearchUser_Textbox;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div[2]/div[4]/div[1]/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]/td[6]/button")
    public WebElement ThreeDots;



    @FindBy(how = How.XPATH, using = "//p[text()='Edit']")
    public WebElement Edit_User;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/main/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div/input")
    public WebElement Edit_DisplayName_Textbox;

    @FindBy(how = How.XPATH, using = "//button[text()='Back']")
    public WebElement Back_Button;



    @FindBy(how = How.XPATH, using = "//p[text()='Reset']")
    public WebElement Reset_Password;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    public WebElement NewPassword_textbox;

    @FindBy(how = How.XPATH, using = "//button[text()='Reset']")
    public WebElement Reset_Button;




    @FindBy(how = How.XPATH, using = "//p[text()='Delete']")
    public WebElement Delete_User;

    @FindBy(how = How.XPATH, using = "//button[text()='Delete']")
    public WebElement Delete_confirmButton;




    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;








}

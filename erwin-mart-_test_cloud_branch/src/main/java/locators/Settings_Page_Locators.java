package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Settings_Page_Locators
{
    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/settings']")
    public WebElement Settings_Page;


    @FindBy(how = How.XPATH, using = "//span[text()='Use SMTP Settings']")
    public WebElement SmtpCheckbox2;


    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter SMTP host']")
    public WebElement EnterSmtpHostname;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Port Number']")
    public WebElement EnterPortNumber;


    @FindBy(how = How.XPATH, using = "//span[text()='Authenticate']")
    public WebElement AuthenticateCheckbox2;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Username']")
    public WebElement SmtpUsername;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Password']")
    public WebElement SmtpPass;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter administrator email']")
    public WebElement AdminEmail;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter no-reply email']")
    public WebElement NoReplyEmail;

    @FindBy(how = How.XPATH,using = "//button[text()='Save']")
    public WebElement SaveButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Reset']")
    public WebElement ResetButton;

    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;
















































}

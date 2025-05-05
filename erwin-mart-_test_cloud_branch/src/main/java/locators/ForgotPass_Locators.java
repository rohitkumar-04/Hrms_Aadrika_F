package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPass_Locators
{
    @FindBy(how = How.XPATH,using = "(//button)[4]")
    public WebElement ProfilePicIcon;

    @FindBy(how = How.XPATH, using = "//li[text()='Logout']")
    public WebElement Logout;

    @FindBy(how = How.XPATH, using = "//a[@href='/MartPortal/auth/forgot-password']")
    public WebElement ForgotPassword;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
    public WebElement EnterUsername;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email Address']")
    public WebElement EnterEmailAddress;

    @FindBy(how = How.XPATH, using = "//button[text()='Send Request']")
    public WebElement SubmitButtonForForgotPassword;



    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;
















































}

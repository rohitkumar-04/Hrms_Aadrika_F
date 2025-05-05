package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_Devices_Page_Locators
{
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/user-devices']")
    public WebElement devicesIcon;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search username...']")
    public WebElement searchField;

    @FindBy(how = How.XPATH, using = "(//input)[3]")
    public WebElement checkBox;


    @FindBy(how = How.XPATH, using = "//button[@aria-label='Logout Devices']")
    public WebElement logOutButton;

    @FindBy(how = How.XPATH, using = "//div[2]/div/div/div/div/table/thead/tr/th[4]/span")
    public WebElement lastLogin;

    @FindBy(how = How.XPATH, using = "//button[text()='Logout']")
    public WebElement ConfirmLogout;

}

package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_Views_Page_Locators
{
    @FindBy(how=How.XPATH, using="//a[@aria-label='Views']")
    public WebElement viewPageIcon;

    @FindBy(how=How.XPATH, using="//div/div[1]/div[1]/div[2]/button")
    public WebElement addView;

    @FindBy(how=How.XPATH, using="//input[@name='view-name']")
    public WebElement name;

    @FindBy(how=How.XPATH, using="//textarea[@name='view-description']")
    public WebElement description;

    @FindBy(how=How.XPATH, using="//input[@name='share-view']")
    public WebElement shareViewCheckBox;

    @FindBy(how=How.XPATH, using="//section/main/div/div[2]/div/div[2]/div/div/div/div[1]")
    public WebElement options;

    @FindBy(how=How.XPATH, using="//input[@role='combobox']")
    public WebElement comboBox;

    @FindBy(how=How.XPATH, using="//input[@name='Aggregates']")
    public WebElement aggregateCheckbox;

    @FindBy(how=How.XPATH, using="//section[1]/div/div[2]/div[1]/div[2]/button")
    public WebElement saveViewButton;

    @FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/div/div[2]")
    public WebElement viewCreatedSuccessfulMessage;

    @FindBy(how=How.XPATH, using="//button[@aria-label='Download CSV']")
    public WebElement downloadCSV;

    @FindBy(how=How.XPATH, using="//button[@aria-label='Download Excel']")
    public WebElement downloadExcel;

    @FindBy(how=How.XPATH, using="//input[@placeholder='Search for View Name']")
    public WebElement searchView;

    @FindBy(how=How.XPATH, using="//table/tbody/tr[1]/td[1]/span/input")
    public WebElement checkBoxDelete;

    @FindBy(how=How.XPATH, using="//button[@aria-label='Delete']")
    public WebElement deleteButton;

    @FindBy(how=How.XPATH, using="/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public WebElement confirmDelete;

    @FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/div/div[2]")
    public WebElement viewDeleteMessageSuccessful;

    @FindBy(how = How.XPATH,using = "//div[@class='MuiAlert-message css-2shwac']")
    public WebElement Notification_PopUp;

}

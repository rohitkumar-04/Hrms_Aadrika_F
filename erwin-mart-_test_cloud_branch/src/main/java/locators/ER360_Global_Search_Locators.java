package locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_Global_Search_Locators {
    @FindBy(how = How.XPATH, using = "//input[@aria-label='search']")
    public WebElement Global_Search_TextBox;

    @FindBy(how = How.XPATH, using = "//span[text()='CUST_address']")
    public WebElement keyword_Result;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Advanced Filters']")
    public WebElement Advanced_FilterButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div[1]/div[2]")
    public WebElement SelectModels;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div[1]/div[1]")
    public WebElement SelectCategories;

    @FindBy(how = How.XPATH, using = "//button[text()='Submit']")
    public WebElement SubmitButton;


    @FindBy(how = How.XPATH, using = "//span[text()='Columns']")
    public WebElement Column_text;

    @FindBy(how = How.XPATH, using = "//p[text()='Categories']")
    public WebElement Categories_text;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div/div/div[3]/div/div/div/div/span[3]/span")
    public WebElement Model_RootNode;

    @FindBy(how = How.XPATH, using = "//p[text()='Models']")
    public WebElement Models_text;

    @FindBy(how = How.XPATH, using = "//h6[text()='ER360']")
    public WebElement ER360_text;



}

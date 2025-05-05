package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Restreports_Page_Locators {

    @FindBy(how = How.XPATH,using = "//button[@aria-label='Apps']")
    public WebElement Apps;

    @FindBy(how = How.XPATH,using = "//a[@href='/MartPortal/main/access-token']")
    public WebElement accessToken;

    @FindBy(how = How.XPATH,using = "//button[text()]")
    public WebElement refreshToken;

    //button[text()]
    //button[contains(.,'Generate Token')]




    @FindBy(how = How.XPATH,using = "//button[contains(@aria-label,'Copy to clipboard')]")
    public WebElement copyToClipboard;

    @FindBy(how = How.XPATH,using = "//li[contains(.,'REST Reports')]")
    public WebElement restReports;

    @FindBy(how = How.XPATH,using = "(//button)[1]")
    public WebElement authorize;

    @FindBy(how = How.XPATH,using = "//input[contains(@type,'text')]")
    public WebElement value;

    @FindBy(how = How.XPATH,using = "//button[@type='submit'][contains(.,'Authorize')]")
    public WebElement submitAuthorize;

    @FindBy(how = How.XPATH,using = "//button[contains(.,'Close')]")
    public WebElement close;

    @FindBy(how = How.XPATH,using = "//button[contains(.,'GET/MartServer/api/report/generateReport/{reportName}runreport')]")
    public WebElement getreports;

    @FindBy(how = How.XPATH,using = "//button[@class='btn try-out__btn'][contains(.,'Try it out')]")
    public WebElement tryItOut;

    @FindBy(how = How.XPATH,using = "//input[contains(@type,'text')]")
    public WebElement reportName;
    @FindBy(how = How.XPATH,using = "//button[@class='btn execute opblock-control__btn'][contains(.,'Execute')]")
    public WebElement execute;

    @FindBy(how = How.XPATH,using = "//textarea[contains(@placeholder,'Token')]")
    public WebElement token;

    @FindBy(how = How.XPATH,using = "//tr[@class='responses-header'][contains(.,'CodeDescriptionLinks')]")
    public WebElement responseCode;




}

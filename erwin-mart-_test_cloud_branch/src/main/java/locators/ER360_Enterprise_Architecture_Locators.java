package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ER360_Enterprise_Architecture_Locators
{
    @FindBy(how = How.XPATH, using = "//a[@href='/ER360/main/enterprise-architecture']")
    public  WebElement EApage;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Edit']")
    public  WebElement Edit;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Add']")
    public  WebElement Add;

    @FindBy(how = How.XPATH, using = " //button[@aria-label='Delete']")
    public  WebElement Delete;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Annotate']")
    public  WebElement Annotate;

    @FindBy(how = How.XPATH, using = " //button[@aria-label='Clear Diagram']")
    public  WebElement ClearDiagram;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/button[2]")
    public  WebElement OkClearDiagram;

    @FindBy(how = How.XPATH, using = " //button[@aria-label='Save']")
    public  WebElement Save;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Bullseye']")
    public  WebElement Bullseye;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div/div[1]/div/div/input")
    public  WebElement ModelDropdown;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div/div[2]/button[2]")
    public  WebElement Submit;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Undo']")
    public  WebElement Undo;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Redo']")
    public  WebElement Redo;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div/div[1]/div/div/input")
    public  WebElement NEW;





}

package actions;

import locators.Restreports_Page_Locators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class Restreports_Page_Actions {

    WebDriver driver;
    WebDriverWait wait;

    SoftAssert softAssert = new SoftAssert();

    public Restreports_Page_Locators RestreportPageLocators;

    static String tokenValue;




    public Restreports_Page_Actions(WebDriver driver) {
        this.driver = driver;
        RestreportPageLocators = new Restreports_Page_Locators();
        PageFactory.initElements(driver, RestreportPageLocators);



    }



    public void ClickOnAccessToken() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.Apps)).click();
        wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.accessToken)).click();
    }

    public void generateAccessToken() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.refreshToken)).click();


        Thread.sleep(5000);

        tokenValue = RestreportPageLocators.token.getText();
        System.out.println(tokenValue);


    }


    public void ClickONRestRePorts() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.Apps)).click();
        wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.restReports)).click();
    }



    public void GenerateReport( ) throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));


        String parentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.authorize)).click();
                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.value)).click();

                System.out.println(tokenValue);

                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.value)).sendKeys(tokenValue);
                wait = new WebDriverWait(driver, Duration.ofSeconds(40));

                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.submitAuthorize)).click();
                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.close)).click();
                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.getreports)).click();
                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.tryItOut)).click();
                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.reportName)).sendKeys("Users");

                System.out.println();

                Thread.sleep(1000);
                wait.until(ExpectedConditions.elementToBeClickable(RestreportPageLocators.execute)).click();



                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",RestreportPageLocators.responseCode );


            }
        }




    }


}

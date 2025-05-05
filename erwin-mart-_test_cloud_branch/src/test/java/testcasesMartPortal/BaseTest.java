package testcasesMartPortal;

import Utilities.Constants;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    public static ExtentSparkReporter extentSparkReporter;
    public static ExtentReports extentReports;
    public static ExtentTest  logger;
    public static WebDriver driver;
    WebDriverWait wait;
    public static String ReportDateAndTime;
    public static int TestPassed = 0;

    public static int TestFailed = 0;

    public static int TestSkipped = 0;

    @BeforeSuite
    public void ReportSetup()
    {

        String dateTime =  new SimpleDateFormat("dd-MM-yyyy-hh-mm").format(new Date());
        ReportDateAndTime = dateTime;
        extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+File.separator+"Mart_Reports"+File.separator+"MartAutomationReports"+dateTime +".html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("Browser", Constants.browser);
        extentReports.setSystemInfo("Mart Build ", Constants.mart_bulid);
        extentReports.setSystemInfo("Db", Constants.DB);


        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setDocumentTitle("Mart Portal Automation Report");
        extentSparkReporter.config().setReportName("Automation Test Result for Mart Portal");
        extentSparkReporter.config().setTimeStampFormat("EEEE,MMMM dd, yyyy,hh:mm a'('zzz')' ");


    }
    @BeforeMethod
    public void BrowserSetup(Method testMethod) throws InterruptedException {
        logger = extentReports.createTest(testMethod.getName());

//Defining headless mode for Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
//Passing headless argument to the driver
        try {
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.get(Constants.URL);
            logger.log(Status.INFO, "Verifying Mart url ");
        }
        catch (Exception e)
        {
            System.out.println(" Error in loading the Cloud URL ");
            logger.log(Status.INFO,"Error in loading the Cloud URL ");
        }

        if(driver.getCurrentUrl().contains("MartPortal"))
        {
            System.out.println("Mart Portal page is successfully loaded");
            logger.log(Status.INFO,"Mart portal page is successfully loaded");
        }
        else {
            System.out.println("Incorrect URL for Mart Portal");
            String webElement = driver.getCurrentUrl();
            logger.log(Status.INFO,"Incorrect URL for Mart Portal");
            logger.log(Status.INFO,"Expected : MartPortal in the url but found");
            logger.log(Status.INFO,"Actual   : " + webElement);

        }
        /*driver.findElement(By.xpath("//button[@id='details-button']")).click();
        driver.findElement(By.xpath("//a[@id='proceed-link']")).click();*/
        try {
            logger.log(Status.INFO, "Entering Mart Portal Username and Password");
            wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username or Email Address']"))).clear();
            //driver.findElement(By.xpath("//input[@placeholder='Username or Email Address']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Username or Email Address']")).sendKeys(Constants.USERNAME);
            ;
            driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Constants.PASSWORD);
            logger.log(Status.INFO, "Clicking on Login Button");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            logger.log(Status.INFO, "Clicking on OK after hitting the submit button");
        }
        catch (Exception e)
        {
            System.out.println(" Error in entering the username and password  ");
            logger.log(Status.INFO," Error in entering the username and password ");
        }
        try {
            wait =  new WebDriverWait(driver,Duration.ofSeconds(40));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Ok']"))).click();
            Thread.sleep(4000);
        } catch (Exception e)
        {
            System.out.println(" OK Pop up msg not found ");
            logger.log(Status.INFO,"OK Pop up msg not found");
        }
        /*driver.findElement(By.xpath("(//button)[16]")).click();*/
        logger.log(Status.INFO,"Verifying the url after successful login");
        if (driver.getCurrentUrl().contains("dashboard"))
        {
            System.out.println("Successfully Logged into Mart Portal");
            logger.log(Status.INFO,"Successfully Logged into Mart Portal");
        }
        else
        {
            System.out.println("Error in Login for Mart Portal");
            logger.log(Status.INFO,"Error in Mart Portal Login");

        }

    }
    public static String ProjectfileScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/FailedTestScreenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;

    }

    /*This Below method is created to put the screenshot in the report*/
    public static String ExtentReportScreenshot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        String error = takesScreenshot.getScreenshotAs(OutputType.BASE64);
        System.out.println("ScreenShot saved successfully ");
        return error;
    }

    public static void Counter1(){
        TestPassed++;
    }
    public static void Counter2()
    {
        TestFailed++;
    }
    public static void Counter3()
    {
        TestSkipped++;
    }

    @AfterMethod
    public void TestResult_BrowserClose(ITestResult result) throws IOException, InterruptedException {

        if (result.getStatus() == ITestResult.FAILURE) {

            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAILED", ExtentColor.RED));
            logger.fail(result.getThrowable());
            BaseTest.ProjectfileScreenshot(driver, result.getName());

            String error = ExtentReportScreenshot();
            logger.addScreenCaptureFromBase64String(error, "Please click above for ERROR IMAGE");
            Counter2();

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASSED", ExtentColor.GREEN));
            Counter1();

        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIPPED", ExtentColor.YELLOW));
            logger.skip(result.getThrowable());
            Counter3();
        }
       /* try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//button)[5]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[text()='Logout']")).click();*/
            Thread.sleep(3000);
            driver.quit();
            Thread.sleep(5000);
        }



    @AfterSuite
    public void ReportClose(){
        extentReports.flush();
    }



}

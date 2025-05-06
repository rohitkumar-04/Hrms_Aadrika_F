package base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseTest;
import utils.Constants;

public class BaseTest {

	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentReports extentReports;
	public static ExtentTest logger;
	public static WebDriver driver;
	WebDriverWait wait;
	public static String ReportDateAndTime;
	public static int TestPassed = 0;

	public static int TestFailed = 0;

	public static int TestSkipped = 0;

	@BeforeSuite
	public void ReportSetup() {

		String dateTime = new SimpleDateFormat("dd-MM-yyyy-hh-mm").format(new Date());
		ReportDateAndTime = dateTime;
		extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "Hrms_Reports"
				+ File.separator + "HrmsAutomationReports" + dateTime + ".html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Browser", Constants.browser);

		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setDocumentTitle("Hrms Automation Report");
		extentSparkReporter.config().setReportName("Automation Test Result for Hrms Portal");
		extentSparkReporter.config().setTimeStampFormat("EEEE,MMMM dd, yyyy,hh:mm a'('zzz')' ");

	}

	@BeforeMethod
	// @SuppressWarnings("deprecation")
	public void BrowserSetup(Method testMethod) throws InterruptedException {
		logger = extentReports.createTest(testMethod.getName());

		
		ChromeOptions options = new ChromeOptions();
		// Defining headless mode for Chrome
		options.addArguments("--headless=new");
		
		// No headless argument
	/*	options.addArguments("--start-maximized"); // Starts the browser maximized also use (--incognito)
		options.addArguments("--disable-notifications"); // Optional: disables popups*/
		
		// Passing headless argument to the driver
		try {
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get(Constants.URL);
			logger.log(Status.INFO, "Verifying Hrms url ");
		} catch (Exception e) {
			System.out.println(" Error in loading the Hrms Cloud URL ");
			logger.log(Status.INFO, "Error in loading the  Hrms Cloud URL ");
		}

		if (driver.getCurrentUrl().contains("hrms")) {
			System.out.println("Hrms Portal page is successfully loaded");
			logger.log(Status.INFO, "Hrms portal page is successfully loaded");
		} else {
			System.out.println("Incorrect URL for Hrms Portal");
			String webElement = driver.getCurrentUrl();
			logger.log(Status.INFO, "Incorrect URL for Hrms Portal");
			logger.log(Status.INFO, "Expected : hrms in the url but found");
			logger.log(Status.INFO, "Actual   : " + webElement);

		}

		try {
			System.out.println("Entering Hrms Portal Username and Password");
			logger.log(Status.INFO, "Entering Hrms Portal Username and Password");
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("id_user_id"))).clear();
			driver.findElement(By.id("id_user_id")).sendKeys(Constants.USERNAME1);
			;
			driver.findElement(By.id("id_password")).clear();
			driver.findElement(By.id("id_password")).sendKeys(Constants.PASSWORD);

			logger.log(Status.INFO, "Clicking on Login Button");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			logger.log(Status.INFO, "Clicking on OK after hitting the submit button");

		} catch (Exception e) {
			System.out.println(" Error in entering the username and password ");
			logger.log(Status.INFO, " Error in entering the username and password ");
		}

		Thread.sleep(2000);
		logger.log(Status.INFO, "Verifying the url after successful login");
		if (driver.getCurrentUrl().contains("hrms/ems/dashboard")) {
			System.out.println("Successfully Logged into Hrms Portal");
			logger.log(Status.INFO, "Successfully Logged into Hrms Portal");
		} else {
			System.out.println("Error in Login for Hrms Portal");
			logger.log(Status.INFO, "Error in Hrms Portal Login");

		}

	}

	public static String ProjectfileScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedTestScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;

	}

	/* This Below method is created to put the screenshot in the report */
	public static String ExtentReportScreenshot() {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String error = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("ScreenShot saved successfully ");
		return error;
	}

	public static void Counter1() {
		TestPassed++;
	}

	public static void Counter2() {
		TestFailed++;
	}

	public static void Counter3() {
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

		Thread.sleep(3000);
		driver.quit();
		Thread.sleep(5000);
	}

	@AfterSuite
	public void ReportClose() {
		extentReports.flush();
	}

}

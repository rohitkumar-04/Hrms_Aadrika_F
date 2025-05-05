package testcasesMartPortal;

import actions.Restreports_Page_Actions;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Restreports_page_Test extends BaseTest {

    Restreports_Page_Actions restreportsPageActions;

    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)

    public void GenerateSwaggerReport() throws InterruptedException {
        restreportsPageActions = new Restreports_Page_Actions(BaseTest.driver);
        logger.log(Status.INFO, "User opens Access-token Page");
        restreportsPageActions.ClickOnAccessToken();
        logger.log(Status.INFO, "user generate Access-token");
        restreportsPageActions.generateAccessToken();
        logger.log(Status.INFO, "Capturing Screenshot");
        String error = ExtentReportScreenshot();
        logger.addScreenCaptureFromBase64String(error, "please click above for image");

        logger.log(Status.INFO, "User opens RestReports Page");
        restreportsPageActions.ClickONRestRePorts();
        logger.log(Status.INFO, "User generate Swagger Report");
        restreportsPageActions.GenerateReport();


        try {
            if (driver.findElement(By.xpath("//p[contains(.,'Error: ')]")).isDisplayed() ){


                System.out.println("Error in Generating the Swagger Report");
                softAssert.assertFalse(true);
                logger.log(Status.INFO,"Error in Generating the Swagger Report");

            }


        }
        catch (Exception e){
            System.out.println("successfully generated the report");
            softAssert.assertTrue(true);
            logger.log(Status.INFO,"successfully generated the report");
            String error2 = ExtentReportScreenshot();
            logger.addScreenCaptureFromBase64String(error2, "please click above for Rest Report image");
        }
        softAssert.assertAll();


    }


}

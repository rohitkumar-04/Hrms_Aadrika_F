package testcasesMartPortal;

import Utilities.Constants;
import actions.ER360_DevicesPageActions;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import java.util.concurrent.TimeoutException;


public class ER360_DevicesTest extends BaseTest
{
    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }

    @Test(priority = 1)
    public void performLogout() throws InterruptedException {
        LoginCheck();
        ER360_DevicesPageActions er36DevicesPageActions = new ER360_DevicesPageActions(driver);
        logger.assignAuthor("sameer");
        logger.assignCategory("Devices Page");
        logger.assignCategory("ER360");
        er36DevicesPageActions.clickOnDevices();

        logger.log(Status.INFO, "Clicking On Devices Page ");

            er36DevicesPageActions.er360DevicesPageLocators.searchField.sendKeys(Constants.USERNAME);

        logger.log(Status.INFO, "Entering the text in search field");
        er36DevicesPageActions.checkBox();
        logger.log(Status.INFO, "Selecting the checkbox");
        er36DevicesPageActions.logOut();
        logger.log(Status.INFO, "Being logout from the current session");
    }




}

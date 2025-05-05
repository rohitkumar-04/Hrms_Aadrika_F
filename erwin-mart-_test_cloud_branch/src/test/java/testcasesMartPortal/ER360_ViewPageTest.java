package testcasesMartPortal;

import Utilities.Constants;
import actions.ER360_DevicesPageActions;
import actions.ER360_ViewPageActions;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;


public class ER360_ViewPageTest extends BaseTest
{
    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }
    ER360_ViewPageActions er360ViewPageActions;

    @Test(priority=1)
    public void AddViews_and_DeleteViews() throws InterruptedException {
        LoginCheck();
        er360ViewPageActions = new ER360_ViewPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Worksheet Page");
        logger.assignCategory("ER360");
        er360ViewPageActions.viewPageClick();
        logger.log(Status.INFO,"Clicked on the View Page icon");
        er360ViewPageActions.addView();
        logger.log(Status.INFO,"Adding a view with name test");
        er360ViewPageActions.deleteView();
        logger.log(Status.INFO,"Deleting the view with name test");
    }




}

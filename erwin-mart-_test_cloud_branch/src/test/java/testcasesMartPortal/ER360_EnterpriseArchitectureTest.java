package testcasesMartPortal;

import Utilities.ExcelReader;
import actions.ER_360_CatalogPageActions;
import actions.ER_360_EnterpriseArchitectureActions;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ER360_EnterpriseArchitectureTest extends BaseTest {

    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }

    ER_360_EnterpriseArchitectureActions er360EnterpriseArchitectureActions;
    @Test(priority = 1)
    public void Verify_EnterpriseArchitecturePage() throws InterruptedException {
        LoginCheck();
        er360EnterpriseArchitectureActions = new ER_360_EnterpriseArchitectureActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Enterprise Architecture Page");
        logger.assignCategory("ER360");
        er360EnterpriseArchitectureActions.ClickonEAPage();
        logger.log(Status.INFO,"User Clicks on EA Page ");
        er360EnterpriseArchitectureActions.ClickonEdit();
        logger.log(Status.INFO,"User Clicks on Edit ");
        er360EnterpriseArchitectureActions.ClickonAdd();
        Thread.sleep(4000);
        logger.log(Status.INFO,"User Clicks on Add Model");
        er360EnterpriseArchitectureActions.ClickonModelDropdown();
        Thread.sleep(4000);
        logger.log(Status.INFO,"User Clicks on Model Dropdown ");
        er360EnterpriseArchitectureActions.ClickonSubmit();
        logger.log(Status.INFO,"User Clicks on Submit");
        er360EnterpriseArchitectureActions.ClickonClearDiagram();
        logger.log(Status.INFO,"User Clicks on Clear Entire Diagram ");
        er360EnterpriseArchitectureActions.ClickonAdd();
        logger.log(Status.INFO,"User Clicks on Add Model again  ");
        er360EnterpriseArchitectureActions.ClickonModelDropdown();
        logger.log(Status.INFO,"User Clicks on Model Dropdown ");
        er360EnterpriseArchitectureActions.ClickonSubmit();
        logger.log(Status.INFO,"User Clicks on Submit ");
        er360EnterpriseArchitectureActions.ClickonBullseye();
        logger.log(Status.INFO,"User Clicks on Bullseye icon ");
        er360EnterpriseArchitectureActions.ClickonAnnotate();
        logger.log(Status.INFO,"User Adds Annotation1");
        er360EnterpriseArchitectureActions.ClickonAnnotate();
        logger.log(Status.INFO,"User Adds Annotation2");
        er360EnterpriseArchitectureActions.ClickonDelete();
        logger.log(Status.INFO,"User Deletes Annotation2");
        er360EnterpriseArchitectureActions.ClickonUndo();
        logger.log(Status.INFO,"User Clicks on UNDO");
        er360EnterpriseArchitectureActions.ClickonRedo();
        logger.log(Status.INFO,"User Clicks on REDO");
        er360EnterpriseArchitectureActions.ClickonSave();
        logger.log(Status.INFO,"User Saves the Diagram ");
        logger.log(Status.INFO,"The attach image should have one Annotation and one Model ");
        logger.log(Status.INFO,"EA page works fine");

    }





}

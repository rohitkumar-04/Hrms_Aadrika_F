package testcasesMartPortal;

import Utilities.ExcelReader;
import actions.ER360_SettingsPageActions;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;


public class ER360_SettingsPageTest extends BaseTest
{
    public void LoginCheck() throws InterruptedException
    {
        Login_ER360 call =  new Login_ER360();
        call.loginER();

    }
    ER360_SettingsPageActions er360SettingsPageActions;


    @Test(priority = 1, dataProviderClass = ExcelReader.class, dataProvider = "ExcelTestData")
    public void Verify_Settings_page_Details(String SMTP,String PortNumber,String Username, String Password,String Email, String NoReplyEmail) throws InterruptedException {
        LoginCheck();
        er360SettingsPageActions = new ER360_SettingsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Settings Page");
        logger.assignCategory("ER360");
        er360SettingsPageActions.ClickonSettingspage();
        logger.log(Status.INFO,"User Clicks on Settings page");
        er360SettingsPageActions.click_SmtpCheckbox();
        logger.log(Status.INFO,"User clicks on Smtp Checkbox ");
        er360SettingsPageActions.Enter_SMTP_HostName(SMTP);
        logger.log(Status.INFO,"User Enters Hostname");
        er360SettingsPageActions.Enter_Port_Number(PortNumber);
        logger.log(Status.INFO,"User Enters Port No ");
        er360SettingsPageActions.click_AuthenticateCheckbox();
        logger.log(Status.INFO,"User clicks on Authenticate Checkbox ");
        er360SettingsPageActions.Enter_SMTP_UserName(Username);
        logger.log(Status.INFO,"User Enters Username ");
        er360SettingsPageActions.Enter_SMTP_Password(Password);
        logger.log(Status.INFO,"User Enters Password ");
        er360SettingsPageActions.Enter_Admin_Email(Email);
        logger.log(Status.INFO,"User Enters Admin Email ");
        er360SettingsPageActions.Enter_No_Reply_Email(NoReplyEmail);
        logger.log(Status.INFO,"User Enters No reply Email ");
        er360SettingsPageActions.click_Save_Button();
        logger.log(Status.INFO,"User Clicks on Save button");
        Thread.sleep(4000);
        logger.log(Status.INFO,"Setting page credentials are working fine ");

    }
    @Test(priority = 2)
    public void Verify_ChangeLogo_for_ER360() throws InterruptedException {
        LoginCheck();
        er360SettingsPageActions = new ER360_SettingsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Settings Page");
        logger.assignCategory("ER360");
        er360SettingsPageActions.ClickonSettingspage();
        logger.log(Status.INFO,"User Clicks on Settings page");
        er360SettingsPageActions.click_Logo_Tab();
        logger.log(Status.INFO,"User Enters Logo Tab");
        er360SettingsPageActions.ClickOnBrowse();
        logger.log(Status.INFO,"User uploads new picture for Logo");
        er360SettingsPageActions.click_Crop_Button();
        logger.log(Status.INFO,"User Crops the picture");
        er360SettingsPageActions.click_Save_Logo();
        logger.log(Status.INFO,"User Saves the logo for ER 360 ");
        logger.log(Status.INFO,"Change Logo for ER 360 is working fine ");

    }
    @Test(priority = 3)
    public void Verify_ChangeLogo_for_Organization() throws InterruptedException {
        LoginCheck();
        er360SettingsPageActions = new ER360_SettingsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Settings Page");
        logger.assignCategory("ER360");
        er360SettingsPageActions.ClickonSettingspage();
        logger.log(Status.INFO,"User Clicks on Settings page");
        er360SettingsPageActions.click_Logo_Tab();
        logger.log(Status.INFO,"User Enters Logo tab");
        er360SettingsPageActions.click_DropdownforLogotype();
        logger.log(Status.INFO,"User Clicks on DropDown");
        er360SettingsPageActions.SelectDropDownforOrganization();
        logger.log(Status.INFO,"User Selects Organization option for changing the logo");
        er360SettingsPageActions.ClickOnBrowse();
        logger.log(Status.INFO,"User uploads new picture for Logo");
        er360SettingsPageActions.click_Crop_Button();
        logger.log(Status.INFO,"User Crops the picture");
        er360SettingsPageActions.click_Save_Logo();
        logger.log(Status.INFO,"User Saves the logo for Organization");

        logger.log(Status.INFO,"Change Logo for Organization is working fine ");

    }
    @Test(priority = 4)
    public void Verify_ChangeLogo_for_Organization_Header() throws InterruptedException {
        LoginCheck();
        er360SettingsPageActions = new ER360_SettingsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Settings Page");
        logger.assignCategory("ER360");
        er360SettingsPageActions.ClickonSettingspage();
        logger.log(Status.INFO,"User Clicks on Settings page");
        er360SettingsPageActions.click_Logo_Tab();
        logger.log(Status.INFO,"User Enters Logo tab");
        er360SettingsPageActions.click_DropdownforLogotype();
        logger.log(Status.INFO,"User Clicks on DropDown");
        er360SettingsPageActions.SelectDropDownforOrganizationHeader();
        logger.log(Status.INFO,"User Selects Organization(Header) option for changing the logo");
        er360SettingsPageActions.ClickOnBrowse();
        logger.log(Status.INFO,"User uploads new picture for Logo");
        er360SettingsPageActions.click_Crop_Button();
        logger.log(Status.INFO,"User Crops the picture");
        er360SettingsPageActions.click_Save_Logo();
        logger.log(Status.INFO,"User Saves the logo for Organization");
        logger.log(Status.INFO,"Change Logo for Organization(Header) is working fine ");

    }

    //The New Model should be inside a libarary- Prerequisite
    @Test(priority = 5)
    public void Verify_IndexMetadata() throws InterruptedException {
        LoginCheck();
        er360SettingsPageActions = new ER360_SettingsPageActions(driver);
        logger.assignAuthor("Prabhat");
        logger.assignCategory("Settings Page");
        logger.assignCategory("ER360");
        er360SettingsPageActions.ClickonSettingspage();
        er360SettingsPageActions.ClickIndexMetadataTab();
        er360SettingsPageActions.ClickOnSearchIcon();
        logger.log(Status.INFO,"User Clicks on SearchIcon ");
        er360SettingsPageActions.ClickOnThreeDots();
        logger.log(Status.INFO,"User Clicks on Three dots (More) ");
        er360SettingsPageActions.ClickOnGetAllCatalogs();
        logger.log(Status.INFO,"User Clicks Get all Catalogs ");
        er360SettingsPageActions.ClickOnYes();
        logger.log(Status.INFO,"User Clicks on YES");
        er360SettingsPageActions.ClickOnSearchCatalogs();
        logger.log(Status.INFO,"User Clicks on Search Catalog field for searching the desired Model");
        er360SettingsPageActions.SendingDatatoSearchCatalogForModel();
        logger.log(Status.INFO,"User enter Model name in search field");
        //er360SettingsPageActions.ClickOnModel();
        er360SettingsPageActions.ClickOnModelCheckbox();
        logger.log(Status.INFO,"User Clicks on the Model");
        er360SettingsPageActions.ClickOnIndexButton();
        logger.log(Status.INFO,"User Clicks on Index Button");
        Thread.sleep(5000);
        logger.log(Status.INFO,"Indexing is working fine.");
    }





}

package Utilities;

import testcasesMartPortal.BaseTest;
import testcasesMartPortal.RegistryReader;


public interface Constants {
    String URL = System.getProperty("url", "https://queensraildemo.myerwin.com/MartPortal/auth/login");
    String USERNAME = System.getProperty("username", "prabhat");
    String PASSWORD = System.getProperty("password", "Erwin123");
    String browser="Google Chrome";
    String mart_bulid = "NA";
    String DB = "NA";
    String UserType="Server User";
    String Collibra_License="487707622893562893";
    String Email_Subject = "Mart Portal & ER360 Automation Test Report (Cloud Url) :  " + RegistryReader.ApplicationName_Cloud ;
    String Email_Content = "<h2>Report Summary for Mart Portal & ER360 (Cloud Url)  : </h2>"+ RegistryReader.ApplicationName_Cloud + "<h3>Test Passed  :</h3>" + BaseTest.TestPassed  + "<h3>Test Failed  :</h3>" + BaseTest.TestFailed +"<h3>Test Skipped :</h3>" +BaseTest.TestSkipped +"<br>"+"<br>"+"<b>For Detailed report - Please open the attached HTML report. </b>"+"<br>"+"<b>Note:- This report contains both Mart Portal and ER360 test cases.</b>"+"<br>"+"<br>"+"<br>"+"Regards,"+"<br>"+"Mart QA Team";
    String Email_To = "prabhat.kumar@quest.com";
    String Email_CC = "murali.macharla@quest.com;prabhat.kumar@quest.com;abdul.sameer@quest.com;gajam.tejasvi@quest.com;manali.rai@quest.com";
    int logintype = 1;

}

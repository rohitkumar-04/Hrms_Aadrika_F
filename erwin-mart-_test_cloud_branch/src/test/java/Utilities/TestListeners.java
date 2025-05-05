package Utilities;


import org.testng.IAnnotationTransformer;
import org.testng.IExecutionListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static testcasesMartPortal.BaseTest.ReportDateAndTime;


public class TestListeners implements IExecutionListener, IAnnotationTransformer {

    /*This listener below is used to send email at the last when the suite ends. */
    @Override
    public void onExecutionFinish() {
        EmailSenderImpl emailSender = new EmailSenderImpl();
        {
            try
            {
               // emailSender.sendEmail("Sample Test Report", "Please find the detailed output in the attached report", "prabhat.kumar@quest.com", "prabhat.kumar@quest.com;prabhat.kumar@quest.com", ".\\ER360 reports\\ER360_Automation_Reports_"+ ReportDateAndTime +".html");
                emailSender.sendEmail(Constants.Email_Subject, Constants.Email_Content, Constants.Email_To, Constants.Email_CC, ".\\Mart_Reports\\MartAutomationReports"+ ReportDateAndTime+".html");
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }

    }


/*This listener is used for retrying the failed testcases. Once the test case fail.
This listener automatically invokes the retry logic */
    public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
    {
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }







}
package Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*This class is created for Retrying the failed test cases. */
/*You can modify the retryCount variable value from 1 to some other value to increase or
 decrease the retry of failed testcases*/
/*Eg if you want to retry the failed test cases for 3 times . Set the retryCount to 3.
The failed test cases will execute 3 times until passed */
public class RetryAnalyzer implements IRetryAnalyzer {
    int count = 0;
    int retryCount = 2;
    @Override

    public boolean retry(ITestResult iTestResult) {

        while (count<retryCount){
            count++;
            return true;
        }

        return false;
    }
}

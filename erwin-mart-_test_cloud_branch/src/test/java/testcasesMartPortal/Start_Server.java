package testcasesMartPortal;


import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;


public class Start_Server {


    @Test(priority = 1)
    public void Start_MartServer() throws IOException, AWTException, InterruptedException {
       /* logger.log(Status.INFO, " Start : Starting MartServer")*/;
        try {
            // Path to Mart Server
            String StartServer = "C:\\Program Files\\erwin\\Mart Portal\\startMartServer.cmd";
            ProcessBuilder processBuilder = new ProcessBuilder(StartServer);
            Process process = processBuilder.start();
            process.waitFor();

            Thread.sleep(40000);

            System.out.println("Server Started Successfully");


        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread.sleep(15000);
    }










}

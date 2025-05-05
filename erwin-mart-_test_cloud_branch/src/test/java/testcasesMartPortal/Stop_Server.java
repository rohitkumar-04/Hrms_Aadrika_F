package testcasesMartPortal;


import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;


public class Stop_Server {

    @Test(priority = 1)
    public void Stop_MartServer() throws IOException, AWTException, InterruptedException {

        try {
            // Path to Stop Mart Server
            String StopServer = "C:\\Program Files\\erwin\\Mart Portal\\stopMartServer.cmd";
            ProcessBuilder processBuilder = new ProcessBuilder(StopServer);
            Process process = processBuilder.start();
            process.waitFor();
            Thread.sleep(10000);
            System.out.println("Server stopped successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread.sleep(15000);
    }














}

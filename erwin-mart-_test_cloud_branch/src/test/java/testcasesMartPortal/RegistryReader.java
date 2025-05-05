package testcasesMartPortal;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class RegistryReader {
    public static String displayVersion;
    public static String ApplicationName;
    public static String ApplicationName_Cloud = "https://ausmltdemo.myerwin.com/MartPortal/auth/login";


    @Test(priority = 1)
    public void findVersion() throws IOException, AWTException, InterruptedException {
        String appName = "erwin Mart"; // Use a partial name to match the application

        // Define the registry path for 64-bit installed applications
        String registryPath = "Software\\Microsoft\\Windows\\CurrentVersion\\Uninstall";

        if (Advapi32Util.registryKeyExists(WinReg.HKEY_LOCAL_MACHINE, registryPath)) {
            String[] subKeys = Advapi32Util.registryGetKeys(WinReg.HKEY_LOCAL_MACHINE, registryPath);
            for (String subKey : subKeys) {
                String keyPath = registryPath + "\\" + subKey;
                try {
                    if (Advapi32Util.registryKeyExists(WinReg.HKEY_LOCAL_MACHINE, keyPath)) {
                        String displayName = Advapi32Util.registryGetStringValue(WinReg.HKEY_LOCAL_MACHINE, keyPath, "DisplayName");
                        if (displayName != null && displayName.contains(appName)) {
                            displayVersion = Advapi32Util.registryGetStringValue(WinReg.HKEY_LOCAL_MACHINE, keyPath, "DisplayVersion");
                            String publisher = Advapi32Util.registryGetStringValue(WinReg.HKEY_LOCAL_MACHINE, keyPath, "Publisher");
                            String installDate = Advapi32Util.registryGetStringValue(WinReg.HKEY_LOCAL_MACHINE, keyPath, "InstallDate");
                            if (displayVersion.length() > 5) {
                                displayVersion = displayVersion.substring(displayVersion.length() - 5); // Get the last 5 digits of the version number
                            }
                            System.out.println("Name: " + displayName);
                            System.out.println("Version: " + displayVersion);
                            System.out.println("Publisher: " + publisher);
                            System.out.println("Install Date: " + installDate);
                            ApplicationName = displayName;
                            System.out.println("Appplication name: " + ApplicationName);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred while reading the registry key: " + keyPath);
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } else {
            System.out.println("The registry path " + registryPath + " does not exist.");
        }
    }
}

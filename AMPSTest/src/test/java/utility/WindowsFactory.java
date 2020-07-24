package utility;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WindowsFactory {
    public  static WiniumDriver startAMPS(WiniumDriver driver) throws MalformedURLException {
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Users\\kmudalagiriyappa\\AppData\\Local\\AmpsSupport\\CSTLoader.exe");
        try {
            driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }

    public static void quitAMPS(WiniumDriver driver){
        driver.quit();
    }
}

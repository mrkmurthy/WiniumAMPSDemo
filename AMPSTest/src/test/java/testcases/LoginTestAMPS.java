package testcases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utility.WindowsFactory;

import java.net.MalformedURLException;

public class LoginTestAMPS {
    WiniumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = WindowsFactory.startAMPS(driver);
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }
    @Test
    public void loginAMPS() {
        LoginPage.loginPage(driver);
        LoginPage loginPage = new LoginPage();
        loginPage.loginToAMPS("", "");
    }
}

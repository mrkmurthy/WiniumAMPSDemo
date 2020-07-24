package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.winium.WiniumDriver;

public class LoginPage {

    static WiniumDriver driver;
    public static void loginPage(WiniumDriver driver1){
        driver = driver1;
    }
    WebElement userName = driver.findElement (By.xpath( "/*[ @Name = 'Auto/Mate Support Tool']//*[@ClassName = 'Edit' and @Name = 'User name:']"));
    WebElement password = driver.findElement (By.xpath( "/*[ @Name = 'Auto/Mate Support Tool']//*[@ClassName = 'Edit' and @Name = 'Password:']"));
    WebElement okButton = driver.findElement (By.name("OK"));
    public void  loginToAMPS(String uName, String pWord) throws InterruptedException {
        userName.clear();
        userName.sendKeys(uName);
        password.sendKeys(pWord);
        okButton.click();
    }
}

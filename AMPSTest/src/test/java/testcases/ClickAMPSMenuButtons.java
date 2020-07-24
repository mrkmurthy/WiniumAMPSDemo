package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ClickAMPSMenuButtons {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Users\\kmudalagiriyappa\\AppData\\Local\\AmpsSupport\\CSTLoader.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        Thread.sleep(8000);
        driver.findElement(By.xpath("/*[ @Name = 'Auto/Mate Support Tool']//*[@ClassName = 'Edit' and @Name = 'User name:']")).clear();
        driver.findElement(By.xpath("/*[ @Name = 'Auto/Mate Support Tool']//*[@ClassName = 'Edit' and @Name = 'User name:']")).sendKeys("krishnam");
        driver.findElement(By.xpath("/*[ @Name = 'Auto/Mate Support Tool']//*[@ClassName = 'Edit' and @Name = 'Password:']")).sendKeys("tur0god#ma58");
        driver.findElement(By.name("OK")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("Internal")).click();
        driver.findElement(By.xpath("/*[ contains(@Name, 'Auto/Mate Support Tool')]//*[@ClassName = 'Edit' and @ControlType = 'ControlType.Edit']")).sendKeys("dev35");
        driver.findElement(By.name("Connect")).click();
        Thread.sleep(18000);
        driver.findElement(By.xpath("//*[@ClassName = 'Edit' and @Name = 'Username']")).sendKeys("krishnam");
        driver.findElement(By.xpath("//*[@ClassName = 'Edit' and @Name = 'Password']")).sendKeys("HE11**th");
        driver.findElement(By.name("Ok")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Add Prospect']")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("Cancel")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Doc/Mate']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Customer/Mate']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Report/Mate']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Vehicle Inventory Report']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("OK")).click();;
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Sales & Finance']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
//        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Accounting']")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Payroll']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Parts']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Service']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Vehicle Merchandising']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'F&&I']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Purchase Orders']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Chat']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
//        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'CRM by DealerSocket']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@AutomationId = 'TitleBar' and @Name = 'CRM by DealerSocket']//*[@Name = 'Close']")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'System Utilities']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Dashboard']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Dispatch/ERO']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("Cancel")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'System Configuration']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Module']")).click();
        driver.findElement(By.xpath("//*[@ControlType = 'ControlType.MenuItem' and @Name = 'Deal Recap Viewer']")).click();
    }
}
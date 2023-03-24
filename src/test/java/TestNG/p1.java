package TestNG;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.List;

public class p1 {
    public WebDriver driver;
    public ExtentReports extent;
    @BeforeClass
    public void report()
    {
        extent =new ExtentReports("report/r1"+System.currentTimeMillis()+".html");
    }
    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("https://www.jqueryui.com/");
        driver.manage().window().maximize();
    }
    @Test(priority = 1,enabled = false)
    public void resizeable()
    {
        driver.findElement(By.xpath("//a[.='Resizable']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        System.out.println(driver.findElement(By.id("resizable")).getCssValue("width"));
        Actions act = new Actions(driver);
        act.clickAndHold(driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"))).moveByOffset(10,10).release().build().perform();
        System.out.println(driver.findElement(By.id("resizable")).getCssValue("width"));
        ExtentTest test = extent.startTest("Resizable");
        test.log(LogStatus.PASS,"test passed");
    }
    @Test(priority = 2,dataProvider = "data_for_date")
    public void datepicker(String str,String d)
    {
        driver.findElement(By.xpath("//a[normalize-space()='Datepicker']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Display month & year menus']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        driver.findElement(By.cssSelector("#datepicker")).click();
        List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement date:dates)
        {
            if (date.getText().equals(d))
            {
                date.click();
                break;
            }
        }
    }
    @DataProvider
    public Object data_for_date()
    {
     return new Object[][]{{"5","1"},{"6","19"}};
    }
    @AfterMethod
    public void teardown()
    {
       driver.quit();
    }
    @AfterClass
    public void savereport()
    {
        extent.flush();
    }
}

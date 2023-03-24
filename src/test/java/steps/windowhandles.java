package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class windowhandles {
    public WebDriver driver;
    @BeforeMethod
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
    }
    @Test
    void windowhandle()
    {
        driver.findElement(By.id("tabButton")).click();
        String parent = driver.getWindowHandle();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        while (it.hasNext())
        {
            String child = it.next();
            if (!parent.equals(child))
            {
                driver.switchTo().window(child);
                System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            }
        }
        driver.switchTo().window(parent);
    }
    @AfterMethod
    void Teardown()
    {
        driver.quit();
    }
}

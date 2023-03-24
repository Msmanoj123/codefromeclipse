package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class seleniumcommands {
    public WebDriver d = chromedriver();
    public WebDriver chromedriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    public WebDriverWait driverwait()
    {
        WebDriverWait wait = new WebDriverWait(d, Duration.ofMinutes(1));
       return wait;
    }
    public Actions Actions()
    {
       Actions act = new Actions(d);
       return act;
    }
    public void screenshot(String name) throws IOException {
        TakesScreenshot tg = (TakesScreenshot) d;
        File src = tg.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\manoj.ms\\Desktop\\screenshots\\" + name + ".png");
        FileUtils.copyFile(src,trg);
    }
    public void scroll(int x ,int y)
    {
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollBy("+x+","+y+")");
    }
    public void click(WebElement element)
    {
        element.click();
    }
    public void clear(WebElement element)
    {
        element.clear();
    }
    public void sendkeys(WebElement element,String elementvalue)
    {
        element.sendKeys(elementvalue);
    }
    public void url(String url)
    {
        d.get(url);
        d.manage().window().maximize();
        d.manage().deleteAllCookies();
    }
    public void close()
    {
        d.quit();
    }
}

package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class p2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");//to use start chrome
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.youtube.com/");
    }
}

package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class code {
    public seleniumcommands sc;
    public pompage pg;
    @BeforeMethod
    void setup()
    {
         sc = new seleniumcommands();
         sc.url("https://www.saucedemo.com/");
    }
    @Test
    void testcase() throws IOException {
         pg =new pompage(sc.d);
         sc.sendkeys(pg.un,"standard_user");
         sc.sendkeys(pg.pd,"secret_sauce");
         sc.driverwait().until(ExpectedConditions.visibilityOf(pg.login)).click();
         sc.scroll(0,250);
         sc.screenshot("swaglab");
    }
    @AfterMethod
    void close()
    {
        sc.close();
    }
}

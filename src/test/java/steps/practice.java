package steps;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.seleniumcommands;

import java.io.IOException;

public class practice {
    public seleniumcommands sc;
    @BeforeMethod
    void browserlaunch()
    {
        sc=new seleniumcommands();
        sc.url("https://magento.softwaretestingboard.com/");
    }
    @Test
    void tetscase() throws InterruptedException, IOException {
        pomluma pm =new pomluma(sc.d);
        sc.click(pm.mentab);
        sc.click(pm.jackets);
        sc.driverwait().until(ExpectedConditions.visibilityOf(pm.bjacket)).click();
        sc.click(pm.XL1);
        sc.click(pm.color1);
        sc.click(pm.addcart);
        Thread.sleep(3000);
        sc.click(pm.cart);
        sc.scroll(0,400);
        sc.screenshot("luma");
    }
    @AfterMethod
    void close()
    {
        sc.close();
    }
}

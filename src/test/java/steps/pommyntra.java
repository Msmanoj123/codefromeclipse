package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class pommyntra {
    public WebDriver driver;
    public WebDriverWait wait;
    public pommyntra(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofMinutes(1));
    }
    @FindBy(xpath = "//a[.='Men']")
    public WebElement mentab;
    @FindBy(xpath = "//a[@href='/men-jeans']")
    public WebElement jeans;
    @FindBy(xpath = "(//div[@class='filter-search-filterSearchBox'])[1]")
    public WebElement search;
    @FindBy(xpath = "//input[@placeholder='Search for Brand']")
    public WebElement searchtextfield;
    @FindBy(xpath = "//label[contains(.,'Roadster')]")
    public WebElement roadster;
    @FindBy(xpath = "//ul[@class='price-list']//li[1]")
    public WebElement price;
    @FindBy(xpath = "//span[@data-colorhex='navy blue']")
    public WebElement color;
    @FindBy(css = "img[title='Roadster Men Navy Blue Skinny Fit Mid-Rise Clean Look Stretchable Jeans']")
    public WebElement pant;
    @FindBy(xpath = "//p[normalize-space()='34']")
    public WebElement size;
    @FindBy(xpath = "//div[.='ADD TO BAG']")
    public WebElement addbag;
    @FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")
    public WebElement bag;
    @FindBy(xpath = "//a[.='Men Navy Blue Skinny Fit Mid-Rise Clean Look Stretchable Jeans']")
    public WebElement pant1;

    public void men_jeans()
    {
        Actions a = new Actions(driver);
        a.moveToElement(mentab).build().perform();
        a.moveToElement(jeans).click().build().perform();
    }
    void selectpant()
    {
//        search.click();
//        searchtextfield.sendKeys("roadster");
//        roadster.click();
//        price.click();
        color.click();
        pant.click();
    }
    public void addtobag()
    {
        windowhandles();
        wait.until(ExpectedConditions.visibilityOf(size)).click();
        addbag.click();
        bag.click();
        if(pant1.isDisplayed())
        {
            System.out.println("Test case pass");
        }
        else
        {
            System.out.println("Test case fail");
        }
        driver.quit();
    }
    public void windowhandles()
    {
        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        while (it.hasNext())
        {
            String child = it.next();
            if(parent!=child)
            {
                driver.switchTo().window(child);
            }
        }
    }
}

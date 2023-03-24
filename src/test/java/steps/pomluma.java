package steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pomluma {
    public WebDriver driver2;
    public WebDriverWait wait;
    pomluma(WebDriver driver)
    {
        driver2 = driver;
        PageFactory.initElements(driver2,this);
    }
    public pomluma(WebDriver driver, WebDriverWait wait) {
        driver2 = driver;
        this.wait = wait;
        PageFactory.initElements(driver2,this);
    }
    @FindBy(xpath = "//a[@id='ui-id-5']")
    public WebElement mentab;
    @FindBy(css = "#ui-id-17")
    public WebElement tops;
    @FindBy(xpath = "//a[contains(text(),'Jackets')]")
    public WebElement jackets;
    @FindBy(xpath = "(//div[@role='presentation'])[2]")
    public WebElement size;
    @FindBy(xpath = "//div[@class='swatch-option text ' and .='XL']")
    public WebElement XL;
    @FindBy(xpath = "//div[normalize-space()='Color']")
    public WebElement color;
    @FindBy(css = "//a[@aria-label='Black']//div[contains(@class,'swatch-option color')]")
    public WebElement black;

    @FindBy(xpath = "//a[normalize-space()='Typhon Performance Fleece-lined Jacket']")
    public WebElement bjacket;
    @FindBy(xpath = "//div[.='XL']")
    public WebElement XL1;
    @FindBy(css = "#option-label-color-93-item-49")
    public WebElement color1;
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addcart;
    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement cart;
    @FindBy(xpath = "//span[normalize-space()='View and Edit Cart']")
    public WebElement viewandedit;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/typhon-performance-fleece-lined-jacket.html' and .='Typhon Performance Fleece-lined Jacket']  ")
    public WebElement item;
    @FindBy(xpath = "//span[normalize-space()='Proceed to Checkout']")
    public WebElement checkout;
    @FindBy(xpath = "(//input[@id='customer-email'])[1]")
    public WebElement email;
    @FindBy(id = "TL766QC")
    public WebElement fname;
    @FindBy(css = "#U1KHB9G")
    public WebElement lname;
    @FindBy(css = "#G1TN0F0")
    public WebElement address;
    @FindBy(id="I2GFV8F")
    public WebElement countrystdrop;
    @FindBy(id="L1LWB41")
    public WebElement statestdrop;
    @FindBy(css = "#PXA497X")
    public WebElement zip;
    @FindBy(css = "#EI3YF9W")
    public WebElement city;
    @FindBy(css = "#TO98OE6")
    public WebElement phnum;
    @FindBy(xpath = "//span[normalize-space()='Next']")
    public WebElement next;
    @FindBy(xpath = "//span[normalize-space()='Place Order']")
    public WebElement placeorder;
    @FindBy(xpath = "//main[@id='maincontent']//p[1]")
    public WebElement text;

    @FindBy(id = "customer-password")
    public WebElement password;
    @FindBy(xpath = "//span[normalize-space()='Login']")
    public WebElement login;


    public void jacket()
    {
        wait.until(ExpectedConditions.visibilityOf(mentab)).click();
//        Actions act = new Actions(driver2);
//        act.moveToElement(mentab).moveToElement(tops).click(jackets).build().perform();
        wait.until(ExpectedConditions.visibilityOf(jackets)).click();
        wait.until(ExpectedConditions.visibilityOf(size)).click();
        XL.click();
    }
    public void add_to_cart() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(bjacket)).click();
        wait.until(ExpectedConditions.visibilityOf(XL1)).click();
        wait.until(ExpectedConditions.visibilityOf(color1)).click();
        wait.until(ExpectedConditions.visibilityOf(addcart)).click();
        Thread.sleep(3000);
    }
    public void check_item_in_cart()
    {
        wait.until(ExpectedConditions.visibilityOf(cart)).click();
        wait.until(ExpectedConditions.visibilityOf(viewandedit)).click();
        if (wait.until(ExpectedConditions.visibilityOf(item)).isDisplayed())
        {
            System.out.println("item is present in the cart");
        }
        else
        {
            System.out.println("item is not present in the cart");
        }
        driver2.quit();
    }
    public void order(String emailid,String firstname,String lastname,String add,String country,String state,String ZIP,String CITY,String PHNUM )
    {
        wait.until(ExpectedConditions.visibilityOf(cart)).click();
        wait.until(ExpectedConditions.visibilityOf(viewandedit)).click();
        wait.until(ExpectedConditions.visibilityOf(checkout)).click();
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(emailid);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(firstname);
        login.click();
//        wait.until(ExpectedConditions.visibilityOf(fname)).sendKeys(firstname);
//        lname.sendKeys(lastname);
//        address.sendKeys(add);
//        Select sel1 = new Select(countrystdrop);
//        sel1.selectByValue(country);
//        Select sel2 = new Select(statestdrop);
//        sel1.selectByValue(state);
//        zip.sendKeys(ZIP);
//        city.sendKeys(CITY);
//        phnum.sendKeys(PHNUM);
//        next.click();
//        wait.until(ExpectedConditions.visibilityOf(placeorder)).click();
//        wait.until(ExpectedConditions.visibilityOf(text));
        if(text.getText().contains("Your order # is"))
        {
            System.out.println("Order is placed");
        }
        else
        {
            System.out.println("order is not placed");
        }
    }
}

package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pompage {
    public WebDriver driver;

    @FindBy(xpath="//input[@id='user-name']")
    WebElement un;
    @FindBy(id="password")
    WebElement pd;
    @FindBy(id="login-button")
    WebElement login;

    public pompage(WebDriver driver) {
        driver=driver;
        PageFactory.initElements(driver,this);
    }
}

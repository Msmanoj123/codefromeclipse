package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mytraTc {
    public WebDriver driver;
    public pommyntra myntra;
    @Given("User open browser  and pass url {string}")
    public void user_open_browser_and_pass_url(String url) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        myntra = new pommyntra(driver);
    }
    @When("select the jeans and add cart")
    public void select_the_jeans_and_add_cart() {
        myntra.men_jeans();
        myntra.selectpant();
    }
    @Then("check jeans present in cart")
    public void check_jeans_present_in_cart() {
        myntra.addtobag();
    }
}

package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class luma {
    public WebDriver driver;
    public WebDriverWait wait;
    public pomluma luma;
    @Given("User launch browser and send url {string}")
    public void user_launch_browser_and_send_url(String Url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
         wait = new WebDriverWait(driver, Duration.ofMinutes(3));
        driver.get(Url);
        driver.manage().window().maximize();
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        System.out.println(width+"   "+height);
//        driver.manage().window().setSize(new Dimension(600,600));
        luma = new pomluma(driver,wait);
    }
    @When("user select men and jackets")
    public void user_select_men_and_jackets() {
        luma.jacket();
    }
    @When("add item to cart")
    public void add_item_to_cart() throws InterruptedException {
        luma.add_to_cart();
    }
    @Then("check the added item in the cart")
    public void check_the_added_item_in_the_cart() {
        luma.check_item_in_cart();
    }
    @When("user add item to cart and order")
    public void user_add_item_to_cart_and_order() throws InterruptedException {
        luma.jacket();
        luma.add_to_cart();
    }
    @Then("check order is placed")
    public void check_order_is_placed() {
        luma.order("roni_cost@example.com","roni_cost3@example.com","new","#31 testing house","india","karnataka","571430","kingsland","8888888717");
    }
}

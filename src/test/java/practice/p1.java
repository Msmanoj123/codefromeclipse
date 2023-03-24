package practice;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class p1 {
    public WebDriver driver;
    public POMJquery jq;
        @Given("^User launch the browser and pass the URL \"([^\"]*)\"$")
        public void user_launch_the_browser_and_pass_the_url_something(String url) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            Dimension size = driver.manage().window().getSize();
            System.out.println("height of window   "+size.height+"    width of window "+size.width);
            driver.manage().window().setSize(new Dimension(500,500));
            driver.manage().window().maximize();
            jq = new POMJquery(driver);
        }
        @When("^user click on draggable$")
        public void user_click_on_draggable(){
            jq.draggable.click();
        }
        @Then("^check user navigate correct page$")
        public void check_user_navigate_correct_page()  {
            jq.v1();
        }
        @When("^user is try to drag the element to required position$")
        public void user_is_try_to_drag_the_element_to_required_position()  {
            jq.drag();
            driver.quit();
        }
    @When("^user click on droppable$")
    public void user_click_on_droppable()  {
            jq.droppable.click();
    }
    @Then("^check user navigate droppable correct page$")
    public void check_user_navigate_droppable_correct_page()  {
            jq.v2();
    }
    @When("user is drag and drop the element")
    public void user_is_drag_and_drop_the_element() {
        jq.drag_and_drop();
    }
    @Then("^Check the element is dropped$")
    public void check_the_element_is_dropped()  {
            jq.v3();
            driver.quit();
    }
    @When("^user click on sortable$")
    public void user_click_on_sortable()  {
            jq.sortable.click();
    }
    @Then("^check user navigate sortable correct page$")
    public void check_user_navigate_sortable_correct_page()  {
            jq.v4();
    }
    @When("^user is try to sort elements$")
    public void user_is_try_to_sort_elements(){
            jq.sort();
    }
    @Then("^Check the element is sorted$")
    public void check_the_element_is_sorted() throws IOException {
            jq.v5();
            driver.close();
    }
}

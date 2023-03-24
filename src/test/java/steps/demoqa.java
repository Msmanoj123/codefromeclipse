package steps;

import ch.qos.logback.core.CoreConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqa {
    public pomdemoqa demoqa;
    public WebDriverWait wait;
    public WebDriver driver;
    public JavascriptExecutor js;
    @Given("User lauch browser and pass the url {string}")
    public void user_lauch_browser_and_pass_the_url(String string) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get(string);
        wait=new WebDriverWait(driver, Duration.ofMinutes(1));
        driver.manage().window().maximize();
        demoqa = new pomdemoqa(driver);
    }
    @When("^work on textbox firstname (.*) and email (.*) and cadd (.*) and padd (.*)$")
    public void work_on_textbox_firstname_tester_and_email_tester_gmail_com_and_cadd_banglore_and_paddbanglore(String uname,String eid,String c,String p ) {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.elementstab)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.textbox)).click();
        js.executeScript("window.scrollBy(0,400)");
        demoqa.username.sendKeys(Keys.SHIFT,uname);
        demoqa.email.sendKeys(eid.toLowerCase());
        demoqa.caddress.sendKeys(c);
        demoqa.paddress.sendKeys(p.toUpperCase());
        //wait.until(ExpectedConditions.elementToBeClickable(steps.demoqa.submitbutton)));
        js.executeScript("arguments[0].scrollIntoView(true);", demoqa.submitbutton);
        //js.executeScript("arguments[0].click()", steps.demoqa.submitbutton);
        demoqa.submitbutton.click();
    }
    @Then("clear all textboxess")
    public void clear_all_textboxess() {
        System.out.println(demoqa.username.isEnabled());
        System.out.println(demoqa.username.isDisplayed());
        demoqa.username.clear();
        demoqa.email.clear();
        demoqa.caddress.clear();
        demoqa.paddress.clear();
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", demoqa.submitbutton);
        demoqa.submitbutton.click();
        driver.quit();
    }
    @When("work on checkbox")
    public void work_on_checkbox() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.elementstab)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.chbox)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.checkbox)).click();
    }
    @Then("Check how many checkboxes are their and check it is selected")
    public void check_how_many_checkboxes_are_their_and_check_it_is_selected() {
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        System.out.println(wait.until(ExpectedConditions.visibilityOf(demoqa.checkbox)).isSelected());
        driver.quit();
    }
    @When("work on radiobutton")
    public void work_on_radiobutton() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.elementstab)).click();
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.radiobutton)).click();
    }
    @Then("Check which radio button is selected and no of radiobuttons")
    public void check_which_radio_button_is_selected_and_no_of_radiobuttons() {
        System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
        System.out.println("The selected radiobutton is  "+wait.until(ExpectedConditions.visibilityOf(demoqa.yes)).isEnabled());
        demoqa.yes.click();
        System.out.println("The selected radiobutton is  "+wait.until(ExpectedConditions.visibilityOf(demoqa.selectedbutton)).getText());
        System.out.println("The selected radiobutton is  "+wait.until(ExpectedConditions.visibilityOf(demoqa.impressive)).isEnabled());
        wait.until(ExpectedConditions.visibilityOf(demoqa.impressive)).click();
        System.out.println("The selected radiobutton is  "+wait.until(ExpectedConditions.visibilityOf(demoqa.selectedbutton)).getText());
        System.out.println("The selected radiobutton is  "+wait.until(ExpectedConditions.visibilityOf(demoqa.no)).isEnabled());
        wait.until(ExpectedConditions.visibilityOf(demoqa.no)).click();
        System.out.println("The selected radiobutton is  "+wait.until(ExpectedConditions.visibilityOf(demoqa.selectedbutton)).getText());
        driver.quit();
    }
    @When("work on upload button")
    public void work_on_upload_button() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.elementstab)).click();
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.uploadbutton)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.choosefile)).sendKeys("C:\\Users\\manoj.ms\\Pictures\\Screenshots\\xyz.png");
    }
    @Then("check file is updated")
    public void check_file_is_updated() {
        System.out.println(wait.until(ExpectedConditions.visibilityOf(demoqa.checking)).getText());
        driver.quit();
    }
    @When("^Enter the data to fname (.*) and lname (.*) and email (.*)$")
    public void enter_the_data_to_fname_firstname_and_lname_lastname_and_email_email(String fname1,String lname1,String email1) {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.formstab)).click();
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.practiceform)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.fname
        )).sendKeys(fname1);
        demoqa.lname.sendKeys(lname1);
        demoqa.email.sendKeys(email1);
    }
    @When("Enter all the datas")
    public void enter_all_the_datas() {
        js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,250)","");
        wait.until(ExpectedConditions.visibilityOf(demoqa.male));
        demoqa.male.click();
        demoqa.phnumber.sendKeys("12345678");
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");
        wait.until(ExpectedConditions.visibilityOf(demoqa.date));
        demoqa.date.click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.feb3));
        demoqa.feb3.click();
        Actions a=new Actions(driver);
        a.sendKeys(demoqa.subjects,"i love steps.demoqa",Keys.ENTER).build().perform();
        js.executeScript("window.scrollTo(0,250)","");
        demoqa.subjects.sendKeys(Keys.TAB);
        wait.until(ExpectedConditions.visibilityOf(demoqa.sports)).click();
        demoqa.upload.sendKeys("C:\\\\Users\\\\manoj.ms\\\\Pictures\\\\Screenshots\\\\xyz.png");
        demoqa.cureent.sendKeys("banglore");
        js.executeScript("window.scrollBy(0,500)","");
        a.moveToElement(demoqa.state).click().build().perform();
        a.keyDown(Keys.DOWN).click().build().perform();
        js.executeScript("window.scrollBy(0,500)");
        a.moveToElement(demoqa.city).click().build().perform();
        a.keyDown(Keys.DOWN).click().build().perform();
    }
    @When("click on submit")
    public void click_on_submit() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        demoqa.submit.click();
        driver.quit();
    }
    @When("click on alertframewindow tab and select alert")
    public void click_on_alertframewindow_tab_and_select_alert() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertframewindow)).click();
        js.executeScript("arguments[0].scrollIntoView(true);", demoqa.alert);
        wait.until(ExpectedConditions.visibilityOf(demoqa.alert)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertbutton)).click();
    }
    @When("Print the text in the alert")
    public void print_the_text_in_the_alert() {
        System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
    }
    @When("accept the alert")
    public void accept_the_alert() {
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        driver.quit();
    }
    @When("click on alertframewindow tab and select alert and click on timedalert button")
    public void click_on_alertframewindow_tab_and_select_alert_and_click_on_timedalert_button() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertframewindow)).click();
        js.executeScript("arguments[0].scrollIntoView(true);", demoqa.alert);
        wait.until(ExpectedConditions.visibilityOf(demoqa.alert)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.timedalert)).click();
    }
    @When("Print the text in the timedalertbutton")
    public void print_the_text_in_the_timedalertbutton() {
        System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
    }
    @When("accept the timedalert")
    public void accept_the_timedalert() {
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        driver.quit();
    }
    @When("click on alertframewindow tab and select alert and click on confirmalert button")
    public void click_on_alertframewindow_tab_and_select_alert_and_click_on_confirmalert_button() {
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", demoqa.alertframewindow);
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertframewindow)).click();
        jse.executeScript("arguments[0].scrollIntoView(true);", demoqa.alert);
        wait.until(ExpectedConditions.visibilityOf(demoqa.alert)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.confirmbuttonalert)).click();
    }
    @When("Print the text in the confirmalertbutton")
    public void print_the_text_in_the_confirmalertbutton() {
        System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
    }
    @When("accept the confirmdalert")
    public void accept_the_confirmdalert() {
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
    @When("Check the alert accepted")
    public void check_the_alert_accepted() {
        if(wait.until(ExpectedConditions.visibilityOf(demoqa.confirmresult)).getText().contains("Ok"))
        {
            System.out.println("testpass");
            driver.quit();
        }
        else
        {
            System.out.println("testfail");
            driver.quit();

        }
    }
    @When("click on alertframewindow tab and select alert and click on promtalert button")
    public void click_on_alertframewindow_tab_and_select_alert_and_click_on_promtalert_button() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertframewindow)).click();
        js.executeScript("arguments[0].scrollIntoView(true);", demoqa.alert);
        wait.until(ExpectedConditions.visibilityOf(demoqa.alert)).click();
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.promtalert)).click();
    }
    @When("Print the text in the promtbutton")
    public void print_the_text_in_the_promtbutton() {
        System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
    }
    @When("accept the promtdalert")
    public void accept_the_promtdalert() {
        wait.until(ExpectedConditions.alertIsPresent()).sendKeys("tester");
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
    @When("Check the promtalert accepted")
    public void check_the_promtalert_accepted() {
        if(wait.until(ExpectedConditions.visibilityOf(demoqa.promtresult)).getText().contains("tester"))
        {
            System.out.println("testpass");
            driver.quit();
        }
        else
        {
            System.out.println("testfail");
            driver.quit();
        }
    }
    @When("click on respective button")
    public void click_on_respective_button() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertframewindow)).click();
        js.executeScript("arguments[0].scrollIntoView(true);", demoqa.alert);
        wait.until(ExpectedConditions.visibilityOf(demoqa.browserwindows)).click();
    }
    @When("capture the text")
    public void capture_the_text() {
        for(int i=1;i<=driver.findElements(By.xpath("(//div[@id='browserWindows']//div//button)")).size();i++)
        {
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,100)");
            System.out.println(driver.findElement(By.xpath("(//div[@id='browserWindows']//div//button)["+i+"]")).getText());
            driver.findElement(By.xpath("(//div[@id='browserWindows']//div//button)["+i+"]")).click();
            Set<String> window = driver.getWindowHandles();
            Iterator<String> it = window.iterator();
            String pid = it.next();
            String cid = it.next();
            driver.switchTo().window(cid);
            System.out.println(demoqa.heading.getText());
            driver.switchTo().window(pid);

        }
    }
    @When("Enter the fetch the text")
    public void enter_the_fetch_the_text() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertframewindow)).click();
        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.frame)).click();
        for(int i=1;i<=2;i++)
        {
            driver.switchTo().frame("frame"+i+"");
            System.out.println(demoqa.heading.getText());
            driver.switchTo().parentFrame();
        }
        driver.quit();
    }
    @When("^Create a employee data is created f (.*)and l (.*)and email (.*) age (.*)and sal (.*)and deapart (.*)$")
    public void create_a_employee_data_is_created_f_testerand_l_xyand_email_tester_gmail_com_age_24and_sal_28000and_deapart_manual(String a,String b,String c,String d,String e,String f) {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.elementstab)).click();
        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.webtables)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.addbutton)).click();
        demoqa.body1.sendKeys(a);
        demoqa.body2.sendKeys(b);
        demoqa.body3.sendKeys(c);
        demoqa.body4.sendKeys(d);
        demoqa.body5.sendKeys(e);
        demoqa.body6.sendKeys(f);
        demoqa.webtablessubmit.click();
    }
    @Then("^Check the employee data is created f(.*)$")
    public void check_the_employee_data_is_created_ftester(String s) {
        if(demoqa.webtablesbody.getText().contains(s))
        {
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test fail");
        }
    }
    @When("user click on doubleclick button")
    public void user_click_on_doubleclick_button() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.elementstab)).click();
        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.buttons)).click();
        Actions a=new Actions(driver);
        a.doubleClick(demoqa.doubleclick).build().perform();
    }
    @Then("check clcik on doubleclick button")
    public void check_clcik_on_doubleclick_button() {
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
    }
    @When("user click on rightclick button")
    public void user_click_on_rightclick_button() {
        Actions a=new Actions(driver);
        a.contextClick(demoqa.rightclick).build().perform();
    }
    @Then("check clcik on rightclick button")
    public void check_clcik_on_rightclick_button() {
        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
    }
    @When("user click on dynamicclick button")
    public void user_click_on_dynamicclick_button() {
        Actions a=new Actions(driver);
        a.click(demoqa.dynamicclick).build().perform();
    }
    @Then("check clcik on dynamicclick button")
    public void check_clcik_on_dynamicclick_button() {
        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
        driver.quit();
    }
    @When("user click on interactions and droppable")
    public void user_click_on_interactions_and_droppable() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.interactions)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.draganddrop)).click();
    }
    @When("work on dropable")
    public void work_on_dropable() {
        Actions a=new Actions(driver);
        js.executeScript("window.scrollBy(0,200)");
        a.dragAndDrop(demoqa.drag,demoqa.drop).build().perform();
    }
    @Then("check the dropped or not")
    public void check_the_dropped_or_not() {
        System.out.println(demoqa.droppable.getText());
    }
    @When("user click nestedframes tab and fetch the text of all frame")
    public void user_click_nestedframes_tab_and_fetch_the_text_of_all_frame() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertframewindow)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.nestedframe)).click();
    }
    @When("validate the text")
    public void validate_the_text() {
        driver.switchTo().frame("frame1");
        System.out.println(demoqa.ptext.getText());
        driver.switchTo().frame(demoqa.childframe);
        System.out.println(demoqa.ctext.getText());
        driver.quit();
    }
    @When("user click on modal dailogs")
    public void user_click_on_modal_dailogs() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.alertframewindow)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.modaldailog)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.smalldailog)).click();
    }
    @When("Get the text from modal dailogs window")
    public void get_the_text_from_modal_dailogs_window() {
        System.out.println(wait.until(ExpectedConditions.visibilityOf(demoqa.smalldailogtext)).getText());
    }
    @When("Close the modal dailogs window")
    public void close_the_modal_dailogs_window() {
        wait.until(ExpectedConditions.visibilityOf(demoqa.button)).click();
        driver.quit();
    }
    @When("user click on slider")
    public void user_click_on_slider() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.widgets)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.slider)).click();
    }
    @When("drag it to small value")
    public void drag_it_to_small_value() {
        Actions a=new Actions(driver);
        a.dragAndDropBy(demoqa.slider1,30,0).build().perform();
    }
    @When("fecth the text from it")
    public void fecth_the_text_from_it() {
        System.out.println(demoqa.slidervalue.getText());
        driver.quit();
    }
    @When("user click on progrssivebar button")
    public void user_click_on_progrssivebar_button() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.widgets)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.progressivebar)).click();
    }
    @When("user click on start button")
    public void user_click_on_start_button() {
        wait.until(ExpectedConditions.visibilityOf(demoqa.progressivestart)).click();
    }
    @When("wait untill it complete {int}% and click on reset")
    public void wait_untill_it_complete_and_click_on_reset(Integer int1) {
        System.out.println(wait.until(ExpectedConditions.visibilityOf(demoqa.progressivestyle)).getCssValue("background-color"));
        wait.until(ExpectedConditions.visibilityOf(demoqa.progressivereset)).click();
    }
    @When("mouse over on button")
    public void mouse_over_on_button() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.widgets)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.tooltips)).click();
        Actions a = new Actions(driver);
        a.moveToElement(demoqa.toolTipButton).build().perform();
    }
    @When("mouse over on textfiled")
    public void mouse_over_on_textfiled() {
        Actions a = new Actions(driver);
        a.moveToElement(demoqa.toolTipTextField).build().perform();
    }
    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }
    @When("click on datepicker")
    public void click_on_datepicker() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.widgets)).click();
        js.executeScript("window.scrollBy(0,400)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.datepicker)).click();
    }
    @When("^Select a date (.*)  and month (.*) from date list$")
    public void select_a_date_and_month_june_from_date_list(String int1,String month) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(demoqa.Datepick)).click();
        while (!demoqa.month.getText().contains(month)) {
            js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)");
            demoqa.nextmonth.click();
        }
        int count = driver.findElements(By.xpath("//div[@tabindex='-1']")).size();
        for(int i=1;i<=count;i++)
        {
            String text = driver.findElements(By.xpath("//div[@tabindex='-1']")).get(i).getText();
            if(text.equals(int1))
            {
                driver.findElements(By.xpath("//div[@tabindex='-1']")).get(i).click();
                break;
            }
        }
        wait.until(ExpectedConditions.visibilityOf(demoqa.datetime)).click();
        while (!demoqa.month.getText().contains(month)) {
            js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)");
            demoqa.nextmonth.click();
        }
        int count1 = driver.findElements(By.xpath("//div[@tabindex='-1']")).size();
        for(int i=1;i<=count1;i++)
        {
            String text = driver.findElements(By.xpath("//div[@tabindex='-1']")).get(i).getText();
            if(text.equals(int1))
            {
                driver.findElements(By.xpath("//div[@tabindex='-1']")).get(i).click();
                break;
            }
        }
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", demoqa.time);
        Thread.sleep(2000);
        driver.quit();
    }
    @When("To resize the webelement")
    public void to_resize_the_webelement() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.interactions)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.resizeable)).click();
        Actions a=new Actions(driver);
        a.clickAndHold(demoqa.resize).moveByOffset(250,150).release().build().perform();
        driver.quit();
    }
    @When("user click on selectables and check they are enabled gettext")
    public void user_click_on_selectables_and_check_they_are_enabled_gettext() throws IOException {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.interactions)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.selectable)).click();
        Actions a=new Actions(driver);
        for (int m=1;m<=4;m++)
        {
            js.executeScript("window.scrollBy(0,100)");
            a.moveToElement(driver.findElement(By.xpath("(//ul[@id='verticalListContainer']//li)["+m+"]"))).click().build().perform();
        }
        TakesScreenshot tg=(TakesScreenshot)driver;
        FileUtils.copyFile(tg.getScreenshotAs(OutputType.FILE),new File("./Screnshots/ss"+System.currentTimeMillis()+".png"));
        wait.until(ExpectedConditions.visibilityOf(demoqa.selectablegrid)).click();
        for (int n=1;n<=driver.findElements(By.xpath("(//div[@id='gridContainer']//div//li)")).size();n++)
        {
            a.moveToElement(driver.findElement(By.xpath("(//div[@id='gridContainer']//div//li)["+n+"]"))).click().build().perform();
        }
        FileUtils.copyFile(tg.getScreenshotAs(OutputType.FILE),new File("./Screnshots/ss"+System.currentTimeMillis()+".png"));
        driver.quit();
    }
    @When("To validate withoutgroup")
    public void to_validate_withoutgroup() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.widgets)).click();
        js.executeScript("window.scrollBy(0,800)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.selectmenu)).click();
        wait.until(ExpectedConditions.visibilityOf(demoqa.divdrop1)).click();
        Actions a=new Actions(driver);
        a.sendKeys(demoqa.divdrop1,"Group 1, option 1",Keys.ENTER).build().perform();
        System.out.println(wait.until(ExpectedConditions.visibilityOf(demoqa.divdrop1)).getText());
    }

    @When("To validate selectone")
    public void to_validate_selectone() {
        wait.until(ExpectedConditions.visibilityOf(demoqa.divdrop2)).click();
        Actions a=new Actions(driver);
        a.sendKeys(demoqa.divdrop2,"Mr",Keys.ENTER).build().perform();
        System.out.println(wait.until(ExpectedConditions.visibilityOf(demoqa.divdrop2)).getText());
    }

    @When("To validate static dropdown")
    public void to_validate_static_dropdown() {
        Select drop=new Select(demoqa.stdrop);
        drop.selectByValue("5");
    }

    @When("To validate multiselect dropdown")
    public void to_validate_multiselect_dropdown() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.divdrop3)).click();
        Actions a=new Actions(driver);
        a.sendKeys(demoqa.divdrop3,"Green",Keys.ENTER).build().perform();
        a.sendKeys(demoqa.divdrop3,"Red",Keys.ENTER).build().perform();
        a.sendKeys(demoqa.divdrop3,"Black",Keys.ENTER).build().perform();
        System.out.println(wait.until(ExpectedConditions.visibilityOf(demoqa.divdrop3)).getText());
    }

    @When("To validate standard multiselect dropdown")
    public void to_validate_standard_multiselect_dropdown() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        Select drop=new Select(demoqa.stdrop2);
        drop.selectByIndex(1);
        drop.selectByIndex(3);
        driver.quit();
    }
    @When("user pass colour and select from suggestions")
    public void user_pass_colour_and_select_from_suggestions() throws InterruptedException {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.widgets)).click();
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.autocomplete)).click();
        Actions action = new Actions(driver);
        action.moveToElement(demoqa.autocompletemulti).click().sendKeys("blue").build().perform();
        action.moveToElement(demoqa.autocompletemulti).click().sendKeys(Keys.ENTER).build().perform();
//            action.moveToElement(steps.demoqa.autocompletesingle).click().sendKeys("violet",Keys.ENTER).build().perform();
//            Thread.sleep(2000);
//            wait.until(ExpectedConditions.visibilityOf(steps.demoqa.autocompletemulti)).sendKeys(color,Keys.ENTER);
//            wait.until(ExpectedConditions.visibilityOf(steps.demoqa.autocompletesingle)).sendKeys(color,Keys.ENTER);
        driver.quit();
    }
    @When("user darg the element to certain place")
    public void user_darg_the_element_to_certain_place() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.interactions)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.dragby)).click();
        Actions a = new Actions(driver);
        a.clickAndHold(demoqa.dragbox).moveByOffset(100,100).build().perform();
        driver.quit();
    }
    @When("user go to every tab and fetch the text of tab and body")
    public void user_go_to_every_tab_and_fetch_the_text_of_tab_and_body() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.widgets)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.tabs)).click();
        for (int y=1;y<driver.findElements(By.xpath("(//nav[@role='tablist']//a)")).size();y++)
        {
            driver.findElement(By.xpath("(//nav[@role='tablist']//a)["+y+"]")).click();
            System.out.println(driver.findElement(By.xpath("(//nav[@role='tablist']//a)["+y+"]")).getText());
        }
        driver.quit();
    }
    @When("user click on menu and mouse over on main item and goto sublist")
    public void user_click_on_menu_and_mouse_over_on_main_item_and_goto_sublist() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.widgets)).click();
        js.executeScript("window.scrollBy(0,600)");
        wait.until(ExpectedConditions.visibilityOf(demoqa.menu)).click();
        Actions a = new Actions(driver);
        a.moveToElement(demoqa.menuitem2).build().perform();
        a.moveToElement(demoqa.sublist).build().perform();
        a.moveToElement(demoqa.subitem).build().perform();
        driver.quit();
    }
    @When("user click and hold and offset it")
    public void user_click_and_hold_and_offset_it() {
        js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");
        wait.until(ExpectedConditions.visibilityOf(demoqa.interactions)).click();
        js.executeScript("window.scrollBy(0,600)","");
        wait.until(ExpectedConditions.visibilityOf(demoqa.sorttab)).click();
        Actions a = new Actions(driver);
        a.clickAndHold(demoqa.sortsource).dragAndDrop(demoqa.sortsource,demoqa.sorttrg).release().build().perform();
    }
}

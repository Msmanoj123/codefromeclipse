package practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class POMJquery {
    public WebDriver driver2;
    public WebDriverWait wait;
    public Actions actions;
    public POMJquery(WebDriver driver) {
        driver2=driver;
        PageFactory.initElements(driver2,this);
        wait = new WebDriverWait(driver2, Duration.ofMinutes(2));
         actions = new Actions(driver2);
    }
    @FindBy(xpath ="//a[.='Draggable']")
    public WebElement draggable;
    @FindBy(xpath ="//iframe[@class='demo-frame']")
    public WebElement iframe;
    @FindBy(css ="#draggable")
    public WebElement drag;
    @FindBy(xpath ="//a[.='Droppable']")
    public WebElement droppable;
    @FindBy(css ="#draggable")
    public WebElement source;
    @FindBy(css ="#droppable")
    public WebElement target;
    @FindBy(xpath ="//a[.='Sortable']")
    public WebElement sortable;
    @FindBy(xpath ="//li[.='Item 2']")
    public WebElement item2;
    @FindBy(xpath ="//li[.='Item 1']")
    public WebElement item1;


    public void v1()
    {
        if(driver2.getCurrentUrl().contains("draggable"))
        {
            System.out.println("we are on correct page");
        }
        else
        {
            System.out.println("we are not on correct page");
        }
    }
    public void drag()
    {
        driver2.switchTo().frame(iframe);
        actions.dragAndDropBy(drag,60,50).build().perform();
        actions.clickAndHold(drag).moveByOffset(60,50).build().perform();
    }
    public void v2()
    {
        if(driver2.getCurrentUrl().contains("droppable"))
        {
            System.out.println("we are on correct page");
        }
        else
        {
            System.out.println("we are not on correct page");
        }
    }
    public void drag_and_drop()
    {
        driver2.switchTo().frame(iframe);
        actions.dragAndDrop(source,target).build().perform();
    }
    public void v3()
    {
        System.out.println(target.getCssValue("element.style"));
        if(target.getCssValue("background").equals("#fffa90"))
        {
            System.out.println("dragAndDrop is successful");
        }
        else
        {
            System.out.println("dragAndDrop is not successful");
        }
    }
    public void v4()
    {
        if(driver2.getCurrentUrl().contains("sortable"))
        {
            System.out.println("we are on correct page");
        }
        else
        {
            System.out.println("we are not on correct page");
        }
    }
    public void sort()
    {
        driver2.switchTo().frame(iframe);
        actions.dragAndDrop(item1,item2).build().perform();
    }
    public void v5() throws IOException {
        TakesScreenshot tg = (TakesScreenshot) driver2;
        FileUtils.copyFile(tg.getScreenshotAs(OutputType.FILE),new File("screenshot/ss"+System.currentTimeMillis()+".png"));
    }
}

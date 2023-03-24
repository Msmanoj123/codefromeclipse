package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class datepicker {
    public void date(String usermont_year,String userdate)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/#multiple-calendars");
        driver.manage().window().maximize();
        WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.findElement(By.xpath("//a[.='Dates in other months']")).click();
        driver.switchTo().frame(fr);
        driver.findElement(By.cssSelector("#datepicker")).click();
        while (!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText().equals(usermont_year))
        {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
        }
        List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement date:dates)
        {
            String str = date.getText();
            if (str.equals(userdate))
            {
                date.click();
                break;
            }
        }

    }
    public static void main(String[] args) throws InterruptedException {
        datepicker date =new datepicker();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the year");
//        int year = sc.nextInt();
//        System.out.println("enter the month");
//        int month = sc.nextInt();
//        System.out.println("enter the date");
//        int d1=sc.nextInt();
//        LocalDate ld=LocalDate.of(year,month,d1);
//        DateTimeFormatter d = DateTimeFormatter.ofPattern("d-MMMM yyyy");
//        String ld1 = ld.format(d);
//        String[] l = ld1.split("-");
//        String da = l[0];
//        String m=l[1];
        date.date("July 2023","26");
    }

}

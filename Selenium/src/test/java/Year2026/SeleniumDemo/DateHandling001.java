package Year2026.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DateHandling001 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String URL = "https://testautomationpractice.blogspot.com/";
        driver.manage().window().maximize();
        driver.get(URL);
        //driver.switchTo().frame(0);
        String year = "2027";
        String month = "Mar";
        String date = "5";

        //Add code to scroll to Date Picker 2
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement datePicker = driver.findElement(By.xpath("//p[contains(text(),'Date Picker 2')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", datePicker);
        datePicker.click();

        driver.findElement(By.className("ui-datepicker-month")).click();

        //select option from dropdown
        Select monthDropdown = new Select(driver.findElement(By.className("ui-datepicker-month")));
        List<WebElement> monthOptions = monthDropdown.getOptions();
        for (WebElement monthElement : monthOptions) {
            String moths = monthElement.getText();
            System.out.println(moths);
            if (moths.equals(month)) {
                monthElement.click();
                break;
            }
        }
        driver.findElement(By.className("ui-datepicker-year")).click();
        //select option from dropdown
        Select yearDropdown = new Select(driver.findElement(By.className("ui-datepicker-year")));
        List<WebElement> yearOptions = yearDropdown.getOptions();
        for (WebElement yearElement : yearOptions) {
            String years = yearElement.getText();
            System.out.println(years);
            if (years.equals(year)) {
                yearElement.click();
                break;
            }
        }

        //select date
        List<WebElement> dateList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for (WebElement dates : dateList) {
            if (dates.getText().equals(date)) {
                dates.click();
                break;
            }
        }
    }


}

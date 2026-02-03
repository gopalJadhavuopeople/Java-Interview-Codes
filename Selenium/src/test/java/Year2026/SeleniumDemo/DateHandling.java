package Year2026.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DateHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String URL = "https://jqueryui.com/datepicker/";
        driver.manage().window().maximize();
        driver.get(URL);

        driver.switchTo().frame(0);
        String year = "2027";
        String month = "March";
        String date = "5";

        driver.findElement(By.id("datepicker")).click();

        DateHandling dt = new DateHandling();
        dt.selectMonthYear(driver, year, month);
        dt.selectDate(driver, date);
        driver.quit();
    }

    void selectMonthYear(WebDriver driver, String year, String month) {
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
            System.out.println(currentMonth);
            String currentYear = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[text() = 'Next']")).click();
        }
    }

    void selectDate(WebDriver driver, String date) {
        List<WebElement> dateList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for (WebElement dates : dateList) {
            if (dates.getText().equals(date)) {
                dates.click();
            }
        }
    }
}

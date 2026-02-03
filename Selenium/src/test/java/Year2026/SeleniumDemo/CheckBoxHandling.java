package Year2026.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {
    public static void main(String[] args) {
        System.out.println("CheckBox Handling");
        WebDriver driver = new ChromeDriver();
        String URL = "https://testautomationpractice.blogspot.com/";
        driver.manage().window().maximize();
        driver.get(URL);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement checkBox = driver.findElement(By.xpath("//label[text()='Sunday']/preceding-sibling::input"));
        js.executeScript("arguments[0].scrollIntoView(true);", checkBox);
        checkBox.click();
        System.out.println("Checkbox selected successfully");
    }
}

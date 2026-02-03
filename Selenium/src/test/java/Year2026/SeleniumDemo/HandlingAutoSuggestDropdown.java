package Year2026.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingAutoSuggestDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Handling Auto Suggest Dropdown");
        WebDriver driver = new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        String URL = "https://www.google.com/";
        driver.manage().window().maximize();
        driver.get(URL);

        //driver.findElement(By.id("APjFqb")).click(); // Accept cookies if prompted
        driver.findElement(By.name("q")).sendKeys("virat kohli");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> options = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.xpath("//ul[@role='listbox']//li//div[@role='option']")
                ));

        System.out.println("Total options: " + options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase("Virat kohli instagram")) {
                //add wait before clicking to be element is clickable
                wait.until(ExpectedConditions.elementToBeClickable(option));
                option.click();
                break;

            }
        }


    }
}

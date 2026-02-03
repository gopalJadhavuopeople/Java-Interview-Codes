package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFunctionalities {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//ul/li/a[@href='/web/index.php/pim/viewMyDetails']")).click();
        Thread.sleep(3000);
        WebElement dateInput = driver.findElement(By.xpath("//label[text()='License Expiry Date']/parent::div/following-sibling::div//input"));
        Thread.sleep(1000);
        dateInput.click();
        Thread.sleep(2000);
        dateInput.sendKeys("1995-01-01");




    }
}

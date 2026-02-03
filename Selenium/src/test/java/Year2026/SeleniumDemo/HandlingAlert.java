package Year2026.SeleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Handling Alert");
        WebDriver driver = new ChromeDriver();
        String URL = "https://testautomationpractice.blogspot.com/";
        driver.manage().window().maximize();
        driver.get(URL);
//handling simple alert
//        driver.findElement(By.id("alertBtn")).click();
//        String alertText = driver.switchTo().alert().getText();
//        System.out.println("Alert Text: " + alertText);
//        driver.switchTo().alert().accept();
//        System.out.println("Alert accepted successfully");

        //handling confirmation alert
//        driver.findElement(By.id("confirmBtn")).click();
//        String confirmAlertText = driver.switchTo().alert().getText();
//        System.out.println("Confirmation Alert Text: " + confirmAlertText);
//        driver.switchTo().alert().dismiss();
//        System.out.println("Confirmation Alert dismissed successfully");

        //handling prompt alert
        driver.findElement(By.id("promptBtn")).click();
        Alert alert = driver.switchTo().alert();
        String promptAlertText = alert.getText();
        System.out.println("Prompt Alert Text: " + promptAlertText);
        Thread.sleep(1000);
        alert.sendKeys("Selenium Prompt Alert");
        Thread.sleep(1000);
        alert.accept();
        System.out.println("Prompt Alert accepted successfully");



    }
}

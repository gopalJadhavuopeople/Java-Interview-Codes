package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WebdriverMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String pageUrl = driver.getCurrentUrl();

        System.out.println(pageUrl);

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        String pageSource =driver.getPageSource();
       // System.out.println(pageSource);

        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);//1B335E47FA78E28EC59B7040FD5F5E40//this id will change every time

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        int numberOfWindow =  windowHandles.size();
        System.out.println(numberOfWindow);

        for(String window:windowHandles){
            System.out.println(window);
        }

        Thread.sleep(3000);

        driver.close();




    }
}

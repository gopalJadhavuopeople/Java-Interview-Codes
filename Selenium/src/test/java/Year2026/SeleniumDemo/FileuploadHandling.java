package Year2026.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String URL = "https://testautomationpractice.blogspot.com/";
        driver.manage().window().maximize();
        driver.get(URL);

        String file00 = "E:\\Selenium Practice\\Selenim upload.txt";
        String file01 = "E:\\Selenium Practice\\File01.txt";
        String file02 = "E:\\Selenium Practice\\File02.txt";
        String file03 = "E:\\Selenium Practice\\File03.txt";

        JavascriptExecutor js = (JavascriptExecutor) driver;
//upload single file
        //   WebElement fileEle =  driver.findElement(By.xpath("//input[@id='singleFileInput']"));
        // js.executeScript("arguments[0].scrollIntoView(true)", fileEle);

        //  Thread.sleep(5000);
        //fileEle.sendKeys(file00);

//upload multiple files
        WebElement multiFileEle = driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
        js.executeScript("arguments[0].scrollIntoView(true)", multiFileEle);
        Thread.sleep(5000);
        multiFileEle.sendKeys(file01 + "\n" + file02 + "\n" + file03);
        System.out.println("Files uploaded successfully");
    }
}

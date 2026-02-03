package Year2025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListIsSortedOrNot {

    static public  void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement scrollTill= driver.findElement(By.xpath("//*[text()='Country:']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",scrollTill);

        WebElement clrs=driver.findElement(By.id("animals"));

        Select selClrs=new Select(clrs);
        List<WebElement> allclrs=selClrs.getOptions();

        ArrayList originallist=new ArrayList();
        ArrayList templist=new ArrayList();

        for (WebElement colour:allclrs)
        {
         originallist.add(colour.getText());
         templist.add(colour.getText());
        }

        System.out.println("orginal list: "+originallist);
        System.out.println("temp list before sorting: "+templist);

        Collections.sort(templist);
        System.out.println("temp list after sorting: "+templist);

        if(originallist.equals(templist))
        {
            System.out.println("list is sorted");
        }
       else
        {
            System.out.println("list is not sorted");
        }

    }
}

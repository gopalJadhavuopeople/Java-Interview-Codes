package Year2025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dynamicWebTable {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Actions act=new Actions(driver);
        driver.get("https://testautomationpractice.blogspot.com/");

        act.sendKeys(Keys.END).build().perform();

        //To get number of pages
        String numberofPages=driver.findElement(By.xpath("(//ul/li/a)[last()]")).getText();
        int pagecount=Integer.parseInt(numberofPages);

        for(int i=1; i<=pagecount; i++)
        {

            //TO count the no of pages
            int numberofrows=driver.findElements(By.xpath("//*[@id='productTable']/descendant::tbody/tr")).size();

            //To click on page no.
            driver.findElement(By.xpath("//ul/li/a[text()='" + i + "']")).click();


            //if required checkbox got clicked then  below value will become true
            boolean hasCheckBoxClicked=false;
            for(int j=1; j<=numberofrows; j++)
            {
                //to get the value of required object from table
                String product=driver.findElement(By.xpath("//*[@id='productTable']/descendant::tbody/tr["+j+"]/td[2]")).getText();

                System.out.println("product name is: "+product);
                if(product.equals("Product 5"))
                {
                    //if required condition satisafying then checkbox for required object will get clicked
                    driver.findElement(By.xpath("//*[@id='productTable']/descendant::tbody/tr["+j+"]/td[4]/input")).click();
                    hasCheckBoxClicked=true;
                    break;
                }
            }

            //if hascheckboxclicked value is true then it will not go to next page
            System.out.println(hasCheckBoxClicked);
            if (hasCheckBoxClicked==true)
            {
                System.out.println("break");
                break;
            }



        }
    }
}

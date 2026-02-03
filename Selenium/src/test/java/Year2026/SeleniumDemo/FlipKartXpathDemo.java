package Year2026.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FlipKartXpathDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
        String URL = "https://www.flipkart.com/";
        driver.manage().window().maximize();
        driver.get(URL);
        Actions actions = new Actions(driver);

        List<WebElement> menuItems = driver.findElements(By.xpath("//div[@class='zj_MPn k917Wb']/*"));

        for (WebElement item : menuItems) {
            System.out.println(item.getText());

            if (item.getText().equalsIgnoreCase("Fashion")) {
                //mouse hover action can be added here if needed

                actions.moveToElement(item).perform();
                //click on the item
            }


        }

        List<WebElement> sideMenu = driver.findElements(By.xpath("//div[@class='QAl8n6 Op95eL']/div[1]//a"));
        for (WebElement sideMenuItem : sideMenu) {
            System.out.println(sideMenuItem.getText());
            if (sideMenuItem.getText().equalsIgnoreCase("Men's Bottom Wear")) {
                {
                    actions.moveToElement(sideMenuItem).click().perform();

                }
            }
        }
        List<WebElement> menuoption2 = driver.findElements(By.xpath("//div[@class='QAl8n6 Op95eL']//div[2]//a"));
        for (WebElement menu2 : menuoption2) {
            System.out.println(menu2.getText());
            if (menu2.getText().equalsIgnoreCase("Men's Cargos")) {
                {
                    actions.moveToElement(menu2);
                    menu2.click();
                    break;

                }
            }
        }
    }
}

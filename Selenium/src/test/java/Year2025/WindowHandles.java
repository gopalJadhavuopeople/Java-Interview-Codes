package Year2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        Set<String> windows=driver.getWindowHandles();



        //***Approach 1--
        //If we are having two windows
        //Converting set into list as need to use get() methods to use IDs

        List<String> windowsList=new ArrayList<String>(windows);
        String window1=windowsList.get(0);
        String window2=windowsList.get(1);

        //We can switch to window by using ids now
        driver.switchTo().window(window1);  //for first window
        driver.switchTo().window(window2);  //for second window

        //**Approach 2
        //If we are having multiple windows
        for(String win:windowsList)
        {
            String windowsTitle=driver.switchTo().window(win).getTitle();

            if(windowsTitle.equals("required title"))
            {
                System.out.println("required steps to do");
            }
        }

    }
}

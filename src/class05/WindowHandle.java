package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-922331821%3A1678243258154503&ifkv=AWnogHdMlk1HcNdDr1dwsEWkqci4u3raYKhu_S5jnHttVnuobR_OpOxelu26K77gXyqmqDPXZBwA&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
   driver.findElement(By.xpath("//a[text()='Help']")).click();
   driver.findElement(By.xpath("//a[text()='Privacy']")).click();
   String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        Set<String> windowHandles=driver.getWindowHandles();
        for (String wh :windowHandles){
            System.out.println(wh);
            driver.switchTo().window(wh);
            String title=driver.getTitle();
            if (title.equalsIgnoreCase("")){
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindowHandle);

    }

}

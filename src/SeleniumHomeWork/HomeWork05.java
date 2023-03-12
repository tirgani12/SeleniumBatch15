package SeleniumHomeWork;
/*
HW
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page (edited)
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");


        driver.findElement(By.xpath("//button[text()='Start']")).click();
        driver.findElement(By.xpath("//div[@ id='finish']")).click();
         WebElement text=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
       System.out.println("The text is displayed "+text.isDisplayed());
    }
}

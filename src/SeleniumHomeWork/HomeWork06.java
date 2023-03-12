package SeleniumHomeWork;
/*
HW2
        1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
        2.Switch to the iframe on the page
        3.Clear the existing text in the  editor inside the iframe
        4.Enter the text "Hello World!" in the editor inside the iframe
        5.Switch back to the main page

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork06 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement textBox=driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
        driver.switchTo().frame(textBox);
        WebElement text=driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        text.clear();

        text.sendKeys("Hello World!");

        driver.switchTo().defaultContent();
        
        driver.close();


    }
}

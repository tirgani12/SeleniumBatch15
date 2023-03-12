package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork003 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of Webdriver

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("30");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        WebElement getTotal = driver.findElement(By.xpath("//span[@id='displayvalue']"));
               String x= String.valueOf(Double.parseDouble(getTotal.getAttribute("Get Total")));
        System.out.println(x);
        //driver.close();



    }
}

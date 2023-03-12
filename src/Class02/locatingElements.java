package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of Webdriver
        WebDriver driver = new ChromeDriver();
        //open up fb.com
        driver.get("https://www.facebook.com/");
        //send in the usename
        driver.findElement(By.id("email")).sendKeys("Ahmed");
        //send the password
        driver.findElement(By.name("pass")).sendKeys("juy765");
        //click on the button create new account

        driver.findElement(By.linkText("create new account")).click();
        //click on forgotten password
        driver.findElement(By.partialLinkText(" password?")).click();
        driver.quit();

    }
}

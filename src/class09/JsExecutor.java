package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='10px dotted pink'",username);
        WebElement loginBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        js.executeScript("arguments[0].click();",loginBtn);

    }
}
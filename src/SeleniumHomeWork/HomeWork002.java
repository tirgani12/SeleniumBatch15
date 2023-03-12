package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
HW2
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
[10:03 PM]
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements


also u will need a Thread.sleep after clcikng on create new account
we will discuss "WHY" in future
 */
public class HomeWork002 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of Webdriver
        WebDriver driver = new ChromeDriver();


        //open up fb.com
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Abass");
        driver.findElement(By.name("lastname")).sendKeys("Al kon");
        driver.findElement(By.name("reg_email__")).sendKeys("8438082014");
        driver.findElement(By.id("password_step_input")).sendKeys("RT1234");
        driver.findElement(By.name("birthday_month")).sendKeys("01");
        driver.findElement(By.name("birthday_day")).sendKeys("23");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.name("sex")).click();
       driver.findElement(By.name("websubmit")).click();
       Thread.sleep(5000);
        driver.close();

        driver.quit();


    }
}

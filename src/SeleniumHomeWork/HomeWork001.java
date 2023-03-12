package SeleniumHomeWork;
/*
HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork001 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Emily");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 rock street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Little river");
        driver.findElement(By.id("customer.address.state")).sendKeys("South carolina");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("29566");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("8435679000");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("Emily45");
        driver.findElement(By.id("customer.password")).sendKeys("EE98765");
        driver.findElement(By.id("repeatedPassword")).sendKeys("EE98765");
        driver.findElement(By.className("button")).click();
        Thread.sleep(1000);
        driver.close();
    }

}

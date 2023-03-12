package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork004 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of Webdriver

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean isBoxSelected = checkBox.isSelected();
        System.out.println("The check box is selected " + isBoxSelected);
        if (!isBoxSelected) {
            checkBox.click();
        }
        isBoxSelected = checkBox.isSelected();
        System.out.println("The status of selection is " + isBoxSelected);
        List<WebElement> options = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement option : options) {
            String box = option.getAttribute("value");
            if (box.equalsIgnoreCase("Option 2")) {
                option.click();
            } else {
                option.click();

            }
            Thread.sleep(1000);


            driver.findElement(By.xpath("//input[@id='myCheck']")).click();

        }
        driver.close();






    }
}


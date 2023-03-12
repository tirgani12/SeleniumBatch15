package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of Webdriver

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        List<WebElement> radiobtns=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //iterate over the list to see ur desired one
        for (WebElement radiobtn :radiobtns){
            String age =radiobtn.getAttribute("value");
            if (age.equalsIgnoreCase("0 - 5")){
                radiobtn.click();
            }

        }
    }
}

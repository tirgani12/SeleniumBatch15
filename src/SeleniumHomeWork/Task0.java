package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task0 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
          WebElement option=driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select sel=new Select(option);
        sel.selectByIndex(1);
        sel.deselectByIndex(2);



    }
}

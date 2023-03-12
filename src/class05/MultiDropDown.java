package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement DD= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(DD);
        sel.selectByValue("New Jersey");
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);
        sel.deselectByValue("New Jersey");
        sel.deselectByVisibleText("Ohio");
        System.out.println("The drop Down is multiple "+sel.isMultiple());
    }
}

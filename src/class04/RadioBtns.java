package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of Webdriver

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
        //check if the radio button is enabled
         boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);
        boolean isDesplayedMale=maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDesplayedMale);
        boolean isSelectedmale=maleBtn.isSelected();
        System.out.println("the male button is selected "+isSelectedmale);
        if (!isSelectedmale){
            maleBtn.click();
        }
         isSelectedmale=maleBtn.isSelected();
        System.out.println("the status of selection is "+isSelectedmale);
    }
}

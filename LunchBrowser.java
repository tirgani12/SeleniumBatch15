package Class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class LunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //get the current url that is there in the browser
        driver.get("https://www.bestbuy.com/");
         String URL=driver.getCurrentUrl();
         //print out the url
        System.out.println(URL);
        //get the title of the webpage
        String title=driver.getTitle();
        //print the title of the page
        System.out.println("the title of the page is "+title);
        //slow down for 3 seconds
        Thread.sleep(3000);
        //close the browser
        driver.quit();
    }
}

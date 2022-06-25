package temp.product.webstaurant.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BrowserManager {
    static WebDriver driver = null;

    public static WebDriver getDriver(String type, String url) {

        driver.manage().window().maximize();

        if (type.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (type.equalsIgnoreCase("Safari")) {
            //driver = new SafariDriver();
        } else {
            Assert.assertTrue(false, "No Browser type sent");
        }


        driver.get(url);
        Reporter.log("Navigated to Browser: " + type + "URL:" + url, true);

        return driver;
    }

}

package webstaurant.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webstaurant.po.po_search;
import webstaurant.utils.BrowserManager;

public class TC_1 {

    static WebDriver driver;

    public static void main(String arg) {

        getDriver("chrome");
    }

    public static void getDriver(String type) {

        WebDriver driver = BrowserManager.getDriver("chrome", "");
        String url = "";
        System.setProperty("webdriver.chrome.driver", ".src/test/resources/chromedriver.exe");
        driver.get("https://www.webstaurantstore.com/");
        po_search obj = PageFactory.initElements(driver, po_search.class);
        //driver.findElement(By.name("searchval")).sendKeys("Stainless Steel Table");
        //driver.findElement(By.className("bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 rounded-l-none rounded-r-normal text-base-1/2 leading-4 m-0 py-2 px-2 capitalize align-top w-24 z-10 xs:py-3 xs:px-5 xs:w-auto bg-blue-300 hover:bg-blue-600 text-white text-shadow-black-60 bg-linear-gradient-180-blue border-black-25 shadow-inset-black-17 align-middle font-semibold")).click();
        obj.SearchAProduct("stainless-Steel-Table");

       //Reporter.log("navigated to Browser:" + type + "url" + url, true);
    }
}
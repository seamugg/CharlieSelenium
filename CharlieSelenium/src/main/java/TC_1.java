import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class TC_1 {

    private WebElement btn_search;

    {

    }

    public static void main(String[] args) {
        getdriver();


    }

    public static void getdriver() {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.get("https://www.webstaurantstore.com/search/stainless-steel-table");


    }

    @SuppressWarnings("null")
    public void SetSearchTextBox(String arg) {


        WebElement txtbox_search = null;
        txtbox_search.sendKeys("Stainless Steel Table");
        //Event.Reporter.log("Product entered in search box:" + arg, true);
    }

    public void SearchAProduct(String arg) {
        WebDriver driver = null;
        SetSearchTextBox(arg);
        ClickSearchButton();
        //assert table is true
        @SuppressWarnings("null")
        String actual = driver.getTitle();
        String expected = "page-header search--title" + "table";
        //Assert.assertEquals(actual, expected);
       // Reporter.log(" Able to search for product " + arg, true);
    }

    public void ClickSearchButton() {
        btn_search.click();
        //Reporter.log(" Search box button clicked", true);
    }

    public void last_page() {
        WebElement.class.equals("rc-pagination-next rc-pagination-disabled");
        WebElement Button_pg9 = null;
        Button_pg9.click();
    }

    public void AddtoCart() {
        WebElement.class.equals("btn btn-cart btn-small");
        WebElement submit = null;
        submit.click();
        WebElement.class.equals("btn btn-small btn-cart");
        WebElement submit_cart = null;
        submit_cart.click();

        // Empty Cart

        WebElement.class.equals("emptyCartButton btn btn-mini btn-ui pull-right");
        WebElement emptycart = null;
        emptycart.click();


    }
}


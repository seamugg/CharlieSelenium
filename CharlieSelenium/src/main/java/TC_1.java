import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

//import temp.product.webstaurant.utils.BrowserManager;

//Automate Test Case with Maven or Groovy using Selenium

//Open a browser 
//Open URl (http://Webstaurant.com)
//Enter UserName
//Click on OK
//Check the page title 
//
//https://www.webstaurantstore.com/ 


//cart - <a href="/viewcart.cfm" class="group flex self-center leading-3 mt-0 no-underline hover:no-underline" aria-label="Your cart has 0 items. View your cart." data-testid="cart-nav-link"><span class="bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 group-hover:bg-green-600 group-hover:bg-top-bottom-4-1/2 rounded-r rounded-l flex items-center text-sm-1/2 py-1 pr-2 pl-2-1/2 xxxs:rounded-r-none  hover:bg-green-600 text-white text-shadow-black-60 bg-green-primary bg-linear-gradient-180-green border-black-25 shadow-inset-black-17 align-middle font-semibold"><svg class="filter-black-400 relative right-1 fill-current text-white" height="17px" width="16px" aria-hidden="true"><use xlink:href="/build/files/6a334675a48c50896da094bfd11efa62.sprite.svg#cart"></use></svg><span class="hidden xsl:inline">Cart</span></span><span id="cartItemCountSpan" class="bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 group-hover:bg-white group-hover:bg-top-bottom-4-1/2 rounded-l-none rounded-r border-l-0 hidden items-center justify-center font-bold text-sm-1/2 leading-3 py-1 px-3 text-gray-800 group-hover:text-gray-800 xxxs:flex xs:min-w-8-1/4  bg-white hover:bg-white px-2 text-gray-800 capitalize bg-linear-gradient-gray-white border-gray-glass shadow-inset-black-17 align-middle font-semibold">0</span></a>
//https://www.webstaurantstore.com/viewcart.cfm
//
//search button  https://www.webstaurantstore.com/search.html
//document.querySelector("#searchForm > div > div")
//#searchval document.querySelector("#searchForm > div > div > div.awesomplete > ul")
//
//"stainless steel table" search - https://www.webstaurantstore.com/search/stainless-steel-table.html
//
//ensure every value has 'table' in its title  - https://www.webstaurantstore.com/search/stainless-steel-table.html?withinval=table
//
////go to last page which is --->  https://www.webstaurantstore.com/search/stainless-steel-table.html?withinval=table&page=9 //add last of found items --->https://www.webstaurantstore.com/vigor-1-3-size-anti-jam-stainless-steel-steam-table-hotel-pan-2-1-2-deep/24713222.html
//
//
// //emtpy cart // --> <button class="emptyCartButton btn btn-mini btn-ui pull-right" type="button">Empty Cart</button>
//<div data-hypernova-key="EmptyCart" data-hypernova-id="EmptyCartF0879756-C723-3A4D-4E481CBA7BD2FCDB" class="inline"><button class="emptyCartButton btn btn-mini btn-ui pull-right" type="button">Empty Cart</button></div>
//
////Additional question that asks if you want to empy cart - /html/body/div[11]/div/div/div/footer/button[1] 
//<button type="button" class="bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 mr-2 rounded-normal text-base px-7 py-2-1/2 hover:bg-green-600 text-white text-shadow-black-60 bg-green-primary bg-linear-gradient-180-green border-black-25 shadow-inset-black-17 align-middle font-semibold">Empty Cart</button>

public class TC_1 {

    private WebElement btn_search;

    {

    }

    public static void main(String[] args) {
        getdriver();


    }

    public static void getdriver() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", ".src/main/resources/chromedriver.exe");
        driver.get("https://www.webstaurantstore.com/search/stainless-steel-table");


    }

    @SuppressWarnings("null")
    public void SetSearchTextBox(String arg) {


        WebElement txtbox_search = null;
        txtbox_search.sendKeys("Stainless Steel Table");
        Reporter.log("Product entered in search box:" + arg, true);
    }

    public void SearchAProduct(String arg) {
        WebDriver driver = null;
        SetSearchTextBox(arg);
        ClickSearchButton();
        //assert table is true
        @SuppressWarnings("null")
        String actual = driver.getTitle();
        String expected = "page-header search--title" + "table";
        Assert.assertEquals(actual, expected);
        Reporter.log(" Able to search for product " + arg, true);
    }

    public void ClickSearchButton() {
        btn_search.click();
        Reporter.log(" Search box button clicked", true);
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


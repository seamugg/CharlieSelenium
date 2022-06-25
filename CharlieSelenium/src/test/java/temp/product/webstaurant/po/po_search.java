package temp.product.webstaurant.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class po_search {

    WebDriver driver;
    @FindBy(how = How.NAME, using = "searchval")
    private WebElement txtbox_search;
    @FindBy(how = How.CLASS_NAME, using = "bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 rounded-l-none rounded-r-normal text-base-1/2 leading-4 m-0 py-2 px-2 capitalize align-top w-24 z-10 xs:py-3 xs:px-5 xs:w-auto bg-blue-300 hover:bg-blue-600 text-white text-shadow-black-60 bg-linear-gradient-180-blue border-black-25 shadow-inset-black-17 align-middle font-semibold")
    private WebElement btn_search;

    public po_search(WebDriver driver) {
        this.driver = driver;
    }

    //Methods

    public void SetSearchTextBox(String arg) {
        txtbox_search.sendKeys(arg);
        Reporter.log("Product entered in search box:" + arg, true);
    }

    public void ClickSearchButton() {
        btn_search.click();
        Reporter.log(" Search box button clicked", true);
    }


    //Business Methods


    public void SearchAProduct(String arg) {
        SetSearchTextBox(arg);
        ClickSearchButton();
        String actual = driver.getTitle();
        String expected = "page-header search--title";
        Assert.assertEquals(actual, expected);
        Reporter.log(" Able to search for product " + arg, true);
    }


}

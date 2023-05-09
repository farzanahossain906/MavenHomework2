package org.example;
import io.netty.handler.codec.json.JsonObjectDecoder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class HomePage extends Utils {

    private By _registerButton = By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");

    public void clickOnRegisterButton() {
        clickElement(_registerButton);
    }

    private By _vote = By.xpath("//li[@class='answer'][2]");
    private By _voteButton = By.xpath("//div[@class='buttons']//button[@class='button-2 vote-poll-button']");
    private By _voteMessage = By.id("block-poll-vote-error-1");
    private By _continueButton = By.xpath("//a[@class='button-1 register-continue-button']");

    public void clickContinue() {
        clickElement(_continueButton);
    }

    public void voteForGood() {
        String expected = "Registered user can vote only";

        clickElement(_vote);
        clickElement(_voteButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Assert.assertEquals(getTextFromElement(_voteMessage), expected);
        System.out.println(_voteMessage);
    }


    private By _addToCartAppleMacBook = By.xpath("//div[@class='item-box'][2]//div[@class='product-item']//div[@class='add-info']//div[@class='buttons']//button[@class='button-2 product-box-add-to-cart-button']");

    //
    public void clickAddToCartAppleMacBook() {
        clickElement(_addToCartAppleMacBook);
    }

    //locators for compare product test
    private By _clickHTCCompare = By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-box'][3]//div[@class='add-info']//div[@class='buttons']//button[@class='button-2 add-to-compare-list-button']");
    private By _clickGiftCardCompare = By.xpath("//div[@class='item-box'][4]//div[@class='add-info']//div[@class='buttons']//button[@class='button-2 add-to-compare-list-button']");
    private By _clickCompareList = By.xpath("//div[@id='bar-notification']//a[@href='/compareproducts']");

    public void clickCompareButtons() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        clickElement(_clickHTCCompare);
        clickElement(_clickGiftCardCompare);
        clickElement(_clickCompareList);
    }

    //locators to click Electronics
    private By _clickElectronics = By.xpath("//div[@class='header-menu']//ul[@class='top-menu notmobile']//a[@href='/electronics']");

    public void clickOnElectronics() {
        clickElement(_clickElectronics);
    }

    //locator for add to cart button of

    private By _addToCartBuildComputer = By.xpath("//div[@class='buttons']//button[@class='button-2 product-box-add-to-cart-button']");

    public void addToCartBuildAComputer() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        clickElement(_addToCartBuildComputer);

    }

    private By _voteSuccessMsg = By.xpath("//ul[@class='poll-results']");

    public void _registeredCanVote() {
        clickElement(_vote);
        clickElement(_voteButton);
        String expected = "Vote submitted";
        Assert.assertEquals(getTextFromElement(_voteSuccessMsg), expected);
    }


    private By _productName = By.xpath("//div[contains(@class, 'product-grid home-page-product-grid')]//h2");

    public void printProductName() {
        //product names print
        listElements(_productName);

    }

    private By _clickSearch = (By.xpath("//button[@class='button-1 search-box-button']"));

    public void verifyAlertNessage() throws InterruptedException {
        clickElement(_clickSearch);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter something");
        Thread.sleep(5000);
        alert.accept();
    }
    private By _selectCurrency =(By.xpath("//select[@id='customerCurrency']"));
    private By _printPrices=By.xpath("//div[@class='prices']");
    public void verifyCurrencyCanBeSelectedAccordingly() throws InterruptedException {
      selectElementByText(_selectCurrency,"Euro");
        System.out.println("Prices converted to Euro: ");
        listElements(_printPrices);
        Thread.sleep(1000);
        selectElementByText(_selectCurrency,"US Dollar");
        System.out.println("Prices converted to US Dollar: ");
        listElements(_printPrices);


    }
    private By _searchSoething =By.id("small-searchterms");
    private By _printSearchedProducts=By.xpath("//div[@class='item-grid']//h2[@class='product-title']");
    public void searchFunctionality(){
        //type something on search bar
        textType(_searchSoething,"Apple");
        //click on search
        clickElement(_clickSearch);
        //print all the products name with this word
        listElements(_printSearchedProducts);
    }
    private By _clickNewReleaseDetails=By.xpath("//div[@class='buttons']//a[@href='/nopcommerce-new-release']");

    public void clickOnDetails(){

        clickElement(_clickNewReleaseDetails);
    }
    private By _clickBuildAComputer=By.xpath("//a[@href='/build-your-own-computer']");
    public void clickBuildComputer(){
        clickElement(_clickBuildAComputer);
    }
    private By _clickOnFacebook=By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    public void clickOnFacebook(){

        String MainWindow=driver.getWindowHandle();
        String windowURL= driver.getCurrentUrl();
        System.out.println("Url is: "+windowURL);
        clickElement(_clickOnFacebook);

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
        String childWindow=i1.next();

        if(!MainWindow.equalsIgnoreCase(childWindow)){
            driver.switchTo().window(childWindow);
        }

        }

    }
    public void voteAlertMessage() throws InterruptedException {
        clickElement(_voteButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please select an option");
        Thread.sleep(1000);
        alert.accept();

    }
}





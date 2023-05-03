package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class HomePage extends Utils{

    private By _registerButton=By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");

    public void clickOnRegisterButton(){
        clickElement(_registerButton);
    }
    private By _vote=By.xpath("//li[@class='answer'][2]");
    private By _voteButton=By.xpath("//div[@class='buttons']//button[@class='button-2 vote-poll-button']");
    private By _voteMessage=By.id("block-poll-vote-error-1");
    private By _continueButton=By.xpath("//a[@class='button-1 register-continue-button']");
    public void clickContinue(){
        clickElement(_continueButton);
    }
    public void voteForGood()  {
        String expected="Registered user can vote only";

        clickElement(_vote);
        clickElement(_voteButton);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        Assert.assertEquals(getTextFromElement(_voteMessage),expected);
        System.out.println(_voteMessage);
    }


    private By _addToCartAppleMacBook=By.xpath("//div[@class='item-box'][2]//div[@class='product-item']//div[@class='add-info']//div[@class='buttons']//button[@class='button-2 product-box-add-to-cart-button']");

//
    public void clickAddToCartAppleMacBook(){
        clickElement(_addToCartAppleMacBook);
    }
    //locators for compare product test
    private By _clickHTCCompare=By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-box'][3]//div[@class='add-info']//div[@class='buttons']//button[@class='button-2 add-to-compare-list-button']");
    private By _clickGiftCardCompare=By.xpath("//div[@class='item-box'][4]//div[@class='add-info']//div[@class='buttons']//button[@class='button-2 add-to-compare-list-button']");
    private By _compareListBar=By.xpath("//p[@class='content']");
    private By _clickCompareList=By.xpath("//div[@id='bar-notification']//a[@href='/compareproducts']");
    public void clickCompareButtons(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
        clickElement(_clickHTCCompare);
        clickElement(_clickGiftCardCompare);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(_compareListBar));
        clickElement(_clickCompareList);
    }
    //locators to click Electronics
    private By _clickElectronics=By.xpath("//div[@class='header-menu']//ul[@class='top-menu notmobile']//a[@href='/electronics']");
    public void clickOnElectronics(){
        clickElement(_clickElectronics);
    }

   //locator for add to cart button of

    private By _addToCartBuildComputer=By.xpath("//div[@class='buttons']//button[@class='button-2 product-box-add-to-cart-button']");
    public void addToCartBuildAComputer(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
        clickElement(_addToCartBuildComputer);

    }
    private By _voteSuccessMsg=By.xpath("//ul[@class='poll-results']");
    public void _registeredCanVote(){
        clickElement(_vote);
        clickElement(_voteButton);
        String expected="Vote submitted";
        Assert.assertEquals(getTextFromElement(_voteSuccessMsg),expected);
    }



}

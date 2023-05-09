package org.example;

import org.openqa.selenium.By;

public class BuildAComputer extends Utils{
    //addressing locators
    protected By _emailFriend=By.xpath("//button[@class='button-2 email-a-friend-button']");
    public void clickMailButton(){
        clickElement(_emailFriend);
    }
    private By _selectProcessor=By.xpath("//select[@name='product_attribute_1']");
    private By _selectRam=By.xpath("//select[@name='product_attribute_2']");
    private By _selectHDD=By.xpath("//label[@for='product_attribute_3_6']");
    private By _selectOS=By.xpath("//input[@id='product_attribute_4_9']");
    private By _selectSoftwar1=By.xpath("//li[@data-attr-value='10']");
    private By _selectSoftwar2=By.xpath("//li[@data-attr-value='11']");
    private By _selectSoftwar3=By.xpath("//li[@data-attr-value='12']");
    private By _addToCart=By.xpath("//button[@id='add-to-cart-button-1']");
    private By _shoppingCart=By.xpath("//p[@class='content']//a[@href='/cart']");
    public void buildAComputerDetails(){
        //selecting details to order this product
        selectElementFromValue(_selectProcessor,"1");
        selectElementFromValue(_selectRam,"5");
       clickElement(_selectHDD);
        clickElement(_selectOS);
        clickElement(_selectSoftwar1);
        clickElement(_selectSoftwar2);
        clickElement(_selectSoftwar3);
        clickElement(_addToCart);
        waitForClickable(_shoppingCart,10);
        clickElement(_shoppingCart);

    }
}

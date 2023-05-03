package org.example;

import org.openqa.selenium.By;

public class CameraAndPhoto extends Utils{
    //locators for add to cart leica camera
    protected By _addToCartLeica=By.xpath("//div[@class='item-box'][3]//div[@class='product-item']//div[@class='details']//div[@class='add-info']//div[@class='buttons']//button[@class='button-2 product-box-add-to-cart-button']");
    //locator for shopping cart
    protected By _shoppingCart=By.xpath("//a[@href='/cart']");
    protected By _name=By.xpath("//td[@class='product']");
    public void addToCartLeicaCamera(){
        clickElement(_addToCartLeica);
        clickElement(_shoppingCart);
//        getTextFromElement(_name);
//        System.out.println(_name);
    }
}

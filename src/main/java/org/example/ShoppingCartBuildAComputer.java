package org.example;

import org.openqa.selenium.By;

public class ShoppingCartBuildAComputer extends Utils{
    private By _agreeTerms=By.xpath("//input[@id='termsofservice']");
    private By _clickCheckout=By.xpath("//button[@id='checkout']");

    public void shoppingCartCheckout(){
        clickElement(_agreeTerms);
        clickElement(_clickCheckout);
    }
}

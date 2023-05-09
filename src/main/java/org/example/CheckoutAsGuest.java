package org.example;

import org.openqa.selenium.By;

public class CheckoutAsGuest extends Utils{
    private By _clickCheckoutAsGuest=By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    public void  clickCheckoutAsGuest(){
        clickElement(_clickCheckoutAsGuest);
    }
}

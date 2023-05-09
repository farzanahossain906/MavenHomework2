package org.example;

import org.openqa.selenium.By;

public class ShippingDetails extends Utils{
    private By _clickShippingMethod=By.xpath("//input[@id='shippingoption_1']");
    private By _clickContinue=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void confirmShipping(){
        //selecting payment method
        clickElement(_clickShippingMethod);
        clickElement(_clickContinue);

    }
}

package org.example;

import org.openqa.selenium.By;

public class PaymentConfirm extends Utils{
    private By _clickConfirm=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    public void clickPaymentConfirm(){
        //click on confirm
        clickElement(_clickConfirm);
    }
}

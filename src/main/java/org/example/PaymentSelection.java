package org.example;

import org.openqa.selenium.By;

public class PaymentSelection extends Utils{
    private By _clickCreditCard=By.xpath("//input[@id='paymentmethod_1']");
    private By _clickContinue=By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public void paymentConfirmation(){
        clickElement(_clickCreditCard);
        clickElement(_clickContinue);
    }
}

package org.example;

import org.openqa.selenium.By;

public class CreditCardDetails extends Utils{
    private By _selectCardType=By.xpath("//select[@id='CreditCardType']");
    private By _typeCardHolderName=By.xpath("//input[@id='CardholderName']");
    private By _typeCardNumber=By.xpath("//input[@id='CardNumber']");
    private By _cardCode=By.xpath("//input[@id='CardCode']");
    private By _selectExpireMonth=By.xpath("//select[@id='ExpireMonth']");
    private By _selectExpireYear=By.xpath("//select[@id='ExpireYear']");
    private By _clickConfirm=By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void creditCardDetailsFillIn(){
        //fill all the credit card details
        selectElementFromValue(_selectCardType,"MasterCard");
        textType(_typeCardHolderName,"test 12");
        textType(_typeCardNumber,"5410256451598149");
        textType(_cardCode,"549");
        selectElementFromValue(_selectExpireMonth,"3");
        selectElementFromValue(_selectExpireYear,"2025");
        clickElement(_clickConfirm);
    }
}

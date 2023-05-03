package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferAProduct extends Utils{
    //addressing locators
    protected By _typeFriendsMail=By.xpath("//input[@class='friend-email']");
    protected By _typeMyMail=By.xpath("//input[@class='your-email']");
    protected By _typeMessage=By.xpath("//textarea[@class=\"your-email\"]");
    protected By _clickSend=By.xpath("//button[@class=\"button-1 send-email-a-friend-button\"]");
    protected By _sentMessage=By.xpath("//div[@class=\"result\"]");
    public void referProductToFriend(){
        textType(_typeFriendsMail,"friendmail@gmail.com");
//        textType(_typeMyMail,"test7@gmail.com");
        textType(_typeMessage,"Good product");
        clickElement(_clickSend);
        getTextFromElement(_sentMessage);
        String expected="Your message has been sent";
        Assert.assertEquals(getTextFromElement(_sentMessage),expected);

    }





}
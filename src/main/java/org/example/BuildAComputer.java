package org.example;

import org.openqa.selenium.By;

public class BuildAComputer extends Utils{
    //addressing locators
    protected By _emailFriend=By.xpath("//button[@class='button-2 email-a-friend-button']");
    public void clickMailButton(){
        clickElement(_emailFriend);
    }
}

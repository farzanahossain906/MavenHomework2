package org.example;

import org.openqa.selenium.By;

public class LoginDetails extends Utils{
    private By _typeEmail=By.id("Email");
    private By _typePassword=By.id("Password");
    private By _submitButton=By.xpath("//div[@class='buttons']//button[@type='submit']");
    public void login(){
        textType(_typeEmail,"test123456@gmail.com");
        textType(_typePassword,"test123");
        clickElement(_submitButton);
    }

    public void loginVote(){
        textType(_typeEmail,"test421@gmail.com");
        textType(_typePassword,"test123");
        clickElement(_submitButton);
    }

}

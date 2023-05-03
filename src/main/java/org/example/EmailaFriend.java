package org.example;

import org.openqa.selenium.By;

public class EmailaFriend extends Utils{

    private By _clickEmailAFriend=By.xpath("//button[@class='button-2 email-a-friend-button']");


    public void appleMacbook(){

     clickElement(_clickEmailAFriend);
    }
}

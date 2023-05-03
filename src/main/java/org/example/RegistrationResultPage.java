package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils{
    String expected="Thanks for registration";
    private By _result=By.xpath("//div[@class=\"result\"]");
    public void registrationComplete(){
       Assert.assertEquals(getTextFromElement(_result),expected);
        System.out.println(_result);


    }
}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FacebookPage extends Utils{
    private By _closeButton=By.xpath("//div[@aria-label='Close']");
    public void facebookPageView(){
        String currentURL= driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://www.facebook.com");
        clickElement(_closeButton);





    }

}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class GuestUserSuccessOrder extends Utils{
    private By _successMessage=By.xpath("//div[@class='section order-completed']//div[@class='title']");
    private By _orderNumber=(By.xpath("//div[@class='order-number']"));

    public void verifyGuestUsersOrderSucceeded(){
        getTextFromElement(_orderNumber);
        System.out.println(getTextFromElement(_orderNumber));
        Assert.assertEquals(getTextFromElement(_successMessage),"Your order has been successfully processed.");
    }
}

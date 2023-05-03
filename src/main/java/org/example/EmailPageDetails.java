package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailPageDetails extends Utils{
    private By _typeFriendsEmail=By.xpath("//div[@class='page email-a-friend-page']//div[@class='page-body']//input[@class='friend-email']");
    private By _typeMyEmail=By.xpath("//div[@class='page email-a-friend-page']//div[@class='page-body']//input[@class='your-email']");
   private By _typeAMessage=By.xpath("//textarea[@class='your-email']");
   private  By _errorMailText=By.xpath("//div[@class='message-error validation-summary-errors']");
   private By _clickSubmit=By.xpath("//div[@class='buttons']//button[@type='submit']");
   public void fillEmailPageDetails(){
       textType(_typeFriendsEmail,"friendsmail"+timeStamp()+"@gmail.com");
       textType(_typeMyEmail,"myMail"+timeStamp()+"@gmail.com");
       textType(_typeAMessage,"The product is good");
       clickElement(_clickSubmit);
       String expected="User should be registered to use email feature ";

      String message= getTextFromElement(_errorMailText);
       System.out.println(message);

       Assert.assertEquals(message,expected);


   }

}

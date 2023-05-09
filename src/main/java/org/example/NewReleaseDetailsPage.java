package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleaseDetailsPage extends Utils{
    private By _typeTitle=By.xpath("//input[@id='AddNewComment_CommentTitle']");
    private By _typeComment=By.xpath("//textarea[@class='enter-comment-text']");
    private By _clickNewComment=By.xpath("//button[@name='add-comment']");
    private By _successMessage=By.xpath("//div[@class='notifications']");
    private By _newComment=By.xpath("//div[@class='comment news-comment'][2]");
    public void commentsFillDetails(){
        //adding title and comment
        textType(_typeTitle,"About a product");
        textType(_typeComment,"The product is really good");
        clickElement(_clickNewComment);
        Assert.assertEquals(getTextFromElement(_successMessage),"Comment added successfully");
        getTextFromElement(_newComment);
    }


}

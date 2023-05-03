package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareList extends Utils {
    protected By _clearList=By.xpath("//a[@class='clear-list']");
    protected By _noProductMessage=By.xpath("//div[@class='no-data']");
    public void clearCompareList(){
        String expected="No products to compare";
        clickElement(_clearList);
        Assert.assertEquals(getTextFromElement(_noProductMessage),expected);

    }
}

package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils{
    //locators for camera and photo page
    private By _clickCameraPhoto=By.xpath("//div[@class='sub-category-item']//a[@href='/camera-photo']");
    public void clickOnCameraAndPhoto(){

        clickElement(_clickCameraPhoto);
    }

}

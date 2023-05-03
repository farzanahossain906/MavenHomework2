package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class Utils extends BasePage{
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void clickElement(By by) {
        driver.findElement(by).click();
    }

    public static void textType(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timeStamp() {
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        return timestamp1.getTime();
    }

}

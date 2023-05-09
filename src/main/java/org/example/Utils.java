package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Utils extends BasePage {
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

    public static void selectElementByText(By by, String text) {
        Select selectText = new Select(driver.findElement(by));
        selectText.selectByVisibleText(text);

    }

    public static void selectElementFromIndex(By by, int number) {
        Select selectIndex = new Select(driver.findElement(by));
        selectIndex.selectByIndex(number);
    }

    public static void selectElementFromValue(By by, String value) {
        Select selectValue = new Select(driver.findElement(by));
        selectValue.selectByValue(value);
    }
    public static void waitForClickable(By by, int timeInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
   public static void listElements(By by){
        //creating reusable method for list elements
       List<WebElement> productNames = driver.findElements(by);
       for (WebElement e :
               productNames) {
           System.out.println(e.getText());
       }
   }
   public static void windowHandle(){
       String MainWindow=driver.getWindowHandle();
       Set<String> s1=driver.getWindowHandles();
       Iterator<String> i1=s1.iterator();
       driver.close();
   }
    public static void alertMethod() throws InterruptedException {
        //alert method
        Alert alert = driver.switchTo().alert();

    }


}


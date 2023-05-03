package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends BasePage{
    public void openBrowser(){
        //open the browser
        driver =new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //command to maximize screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void closeBrowser(){
        //close the browser
        driver.close();
    }
}

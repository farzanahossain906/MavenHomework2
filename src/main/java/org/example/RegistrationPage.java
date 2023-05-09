package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage extends Utils{
    //declaring x path locators
    private By _firstname=(By.xpath("//div[@class=\"inputs\"][2]//input[@type='text']"));
    private By _lastName=(By.id("LastName"));
    private By _email=(By.xpath("//div[@class=\"inputs\"][4]//input[@type=\"email\"]"));
    private By _password=(By.xpath("//input[@type=\"password\"][1]"));
    private By _confirmPassword=(By.id("ConfirmPassword"));
    private By _clickSubmitButton =(By.xpath("//div[@class='buttons']//button[@type='submit']"));
    private By _selectGender=(By.xpath("//span[@class='female']//input[@id='gender-female']"));
    private By _selectDate=(By.xpath("//select[@name='DateOfBirthDay']"));
    private By _selectMonth=(By.xpath("//select[@name='DateOfBirthMonth']"));
    private By _selectYear=(By.xpath("//select[@name='DateOfBirthYear']"));

    public void fillRegistrationDetails(){
        //selecting gender

        //type firstname
        textType(_firstname,"Test1Name");
        //type last name
        textType(_lastName,("Test2Name"));
        //select date of birth
        selectElementFromIndex(_selectDate,25);
        selectElementByText(_selectMonth,"April");
        selectElementFromValue(_selectYear,"2002");

        //type email address
        textType(_email,("testEmail"+timeStamp()+"@gmail.com"));
        System.out.println(timestamp);
        //type password
        textType(_password,("software123"));
        //confirm password
        textType(_confirmPassword,("software123"));
        //click on register button
        clickElement(_clickSubmitButton);



    }


    private By _registrationContinue=By.xpath("//div[@class='buttons']//a[@class='button-1 register-continue-button']");
    private By _clickLogin=By.className("ico-login");
    public void registrationDetailsForLogin(){
        //type firstname
        textType(_firstname,"Name123");
        //type last name
        textType(_lastName,("Name1234"));
        //type email address
        textType(_email,("test123456@gmail.com"));
        //type password
        textType(_password,("test123"));
        //confirm password
        textType(_confirmPassword,("test123"));
        //click on register button
        clickElement(_clickSubmitButton);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
        clickElement(_registrationContinue);


        // click on login button
        clickElement(_clickLogin);

    }
    public void loginForVote(){
        //type firstname
        textType(_firstname,"Name321");
        //type last name
        textType(_lastName,("Name322"));
        //type email address
        textType(_email,("test421@gmail.com"));
        //type password
        textType(_password,("test123"));
        //confirm password
        textType(_confirmPassword,("test123"));
        //click on register button
        clickElement(_clickSubmitButton);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
        clickElement(_registrationContinue);


//        // click on login button
//        clickElement(_clickLogin);


    }

}


package org.example;

import org.openqa.selenium.By;

public class BillingDetails extends Utils{
    private By _typeName1=By.xpath("//input[@id='BillingNewAddress_FirstName']");
    private By _typeName2=By.xpath("//input[@id='BillingNewAddress_LastName']");
    private By _typeEmail=By.xpath("//input[@id='BillingNewAddress_Email']");
    private By _typeCompany=By.xpath("//input[@id='BillingNewAddress_Company']");
    private By _selectCountry=By.xpath("//select[@data-trigger='country-select']");
    private By _selectState=By.xpath("//select[@data-trigger='state-select']");
    private By _typeCity=By.xpath("//input[@id='BillingNewAddress_City']");
    private By _typeAddress1=By.xpath("//input[@id='BillingNewAddress_Address1']");
    private By _typeAddress2=By.xpath("//input[@id='BillingNewAddress_Address2']");
    private By _postCode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private By _typePhoneNo=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private By _typeFaxNo=By.xpath("//input[@id='BillingNewAddress_FaxNumber']");
    private By _clickContinue=By.xpath("//button[@onclick='Billing.save()']");

    public void fillBillingAddressDetails(){
        //filling billing details
        textType(_typeName1,"test1");
        textType(_typeName2,"test2");
        textType(_typeEmail,"test12"+timeStamp()+"@gmail.com");
        textType(_typeCompany,"Software ltd.");
        selectElementFromValue(_selectCountry,"161");
        textType(_typeCity,"Agra");
        textType(_typeAddress1,"Kingston 12");
        textType(_typeAddress2,"hali pad 45");
        textType(_postCode,"1234 12");
        textType(_typePhoneNo,"941632145");
        textType(_typeFaxNo,"456 780 125");
        clickElement(_clickContinue);

    }


}

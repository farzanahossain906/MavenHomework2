package org.example;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSuite extends BaseTest {
    DriverManager driverManager=new DriverManager();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Test

    public void userShouldBeAbleToRegisterSuccessfully() {

        homePage.clickOnRegisterButton();
        registrationPage.fillRegistrationDetails();
        registrationResultPage.registrationComplete();

    }
    @Test
    public void verifyRegisterUserCanVoteOnly()  {
        homePage.voteForGood();

    }
    EmailaFriend emailaFriend=new EmailaFriend();
    EmailPageDetails emailPageDetails=new EmailPageDetails();
    @Test
    public void verifyRegisteredUserCanUserEmailFeature(){

        homePage.clickAddToCartAppleMacBook();
        emailaFriend.appleMacbook();
        emailPageDetails.fillEmailPageDetails();


    }
    CompareList compareList=new CompareList();
    @Test
    public void verifyProductCompareListEmpty(){
        homePage.clickCompareButtons();
        compareList.clearCompareList();

    }
    Electronics electronics=new Electronics();
    CameraAndPhoto cameraAndPhoto=new CameraAndPhoto();
    @Test


    public void verifyShoppingCart(){
        homePage.clickOnElectronics();
        electronics.clickOnCameraAndPhoto();
        cameraAndPhoto.addToCartLeicaCamera();
    }
    LoginDetails loginDetails=new LoginDetails();
    BuildAComputer buildAComputer=new BuildAComputer();
    ReferAProduct referAProduct=new ReferAProduct();
    @Test
    public void verifyRegisteredUserCanReferAProduct() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
        homePage.clickOnRegisterButton();
        registrationPage.fillRegistrationDetails();
     homePage.clickContinue();
        homePage.addToCartBuildAComputer();
        buildAComputer.clickMailButton();
     referAProduct.referProductToFriend();


    }
    @Test
    public void verifyRegisteredUserCanVoteSuccessfullu(){

        homePage.clickOnRegisterButton();
        registrationPage.fillRegistrationDetails();
        homePage.clickContinue();
        homePage._registeredCanVote();

    }
}


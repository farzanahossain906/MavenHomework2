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
    @Test
    public void verifyProductNameIsPrinted(){

        homePage.printProductName();
    }
    @Test
    public void verifyAlertMessageSearchFunction() throws InterruptedException {
        homePage.verifyAlertNessage();

    }
    @Test
    public void verifyCurrencyCanBeSelectedSuccessfully() throws InterruptedException {
        homePage.verifyCurrencyCanBeSelectedAccordingly();
        Thread.sleep(5000);
    }
   @Test
    public void verifyUserCanSearchGivenProductSuccessfully() throws InterruptedException {
        homePage.searchFunctionality();
        Thread.sleep(5000);
   }
   NewReleaseDetailsPage newReleaseDetailsPage=new NewReleaseDetailsPage();
   @Test
   public void verifyUserCanCommentOnNopCommerceDetails(){
        homePage.clickOnDetails();
        newReleaseDetailsPage.commentsFillDetails();

   }
   ShoppingCartBuildAComputer shoppingCartBuildAComputer=new ShoppingCartBuildAComputer();
    CheckoutAsGuest checkoutAsGuest=new CheckoutAsGuest();
    BillingDetails billingDetails=new BillingDetails();
    ShippingDetails shippingDetails=new ShippingDetails();
    PaymentSelection paymentSelection=new PaymentSelection();
    CreditCardDetails creditCardDetails=new CreditCardDetails();
    PaymentConfirm paymentConfirm=new PaymentConfirm();
    GuestUserSuccessOrder guestUserSuccessOrder=new  GuestUserSuccessOrder();
   @Test
   public void verifyGuestUserCanCheckOutSuccessfully() throws InterruptedException {
       homePage.clickBuildComputer();
       buildAComputer.buildAComputerDetails();
       shoppingCartBuildAComputer.shoppingCartCheckout();
       checkoutAsGuest.clickCheckoutAsGuest();
       billingDetails.fillBillingAddressDetails();
       shippingDetails.confirmShipping();
       paymentSelection.paymentConfirmation();
       creditCardDetails.creditCardDetailsFillIn();
       paymentConfirm.clickPaymentConfirm();
       guestUserSuccessOrder.verifyGuestUsersOrderSucceeded();
       Thread.sleep(1000);
   }
   FacebookPage facebookPage=new FacebookPage();
   @Test
    public void verifyUserCanUseFacebookLink(){
       homePage.clickOnFacebook();
       facebookPage.facebookPageView();

   }
   @Test
    public void verifyUserMustSelectAVoteOption() throws InterruptedException {
       homePage.voteAlertMessage();

   }
}


package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends Utils{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckingOutAsGuestPage checkingOutAsGuestPage = new CheckingOutAsGuestPage();
    CheckOutBillingPage checkOutBillingPage = new CheckOutBillingPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registerPage.fillInRegistrationDetails();

    }

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.verifyUserShouldBeAbleToRegisterSuccessfully();


    }
    @Given("I am registered user")
    public void i_am_registered_user() {
        homePage.clickOnRegisterButton();
        registerPage.fillInDetailsFor_AllReadyRegisteredUser();
    }
    @Given("I am logged into my account")
    public void i_am_logged_into_my_account() {
        homePage.clickOnLoginButton();
        loginPage.fillInLoginDetails();
    }
    @Given("I am on homepage")
    public void i_am_on_homepage() {
        homePage.verifyHomepage();
    }
    @When("I click on Apple MacBook-{int} ADD TO CART Button")
    public void i_click_on_apple_mac_book_add_to_cart_button(Integer int1) {
        homePage.clickOnAppleMacAddToCartButton();
    }
    @When("I am on product page")
    public void i_am_on_product_page() {
        productPage.verifyProductPage();
    }
    @When("I click on Email a friend button")
    public void i_click_on_email_a_friend_button() {
        productPage.emailaFriendButton();
    }
    @Then("Email a friend page should appear")
    public void email_a_friend_page_should_appear() {
        productPage.verifyEmailAFriendPage();
    }
    @Then("I enter required Email a friend Details")
    public void i_enter_required_email_a_friend_details() {
        productPage.fillEmailAFriendDetails();
    }
    @Then("I click on send email button")
    public void i_click_on_send_email_button() {
        productPage.clickOnSendEmail();
    }
    @Then("A successfully sent email message should be displayed")
    public void a_successfully_sent_email_message_should_be_displayed() {
        productPage.sendEmailSuccessfulMessage();

    }


    @Given("I am on DemonopCommerce home page")
    public void iAmOnDemonopCommerceHomePage() {
    }

    @When("I am click on {string} button")
    public void iAmClickOnButton(String button_name) {
        //clickOnElement(By.xpath("//a[text()='"+button_name+" ']"));
        homePage.clickOnCategory(button_name);

    }

    @Then("I should able to verify I am navigated to related page{string} successfully")
    public void iShouldAbleToVerifyIAmNavigatedToRelatedPageSuccessfully(String page_url) {
       // Assert.assertEquals(getCurrentURL(),page_url);
        homePage.verifyURL(page_url);
    }

    @And("I should able to verify the page title as{string}")
    public void iShouldAbleToVerifyThePageTitleAs(String page_title) {
      //  Assert.assertEquals(getTextFromElement(By.tagName("h1")),page_title);
        homePage.verifyPageTitle(page_title);
    }

    @When("I hover over {string} category link")
    public void iHoverOverCategoryLink(String categoryName) {
        homePage.hoverOverCategoryLink(categoryName);
    }

    @Then("I should be able to verify after hover changes color of category")
    public void iShouldBeAbleToVerifyAfterHoverChangesColorOfCategory() {
    }

    @When("I click on {string} subcategory")
    public void iClickOnSubcategory(String subcategory) {
        homePage.clickOnSubcategory(subcategory);
    }

    @Then("I should able to navigated to {string} page successfully")
    public void iShouldAbleToNavigatedToPageSuccessfully(String page) {
        homePage.verifySubcategoryPage(page);
    }

    @When("I click on Build Your Own Computer image")
    public void iClickOnBuildYourOwnComputerImage() {
        homePage.clickOnOwnComputer();
    }

    @Then("I should able to navigate to related product page")
    public void iShouldAbleToNavigateToRelatedProductPage() {
        productPage.verifyProductPageForBuilYourOwnComputer();
    }

    @When("I select all the required pc configuration")
    public void iSelectAllTheRequiredPcConfiguration() {
        productPage.buildYourOwnComputer();
    }

    @And("I click On ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        productPage.buildOurOwnADDTOCARTButton();
    }

    @And("I click on Shopping cart Button")
    public void iClickOnShoppingCartButton() {
        productPage.shoppingCartOnGreenBar();
    }

    @Then("I should able to navigate to shopping cart page")
    public void iShouldAbleToNavigateToShoppingCartPage() {
        shoppingCartPage.verifyShoppingCartPageURL();
    }

    @And("I should able to verify desired product with configuration in shopping cart")
    public void iShouldAbleToVerifyDesiredProductWithConfigurationInShoppingCart() {
        shoppingCartPage.verifyDetailsOfBuildYourOwnComputer();
    }

    @When("I click on checkbox of Terms and Conditions and i click on Checkout Button")
    public void iClickOnCheckboxOfTermsAndConditionsAndIClickOnCheckoutButton() {
        shoppingCartPage.termsAndConditionAndCheckOutButton();
    }

    @Then("I should able to navigate to Checkout as guest page")
    public void iShouldAbleToNavigateToCheckoutAsGuestPage() {
        checkingOutAsGuestPage.verifyCheckAsGuestPageURL();
    }

    @And("I click on CHECKOUT AS GUEST Button")
    public void iClickOnCHECKOUTASGUESTButton() {
        checkingOutAsGuestPage.clickOnCheckoutAsGuest();
    }

    @And("I should able to navigate to Checkout Billing page")
    public void iShouldAbleToNavigateToCheckoutBillingPage() {
        checkOutBillingPage.checkOutBillingPageURL();
    }

    @When("I fill all required details and i click on continue button")
    public void iFillAllRequiredDetailsAndIClickOnContinueButton() {
        checkOutBillingPage.fillInBillingDetails();
    }

    @Then("I should able to navigate to shipping method page")
    public void iShouldAbleToNavigateToShippingMethodPage() {
        shippingMethodPage.verifyShippingMethodPageURL();
    }

    @And("I click on NextDay Air radio Button and i click on CONTINUE Button")
    public void iClickOnNextDayAirRadioButtonAndIClickOnCONTINUEButton() {
        shippingMethodPage.clickOnShippingMethod();
    }

    @And("I click on credit Card radio Button and i click on CONTINUE Button")
    public void iClickOnCreditCardRadioButtonAndIClickOnCONTINUEButton() {
        shippingMethodPage.selectCreditCard();
    }

    @When("I fill all required payment information and i click on CONTINUE Button")
    public void iFillAllRequiredPaymentInformationAndIClickOnCONTINUEButton() {
        shippingMethodPage.paymentInfo();
    }

    @And("I click on CONFIRM Button")
    public void iClickOnCONFIRMButton() {
        shippingMethodPage.confirmOrder();
    }

    @Then("I should able to see the message Your order has been successfully processed!")
    public void iShouldAbleToSeeTheMessageYourOrderHasBeenSuccessfullyProcessed() {
        shippingMethodPage.verifyConfirmOrderMessage();
    }
}


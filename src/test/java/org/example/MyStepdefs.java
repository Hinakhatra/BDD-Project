package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
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





}

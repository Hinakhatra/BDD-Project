package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _emailAFriendButton = By.xpath("//button[text()='Email a friend']");
    private By _enterFriendEmail = By.xpath("//input[contains(@class,'friend-email')]");
    private By _typePersonalMessage = By.xpath("//textarea[starts-with(@name,'Personal')]");
    private By _sendEmailButton = By.xpath("//button[text()='Send email']");
    private By _sendEmailMessage = By.xpath("//div[@class='result']");
    private By _productPageTitle = By.xpath("//h1[text()='Apple MacBook Pro 13-inch']");
    private By _processor = By.cssSelector("select#product_attribute_1");
    private By _ram = By.cssSelector("select#product_attribute_2");
    private By _hdd = By.cssSelector("input#product_attribute_3_6");
    private By _os = By.cssSelector("input#product_attribute_4_9");
    private By _checkbox1 = By.cssSelector("input#product_attribute_5_10");
    private By _checkbox2 = By.cssSelector("input#product_attribute_5_11");
    private By _checkbox3 = By.cssSelector("input#product_attribute_5_12");
    private By _addToCart = By.cssSelector("button#add-to-cart-button-1");
    private By _shoppingCart = By.xpath("//a[text()='shopping cart']");
    public void emailaFriendButton(){
        //click on email a friend button
        clickOnElement(_emailAFriendButton);
    }
    public void fillEmailAFriendDetails(){
        //type friend's email
        typeText(_enterFriendEmail,loadProp.getProperty("friendEmail")+loadProp.getProperty("emailDomain"));
        //type personal message
        typeText(_typePersonalMessage,loadProp.getProperty("personalMessage"));

    }
    public void clickOnSendEmail(){
        //click on send email button
        clickOnElement(_sendEmailButton);

    }
    public void sendEmailSuccessfulMessage(){
        //Get emil sent message
        String actualMessage = getTextFromElement(_sendEmailMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("sendEmailMessage"));


    }
    public void verifyProductPage(){
        String productPageTitle = getTextFromElement(_productPageTitle);
        Assert.assertEquals(productPageTitle,loadProp.getProperty("productPageTitle"));
    }
    public void verifyEmailAFriendPage(){
        String emailAFriendPageURL = getCurrentURL();
        Assert.assertEquals(emailAFriendPageURL,loadProp.getProperty("emailAFriendPageURL"));
    }
    public void verifyProductPageForBuilYourOwnComputer(){
        Assert.assertEquals(getCurrentURL(),loadProp.getProperty("BuildYourOwnComputerPageURL"));
    }
    public void buildYourOwnComputer(){
        //select 2.5 GHz intel pentium processor
        selectElementByValue(_processor,loadProp.getProperty("processor"));
        //select 8GB in RAM
        selectElementByValue(_ram,loadProp.getProperty("ram"));
        // click on 320GB in HDD
        clickOnElement(_hdd);
        //click on vista premium in OS
        clickOnElement(_os);
        //for uncheck checkbox1
        clickOnElement(_checkbox1);
        //click on all 3 check box
        clickOnElement(_checkbox1);
        clickOnElement(_checkbox2);
        clickOnElement(_checkbox3);
    }
    public void buildOurOwnADDTOCARTButton(){
        //click on add to cart
        clickOnElement(_addToCart);
    }
    public void shoppingCartOnGreenBar(){
        //click on shopping cart top right corner
        clickOnElement(_shoppingCart);
    }

}




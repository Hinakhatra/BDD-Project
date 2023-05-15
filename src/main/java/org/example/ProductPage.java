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

}

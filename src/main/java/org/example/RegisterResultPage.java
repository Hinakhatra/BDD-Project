package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _actualMessage = By.cssSelector("div.result");

    public void verifyUserShouldBeAbleToRegisterSuccessfully(){
        //gettext from Web element
        String actualMessage = getTextFromElement(_actualMessage);
        Assert.assertEquals(actualMessage, loadProp.getProperty("expectedRegistrationCompleteMsg"));

    }

}

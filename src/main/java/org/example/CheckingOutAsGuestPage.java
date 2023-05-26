package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckingOutAsGuestPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _checkoutGuestButton = By.xpath("//button[text()='Checkout as Guest']");

    public void verifyCheckAsGuestPageURL(){
        Assert.assertEquals(getCurrentURL(),loadProp.getProperty("checkOutAsGuestPageURL"));
    }
    public void clickOnCheckoutAsGuest(){
        //click on checkout guest button
        clickOnElement(_checkoutGuestButton);

    }

}

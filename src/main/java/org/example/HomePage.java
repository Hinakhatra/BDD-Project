package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _registerButton = By.cssSelector("a.ico-register");
    private By _login = By.xpath("//a[text()='Log in']");
    private By _addToCartAppleMac = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");

    LoadProp loadProp = new LoadProp();
    public void clickOnRegisterButton(){
        //click on Register button
        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton(){
        //click on login button
        clickOnElement(_login);
    }
    public void clickOnAppleMacAddToCartButton(){
        //click on Apple mac 13 ADD TO CART Button
        clickOnElement(_addToCartAppleMac);
    }

}

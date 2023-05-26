package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _buildYourOwnComputername = By.cssSelector("a.product-name");
    private By _computerDetails = By.xpath("//td[@class='product']/div[1]");
    private By _termsCheckBox = By.cssSelector("input#termsofservice");
    private By _ckeckout = By.cssSelector("button#checkout");
    public void verifyShoppingCartPageURL(){
        Assert.assertEquals(getCurrentURL(),loadProp.getProperty("shoppingCartPageURL"));
    }
    public void verifyDetailsOfBuildYourOwnComputer(){
        String productName = getTextFromElement(_buildYourOwnComputername);
        System.out.println("Product Name: "+productName);
        String actualComputerDetails  = getTextFromElement(_computerDetails);
        System.out.println(actualComputerDetails);
    }
    public void termsAndConditionAndCheckOutButton(){
        //click on terms of service checkbox
        clickOnElement(_termsCheckBox);
        //click on checkout button
        clickOnElement(_ckeckout);

    }
}


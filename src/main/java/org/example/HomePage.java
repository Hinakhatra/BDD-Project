package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class HomePage extends Utils{
    private By _registerButton = By.cssSelector("a.ico-register");
    private By _login = By.xpath("//a[text()='Log in']");
    private By _addToCartAppleMac = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
    public String expectedAfterHoverColor="rgba(74, 178, 241, 1)";
    public String expectedBeforeHoverColor="rgba(85, 85, 85, 1)";
    private By _clickOnBuildyourowncomputerImg = By.xpath("//img[@alt='Picture of Build your own computer']");

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
    public void verifyHomepage(){
        String homepage = getCurrentURL();
        Assert.assertEquals(homepage,loadProp.getProperty("url"));
    }
    public void clickOnCategory(String button_name){
        clickOnElement(By.linkText(button_name));
    }
    public void verifyURL(String page_url){
        Assert.assertEquals(getCurrentURL(),page_url);
    }
    public void verifyPageTitle(String page_title){
        Assert.assertEquals(getTextFromElement(By.tagName("h1")),page_title);
    }
    public void hoverOverCategoryLink(String categoryLinkName){
        WebElement element = driver.findElement(By.linkText(categoryLinkName ));
        System.out.println("Before hover category color is :"+element.getCssValue("color"));
        Assert.assertEquals(element.getCssValue("color"),expectedBeforeHoverColor);
        //create object of Action class
        Actions action = new Actions(driver);
        //performing the mouse hover action on the target element
        action.moveToElement(element).perform();
        System.out.println("After hover category color is :"+element.getCssValue("color"));
        Assert.assertEquals(element.getCssValue("color"),expectedAfterHoverColor);

    }
    public void hoverOverSubCategory(String subcategory){
        WebElement ele = driver.findElement(By.linkText(subcategory));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }
    public void clickOnSubcategory(String subcategory){
        clickOnElement(By.linkText(subcategory));

    }
    public void verifySubcategoryPage(String page){

        Assert.assertTrue(getCurrentURL().contains(page));
    }
    public void clickOnOwnComputer(){
        //click on build your own computer
        clickOnElement(_clickOnBuildyourowncomputerImg);}





}

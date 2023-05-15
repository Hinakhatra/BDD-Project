package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _firstName = By.cssSelector("input#FirstName");
    private By _lastName = By.cssSelector("input#LastName");
    private By _dateOfBirth = By.name("DateOfBirthDay");
    private By _monthOfBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.name("DateOfBirthYear");
    private By _email = By.name("Email");
    private   By _password = By.id("Password");
    private   By _confirmPassword = By.id("ConfirmPassword");
    private   By _registerButton = By.id("register-button");
    private By _dayOfBirthday = By.name("DateOfBirthDay");
    private By _monthOfBirthday = By.name("DateOfBirthMonth");
    private By _yearOfBirthday = By.name("DateOfBirthYear");
    public void fillInRegistrationDetails(){
        //Type first name
        typeText(_firstName,loadProp.getProperty("firstName"));
        //Type last name
       typeText(_lastName,loadProp.getProperty("lastName"));
       //Select date from drop down
       selectElementByValue(_dateOfBirth,loadProp.getProperty("date_Of_Birth"));
       //Select month from drop down
       selectElementByValue(_monthOfBirth,loadProp.getProperty("month_Of_Birth"));
       //select year from drop down
       selectElementByText(_yearOfBirth,loadProp.getProperty("year_Of_Birth"));
       //Type email
       typeText(_email,loadProp.getProperty("email")+timestamp()+loadProp.getProperty("emailDomain"));
       //Type password
       typeText(_password,loadProp.getProperty("password"));
       //Type confirm password
       typeText(_confirmPassword, loadProp.getProperty("confirmPassword"));
       //click on register button
       clickOnElement(_registerButton);

    }
    public void fillInDetailsFor_AllReadyRegisteredUser(){
        //Type first name
        typeText(_firstName,loadProp.getProperty("firstName"));
        //Type last name
        typeText(_lastName,loadProp.getProperty("lastName"));
        //Select date from drop down
        selectElementByValue(_dateOfBirth,loadProp.getProperty("date_Of_Birth"));
        //Select month from drop down
        selectElementByValue(_monthOfBirth,loadProp.getProperty("month_Of_Birth"));
        //select year from drop down
        selectElementByText(_yearOfBirth,loadProp.getProperty("year_Of_Birth"));
        //Type email
        typeText(_email,loadProp.getProperty("email")+loadProp.getProperty("emailDomain"));
        //Type password
        typeText(_password,loadProp.getProperty("password"));
        //Type confirm password
        typeText(_confirmPassword, loadProp.getProperty("confirmPassword"));
        //click on register button
        clickOnElement(_registerButton);

    }

}

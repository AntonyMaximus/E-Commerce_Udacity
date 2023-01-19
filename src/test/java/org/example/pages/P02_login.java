package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

public class P02_login {
    WebDriver driver;
    public P02_login(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }
    public WebElement emailPOM(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement passwordPOM(){
        return driver.findElement(By.id("Password"));
    }
    public void LoginSteps( String email, String password){
        //enter username using POM
        emailPOM().clear();
        emailPOM().sendKeys(email);
        //enter password using POM
        passwordPOM().sendKeys(password);

    }
}




package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_register {
    WebDriver driver;

    public P01_register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement genderPOM() {
        return driver.findElement(By.id("gender-male"));
    }

    public WebElement firstNamePOM() {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastnamePom() {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement dayBirthPOM() {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement monthBirhtPOM() {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement yearBirthPOM() {
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement emailPOM() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement companyPOM() {
        return driver.findElement(By.id("Company"));
    }

    public WebElement newsLetterPOM() {
        return driver.findElement(By.id("Newsletter"));
    }

    public WebElement passwordPOM() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmPasswordPOM() {
        return driver.findElement(By.id("ConfirmPassword"));
    }
}




package org.example.stepDefs;

import org.example.pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class D01_registerStepDef {

    public static WebDriver driver = Hooks.driver;

    P01_register registration = new P01_register(driver);

    @When("user navigate to registration page")
    public void user_navigate() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2Fcart");
        Thread.sleep(3000);

    }

    @And("user select gender")
    public void GenderSelect() {
        registration.genderPOM().click();
    }

    @And("user enters first name")
    public void firstName() {
        registration.firstNamePOM().sendKeys("Antony");
    }

    @And("user enters last name")
    public void lastName() {
        registration.lastnamePom().sendKeys("Shenouda");
    }

    @And("user select date of birth")
    public void dateOfBirthday() {
        Select select1 = new Select(registration.dayBirthPOM());
        select1.selectByValue("20");
        Select select2 = new Select(registration.monthBirhtPOM());
        select2.selectByValue("9");
        Select select3 = new Select(registration.yearBirthPOM());
        select3.selectByValue("1995");

    }

    @And("user enters email address")
    public void emailType() {
        registration.emailPOM().sendKeys("tonymaximus@gmail.com");
    }

    @And("user enters company name")
    public void companyType() {
        registration.companyPOM().sendKeys("Vodafone");
    }

    @And("user select newsletter options")
    public void newsLitter() {
        registration.newsLetterPOM().isEnabled();
    }

    @And("user enters password")
    public void passType() {
        registration.passwordPOM().sendKeys("Orange");
    }

    @And("user enters confirm password")
    public void confPass() {
        registration.confirmPasswordPOM().sendKeys("Orange");
    }

    @And("user clicks on register button")
    public void registerButton() throws InterruptedException {
        registration.confirmPasswordPOM().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    //compare actual with expected result
    @Then("user could register successfully")
    public void successRegister() {
        Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/cart", driver.getCurrentUrl());
    }
}

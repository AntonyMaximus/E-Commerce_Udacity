package org.example.stepDefs;

import org.example.pages.P02_login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class D02_loginStepDef {
    WebDriver driver =Hooks.driver;
    P02_login login = new P02_login(driver);

    @When("Open Login page")
    public void userNavigateToLoginPage()  {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    @And("^user enter \"(.*)\" and \"(.*)\"$")
    public void validData(String email, String password){
        login.LoginSteps(email,password);
    }
    @And("Click on Login button")
    public void loginButton()  {
        login.passwordPOM().sendKeys(Keys.ENTER);

    }
    //compare actual with expected result
    @Then("Login Successfully Back to loginPage")
    public void successLogin(){
        Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());



    }

}

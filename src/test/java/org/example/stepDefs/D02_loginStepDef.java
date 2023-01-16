package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_homePage;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P00_homePage homePage = new P00_homePage(Hooks.driver);
    P02_login loginPage = new P02_login(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();

    @Given("Open Login page")
    public void userOpenLoginPage() {
        homePage.getLoginLink().click();
    }

    @When("Enter email & password")
    public void userEnterEmailAndPassword() {
        loginPage.getEmailTxtField().sendKeys(Hooks.userEmail);
        loginPage.getPasswordTxtField().sendKeys(Hooks.userValidPassword);
    }

    @And("Click on Login button")
    public void userClickOnLoginButton() {
        loginPage.getLoginBtn().click();
    }

    @Then("Login Successfully Back to loginPage")
    public void userLoginSuccessfullyAndReturnToHomePage() {
        softAssert.assertTrue(homePage.getMyAccountLink().isDisplayed());
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        softAssert.assertAll();
    }

    @When("Invalid E-Mail & Passwprd")
    public void userEnterInvalidEmailAndPassword() {
        loginPage.getEmailTxtField().sendKeys(Hooks.userInvalidEmail);
        loginPage.getPasswordTxtField().sendKeys(Hooks.userValidPassword);
    }

    @Then("user login failed and error message appears")
    public void loginFailedWithErrorMessage() {
        softAssert.assertTrue(loginPage.getErrorMessage().getText().contains("Login was unsuccessful"));
        softAssert.assertEquals((Color.fromString(loginPage.getErrorMessage().getCssValue("color")).asHex()),
                "#e4434b");
        softAssert.assertAll();
    }
}

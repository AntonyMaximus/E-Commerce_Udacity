package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P00_homePage homePage = new P00_homePage(Hooks.driver);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    SoftAssert softAssert = new SoftAssert();

    @Given("User at the homepage")
    public void userAtTheHomepage() {
        homePage.getHomePageLink().click();
    }

    @When("User click on add to wishlist button of htc phone")
    public void userClickOnAddToWishlistButtonOfHtcPhone() {
        homePage.getHtcPhoneAddToWishlistBtn().click();
    }

    @And("User click on Wishlist link")
    public void userClickOnWishlistLink() {
        wait.until(ExpectedConditions.invisibilityOf(homePage.getSuccessNotification()));
        homePage.getWishListLink().click();
    }

    @Then("success message appears which confirm adding of the product")
    public void successMessageAppearsWhichConfirmAddingOfTheProduct() {
        softAssert.assertTrue(homePage.getSuccessNotification().isDisplayed());
        softAssert.assertEquals(homePage.getSuccessNotification().
                getCssValue("background-color"), "rgba(75, 176, 122, 1)"); // Green
        softAssert.assertAll();
    }

    @Then("User will navigate to wishlist page which contain htc phone product with its quantity")
    public void userWillNavigateToWishlistPageWhichContainHtcPhoneProductWithItsQuantity() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("wishlist"));
        int productQuantity = Integer.parseInt(homePage.getProductQuantity().getAttribute("value"));
        softAssert.assertTrue(productQuantity > 0);
        softAssert.assertAll();
    }

}



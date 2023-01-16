package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P00_homePage homePage = new P00_homePage(Hooks.driver);
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

    @Given("User at home page")
    public void userAtHomePage() {
        homePage.getHomePageLink().click();
    }

    @When("User click on first slider nokia image")
    public void userClickOnFirstSliderNokiaImage() {
        homePage.getNokiaImgLink().click();
    }

    @Then("User navigate to nokia product details page")
    public void userNavigateToNokiaProductDetailsPage() {
        wait.until(ExpectedConditions.urlToBe(Hooks.nokiaProductDetailsPageUrl));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), Hooks.nokiaProductDetailsPageUrl);
    }

    @When("User click on second slider iphone image")
    public void userClickOnSecondSliderIphoneImage() throws InterruptedException {
        homePage.getIphoneSelector().click();
        Thread.sleep(2000);
        homePage.getIphoneImgLink().click();
    }

    @Then("User navigate to iphone product details page")
    public void userNavigateToIphoneProductDetailsPage() {
        wait.until(ExpectedConditions.urlToBe(Hooks.iphoneProductDetailsPageUrl));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), Hooks.iphoneProductDetailsPageUrl);
    }
}



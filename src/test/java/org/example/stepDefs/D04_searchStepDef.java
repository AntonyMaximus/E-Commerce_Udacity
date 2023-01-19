package org.example.stepDefs;

import org.example.pages.P04_search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class D04_searchStepDef {
    //public static WebDriver driver = Hooks.driver;

    WebDriver driver = Hooks.driver;
    P04_search search = new P04_search(driver) ;


    @When("^the user enter \"(.*)\" for any product$")
    public void searchProduct(String product) {
        search.searchSteps(product);
        search= new P04_search(driver);
    }
    @And("user click on search button")
    public void searchButton() throws InterruptedException {
        search.searchPOM().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("user could search for any product successfully")
    public void textMsg() {
        String expectedResult = "Search";
        String actualResult = search.flashPOM().getText();
        System.out.println("actualResult : " + actualResult);

        Assert.assertEquals("Notification message: user could search for any product successfully ",actualResult.contains(expectedResult),true);
    }

}

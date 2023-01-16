package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_homePage;
import org.example.pages.P02_login;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P00_homePage homePage = new P00_homePage(Hooks.driver);
    P02_login loginPage = new P02_login(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();
    Select select;

    @When("User enter a product name {string} in search text field")
    public void userEnterAProductNameInSearchTextField(String name) {
        homePage.getSearchTxtField().sendKeys(name);
    }

    @When("User enter a product sku {string} in search text field")
    public void userEnterAProductSkuInSearchTextField(String sku) {
        homePage.getSearchTxtField().sendKeys(sku);
    }

    @And("User click on search button")
    public void userClickOnSearchButton() {
        homePage.getSearchBtn().click();
    }

    @Then("Search result appears with products related to the product name {string}")
    public void searchResultAppearsWithProductsRelatedToTheProductName(String name) {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("search"));
        List<WebElement> products = homePage.getProducts();
        for (WebElement product : products) {
            softAssert.assertTrue(product.getText().toLowerCase().contains(name));
        }
        softAssert.assertAll();
    }

    @Then("Search result appears with products related to the product sku {string}")
    public void searchResultAppearsWithProductsRelatedToTheProductSku(String sku) {
        homePage.getProducts().get(0).click();
        Assert.assertTrue(homePage.getProductSku().getText().contains(sku));
    }
}

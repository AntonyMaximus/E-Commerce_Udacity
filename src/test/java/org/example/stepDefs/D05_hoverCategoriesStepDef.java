package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_homePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D05_hoverCategoriesStepDef {
    P00_homePage homePage = new P00_homePage(Hooks.driver);
    Actions actions = new Actions(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();
    String subCategory;
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));


    @When("User hover to a category and click on one of its sub-categories")
    public void userHoverToACategoryAndClickOnOneOfItsSubCategories() {
        actions.moveToElement(homePage.getComputersLink()).
                moveToElement(homePage.getNotebooksLink()).build().perform();
        wait.until(ExpectedConditions.visibilityOf(homePage.getNotebooksLink()));
        subCategory = homePage.getNotebooksLink().getText().toLowerCase().trim();
        System.out.println(subCategory);
        actions.moveToElement(homePage.getComputersLink()).
                moveToElement(homePage.getNotebooksLink())
                .click().build().perform();
    }

    @Then("User will navigate to a page contains products about that sub-category")
    public void userWillNavigateToAPageContainsProductsAboutThatSubCategory() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("notebooks"));
        softAssert.assertTrue(homePage.getNotebooksBreadCrumb().isDisplayed());
        softAssert.assertEquals(homePage.getPageTitleHeader().getText(), "Notebooks");
        softAssert.assertTrue(homePage.getPageTitleHeader().getText().
                toLowerCase().equals(subCategory));
        softAssert.assertAll();

    }


}

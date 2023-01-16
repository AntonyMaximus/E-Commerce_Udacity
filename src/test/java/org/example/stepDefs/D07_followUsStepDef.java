package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P00_homePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class D07_followUsStepDef {
    P00_homePage homePage = new P00_homePage(Hooks.driver);

    @Given("User at the home page")
    public void userAtHomePage() {
        homePage.getHomePageLink().click();
    }

    @When("User click on facebook icon")
    public void userClickOnFacebookIcon() {
        homePage.getFacebookIcon().click();
    }

    @When("User click on twitter icon")
    public void userClickOnTwitterIcon() {
        homePage.getTwitterIcon().click();
    }

    @When("User click on rss icon")
    public void userClickOnRssIcon() {
        homePage.getRssIcon().click();
    }

    @When("User click on youtube icon")
    public void userClickOnYoutubeIcon() {
        homePage.getYoutubeIcon().click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String url) {
        List<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        try {
            Thread.sleep(3000);
            Hooks.driver.switchTo().window(tabs.get(1));
        } catch (IndexOutOfBoundsException exp) {
            System.out.println("The url : " + Hooks.driver.getCurrentUrl());
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), url);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }
}

package org.example.stepDefs;
import org.example.pages.P03_reset;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class D03_resetStepDef {

    WebDriver driver = Hooks.driver;
    P03_reset reset = new P03_reset(driver);

    @And("user navigate to reset page")
    public void userNavigate() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/passwordrecovery");
        Thread.sleep(3000);
    }

    @When("^the user enter \"(.*)\"$")
    public void emailAccount(String email) {
        reset.resetSteps(email);
    }

    @And("user click on recover button")
    public void recoverButton() throws InterruptedException {
        reset.emailPOM().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("user could reset password successfully")
    public void textMsg() {
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = reset.flashPOM().getText();
        System.out.println("actualResult : " + actualResult);

        // Assert.assertTrue("Notification message: Text is true ", actualResult.contains(expectedResult));
        Assert.assertEquals("Notification message: Text is true ", actualResult.contains(expectedResult), true);
    }
}


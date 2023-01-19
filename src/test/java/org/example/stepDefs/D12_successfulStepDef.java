package org.example.stepDefs;
import org.example.pages.P12_successful;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
public class D12_successfulStepDef {

    WebDriver driver = Hooks.driver;
    P12_successful success= new P12_successful(driver);

    @And("user checkout the terms and click on checkout button")
    public void checkout() throws InterruptedException {
        success.checkPOM().click();
        success.checkoutPOM().click();

        Thread.sleep(3000);
    }
    @And("user enter the data of address and click continue")
    public void AddressSteps() throws InterruptedException {
        success.AddressSteps();
        success.continueButton1POM().click();
        Thread.sleep(3000);
    }
    @And("user check shipping method and click continue")
    public void shippingMethod() throws InterruptedException {
        success.continueButton2POM().click();
        Thread.sleep(3000);
    }
    @And("user check payment method and click continue")
    public void paymentMethod() throws InterruptedException {
        success.continueButton3POM().click();
        Thread.sleep(3000);
    }
    @And("user check payment information and click continue")
    public void paymentInformation() throws InterruptedException {
        success.continueButton4POM().click();
        Thread.sleep(3000);
    }
    @And("user confirm order and click confirm")
    public void confirm_order() throws InterruptedException {
        success.confirmPOM().click();
        Thread.sleep(3000);
    }

}

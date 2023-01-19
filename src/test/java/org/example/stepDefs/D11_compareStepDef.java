package org.example.stepDefs;
import org.example.pages.P11_compare;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
public class D11_compareStepDef {

    WebDriver driver =Hooks.driver;
    P11_compare compare = new P11_compare(driver);

    @And("user add products to compare list")
    public void categoryPOM() throws InterruptedException {
        compare.product1POM().click();
        Thread.sleep(3000);

        compare.product2POM().click();
        Thread.sleep(3000);

        compare.product3POM().click();
        Thread.sleep(3000);

    }
    @And("user go to the compare page")
    public void comparePage() throws InterruptedException {
        compare.comparePagePOM().click();
        Thread.sleep(3000);
    }
}

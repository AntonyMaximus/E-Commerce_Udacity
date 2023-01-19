package org.example.stepDefs;
import org.example.pages.P08_tags;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
public class D08_tagsStepDef {

    WebDriver driver =Hooks.driver;
    P08_tags tag = new P08_tags(driver);


    @And("the user click on random category 'apparel'")
    public void categories()  {
        tag.categoryTypePOM().click();
    }
    @And("select different tags")
    public void categoryPOM() throws InterruptedException {
        tag.tag1POM().click();
        Thread.sleep(1000);
        tag.tag2POM().click();
        Thread.sleep(1000);
        tag.tag3POM().click();
        Thread.sleep(1000);
    }
}

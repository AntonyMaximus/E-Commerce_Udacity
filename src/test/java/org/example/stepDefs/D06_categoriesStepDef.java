package org.example.stepDefs;
import org.example.pages.P06_categories;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class D06_categoriesStepDef {
    WebDriver driver =Hooks.driver;
    P06_categories category = new P06_categories(driver);


    @And("the user click on random category 'electronics'")
    public void categories() throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(category.categoriesPOM()).perform();
        Thread.sleep(2000);

    }
    @And("select sub category if found")
    public void categoryPOM() throws InterruptedException {
        category.subcategoryPOM().click();
        Thread.sleep(2000);
    }
}

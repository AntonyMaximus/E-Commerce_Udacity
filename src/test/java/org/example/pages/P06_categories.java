package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class P06_categories {

    WebDriver driver;
    public P06_categories(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }
    public WebElement categoriesPOM(){
        return driver.findElement ( By.cssSelector("a[href=\"/electronics\"]"));
    }
    public WebElement subcategoryPOM(){
        return driver.findElement(By.cssSelector("a[href=\"/cell-phones\"]"));
    }

}

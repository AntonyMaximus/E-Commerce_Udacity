package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class P07_filter {
    WebDriver driver;
    public P07_filter(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }
    public WebElement categoryTypePOM(){
        return driver.findElement ( By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement subCategoryPOM(){
        return driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
    }
    public WebElement greyColorPOM(){
        return driver.findElement(By.id("attribute-option-14"));
    }
    public WebElement blueColorPOM(){
        return driver.findElement(By.id("attribute-option-16"));
    }
}

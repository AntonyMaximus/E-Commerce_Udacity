package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class P09_shopping {

    WebDriver driver;
    public P09_shopping(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }
    public WebElement categoriesTypePOM(){
        return driver.findElement ( By.cssSelector("a[href=\"/electronics\"]"));
    }
    public WebElement subCategoryPOM(){
        return driver.findElement(By.cssSelector("a[href=\"/cell-phones\"]"));
    }
    public WebElement product1POM(){
        return driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]"));
    }
    public WebElement product2POM(){
        return driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]"));
    }
    public WebElement product3POM(){
        return driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[3]"));
    }
    public WebElement cartPagePOM(){
        return driver.findElement(By.xpath("//p[@class='content']/child::*"));
    }

}

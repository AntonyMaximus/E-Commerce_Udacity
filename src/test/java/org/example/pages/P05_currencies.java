package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P05_currencies {
    WebDriver driver;
    public P05_currencies(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }

    public WebElement currnciesPOM(){
        return driver.findElement(By.id("customerCurrency"));

    }
}

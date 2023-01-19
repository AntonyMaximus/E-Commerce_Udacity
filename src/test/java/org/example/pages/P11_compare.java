package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class P11_compare {
    WebDriver driver;
    public P11_compare(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    public WebElement product1POM(){
        return driver.findElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[2]"));
    }

    public WebElement product2POM(){
        return driver.findElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[1]"));
    }
    public WebElement product3POM(){
        return driver.findElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]"));
    }
    public WebElement comparePagePOM(){
        return driver.findElement(By.xpath("//p[@class='content']/child::*"));
    }


}

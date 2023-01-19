package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class P08_tags {
    WebDriver driver;
    public P08_tags(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }
    public WebElement categoryTypePOM(){
        return driver.findElement ( By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement tag1POM(){
        return driver.findElement(By.cssSelector("a[href=\"/awesome\"]"));
    }
    public WebElement tag2POM(){
        return driver.findElement(By.cssSelector("a[href=\"/cool\"]"));
    }
    public WebElement tag3POM(){
        return driver.findElement(By.cssSelector("a[href=\"/nice\"]"));
    }
}

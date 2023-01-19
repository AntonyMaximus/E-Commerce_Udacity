package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P04_search {
    WebDriver driver;
    public P04_search(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }


    public WebElement searchPOM(){
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement flashPOM(){
        return   driver.findElement(By.className("page-title"));
    }

    public void searchSteps( String product){
        //enter username using POM
        searchPOM().clear();
        searchPOM().sendKeys(product);


    }
}


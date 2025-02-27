package com.kapil.Selenium_Practice.ex_selenium_180724;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class lab126 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        driver = new EdgeDriver(options);

    }

    @Test(groups = "QA")
    @Description("Test case Description")
    public void flipkart (){
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[id=\"gh-ac\"]")).sendKeys("macmini");
        driver.findElement(By.cssSelector("button[id=\"gh-search-btn\"]")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> searchtitles = driver.findElements(By.cssSelector(".s-item__title"));
        List<WebElement> searchTitlesPrices = driver.findElements(By.cssSelector(".s-item__price"));
        for (WebElement title : searchtitles){
            System.out.println(title.getText());
        }

        for (WebElement title : searchTitlesPrices){
            System.out.println(title.getText());
        }

    }
    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}

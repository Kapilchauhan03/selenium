package com.kapil.Selenium_Practice.ex_Selenium_230724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class lab131 {

    // SVG - click on search for flipkart website

    @Test
    public void Flipkart(){

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("Start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.name("q")).sendKeys("macmini");

        // Now click on search- Here we have tag is SVG so we are using the SVG Type

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(0).click();


    }
}

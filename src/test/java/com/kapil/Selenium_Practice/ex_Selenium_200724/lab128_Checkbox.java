package com.kapil.Selenium_Practice.ex_Selenium_200724;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class lab128_Checkbox {

    @Test
    public void verifyJSAlerts () throws InterruptedException {

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("Start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        System.out.println(driver.getTitle());

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        checkboxes.get(0).click();
        checkboxes.get(1).click();

       // driver.quit();
    }
}
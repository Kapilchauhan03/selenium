package com.kapil.Selenium_Practice.ex_Selenium_200724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab127Explicit {

    @Test
    public void appvwo (){

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("start-maximized");

        // Explicit Wait

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://app.vwo.com/#/login");

        driver.findElement(By.id("login-username")).sendKeys("contact+atb7x@thetestingacademy.com");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@1234");
        driver.findElement(By.id("js-login-btn")).click();

       // Wait to dashboard load using explicit wait & verify account name Aman Ji

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-qa='lufexuloga']")));


        WebElement loggedin_username = driver.findElement(By.cssSelector("span[data-qa='lufexuloga']"));
        System.out.println("Logged in user details -> " + loggedin_username.getText());
        Assert.assertEquals(loggedin_username.getText(),"Aman Ji");


    }
}

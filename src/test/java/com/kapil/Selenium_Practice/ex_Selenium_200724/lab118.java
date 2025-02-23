package com.kapil.Selenium_Practice.ex_Selenium_200724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab118 {

    @Test
    public void appVWO (){

       EdgeOptions options = new EdgeOptions();
       options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("start-maximized");

        // Implicit Wait


        WebDriver driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://app.vwo.com/#/login");

        driver.findElement(By.id("login-username")).sendKeys("dsffdfd");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("dhfvdjf");
       // driver.findElement(By.id("login-password")).sendKeys("dsffdfd");

        driver.findElement(By.id("js-login-btn")).click();



    }
}

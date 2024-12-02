package com.kapil.Selenium_Practice.Project_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VwoLogin {

    @Test
    public void VWOlogin (){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");

        WebElement login_Username = driver.findElement(By.id("login-username"));
        login_Username.sendKeys("admin451@gmail.com");

        WebElement login_Password = driver.findElement(By.id("login-password"));
        login_Password.sendKeys("Admin451");

        WebElement Signin_Button = driver.findElement(By.id("js-login-btn"));
        Signin_Button.click();


    }
}

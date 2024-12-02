package com.kapil.Selenium_Practice.Project_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class idrive360_login {

    @Test
    public void idrive () throws InterruptedException {

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get(" https://www.idrive360.com/enterprise/login");

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("augtest_040823@idrive.com");

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("123456");

        Thread.sleep(2000);

        WebElement SignIn = driver.findElement(By.id("frm-btn"));
        SignIn.click();

        Thread.sleep(30000);

        Assert.assertEquals(mes);

        driver.quit();



    }
}

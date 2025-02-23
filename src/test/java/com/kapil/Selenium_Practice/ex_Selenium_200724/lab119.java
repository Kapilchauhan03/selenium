package com.kapil.Selenium_Practice.ex_Selenium_200724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class lab119 {

    //Negative TC's

    @Test
    public void appVWO () throws InterruptedException {

       EdgeOptions options = new EdgeOptions();
       options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("start-maximized");

        // Explicit Wait


        WebDriver driver = new EdgeDriver(options);
        driver.get("https://app.vwo.com/#/login");

        driver.findElement(By.id("login-username")).sendKeys("dsffdfd");
        driver.findElement(By.id("login-password")).sendKeys("dsffdfd");
        driver.findElement(By.id("js-login-btn")).click();

        WebElement errer_msg = driver.findElement(By.id("js-notification-box-msg"));

        // Explicit wait we are applying to read the login id password incorrect error
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.textToBePresentInElement(errer_msg,"Your email, password, IP address or location did not match"));

        Assert.assertEquals(errer_msg.getText(),"Your email, password, IP address or location did not match");

        Thread.sleep(3000);

        driver.quit();

    }
}

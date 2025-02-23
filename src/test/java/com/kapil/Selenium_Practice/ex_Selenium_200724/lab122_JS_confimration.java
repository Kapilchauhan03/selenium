package com.kapil.Selenium_Practice.ex_Selenium_200724;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab122_JS_confimration {

    @Test
    public void verifyJSAlerts () throws InterruptedException {

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("Start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());

        // button[text()='Click on JS Alert']
        //WebElement element = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        WebElement element = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        //alert.accept();
        alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result,"You clicked: Ok");
        Assert.assertEquals(result,"You clicked: Cancel");


        Thread.sleep(6000);

        driver.quit();
    }
}

package com.kapil.Selenium_Practice.ex_Selenium_200724;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab135 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        options.addArguments("start-maximized");
        driver = new EdgeDriver(options);
    }

    @Test (groups = "QA")
    @Description("Yo")
    public void testDashboardlogin (){

        driver.get("https://app.vwo.com/#/login");
       System.out.println(driver.getTitle());
       driver.manage().window().maximize();

       driver.findElement(By.xpath("//input[@data-qa=\"hocewoqisi\"]")).sendKeys("contact+atb7x@thetestingacademy.com");
       driver.findElement(By.xpath("//input[@data-qa=\"jobodapuxe\"]")).sendKeys("Wingify@1234");
       driver.findElement(By.id("js-login-btn")).click();

       // Explicit Wait we are applying here to verify the dashboard Name

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-qa=\"lufexuloga\"]")));

        WebElement loggedin_username = driver.findElement(By.cssSelector("[data-qa=\"lufexuloga\"]"));
        System.out.println("Logged in user details -> " + loggedin_username.getText());
        Assert.assertEquals(loggedin_username.getText(),"Aman Ji");

    }

    @AfterTest
    public void closeBrowser (){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}

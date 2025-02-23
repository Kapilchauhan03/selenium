package com.kapil.Selenium_Practice.ex_Selenium_130724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

import java.util.List;

public class lab113 {

    public static void main(String[] args) throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();

         edgeOptions.addArguments("start-maximized");
        //edgeOptions.addArguments("window-size=800,600");
        //edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        // edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
       edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
       // driver.manage().window().maximize(); will maximize the window
       // driver.manage().window().minimize(); will minimize the window
        System.out.println(driver.getTitle());

        driver.findElement(By.id("login-username")).sendKeys("kapil@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("qwqwqwq");
        driver.findElement(By.id("js-login-btn")).click();


        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
       // Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        // Now click on Hyper link using link text ( only using for Hyperlink )

        driver.findElement(By.linkText("Start a free trial")).click();
        driver.findElement(By.id("page-v1-step1-email")).sendKeys("KKKKKK@gmail.com");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();



        Thread.sleep(5000);
        driver.quit();
    }
}

package com.kapil.Selenium_Practice.SHADOwDOM1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class lab138 {
    @Test
    public void shadowDom () throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        // Now we have to add name of Pizza
        // but here this is a Shadow dom so we have to find java script using java executor

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement divscrollTo = driver.findElement(By.xpath("//div[@id=\"userName\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);",divscrollTo);

        Thread.sleep(3000);

        // clicking on learning hub
        WebElement clicklearninghub = (WebElement) js.executeScript("document.querySelector(\"div#userName\").shadowRoot.querySelector(\"a\")");
        clicklearninghub.click();
        
//        WebElement inputboxpizza = ( WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div\").shadowRoot.querySelector(\"input#pizza\")");
//        inputboxpizza.sendKeys("farmhouse");

       Thread.sleep(5000);

        driver.quit();


    }

}

package com.kapil.Selenium_Practice.SHADOwDOM1;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class lab140aClick_Right_CLICK {

    @Test
    public void capscharacterenter () throws InterruptedException  {

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);


       WebElement link = driver.findElement(By.xpath("//a[contains(text(),\"Click here to Download File\")]"));
       actions.contextClick(link).build().perform();

       Thread.sleep(5000);

       driver.quit();






    }
}

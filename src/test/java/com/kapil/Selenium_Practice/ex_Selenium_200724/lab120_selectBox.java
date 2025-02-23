package com.kapil.Selenium_Practice.ex_Selenium_200724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class lab120_selectBox {

    @Test
    public void verifyselectBox () throws InterruptedException {

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("Start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());

        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
        //select.selectByIndex(1);
        //select.selectByIndex(2);

        select.selectByVisibleText("Option 1");

        Thread.sleep(6000);

        driver.quit();
    }
}

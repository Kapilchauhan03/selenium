package com.kapil.Selenium_Practice.ex_selenium_180724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.List;

public class lab125 {

    public static void main(String[] args) throws InterruptedException {


            EdgeOptions options = new EdgeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("start-maximized");

            WebDriver driver = new EdgeDriver(options);
            driver.navigate().to("https://www.tataplaybinge.com/");

            Thread.sleep(5000);

            driver.findElement(By.xpath("//p[@class='not-click']")).click();

            driver.findElement(By.xpath("//button[@class=\"logged_out_button\"]")).click();

             Thread.sleep(5000);
            driver.quit();
        }
    }

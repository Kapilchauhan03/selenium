package com.kapil.Selenium_Practice.ex_Selenium_130724;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class lab113 {

    public static void main(String[] args) {

        EdgeOptions edgeOptions = new EdgeOptions();

        // edgeOptions.addArguments("start-maximized");
        edgeOptions.addArguments("window-size=800,600");
        //edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        // edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
       edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
       // driver.manage().window().maximize(); will maximize the window
       // driver.manage().window().minimize(); will minimize the window
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

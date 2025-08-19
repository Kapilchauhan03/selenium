package com.kapil.Selenium_Practice.ex_Selenium_110724;

import org.openqa.selenium.edge.EdgeDriver;

public class lab118 {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        // driver.get("https://tataplaybinge.com");
        driver.navigate().to("https://tataplaybinge.com");
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

        Thread.sleep(5000);

        driver.close();
    }
}

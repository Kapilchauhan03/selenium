package com.kapil.Selenium_Practice.ex_Selenium_110724;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab111 {

    @Test
    public void vwologin(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        //Thread.sleep(5000);

        // driver.close();
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();



    }
}

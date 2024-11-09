package com.kapil.Selenium_Practice.ex_Selenium_110724;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class lab110 {

    @Test
    public void vwologin() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        Thread.sleep(5000);

       // driver.close();
        driver.quit();



    }
}

package com.kapil.Selenium_Practice.ex_Selenium_130724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.text.html.Option;

public class lab114 {

    @Test
    public void BingeLogin(){


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new EdgeDriver();
        driver.get("https://tataplaybinge.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login- Binge");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.tataplaybinge.com/");

        WebElement login_RMN = driver.findElement(By.name("rmn"));
        login_RMN.sendKeys("8983479374");

    }
}

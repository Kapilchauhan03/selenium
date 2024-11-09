package com.kapil.Selenium_Practice.ex_selenium_160724;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class lab117 {

    @Test
    public void CURAHelathcare(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        // With this Xpath we have find two option using Xpath so we are using here Indexing

        List<WebElement> username_element = driver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        username_element.get(1).sendKeys("John Doe");

        // This is using by id
        //WebElement password = driver.findElement(By.id("txt-password"));
        //password.sendKeys("12345");

        // Here we are using Xpath, there is indexing we have use because of two option are showing
        List<WebElement> password_Username = driver.findElements(By.xpath("//input[@placeholder =\"Password\"]"));
        password_Username.get(1).sendKeys("123456");

        // Click on Login  using Xpath 

        WebElement login_button = driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]"));
        login_button.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
`
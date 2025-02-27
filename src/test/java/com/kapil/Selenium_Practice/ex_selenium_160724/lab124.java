package com.kapil.Selenium_Practice.ex_selenium_160724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class lab124 {

    @Test
    public void Curhealthcare (){

        ChromeOptions Coptions = new ChromeOptions();
        Coptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        Coptions.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(Coptions);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.partialLinkText("Make")).click();

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Kapil Singh");

        List<WebElement> password_element = driver.findElements(By.xpath("//input[@placeholder=\"Password\"]"));
        password_element.get(1).sendKeys("Kaps@311996@#!!");

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        driver.quit();






    }
}

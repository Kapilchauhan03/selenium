package com.kapil.Selenium_Practice.Project_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Herokuapp {

    @Test
    public void Herokuapp () throws InterruptedException {

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement AppointmentButton = driver.findElement(By.id("btn-make-appointment"));
        AppointmentButton.click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        Thread.sleep(3000);

        WebElement USerName = driver.findElement(By.name("username"));
        USerName.sendKeys("John Doe");

        WebElement Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement LoginButton = driver.findElement(By.id("btn-login"));
        LoginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(3000);

        WebElement VisitDate = driver.findElement(By.id("txt_visit_date"));
        VisitDate.sendKeys("03/12/2024");

        WebElement BookAppointment = driver.findElement(By.id("btn-book-appointment"));
        BookAppointment.click();

        Thread.sleep(5000);

        driver.quit();


    }
}

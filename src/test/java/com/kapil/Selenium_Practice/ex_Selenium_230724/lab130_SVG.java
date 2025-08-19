package com.kapil.Selenium_Practice.ex_Selenium_230724;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class lab130_SVG {

    @Test
    public void SVG (){

        // SVG for INDIA MAP

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("Start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        System.out.println(driver.getTitle());

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement state : states){
            System.out.println(state.getDomAttribute("aria-label"));
            if (state.getDomAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }
    }
}

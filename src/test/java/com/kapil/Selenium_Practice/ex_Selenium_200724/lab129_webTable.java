package com.kapil.Selenium_Practice.ex_Selenium_200724;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
public class lab129_webTable {

    EdgeDriver driver;

    // Static Web table

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void positive (){
        driver.manage().window().maximize();
        driver.navigate().to("https://awesomeqa.com/webtable.html");

        // Print all the data in the table. - P1
        // Halen belong to which country  - P2

        // Row  - //table[@id="customers"]/tbody/tr
        // Col - //table[@id="customers"]/tbody/tr[2]/td

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        //table[@id="customers"]/tbody/tr[i]/td[j]
        // i = 1 to 7
        // j = 1 to 3

        //  // xpath ->  //table[@id="customers"]/tbody/tr[5]/td[2]

        // xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        for ( int i=2; i<= row; i++){
            for ( int j=1; j<=col; j++){
                String dynamic_xPath = first_part+i+second_part+j+third_part;
                String data = driver.findElement(By.xpath(dynamic_xPath)).getText();
                //System.out.println(data);
                if ( data.contains("Helen Bennett")){
                    String country_path = dynamic_xPath+"/following-sibling::td";
                    String country_company = dynamic_xPath+"/preceding-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    String company_text = driver.findElement(By.xpath(country_company)).getText();
                    System.out.println("Helen Bennett is in " + country_text);
                    System.out.println("Helen Bennett is company " + company_text);
                }
            }
        }

    }

}


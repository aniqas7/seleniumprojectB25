package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver= new ChromeDriver();


        //2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");


       // 3. Verify title:
        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

       //actual title from website
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("verification passed");
        }else{
            System.out.println("verification failed");
        }
    }
    /*
    TC #1: Yahoo Title Verification
1.Open Chrome browser
2.Go to https://www.yahoo.com
3.Verify title:
Expected: Yahoo
     */
}

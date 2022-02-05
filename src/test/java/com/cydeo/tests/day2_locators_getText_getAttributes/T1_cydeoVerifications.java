package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_cydeoVerifications {
    public static void main(String[] args) {
        //TC#1: Cydeo practice tool verifications

        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup(); //setup browser
        WebDriver driver= new ChromeDriver();  //open browser

        //2. maximize page
        driver.manage().window().maximize();

        //3.go to https://practice.cydeo.com

        driver.navigate().to("https://practice.cydeo.com");

        //Expected: cydeo
        String expectedURL="cydeo";
        String actualURL=driver.getCurrentUrl();

        //verify URL
        if(actualURL.contains(expectedURL)){
            System.out.println("verification passed");
        }else {
            System.out.println("verification failed");
        }
        //verify title
        String expectedTitle= "Practice";
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("verificaton passed");
        }else{
            System.out.println("verification failed");
        }
        driver.close();

    }
}

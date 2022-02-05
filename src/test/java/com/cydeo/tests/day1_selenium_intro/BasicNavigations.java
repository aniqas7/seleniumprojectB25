package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-set up the browser driver
        WebDriverManager.chromedriver().setup();
        //2-create instance of the selenium web driver
        //this opens empty browser
        WebDriver driver= new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();
        //3-go to https:// www.tesla.com
        driver.get("https://www.tesla.com");

        // get the title
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get current URL

        String currentURL=driver.getCurrentUrl();
        System.out.println(currentURL);

        //4-stop code execution for 3 seconds
        Thread.sleep(3000);
        //5-use selenium to navigate back
        driver.navigate().back();

        //6--stop code execution for 3 seconds
        Thread.sleep(3000);

        //9-use selenium to navigate forward
        driver.navigate().forward();

        //10--stop code execution for 3 seconds
        Thread.sleep(3000);

        //11-use selenium to navigate refresh
        driver.navigate().refresh();

        //12--stop code execution for 3 seconds
        Thread.sleep(3000);


        //13--use navigate().to():
        driver.navigate().to("https://www.google.com");

        //14--get the title of the page
      //  System.out.println("driver.getTitle() = " + driver.getTitle());
        //print it otherwise else it would get the title but not store it

         //String currentTitle= driver.getTitle();
        //reassigning it "current title"
        currentTitle=driver.getTitle();//it will check the title again and return the value
        System.out.println("currentTitle= "+currentTitle);

        //15--get the current URL
         currentURL= driver.getCurrentUrl();
        System.out.println(currentURL);

        //this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();
    }
}

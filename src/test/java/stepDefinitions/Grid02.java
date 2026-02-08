package stepDefinitions;

import manage.GridDriverManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Grid02 {

    GridDriverManage manage = new GridDriverManage();
    WebDriver driver;

    @Test
    void chromeTest(){

        driver = manage.setUpChromeDriver();
        driver.get("https://www.babayigit.net");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }


    @Test
    void firefoxTest(){

        driver = manage.setUpFirefoxDriver();
        driver.get("https://www.kirikkalem.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }


    @Test
    void edgeTest(){

        driver = manage.setUpEdgeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }


}

package com.ait.qa31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * Создайте, пожалуйста, новый тестовый класс и найти 10 элементов на странице.
 * Для этого следует создать два тестовых метода: один будет искать элементы по cssSelector,
 * а второй те же самые элементы, но по xPath.
 */

public class FindElementTestHW_3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Test
    public void find_10_ElementsByCssSelectorTest(){
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#ui-id-1"));
        driver.findElement(By.cssSelector("#topcartlink"));


        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".master-wrapper-main"));
        driver.findElement(By.cssSelector(".ico-register"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector(".nivo-caption"));
    }


    @Test
    public void find_10_ElementByXpath(){

        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//div[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//div[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//ul[@id='ui-id-1']"));
        driver.findElement(By.xpath("//li[@id='topcartlink']"));


        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-main']"));
        driver.findElement(By.xpath("//*[@class='ico-register']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@class='nivo-caption']"));


    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

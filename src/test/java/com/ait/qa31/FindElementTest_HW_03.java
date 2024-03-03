package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Создайте, пожалуйста, новый тестовый класс и найти 10 элементов на странице.
 * Для этого следует создать два тестовых метода: один будет искать элементы по cssSelector,
 * а второй те же самые элементы, но по xPath.
 */

public class FindElementTest_HW_03 extends TestBase  {


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


}

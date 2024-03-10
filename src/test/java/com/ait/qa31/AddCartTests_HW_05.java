package com.ait.qa31;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**HW_05
 * Добавьте, пожалуйста, в проект по тестированию сайта класс для проверки функции добавления товара в
 * корзину(выбрать товар на главной странице, добавить, зайти в корзину и убедиться, что он добавлен).
 * *Создайте, пожалуйста, предусловие(Log in)
 */

public class AddCartTests_HW_05 extends TestBase{

    @Test
    public void loginPositiveTest() {
        driver.findElement(By.cssSelector(".ico-login")).click();

        driver.findElement(By.cssSelector(".email")).click();
        driver.findElement(By.cssSelector(".email")).clear();
        driver.findElement(By.cssSelector(".email")).sendKeys("tat3@gmail.com");

        driver.findElement(By.cssSelector(".password")).click();
        driver.findElement(By.cssSelector(".password")).clear();
        driver.findElement(By.cssSelector(".password")).sendKeys("77qazWsx$");

        driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();

    }

    @Test
    public void cartPositiveTest() {
        loginPositiveTest();
        driver.findElement(By.xpath("//*[@href='/141-inch-laptop']")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-button-31']")).click();
        driver.findElement(By.xpath("//*[text()='shopping cart']")).click();

        Assert.assertTrue(isElementPresent(By.cssSelector(".product-name")));
    }

}

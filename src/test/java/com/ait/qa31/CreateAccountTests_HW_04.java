package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests_HW_04 extends TestBase {

    /**
     * В проекте FirstSeleniumProject создайте, пожалуйста, родительский класс TestBase
     * и его наследник CreateAccountTests с позитивным методом регистрации на сайте
     */

    @Test
    public void createNewAccountPositiveTest() {
        driver.findElement(By.cssSelector(".ico-register")).click();
        driver.findElement(By.xpath("//label[.='Female']")).click();

        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Taha");

        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("IL");

        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("tt@gmail.com");

        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("77qazWsx$");

        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("77qazWsx$");

        driver.findElement(By.xpath("//*[@class='button-1 register-next-step-button']")).click();

        Assert.assertTrue(isElementPresent(By.xpath("//*[text()='tt@gmail.com']")));
//

    }
}

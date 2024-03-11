package com.ait.qa31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CreateAccountTests_HW_04 extends TestBase {

    /**
     * В проекте FirstSeleniumProject создайте, пожалуйста, родительский класс TestBase
     * и его наследник CreateAccountTests с позитивным методом регистрации на сайте
     */

    // @Test
    public void createNewAccountPositiveTest() {
        openRegistrationForm();
        fillNewAccountForm("Taha","IL","tat3@gmail.com",
                "77qazWsx$");
        saveNewAccount();
        Assert.assertTrue(isElementPresent(By.xpath("//*[text()='tat3@gmail.com']")));


    }

    private void saveNewAccount() {
        getElement(By.cssSelector("[name='register-button']")).click();
    }

    private void fillNewAccountForm(String firstname, String lastname,
                                    String email, String password) {
        getElement(By.xpath("//label[.='Female']")).click();
        fillInputField("FirstName", firstname);
        fillInputField("LastName",lastname );
        fillInputField("Email", email );
        fillInputField("Password",password );
        fillInputField("ConfirmPassword", password);

    }

    private void fillInputField(String FirstName, String Taha) {
        getElement(By.name(FirstName)).click();
        getElement(By.name(FirstName)).clear();
        getElement(By.name(FirstName)).sendKeys(Taha);
    }

    private void openRegistrationForm() {
        getElement(By.cssSelector(".ico-register")).click();
    }

    private WebElement getElement(By by) {
        return driver.findElement(by);
    }
}

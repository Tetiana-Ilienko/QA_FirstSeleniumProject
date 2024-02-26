package com.ait.qa31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver; // объявляем самый главный класс из библиотеки Силениуь

    // before - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();// вебдрайвет находит в исходной папке
        //нужный файл и запускает хром с требуемой страницей
        driver.get("https://www.google.com");
       // driver.navigate().to("https://www.google.com") // метод запускает браузер с историей

        // driver.navigate().back(); // отправляет браузер на одну страницу назад в его истории браузера.
        // Это эквивалентно нажатию кнопки "Назад" в браузере.

        //driver.navigate().forward(); //  отправляет браузер на одну страницу вперед в истории браузера.

        //driver.navigate().refresh(); //обновление текущей страницы в браузере с использованием объекта WebDriver

    }

    //test
    @Test
    public void openGoogleTest(){
        System.out.println("Google opened!");
    }

    //after - tearDown
    @AfterMethod(enabled = false) // аннотация позволяет временно отключить выполнение этого метода
    // без необходимости его удаления из кода
    public void tearDown(){
        driver.quit();// закрывае все вкладки
        //driver.close(); // метод закрывает только текущую вкладку
    }


}

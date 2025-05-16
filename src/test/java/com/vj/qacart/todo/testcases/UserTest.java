package com.vj.qacart.todo.testcases;

import com.github.javafaker.Faker;
import com.vj.qacart.todo.base.BaseTest;
import com.vj.qacart.todo.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserTest extends BaseTest {

    @Test
    public void shouldBeAbleToRegister() {

        Faker faker = new Faker();
        String firsName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();

        driver.get("https://todo.qacart.com/signup");
        driver.findElement(By.cssSelector("[data-testid='first-name']")).sendKeys(firsName);
        driver.findElement(By.cssSelector("[data-testid='last-name']")).sendKeys(lastName);
        driver.findElement(By.cssSelector("[data-testid='email']")).sendKeys(email);
        driver.findElement(By.cssSelector("[data-testid='password']")).sendKeys("Simple1!");
        driver.findElement(By.cssSelector("[data-testid='confirm-password']")).sendKeys("Simple1!");
        driver.findElement(By.cssSelector("[data-testid='submit']")).click();
        boolean isWelcomeHeaderDisplayed = driver.findElement(By.cssSelector("[data-testid='welcome']")).isDisplayed();
        Assert.assertTrue(isWelcomeHeaderDisplayed);
    }
}

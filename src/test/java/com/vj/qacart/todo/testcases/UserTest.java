package com.vj.qacart.todo.testcases;

import com.vj.qacart.todo.base.BaseTest;
import com.vj.qacart.todo.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    @Test
    public void shouldBeAbleToRegister() {
        User user = new User();
        driver.get("https://todo.qacart.com/signup");
        driver.findElement(By.cssSelector("[data-testid='first-name']")).sendKeys(user.getFirstName());
        driver.findElement(By.cssSelector("[data-testid='last-name']")).sendKeys(user.getLastName());
        driver.findElement(By.cssSelector("[data-testid='email']")).sendKeys(user.getEmail());
        driver.findElement(By.cssSelector("[data-testid='password']")).sendKeys("Simple1!");
        driver.findElement(By.cssSelector("[data-testid='confirm-password']")).sendKeys("Simple1!");
        driver.findElement(By.cssSelector("[data-testid='submit']")).click();
        boolean isWelcomeHeaderDisplayed = driver.findElement(By.cssSelector("[data-testid='welcome']")).isDisplayed();
        Assert.assertTrue(isWelcomeHeaderDisplayed);
    }
}

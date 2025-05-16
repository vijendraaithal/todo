package com.vj.qacart.todo.testcases;

import com.vj.qacart.todo.base.BaseTest;
import com.vj.qacart.todo.models.User;
import com.vj.qacart.todo.pages.RegisterPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    @Test
    public void shouldBeAbleToRegister() {
        User user = new User();
        driver.get("https://todo.qacart.com/signup");
        new RegisterPage().register(driver, user);
        boolean isWelcomeHeaderDisplayed = driver.findElement(By.cssSelector("[data-testid='welcome']")).isDisplayed();
        Assert.assertTrue(isWelcomeHeaderDisplayed);
    }
}

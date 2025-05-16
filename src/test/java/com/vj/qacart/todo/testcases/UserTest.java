package com.vj.qacart.todo.testcases;

import com.vj.qacart.todo.base.BaseTest;
import com.vj.qacart.todo.models.User;
import com.vj.qacart.todo.pages.NewTodoPage;
import com.vj.qacart.todo.pages.RegisterPage;
import com.vj.qacart.todo.pages.TodoPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    @Test
    public void shouldBeAbleToRegister() {
        User user = new User();
        RegisterPage.getInstance().load(driver);
        RegisterPage.getInstance().register(driver, user);
        boolean isWelcomeHeaderDisplayed = TodoPage.getInstance().isWelcomeHeaderDisplayed(driver);
        Assert.assertTrue(isWelcomeHeaderDisplayed);
    }
}

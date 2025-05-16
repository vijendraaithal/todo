package com.vj.qacart.todo.testcases;

import com.vj.qacart.todo.base.BaseTest;
import com.vj.qacart.todo.models.User;
import com.vj.qacart.todo.pages.NewTodoPage;
import com.vj.qacart.todo.pages.RegisterPage;
import com.vj.qacart.todo.pages.TodoPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddATodo() {
        User user = new User();
        driver.get("https://todo.qacart.com/signup");
        new RegisterPage().register(driver, user);
        new TodoPage().clickPlusIcon(driver);
        new NewTodoPage().clickNewTodoInp(driver);
        new NewTodoPage().clickSubmitBtn(driver);
        String actualTodo = new TodoPage().getAddedTodoText(driver);
        Assert.assertEquals(actualTodo, "Learn Selenium");
    }

    @Test
    public void shouldBeAbleToDeleteAddedTodo() {
        User user = new User();
        driver.get("https://todo.qacart.com/signup");
        new RegisterPage().register(driver, user);
        new TodoPage().clickPlusIcon(driver);
        new NewTodoPage().clickNewTodoInp(driver);
        new NewTodoPage().clickSubmitBtn(driver);
        new TodoPage().deleteTodoItem(driver);
        boolean isNoAvailableTodosDisplayed = new TodoPage().isNoAvailableTodosTextDisplayed(driver);
        Assert.assertTrue(isNoAvailableTodosDisplayed);
    }
}

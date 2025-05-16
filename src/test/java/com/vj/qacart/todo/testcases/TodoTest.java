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
        RegisterPage.getInstance().load(driver);
        RegisterPage.getInstance().register(driver, user);
        TodoPage.getInstance().clickPlusIcon(driver);
        NewTodoPage.getInstance().clickNewTodoInp(driver, "Learn Selenium");
        NewTodoPage.getInstance().clickSubmitBtn(driver);
        String actualTodo = TodoPage.getInstance().getAddedTodoText(driver);
        Assert.assertEquals(actualTodo, "Learn Selenium");
    }

    @Test
    public void shouldBeAbleToDeleteAddedTodo() {
        User user = new User();
        RegisterPage.getInstance().load(driver);
        RegisterPage.getInstance().register(driver, user);
        TodoPage.getInstance().clickPlusIcon(driver);
        NewTodoPage.getInstance().clickNewTodoInp(driver, "Lear Selenium");
        NewTodoPage.getInstance().clickSubmitBtn(driver);
        TodoPage.getInstance().deleteTodoItem(driver);
        boolean isNoAvailableTodosDisplayed = TodoPage.getInstance().isNoAvailableTodosTextDisplayed(driver);
        Assert.assertTrue(isNoAvailableTodosDisplayed);
    }
}

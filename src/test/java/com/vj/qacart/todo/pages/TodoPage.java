package com.vj.qacart.todo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage {

    private static TodoPage todoPage;
    // Elements
    private final By msgWelcome = By.cssSelector("[data-testid='welcome']");
    private final By icnPlus = By.cssSelector("[data-testid='add']");
    private final By txtAddedTodo = By.cssSelector("[data-testid='todo-text']");
    private final By icnDelete = By.xpath("(//button[@aria-label='delete'])[2]");
    private final By msgNoTodos = By.cssSelector("[data-testid='no-todos']");


    // Constructor
    private TodoPage() {}

    public static TodoPage getInstance() {
        if (todoPage == null) {
            todoPage = new TodoPage();
        }
        return todoPage;
    }

    // Methods
    public boolean isWelcomeHeaderDisplayed(WebDriver driver) {
        return driver.findElement(msgWelcome).isDisplayed();
    }

    public void clickPlusIcon(WebDriver driver) {
        driver.findElement(icnPlus).click();
    }

    public String getAddedTodoText(WebDriver driver) {
        return driver.findElement(txtAddedTodo).getText();
    }


    public void deleteTodoItem(WebDriver driver) {
        driver.findElement(icnDelete).click();
    }

    public boolean isNoAvailableTodosTextDisplayed(WebDriver driver) {
        return driver.findElement(msgNoTodos).isDisplayed();
    }
}

package com.vj.qacart.todo.pages;

import org.openqa.selenium.By;

public class TodoPage {
    // Elements
    private final By msgWelcome = By.cssSelector("[data-testid='welcome']");
    private final By icnPlus = By.cssSelector("[data-testid='add']");
    private final By addedTodo = By.cssSelector("[data-testid='todo-text']");
    private final By icnDelete = By.xpath("(//button[@aria-label='delete'])[2]");
    private final By msgNoTodos = By.cssSelector("[data-testid='no-todos']");
}

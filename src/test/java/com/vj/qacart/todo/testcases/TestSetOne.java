package com.vj.qacart.todo.testcases;

import org.testng.annotations.Test;

public class TestSetOne {

    @Test(priority = 1)
    public void testCaseOne() {
        System.out.println("TC 1");
    }

    @Test(priority = 2)
    public void testCaseTwo() {
        System.out.println("TC 2");
    }
}

package com.junitlessontest;

import org.junit.jupiter.api.*;

public class Junit5Base
{
    //No Parameter Type
    //No return type

    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("Before All Working.");
    }
    @BeforeEach
    public void beforeEach()
    {
        //Driver
        System.out.println("Before Each Working.");
    }

    @Test
    public void test1()
    {
        System.out.println("Test 1 Working.");
    }

    @Test
    public void test2()
    {
        System.out.println("Test 2 Working.");
    }

    @AfterEach
    public void afterEach()
    {
        System.out.println("After Each Working.");
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println("After All Working.");
    }
}

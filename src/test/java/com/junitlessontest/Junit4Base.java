package com.junitlessontest;

import org.junit.*;

public class Junit4Base
{
    @BeforeClass
    public static void beforeClass()
    {
        //Tüm testlerden önce yapılacak işler.
        //Rapor işleri
        //1 kez çalışır
        System.out.println("Before Class working.");
    }

    @Before
    public void before()
    {
        //Her testten önce çalışacak işler
        //Driver
        System.out.println("Before Working.");
    }

    @Test
    public void test()
    {
        System.out.println("Test 1 Working.");
    }

    @Test
    public void test2()
    {
        System.out.println("Test 2 Working.");
    }

    @After
    public void after()
    {
        System.out.println("After Working.");
    }

    @AfterClass
    public static void afterClass()
    {
        //Tüm testlerden sonra çalışacak işler.
        System.out.println("After Class Working.");
    }
}

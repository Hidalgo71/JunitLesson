package com.junitlessontest;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Junit5Assertion extends Junit5Base
{
    @Test
    public void assertEqualsTest()
    {
        String str1 = "Test1";
        assertEquals("Test1", "Test1", "Testler Farklı.");
        assertEquals("Test1", str1);

        System.out.println("JU 5 Test 1 Working.");
    }

    @Test
    public void assertTrueTest()
    {
        int x = 0, y = 10;
        String str2 = "yeknes";
        Assertions.assertTrue( x!=10);
        Assertions.assertTrue(str2.contains("yek"));

    }

    @Test
    public void notEqualsTest()
    {
        //Not Equal Test
        assertNotEquals("Test1", "Test2", "Values not equal");
    }
}

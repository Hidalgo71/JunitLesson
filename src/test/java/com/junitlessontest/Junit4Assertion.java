package com.junitlessontest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit4Assertion extends Junit4Base
{
    private int getArg1()
    {
        return 71;
    }

    private int getSum1(int x, int y)
    {
        return 0;
    }

    @Test
    public void AEExcTest()
    {

    }
    @Test
    public void testAE()
    {
        int arg1 = getArg1();
        assertEquals(71, arg1);
    }

    @Test
    public void assertEqualsTest()
    {
        //SOFT ASSERT: Hata olsa bile sonraki testleri koşar.
        //HARD ASSERT: Hata aldığında koşuyu durdurur.

        System.out.println("JU 4 Test 1 Working.");
        assertEquals("Test1", "Test1", "Testler farklı.");
        int int1 = Integer.parseInt("2");
        String str1 = String.valueOf(int1);
    }
}

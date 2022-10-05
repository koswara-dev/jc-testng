package com.juaracoding.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(10, 5);
        int expect = 15;
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int actual = calculator.substract(10, 5);
        int expect = 5;
        Assert.assertEquals(actual, expect);
    }

    // Jenis result testing yang passes
    @Test
    public void testAssertTrue(){
//        boolean angka = 16>16;
//        Assert.assertTrue(angka);
        String actual = "Data berhasil disimpan";
        String expect = "Data berhasil disimpan";
        // Validasi
        Assert.assertTrue(actual.equals(expect));
    }



}

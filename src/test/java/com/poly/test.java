package com.poly;

import org.junit.jupiter.api.*;

public class test {
    @BeforeAll
    static void  initAll(){
        System.out.println("@BeforeAll-Run before all methods once");
    }
    @BeforeEach
    void init(){
        System.out.println("@BeforeEach - Run before each test methods");
    }
    @DisplayName("First test")
    @Test
    void testMethod1(){
        System.out.println(" Test methods 1");

    }
    @Test
    @Disabled
    void testMethods2(){
        System.out.println(" Test methods 2");
    }
    @Test
    void testMethods3(){
        System.out.println(" Test methods 3");
    }
    @AfterEach
    void tearDown(){
        System.out.println("@AfterEach- Run after each test methods");
    }
    @AfterAll
     static void tearDownAll(){
        System.out.println("@AfterAll -Run after all test method once");
    }
}

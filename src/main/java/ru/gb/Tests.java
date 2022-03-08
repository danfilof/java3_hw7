package ru.gb;

public class Tests {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }


    @Test (10)
    public void test1(){
        System.out.println("Test 1");
    }

    @Test (1)
    public void test4(){
        System.out.println("Test 4");
    }

    @Test (9)
    public void test3(){
        System.out.println("Test 3");
    }

    @Test (2)
    @AfterSuite
    public void test2(){
        System.out.println("Test 2");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }


}

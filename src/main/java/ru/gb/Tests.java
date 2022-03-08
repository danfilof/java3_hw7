package ru.gb;

public class Tests {

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @Test (10)
    public void test1(){
        System.out.println("Test 4");
    }


}

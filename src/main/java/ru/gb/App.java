package ru.gb;

import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) {
        start(Tests.class);
    }

    private static void start(Class object) {
        Method[] methods = object.getDeclaredMethods();

        try {
            int counter = 0;
            for (Method m : methods) {
                if (m.getAnnotation(BeforeSuite.class) != null) {
                    if (counter > 1) {
                        throw new RuntimeException();
                    }
                    counter++;
                    System.out.println(m);
                }
            }

            int counter01 = 0;
            for (Method m : methods) {
                if (m.getAnnotation(AfterSuite.class) != null) {
                    if (counter01 > 1) {
                        throw new RuntimeException();
                    }
                    counter01++;
                    System.out.println(m);
                }
            }

            for (int i = 0; i <= 10; i++) {
                for (Method m : methods) {
                    if (m.getAnnotation(Test.class) != null) {
                        Test test = m.getAnnotation(Test.class);

                        if (test.value() == i) {
                            System.out.println("Test value " + test.value() + " || " + m);
                        }
                    }
                }
            }

        } catch (Exception e) {

        }
    }
}

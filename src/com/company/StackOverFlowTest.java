package com.company;

public class StackOverFlowTest {
    static int count;

    private static void test(){
        count++;
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        }
        catch (StackOverflowError e){
            System.out.println("Случилась ошибка, зови админа");
        }
    }
}

package com.company;

public class ArrayExceptionTest {


    public static void main(String[] args) {
        String[] array = new String[6];

        printArray(array, 0,5);
        printArray(array,4,8);
        printArray(array,3,9);




    }

    static void printArray(String[]a, int Start, int End) {
        try {

            for (int i = Start; i< End; i++) {
                System.out.println(a[i]);

            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = i; размер массива = s;");
        }

    }
}


package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.System.arraycopy;

public class Main {

    static final int SIZE = 100000;


    public static void main(String[] args) {

        Random random = new Random();
        MyArrayList<Integer> mal1 = new MyArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            mal1.add(random.nextInt(20000));
        }
        long a = System.currentTimeMillis();
        mal1.selectionSort();
        System.out.println(("selectionSort выполнялся " + (System.currentTimeMillis() - a)/1000%60) + " сек.");

        MyArrayList<Integer> mal2 = new MyArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            mal2.add(random.nextInt(20000));
        }
        a = System.currentTimeMillis();
        mal2.insertionSort();
        System.out.println(("insertionSort выполнялся " + (System.currentTimeMillis() - a)/1000%60) + " сек.");

        MyArrayList<Integer> mal3 = new MyArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            mal3.add(random.nextInt(20000));
        }
        a = System.currentTimeMillis();
        mal3.bubbleSort();
        System.out.println(("bubbleSort выполнялся " + (System.currentTimeMillis() - a)/1000%60) + " сек.");

    }
}

package main;

import java.util.Arrays;

import static classes.BubbleSortController.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] list = {7,5,1,8,3};

        bubbleSort(list);

        System.out.println(Arrays.toString(list));

        int[] list2 = {55, 2, 6, 2, 10, 11, 9};

        bubbleSort(list2);

        System.out.println(Arrays.toString(list2));
    }
}
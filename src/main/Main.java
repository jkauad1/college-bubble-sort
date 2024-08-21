package main;

import java.util.Arrays;

import static classes.BubbleSortController.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] lista = {7,5,1,8,3};

        bubbleSort(lista);

        System.out.println(Arrays.toString(lista));
    }
}
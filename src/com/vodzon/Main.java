package com.vodzon;

import java.util.Arrays;

/*
2*) Реализовать метод который сортирует массив целых чисел быстрой сортировкой.
Можно найти готовую реализацию и разобраться или написать свою:
https://en.wikipedia.org/wiki/Quicksort
*/
public class Main {

    public static void main(String[] args) {
        int[] array = {33, 21, 16, 10, 15, 69, 42, 96, 65, 39};
        System.out.println("Unsorted: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        int left = low;
        int right = high;
        int pivot = array[(left + right) / 2];
        do {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int tmp = array[left];
                    array[left] = array[right];
                    array[right] = tmp;
                }
                left++;
                right--;
            }
        } while (left <= right);

        if (left < high) {
            quickSort(array, left, high);
        }
        if (low < right) {
            quickSort(array, low, right);
        }
    }
}
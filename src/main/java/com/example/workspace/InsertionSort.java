package com.example.workspace;

import java.util.Arrays;
import java.util.Random;

//  Insertion Sort
public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        System.out.println("Insertion Sorted Array: ");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");



    }

    // Driver method
    public static void main(String args[])
    {
        int z = 50000;
        int[] integerArray = new Random().ints(z, 0, 100).toArray();
        System.out.println("Random Array: ");
        System.out.println(Arrays.toString(integerArray));
        int arr[] = integerArray;

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
};

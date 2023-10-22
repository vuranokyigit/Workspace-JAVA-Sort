package com.example.workspace;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    // Bubble Sort
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int z = 5;
        int[] integerArray = new Random().ints(z, 0, 100).toArray();
        System.out.println("Random Array: ");
        System.out.println(Arrays.toString(integerArray));
        int arr[] = integerArray;

        int n = arr.length;
        bubbleSort(arr, n);

        System.out.println("Bubble Sorted Array: ");
        printArray(arr, n);
    }
}


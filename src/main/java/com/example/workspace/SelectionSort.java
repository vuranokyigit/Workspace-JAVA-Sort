package com.example.workspace;


//  Selection Sort

import java.util.Arrays;
import java.util.Random;

public class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int z = 5;
        int[] integerArray = new Random().ints(z, 0, 100).toArray();
        System.out.println("Random Array: ");
        System.out.println(Arrays.toString(integerArray));
        int arr[] = integerArray;
        ob.sort(arr);
        System.out.println("Selection Sorted Array: ");
        ob.printArray(arr);
    }
}




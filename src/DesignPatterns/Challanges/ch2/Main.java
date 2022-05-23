package DesignPatterns.Challanges.ch2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copyo1OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copyo2OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copyo1OfArr);
        displaySorted(new MergeSort(), copyo1OfArr);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr)
    {
        strategy.sort(arr);
        System.out.println();
        for (var i : arr)
        {
            System.out.print(i + " ");
        }
    }
}


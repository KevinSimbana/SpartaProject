package com.sparta.testing.testcases;

import com.sparta.sorting.controller.ArrayCreator;
import com.sparta.sorting.controller.TreeDriver;
import com.sparta.sorting.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortMethodTester {
    private final int[] testArr = {42,12,554,12,356,87,1,23,2,3,23};
    private int[] sortedArr = {42,12,554,12,356,87,1,23,2,3,23};;
    ArrayCreator arr = new ArrayCreator();

//    public static void main(String[] args) {
//        SortMethodTester test = new SortMethodTester();
//
//        test.bubbleSortTest();
//        test.mergeSortTest();
//        test.quickSortTest();
//        test.insertionSortTest();
//        test.selectionSortTest();
//        test.binaryTreeTest();
//    }

    @Test
    public void bubbleSortTest(){
        arr.setCopiedArr(sortedArr);
        Arrays.sort(sortedArr);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        Assertions.assertArrayEquals(sortedArr, testArr);
    }

    @Test
    public void mergeSortTest(){
        arr.setCopiedArr(sortedArr);
        Arrays.sort(sortedArr);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);

        Assertions.assertArrayEquals(sortedArr, testArr);
    }

    @Test
    public void quickSortTest(){
        arr.setCopiedArr(sortedArr);
        Arrays.sort(sortedArr);

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        Assertions.assertArrayEquals(sortedArr, testArr);
    }

    @Test
    public void insertionSortTest(){
        arr.setCopiedArr(sortedArr);
        Arrays.sort(sortedArr);

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);

        Assertions.assertArrayEquals(sortedArr, testArr);
    }

    @Test
    public void selectionSortTest(){
        arr.setCopiedArr(sortedArr);
        Arrays.sort(sortedArr);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);

        Assertions.assertArrayEquals(sortedArr, testArr);
    }

    @Test
    public void binaryTreeTest(){
        arr.setCopiedArr(sortedArr);
        Arrays.sort(sortedArr);

        TreeDriver treeDriver = new TreeDriver();
        treeDriver.sort(arr);

        Assertions.assertArrayEquals(sortedArr, testArr);
    }


}

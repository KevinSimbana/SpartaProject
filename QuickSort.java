package com.sparta.sorting.model;

import com.sparta.sorting.controller.ArrayCreator;
import com.sparta.sorting.controller.Timer;
import org.apache.log4j.Logger;

public class QuickSort implements Sorter {
    Timer timer;
    private static Logger logger = Logger.getLogger("Sorting Application");

    @Override
    public void sort(ArrayCreator arr) {
        int[] array = arr.getCopiedArr();
        timer = new Timer();
        timer.startTime();

        quickSort(array, 0, array.length-1);

        timer.endTime();
    }

    @Override
    public void printSortTime(){
        System.out.println("quickSort time: " + timer.getTime() + "ns");
        logger.info("quickSort sorting time:" + timer.getTime() + "ns");
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    public int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                //SWAP
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //SWAP
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }
}

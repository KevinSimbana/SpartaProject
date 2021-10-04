package com.sparta.sorting.model;

import com.sparta.sorting.controller.ArrayCreator;
import com.sparta.sorting.controller.Timer;
import org.apache.log4j.Logger;

public class SelectionSort implements Sorter{
    Timer timer;
    private static Logger logger = Logger.getLogger("Sorting Application");

    @Override
    public void sort(ArrayCreator arr) {
        int[] array = arr.getCopiedArr();
        timer = new Timer();
        timer.startTime();
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        timer.endTime();
    }

    @Override
    public void printSortTime(){
        System.out.println("selectionSort time: " + timer.getTime() + "ns");
        logger.info("selectionSort sorting time:" + timer.getTime() + "ns");
    }
}

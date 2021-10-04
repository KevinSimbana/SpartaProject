package com.sparta.sorting.model;

import com.sparta.sorting.controller.ArrayCreator;
import com.sparta.sorting.controller.Timer;
import org.apache.log4j.Logger;

public class InsertionSort implements Sorter{
    Timer timer;
    private static Logger logger = Logger.getLogger("Sorting Application");

    @Override
    public void sort(ArrayCreator arr) {
        int[] array = arr.getCopiedArr();
        timer = new Timer();
        timer.startTime();
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        timer.endTime();
    }
    @Override
    public void printSortTime(){
        System.out.println("insertionSort time: " + timer.getTime() + "ns");
        logger.info("insertionSort sorting time:" + timer.getTime() + "ns");
    }
}

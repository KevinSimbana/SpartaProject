package com.sparta.sorting.model;

import com.sparta.sorting.controller.ArrayCreator;
import com.sparta.sorting.controller.Timer;
import org.apache.log4j.Logger;

public class BubbleSort implements Sorter {
    private Timer timer;
    private static Logger logger = Logger.getLogger("Sorting Application");

    @Override
    public void sort(ArrayCreator arr) {
        int[] array = arr.getCopiedArr();
        timer = new Timer();
        timer.startTime();
        int temp;
        int n = array.length;

        for(int i=0; i<n; i++) {
            for(int j = 1; j <= (n-1); j++) {
                //SWAP
                if(array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        timer.endTime();
    }

    @Override
    public void printSortTime(){
        System.out.println("bubbleSort: " + timer.getTime() + "ns");
        logger.info("bubbleSort sorting time:" + timer.getTime() + "ns");
    }
}

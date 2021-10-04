package com.sparta.sorting.model;

import com.sparta.sorting.controller.ArrayCreator;
import com.sparta.sorting.controller.Timer;
import org.apache.log4j.Logger;

public class MergeSort implements Sorter {
    private Timer timer;
    private static Logger logger = Logger.getLogger("Sorting Application");

    @Override
    public void sort(ArrayCreator arr) {
        int[] array = arr.getCopiedArr();
        timer = new Timer();
        timer.startTime();

        mergeSort(array);

        timer.endTime();
    }

    @Override
    public void printSortTime(){
        System.out.println("mergeSort: " + timer.getTime() + "ns");
        logger.info("mergeSort sorting time:" + timer.getTime() + "ns");
    }

    public void mergeSort(int[] array){
        if (array.length < 2) {
            return;
        }

        int n = array.length;
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i-mid] = array[i];
        }
        mergeSort(l);
        mergeSort(r);

        merge(array, l, r, mid, n-mid);
    }

    public void merge(int[] arr, int[] l, int[] r, int left, int right) {
        int i=0, j=0, k=0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }
}
package com.sparta.sorting.controller;

import com.sparta.sorting.model.BinaryTree;
import com.sparta.sorting.model.Sorter;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class TreeDriver implements Sorter {

    private BinaryTree theTree = new BinaryTree();
    private Timer timer;
    private static Logger logger = Logger.getLogger("Sorting Application");

    @Override
    public void sort(ArrayCreator arr) {
        int[] array = arr.getCopiedArr();
        timer = new Timer();
        timer.startTime();
        for (int nextValue : array) {
            theTree.add(nextValue);
        }
        timer.endTime();
        Arrays.sort(array);
        arr.setCopiedArr(array);
    }

    @Override
    public void printSortTime(){
        System.out.println("binaryTree time: " + timer.getTime() + "ns");
        logger.info("binaryTree sorting time:" + timer.getTime() + "ns");
    }

    public void print(){
        System.out.println(theTree);
    }

}

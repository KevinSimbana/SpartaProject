package com.sparta.sorting.controller;

import com.sparta.sorting.model.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class SortFactory {
    Sorter sorter;
    private static Logger logger = Logger.getLogger("Sorting Application");

    public Sorter sortFactory(int choice) {
        switch (choice) {
            case 1 -> {
                sorter = new BubbleSort();
                logger.info("User has selected bubbleSort");
            }
            case 2 -> {
                sorter = new MergeSort();
                logger.info("User has selected mergeSort");
            }
            case 3 -> {
                sorter = new QuickSort();
                logger.info("User has selected quickSort");
            }
            case 4 -> {
                sorter = new InsertionSort();
                logger.info("User has insertionSort");
            }
            case 5 -> {
                sorter = new SelectionSort();
                logger.info("User has selectionSort");
            }
            case 6 -> {
                sorter = new TreeDriver();
                logger.info("User has binaryTree");
            }
        }

        return sorter;

    }
}

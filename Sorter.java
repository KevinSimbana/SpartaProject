package com.sparta.sorting.model;

import com.sparta.sorting.controller.ArrayCreator;

public interface Sorter {
    public void sort(ArrayCreator arr);

    //public void print(int[] array);

    public void printSortTime();
}

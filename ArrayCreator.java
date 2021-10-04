package com.sparta.sorting.controller;

import java.util.Random;

public class ArrayCreator {
    private int[] originalArr;
    private int[] copiedArr;

    public ArrayCreator() {
    }

    public int[] getOriginalArr() {
        return originalArr;
    }

    public int[] getCopiedArr() {
        return copiedArr;
    }

    public void setOriginalArr(int size) {
        this.originalArr = createArray(size);
    }

    public void setCopiedArr(int[] arr) {
        this.copiedArr = createCopyArray(arr);
    }

    private int[] createArray(int size) {
        Random random = new Random();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }

    private int[] createCopyArray(int[] arr) {
        int size = arr.length;
        int[] copiedArr = new int[size];

        for (int i = 0; i < size; i++) {
            copiedArr[i] = arr[i];
        }
        return copiedArr;
    }
}

package com.sparta.sorting.controller;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public final class UserInput {
    //PROPERTIES
    private static Logger logger = Logger.getLogger("Sorting Application");
    private static UserInput instance;
    private int arraySize;
    private int sortChoice;
    private ArrayList<Integer> choice = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    private UserInput(){
    }

    //GETTERS & SETTERS;
    public static UserInput getInstance(){
        if (instance == null) {
            instance = new UserInput();
        }
        return instance;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize() {
//        int size = scanner.nextInt();
//        if (size < 0) {
//            System.out.println("input size invalid, number must be greater than 0");
//            System.exit(0);
//        }
        int size = scanner.nextInt();
        this.arraySize = size;
        logger.info("user has array of size:" + size);
    }

    public ArrayList<Integer> getSortChoice() {
        return choice;
    }

    public void setSortChoice() {
//        while (scanner.nextInt() != 0) {
//            this.choice.add(scanner.nextInt());
//        }

        boolean valid = false;
        int input = -1;
        while(!valid) {
            input = scanner.nextInt();
            choice.add(input);
            if (input == 0) {
                valid = true;
            }
        }
    }

    public void runUserInput(){
        System.out.println("Sorting Application");
        System.out.println();
        System.out.println("1: bubbleSort");
        System.out.println("2: mergeSort");
        System.out.println("3: quickSort");
        System.out.println("4: selectionSort");
        System.out.println("5: insertionSort");
        System.out.println("6: binaryTree");

        System.out.println();
        System.out.println("How big do you want the array");
        setArraySize();

        System.out.println("Choose a sort method or more: (enter 0 to sort your array.)");
        setSortChoice();
    }

}

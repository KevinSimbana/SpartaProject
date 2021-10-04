package com.sparta.sorting.view;

import com.sparta.sorting.controller.ArrayCreator;
import com.sparta.sorting.controller.SortFactory;
import com.sparta.sorting.controller.UserInput;
import com.sparta.sorting.model.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

//TODO: Change project into Maven, then look into implementing Junit (test cases) & log4j (logging).
//TODO: look into the possibility of adding a binaryTree data structure and sort using binaryTree.

public class App {
    private static Logger logger = Logger.getLogger("Sorting Application");

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        //Single method call in UserInput class deals with displaying questions and taking in userInput.
        UserInput userInput = UserInput.getInstance();
        try {
            userInput.runUserInput();
        } catch (InputMismatchException e){
            logger.error("user input only accepts numbers a valid entry");
            System.out.println("input only accepts numbers");
            System.out.println("Error message: " + e);
            System.exit(0);
        }

        //Array creation from user input size of array. Generated with random values.
        //Two arrays created: original and copy of original array to be sorted later.
        ArrayCreator array = new ArrayCreator();
        try {
            array.setOriginalArr(userInput.getArraySize());
            array.setCopiedArr(array.getOriginalArr());
        } catch (NegativeArraySizeException e) {
            logger.error("user input tried to create an array with a negative size");
            System.out.println("cannot create array with negative size");
            System.out.println("Error message: " + e);
            System.exit(0);
        }

        System.out.println("Random array:");
        System.out.println(Arrays.toString(array.getOriginalArr()));
        System.out.println();

        //Deals the creation of which sort method object needs to be used when sorting the array.
        SortFactory theFactory = new SortFactory();
        ArrayList<Sorter> sorter = new ArrayList<>();

        for (int i=0; i < userInput.getSortChoice().size()-1; i++){
            sorter.add(theFactory.sortFactory(userInput.getSortChoice().get(i)));
        }

        System.out.println("Sorted Array:");
        for (Sorter s : sorter) {
            s.sort(array);
        }

        System.out.println(Arrays.toString(array.getCopiedArr()));
        for (Sorter s : sorter) {
            s.printSortTime();
        }

    }

}

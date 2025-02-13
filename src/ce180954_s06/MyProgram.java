/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s06;

import java.util.ArrayList;

/**
 * S06 - Array Manipulations
 *
 * @author Le Khanh Dang - CE180954 06/02/2025
 */
public class MyProgram {

    private ArrayList<Integer> arrayList; // List to store the integers

    /**
     * Constructor to initialize the arrayList as an empty list.
     */
    public MyProgram() {
        this.arrayList = new ArrayList<>(); // Initialize the ArrayList
    }

    /**
     * Adds an integer value to the arrayList.
     *
     * @param value The integer value to be added to the list.
     */
    public void addElement(int value) {
        arrayList.add(value); // Adds the provided value to the list
    }

    /**
     * Searches for a value in the arrayList and returns the index of the value.
     * If the value is not found, it returns -1.
     *
     * @param value The integer value to be searched.
     * @return The index of the value in the list, or -1 if not found.
     */
    public int searchValue(int value) {
        int dem = 0;
        for (Integer i : arrayList) {
            if(i == value){
                System.out.println(dem);
            } 
            dem++;
        }
        return 0; // Returns the index of the value, -1 if not found
    }

    /**
     * Prints all elements of the arrayList. If the list is empty, it notifies
     * the user.
     */
    public void printArray() {
        if (arrayList.isEmpty()) { // Check if the list is empty
            System.out.println("Array is empty."); // Print message if the list is empty
        } else {
            // Loop through the arrayList and print each element
            for (int num : arrayList) {
                System.out.print(num + " "); // Print each element followed by a space
            }
            System.out.println(); // Move to the next line after printing all elements
        }
    }

    /**
     * Prints all values in the arrayList that are within the specified range
     * [min, max].
     *
     * @param min The minimum value of the range.
     * @param max The maximum value of the range.
     */
    public void printInRange(int min, int max) {
        boolean found = false; // Flag to track if any values within the range are found
        // Loop through the arrayList and check if each value is within the range
        for (int num : arrayList) {
            if (num >= min && num <= max) { // Check if the value is within the range
                if (found) {
                    System.out.print(", "); // Print out the comma if it is not at the end
                }
                System.out.print(num); // Print value
                found = true; // Mark that at least one value was found
            }
        }
        if (!found) {
            System.out.println("Invalid. Min nho hon max"); // Print message if no values are found in the range
        } else {
            System.out.println(); // Print a new line after printing the values in range
        }
    }

    /**
     * Sorts the arrayList in ascending order using the Bubble Sort algorithm.
     * Bubble sort repeatedly steps through the list, compares adjacent
     * elements, and swaps them if they are in the wrong order.
     */
    public void bubbleSort() {
        int n = arrayList.size(); // Get the size of the list
        // Outer loop for bubble sort
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) { // If current element is greater than next element
                    // Swap the elements
                    int temp = arrayList.get(j); // Temporarily store the current element
                    arrayList.set(j, arrayList.get(j + 1)); // Set the current element to the next element
                    arrayList.set(j + 1, temp); // Set the next element to the stored current element
                }
            }
        }
        System.out.println("Array sorted in ascending order."); // Print message after sorting is complete
    }
}

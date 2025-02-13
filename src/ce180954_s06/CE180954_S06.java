/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s06;

/**
 * S06 - Array Manipulations
 * 
 * @author Le Khanh Dang - CE180954 06/02/2025
 */
public class CE180954_S06 {

    /**
     * Main method - Entry point of the program
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IO io = new IO(); // Create an IO object to handle user input
        MyProgram mp = new MyProgram(); // Create a MyProgram object to manipulate the array
        int choice;

        // Main loop displaying the menu
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Add a value");
            System.out.println("2 - Search a value");
            System.out.println("3 - Print out the array");
            System.out.println("4 - Print out values in a range of inputted min and max values");
            System.out.println("5 - Sort the array in ascending order");
            System.out.println("6 - Quit");

            // Prompt the user to choose an option
            choice = io.input("Choose an option: ");

            // Execute the corresponding function based on the user's choice
            switch (choice) {
                case 1:
                    // Option 1: Add a value to the array
                    int value = io.input("Enter a value to add: ");
                    mp.addElement(value); // Add the value to the array
                    break;
                case 2:
                    // Option 2: Search a value in the array
                    value = io.input("Enter a value to search: ");
                    int index = mp.searchValue(value); // Search the value in the array
                    if (index == -1) {
                        System.out.println("Value not found in the array.");
                    } else {
                        System.out.println("Value found at index: " + index);
                    }
                    break;
                case 3:
                    // Option 3: Print the entire array
                    mp.printArray(); // Print all elements in the array
                    break;
                case 4:
                    // Option 4: Print values within a specified range
                    int min = io.input("Enter the min value: ");
                    int max = io.input("Enter the max value: ");
                    mp.printInRange(min, max); // Print values within the range [min, max]
                    break;
                case 5:
                    // Option 5: Sort the array in ascending order
                    mp.bubbleSort(); // Sort the array using Bubble Sort
                    break;
                case 6:
                    // Option 6: Quit the program
                    System.out.println("Exiting program.");
                    return; // Exit the program
                default:
                    // If an invalid option is selected, ask the user to try again
                    System.out.println("Invalid choice! Please select a valid option.");
                    break; // Do not exit the program; continue showing the menu
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180954_s06;

import java.util.Scanner;

/**
 * S06 - Array Manipulations
 *
 * @author Le Khanh Dang - CE180954 06/02/2025
 */
public class IO {

    // Create a Scanner object to read input from the user
    Scanner sc = new Scanner(System.in);

    /**
     * Method to get an integer input from the user. It keeps prompting the user
     * until a valid integer is entered.
     *
     * @param msg The message prompt to display to the user
     * @return The valid integer entered by the user
     */
    public int input(String msg) {
        int inputUser; // Variable to store the user's input

        // Continue to ask for input until a valid integer is entered
        while (true) {
            try {
                // Display the prompt message and read the user's input
                System.out.print(msg);

                // Convert the input string to an integer
                inputUser = Integer.parseInt(sc.nextLine());

                // Return the valid integer input
                return inputUser;
            } catch (NumberFormatException e) {
                // If the input is not a valid integer, catch the exception and prompt the user again
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}

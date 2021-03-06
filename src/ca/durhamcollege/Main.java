/*
* Author: Tyler Henry
* Date: November 11, 2021
*/

package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Define our Scanner
        Scanner keyboard = new Scanner(System.in);

        //Input
        String name = "";
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;

        boolean isValidInput = false; // sentinel variable
        do
        {
            System.out.print("Please enter your age: ");
            try
            {

                age = keyboard.nextFloat();
                isValidInput = true;

                if ((age <= 0.0f) || (age > 120.0))
                {
                    System.out.printf("Error: You must enter an age greater than 0 and less than 120 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.out.printf("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;

            }

        }
        while(!isValidInput);
        System.out.println();
        //Output
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);


        //multi-dimensional array example
        int rows = 8;
        int cols = 8;
        float[][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < cols; y++)
            {
                board[x][y] = (float)(Math.random() + 100.0f) + 1.0f;
            }
        }
        System.out.println("Showing 10 Random Values: ");
        for (int i = 0; i < 10; i++)
        {
            var randRows = (int)(Math.random() *rows);
            var randCols = (int)(Math.random() *cols);
            System.out.print("For row: " + randRows + " cols: " + randCols + " ");
            System.out.printf("The random number is %.2f \n", board[randRows][randCols]);
        }





    }
}

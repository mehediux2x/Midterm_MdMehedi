package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //int num = 5;
        //System.out.println("Factorial of "+ number + " is " + factorial(5));
        //System.out.println("Factorial of  is " + factorial(5));

        Scanner scanner = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.print("Enter Any positive number :");
        num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);


        System.out.println("********************************");
        factorial(5);

    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        int fac = number * factorial(number - 1);
        System.out.println("Factorial of " + number + " is " + fac);
        return fac;

    }
}

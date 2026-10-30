package AdvanceJava;

public class Recursivemethods {
    public static void main(String[] args) {
        // sayHello(0);

        // printNumber(1);

        int ans = factorial(5);
        System.out.println("The factorial of 5 is: " + ans);
    }

    static void sayHello(int count) {
        if (count == 10) {
            return;
        }
        System.out.println("Hello");
        sayHello(count + 1);
    }

    // Print 1 to 10 without using loop

    static void printNumber(int count) {
        if (count == 10) {
            System.out.println(count);
            return;
        }
        System.out.println(count);
        printNumber(count + 1);
    }

    // Factorial of a number using recursion

    static int factorial(int num) { // 5!
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1); // 120
    }

}
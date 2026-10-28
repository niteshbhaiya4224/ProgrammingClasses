package AdvanceJava;

public class Recursivemethods {
    public static void main(String[] args) {
        // sayHello(0);

        printNumber(1);
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

    // print from 10 to 1 without using loop

}

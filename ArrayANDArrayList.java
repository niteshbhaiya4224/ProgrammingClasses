import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayANDArrayList {
    public static void main(String[] args) {
        
        // First way
        // int arr[] = {3,5,1,2,7,8,9};

        // System.out.println(arr.length);

        // // Second way 
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the Size of the array");
        // int n = sc.nextInt();
        // System.out.println("Enter "+n+" elements of the array");
        // int arr2[] = new int[n];
        
        // // Take array user input

        // for(int i =0; i<arr2.length; i++){
        //     arr2[i] = sc.nextInt();
        // }

        // // Print the array

        // for(int i =0; i<arr2.length; i++){
        //     System.out.print(arr2[i]+" ");
        // }
        // System.out.println();

        // // Built in methods
        // Arrays.fill(arr2, 2); // This will make all the arrays value to 2

        // ---------------------------------------------

        /*
            Integer,
            Double,
            Float,
            Boolean,
            Byte,
            Short,
            Long,
            Character

        */

        ArrayList<Integer> list1 = new ArrayList<>(); 

        list1.add(4);
        list1.add(6);
        list1.add(9);

        System.out.println(list1);



        /*
        
        a = [3,0,1,0,2]; m = 5

        for j from 0 to 4:
        if a[j] & j:
            a[j] = a[j] & j
        m = a[0] + a[4] – a[1]


        print m

        --------

        j = 0
        a[0] = 3

        m = 3 + 2 - 0 = 5
        ----
        j = 1

        a[1] = 0;

        m = 



        --------


        for a = 0 to 4:    ----> 
            for b = 0 to 2:  -----> 
                if a > b: print "A"

        ans = 9;


        */

        for(int a =0; a<=4; a++){
            for(int b = 0; b<=2; b++){
                if(a>b){
                    System.out.println("A");
                }
            }
        }

    }
}

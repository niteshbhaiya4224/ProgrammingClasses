import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Numbers");

        for(int i =0; i<5; i++){
            list1.add(sc.nextInt());
        }

        System.out.println("----Original List----");
        System.out.println(list1);

        // Sorting Ascending

        Collections.sort(list1);
        System.out.println("---Sorted list----");
        System.out.println(list1);

        // Sorting in Descending

        Collections.sort(list1);
        System.out.println("---Sorted list in desc----");
        Collections.reverse(list1);
        System.out.println(list1);
        // for(int i = list1.size()-1; i>=0; i--){
        //     System.out.print(list1.get(i)+" ");
        // }

    }
}

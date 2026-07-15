import java.util.ArrayList;

public class FlatteningtoASingleList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(2);
        list1.add(4);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(3);
        list2.add(6);
        list2.add(0);

       ArrayList<Integer> result =  flattenListInAscendingOrder(list1, list2);

       System.out.println(result);
        
    }

    public static ArrayList<Integer> flattenListInAscendingOrder(ArrayList<Integer> list1, ArrayList<Integer> list2){

        // P1 = 4 --> Max limit
        // p2 = 2

        // 3 5 2 4
        // 4 3 6 0 5 3 

        // 3 4 3 5 2 4 0 5 3
        
        return null;
    }
}

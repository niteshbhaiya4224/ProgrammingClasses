public class EvenOddMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        
        // header line 
        System.out.println("    ");
        for (int col = 1; col<=9; col+=2){
            System.out.printf("%5d",col);
        }
        System.out.println();

        // separtator 
        System.out.println("---------------------------------");

        // rows

        for(int row =2; row<=8; row+=2){
            System.out.printf("%2d |",row);

            for(int col = 1;col<=9;col+=2){
                System.out.printf("%5d",row*col);
            }
            System.out.println();
        }

    }
}


   

/*


    *
   ***
  *****
 *******
*********

*/

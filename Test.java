import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /* 
        && -- Less than
        || -- Greater than

        case 1 - less than < -> AND (&&)

        |y-5| < 3

        -(y-5) < 3 --> -y + 5 < 3 -->  2 < y
        +(y-5) < 3 --> y-5 < 3 --> y < 8
        
        2<y && y<8

        Rule 
        |A| < B

        -B < A && A < B



        Case 2 - Greater than > -> ||

        |y-5| > 3
        
        -(y-5) > 3 --> -y + 5 > 3 -->  y < 2
        +(y-5) > 3 --> y-5 > 3 --> y > 8

        y < 2 || y > 8

        Rule 
        |A| > B

        A < -B || A > B


        */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total bill amount: ");
        // int totalBilledAmount = sc.nextInt();

        // if(totalBilledAmount > 50){
        //     System.out.println("Shipping is free");
        //     if(totalBilledAmount > 100){
        //         System.out.println("Additional Discount");
        //     }
        // }





        // if(totalBilledAmount > 50){
        //     System.out.println("Shipping is free");
        // }
        // if(totalBilledAmount>100){
        //     System.out.println("Additional Discount");
        // }


        // System.out.println("---END-----");

        double x = 0.1;
        double y = 0.2;

        double res = x+y;

        System.out.println(res); // 0.30000000000000004

        
        // String.toChars() never exist

        String str = "Nitesh";
        System.out.println(str);

        char[] strArray = str.toCharArray();

        for(int i =0; i<strArray.length; i++){
            System.out.print(strArray[i]+" ");
        }

        System.out.println();

    }


    /*
    
            i = 1 
            i = 2
            i = 3

            for (int i =1; i<=3; i++){
                for(int j = i; j<=3; j++){

                    if(some expression){
                        sout("*");
                    }

                }
                sout()

            }
    
    */


    /*

        Nested if else 

            totalOrder > 50 --> Free shipping
            totalOrder > 100 --> Free shipping + discount


            

    */

}

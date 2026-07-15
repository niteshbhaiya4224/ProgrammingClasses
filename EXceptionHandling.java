import java.util.Scanner;

public class EXceptionHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter First Number");
        // int x = sc.nextInt();
        // System.out.println("Enter Second Number");
        // int y = sc.nextInt();
        // int operation = 0;
        // try{
        //     operation = x/y;
        // }catch(ArithmeticException e){
        //     System.out.println("Please change the value of second number you can't Divide by 0");
        //     return;
        // }finally{
        //     System.out.println("Result : "+ operation);
        // }


        // int arr[] = {4,7,3};

        // try{
        //     System.out.println(arr[2]/0);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Divide By zero is not possible");
        // }
        // catch(RuntimeException e){
        //     System.out.println("You are accesing the elements beyond the limit");
        // }
        
        // System.out.println("Outside Exceptions");



        // try{
        //     System.out.println("Outer Try Blocks starts ");
        //     try{
        //         int res = 10/0; // Arithmetic Exceptions
        //         System.out.println(res);
        //     }catch(ArithmeticException e){
        //         System.out.println("Inner catch: "+ e);
        //     }

        //     int arr[] = {1,2,3};
        //     System.out.println(arr[5]); // ArrayIndexofBoundException
        // }catch(ArrayIndexOutOfBoundsException e){
        //     // e.printStackTrace();
        //     System.out.println("Outer catch executed : "+ e.getMessage());
        // }

        // System.out.println("----Ends----");

        String nameArray[] = {"Nitesh","Issac","John","Tom"};
        System.out.println("Enter a name");
        String userinput = sc.nextLine();

        boolean found = false;

        for(String name : nameArray){
            if(userinput.equalsIgnoreCase(name)){
                found=true;
                break;
            }
        }

        try{
            if(!found){
                throw new NameNotFoundException("Name is not Available in the list");
            }
            System.out.println("Found...");
        }catch(NameNotFoundException e){
            System.out.println(e);
        }



        // Note : throw keyword is used to throw a custom exception.
        // Throwable is the parent class of all the exception

        // What is difference between final, finally, and Finalize ?
        

    }
}

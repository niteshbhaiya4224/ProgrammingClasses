import java.util.Random;
import java.util.Scanner;

public class MathLearn {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Enter 0 --> Rock\nEnter 1 --> Paper\nEnter 2 --> Scissor");
        int userChoice = sc.nextInt();
        int computerChoice = ran.nextInt(0,3);

        if(userChoice>2){
            System.out.println("Invalid Input");
        }
        else if(userChoice == computerChoice){
            System.out.println("Match Draw Play another round....");
        }
        else if(userChoice == 0 && computerChoice == 1) {
            System.out.println("Computer Wins...");
        }
        else if(userChoice == 1 && computerChoice == 2){
            System.out.println("Computer Wins....");
        }
        else if(userChoice == 2 && computerChoice == 0){
            System.out.println("Computer Wins....");
        }
        else{
            System.out.println("User Wins...");
        }
        sc.close();
    }
}
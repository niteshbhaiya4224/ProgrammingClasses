import java.util.Scanner;

public class SwitchandCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("+ -> Addition\n- -> Subtraction\n* -> Multiplication\n -> Division");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-': 
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case 'd':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Wrong Input");
                break;

        }

        sc.close();
    }
}

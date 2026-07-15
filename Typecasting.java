public class Typecasting {
    public static void main(String[] args) {

        // Widening Type caseting (Automatically)
        int x = 34;
        System.out.println(x);
        double y = x;
        System.out.println(y);


        // Narrowing Type casting (Manually)

        double pi = 3.84;

        int piInt = (int)pi;

        System.out.println(pi);
        System.out.println(piInt);


        char ch = 'A';
        int x1 = ch;

        System.err.println(x1);

    }
}

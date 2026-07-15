public class TernaryOperator {
    public static void main(String[] args) {
        // If today it will be not raining in the evening I will go to play outside.
        String user = "John";
        boolean isRaining = true;
        boolean isEvening = false;

        // if(isEvening && isRaining){
        // System.out.println("Not Play");
        // }
        // else if(isEvening && !isRaining){
        // System.out.println("Play");
        // }
        // else{
        // System.out.println("Its not evening");
        // }


        int a = 7;
        int b = 5;

        if(a<b){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is Greater");
        }


        String ans = a>b ? a +" is greater" : b +" is greater" ;
        System.out.println(ans);


        // Ternary Operator

        String answer = isEvening ? "It is evening" : "Its not evening";
        System.out.println(answer);

        String res = isEvening ? (isRaining ? "Not Play" : "Play")
                : "Not play";

        System.out.println(res);
    }
}

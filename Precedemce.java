public class Precedemce {
    /*
    
    Level	Operators
1 (highest)	var++ , var-- (postfix)
2	+ - (unary), ++var , --var, ! (not), (type) cast
3	* / %
4	+ - (binary)
5	< <= > >= (relational)
6	== != (equality)
7	^ (xor)
8	&&
9	||
10 (lowest)	= += -= *= /= %= (assignment)

    */

public static void main(String[] args) {
    int x = 5;
    int y = 3;
    int z = 2;

    
    int a = x++;
    System.out.println(x); // 6 
    System.out.println(a); // 6 


 // PreIncrement --> In PreIncrement first it will increase the value then it will assign the value to the variable.

 // PostIncrement --> In PostIncrement first it will assign the value to the variable then it will increase the value.




    // int res = (x+y) * z;
    // System.out.println(res);

    // int res2 = (++x + y) * 2;
    // System.out.println(res2);

}

/*

Precedence level

Highest - () --> (5+3) * 2;
Unary - ++, --, ! --> x++
Multiplicative -- *, /, % --> 5*2
Additive -- +, -  ---> 5+3
Relational == <, > ,<=, >= 
Equality -- ==, !=
Logical And -- && --> a && b
Logical Or -- || --> a || b
Assignment -- =, +=, -=


// BODMAS ---> PEMDAS

*/

}

package Variable_Operators;

public class Operators {

    public static void main(String[] args) {
        int a = 10, b = 50, c = 30, result;

        //condition ? if true : if false
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);

        a = b++ + c; //a = (b+c) then b = b+1

        System.out.println(a);
        System.out.println(b);

       b += a; //b = b + a
        System.out.println(b);



    }
}

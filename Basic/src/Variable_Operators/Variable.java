package Variable_Operators;

public class Variable {
    public String geek; //instance variable

    public Variable() //default constructor
    {
        this.geek = "subasa jain";
    }

    public static String name = "subansan jain";

    public static void main(String[] args) {
        int var = 10; //local variable

        System.out.println("Local variable: " + var);

        Variable variable = new Variable();
        System.out.println("Geek name is: " +variable.geek);

        System.out.println(Variable.name);

    }
}

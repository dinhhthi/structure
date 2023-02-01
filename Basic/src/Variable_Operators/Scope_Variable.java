package Variable_Operators;

public class Scope_Variable {
    static int x = 11;
    private int y = 33;

    public void method1(int x)
    {
        Scope_Variable t = new Scope_Variable();

        this.x = 22; //this dùng để phân biệt variable instance và variable static
        y = 44;

        System.out.println("Test.x: " + Scope_Variable.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[])
    {
        Scope_Variable t = new Scope_Variable();
        t.method1(5);

        int z;
        for (z = 0; z <= 4; z++)
        {
            System.out.println(z);
        }

        System.out.println(z);
    }
}

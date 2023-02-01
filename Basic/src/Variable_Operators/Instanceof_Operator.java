package Variable_Operators;

public class Instanceof_Operator {
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Boy();

        System.out.println("obj1 instanceof Person: "
                + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof myInterface));


        System.out.println("obj2 instanceof Person: "
                + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof myInterface));


    }

}
class Person{}
interface myInterface{}
class Boy extends Person implements myInterface{}

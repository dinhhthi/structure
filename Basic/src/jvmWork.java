import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class jvmWork {

    public static void main(String[] args) {
        Student student = new Student();
        Class c1 = student.getClass();
        System.out.println(c1.getName());

        Method m[] = c1.getDeclaredMethods();
        for (Method method : m) {
            System.out.println(method.getName());

            Field f[] = c1.getDeclaredFields();
            for (Field field : f)
                System.out.println(field.getName());
        }

        System.out.println(String.class.getClassLoader());

        System.out.println(jvmWork.class.getClassLoader());
    }


}

class Student {
    private String name;
    private int roll_No;

    public Student() {
    }

    public Student(String name, int roll_No) {
        this.name = name;
        this.roll_No = roll_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }
}
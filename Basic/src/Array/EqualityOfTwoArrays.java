package Array;

import java.util.Arrays;

//Write a Java program to check the equality of two arrays?
public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        String[] s1 = {"java", "j2ee", "struts", "hibernate"};

        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};

        String[] s3 = {"java", "j2ee", "struts", "hibernate"};

        String[] s4 = {"jsp", "spring", "jdbc", "hibernate"};


        int a1[][] = {{10, 20},
                {40, 50},
                {60, 70}};

        int a2[][] = {{30, 20},
                {10, 0},
                {60, 80}};

        int a3[][] = {{10, 20},
                {40, 50},
                {60, 70}};

        //System.out.println(Arrays.equals(s1, s2));        //Output : false

        //System.out.println(Arrays.equals(s1, s3));        //Output : true

        //System.out.println(Arrays.deepEquals(a1, a3));

        //equal works on an single dimensional array
        //deepequal works on all array

        checkArrays(s2, s4);
    }

    public static void checkArrays(String[] arr1, String[] arr2) {

        boolean flag = true;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                }
            }
        } else {
            System.out.println("arr length not same");
        }

        if (flag) {
            System.out.println("two array are equal");
        } else {
            System.out.println("two array are not equal");
        }

    }
}

package Array;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Write a Java program to find the intersection of two arrays?
public class CommonElement {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        Integer[] i1 = {1, 2, 3, 4, 5, 4};

        Integer[] i2 = {3, 4, 5, 6, 7, 4};

        Iterative(i1, i2);
        IterativeString(s1, s2);

    }

    public static void Iterative(Integer[] arr, Integer[] arr2) {
        HashSet<Integer> set1 = new HashSet(Arrays.asList(arr));
        HashSet<Integer> set2 = new HashSet(Arrays.asList(arr2));

        set1.retainAll(set2); // giữ lại phần tử chung của 2 tập hợp

        System.out.println(set1);

    }

    public static void IterativeString(String[] arr, String[] arr2) {
        HashSet<String> set = new HashSet<>(); //hashset lưu 1 giá trí duy nhất kh trùng lặp

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i].equals(arr2[j])) {
                    set.add(arr[i]);

                }
            }
        }
        System.out.println(set);
    }
}

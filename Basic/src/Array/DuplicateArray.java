package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Write a Java program to find duplicate elements in an array?
public class DuplicateArray {
    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};

        findDuplicate(inputArray);
        finDuplicateStream(inputArray);
    }

    public static void findDuplicate(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element: " + arr[j]);
                }
            }
        }
    }

    public static void finDuplicateStream(int[] arr) {
        Set<Integer> uniqueElement = new HashSet<>();

        Set<Integer> duplicateElement = Arrays.stream(arr).filter(i -> !uniqueElement.add(i)).boxed().collect(Collectors.toSet());

        System.out.println(duplicateElement);
    }
}

//https://javaconceptoftheday.com/java-array-interview-programs/

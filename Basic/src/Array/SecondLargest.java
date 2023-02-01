package Array;

import java.util.*;
import java.util.List;

// Write a Java program to find second largest element in an array of integers?

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{45, 51, 28, 75, 49, 42}));

        System.out.println(secondLargestCollections(new int[]{47498, 14526, 74562, 42681, 75283, 45796}));

        List<Integer> list = Arrays.asList(985, 521, 975, 831, 479, 861);

        System.out.println(secondLargestListCollections(list));


    }

    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static int secondLargestCollections(int[] arr) {
        int second = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        return second;
    }

    public static int secondLargestListCollections(List<Integer> list) {
        int number = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        return number;
    }
}


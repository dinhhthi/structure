package Array;


import java.util.Arrays;
import java.util.HashMap;

//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?
public class PairOfElement {
    public static void main(String[] args) {


        findThePairsHashmap(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);
        findThePairsHashmap(new int[]{4, -5, 9, 11, 25, 13, 12, 8}, 20);

         findThePairs(new int[]{12, 13, 10, 15, 8, 40, -15}, 25);

        findThePairs(new int[]{12, 23, 10, 41, 15, 38, 27}, 50);
    }

    public static void findThePairs(int[] arr, int num) {
        System.out.println("------------------------------------");

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }
    }

    public static void findThePairsHashmap(int[] arr, int num) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        System.out.println(map.values());
        System.out.println(map.keySet());

        for (int j = 0; j < arr.length; j++) {
            int numToFind = num - arr[j];
            if (map.containsValue(numToFind)) { //check value || containsKey check key

                System.out.println(" The Sum of  " + arr[j] + " and " + numToFind + " is " + num);
                map.remove(j);
                map.remove(numToFind);
            }

        }
    }
}

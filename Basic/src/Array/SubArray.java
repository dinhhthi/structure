package Array;


//Write a Java program to find continuous sub array whose sum is equal to a given number?
public class SubArray {
    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        //findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        //findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }

    private static void findSubArray(int[] arr, int num) {
        int sum = arr[0]; //42
        int start = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            while (sum > num && start <= i -1){
                sum -= arr[start];
                start++;
            }

            if (sum == num){
                for (int j = start; j <= i; j++)
                {
                    System.out.print(arr[j]+" ");
                }

                System.out.println();
            }
        }
    }
}

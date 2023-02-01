package FlowControl;

public class forEach {
    public static void main(String[] args) {
        int[] marks = { 125, 132, 95, 116, 110 };


        System.out.println(Max(marks));
    }
    public static int Max(int[] number){
        int max = number[0];

        for (int num: number
             ) {
            if (num > max){
               max = num;
            }
        }
        return max;
    }

}


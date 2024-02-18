package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter length of array :- ");
        int n = scan.nextInt();
        Integer []arr = new Integer[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[arr.length-1]);
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        System.out.println(min);
        System.out.println(max);
    }
}

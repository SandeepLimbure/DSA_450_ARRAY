package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Kth_Min_Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter length of array :- ");
        int n = scan.nextInt();
        System.out.print("enter the Kth value :- ");
        int k = scan.nextInt();
        int []arr =  new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print("sorted array :- ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println(Kth_Max_Value(arr,k));
        System.out.println(Kth_Min_value(arr,k));
//        Arrays.sort(arr);
//        System.out.println();
//        if(k<arr.length){
//            System.out.println(arr[k-1]);
//        }
//        else{
//            System.out.println("index out of boundary");
        }
    static int Kth_Max_Value(int []arr,int k ){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    static int Kth_Min_value(int []arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

}

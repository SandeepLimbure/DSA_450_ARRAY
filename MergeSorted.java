package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        int []arr1 = {1,9,2,5,3,8,6,22};
        int []arr2 = {12,7,4,24,51,10};
        int n = arr1.length;
        int m = arr2.length;
        int l = n+m;
        int []arr= Arrays.copyOf(arr1,l);
        System.arraycopy(arr2,0,arr,n,m);
        System.out.println("original array :- ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array :- ");
        System.out.println(Arrays.toString(arr));
        if(l%2==0){
            int s = (arr[l/2]+arr[l/2+1])/2;
            System.out.println("the median is = "+s);
        }else{
            int r = (l+1)/2;
            System.out.println("the medial is = "+arr[r-1]);
        }


    }
}

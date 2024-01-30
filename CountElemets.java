package Array;

import java.util.ArrayList;

public class CountElemets {
    public static void main(String[] args) {
        int []A = {1, 4, 10, 20, 40, 80};
        int []B = {6, 4, 20, 80, 100};
        int []C = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(commonElement(A,B,C));
    }
    static ArrayList<Integer> commonElement(int []a, int []b, int[]c){
        int count = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                for(int k = 0;k<c.length;k++){
                    if(a[i]==b[j]&&b[j]==c[k]){
                        result.add(a[i]);
                        break;
                    }
                }
            }
        }
        return result;
    }
}

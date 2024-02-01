package Array;

public class InversionCount {
    public static void main(String[] args) {
        int []num= {2, 4, 1, 3, 5};
        int n = num.length;
        System.out.println(Count(num,n));
    }
    static int Count(int []arr,int n){
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]>arr[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}

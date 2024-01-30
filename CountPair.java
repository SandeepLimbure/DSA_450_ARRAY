package Array;

public class CountPair {
    public static void main(String[] args) {
         int []arr = {1, 5, 7, 1};
        System.out.println("the pairs count is :- ");
        System.out.print(Pair(arr,6));
    }
    static int Pair(int []arr,int target){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count++;
    }
}

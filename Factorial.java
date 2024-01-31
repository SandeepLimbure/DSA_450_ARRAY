package Array;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fact(20));
    }
    static long Fact(int n){
        long fact = 1;
        if(n==0 || n==1){
            return 1;
        }
        for(int i = 1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}

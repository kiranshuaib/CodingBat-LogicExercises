package logic2;

/**
 *
 Given 3 int values, a b c, return their sum.
 However, if one of the values is the same as another of the values, it does not count towards the sum

 oneSum(1, 2, 3) → 6
 loneSum(3, 2, 3) → 2
 loneSum(3, 3, 3) → 0
 */

public class LoneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(3,3,3));
    }
    public static int loneSum(int a, int b, int c) {
        int sum = a  + b + c;
        if (a == b && b!=c){
            return c;
        }else if (b == c && c!= a){
            return a;
        }else if(a == c && b!=a){
            return b;
        }else if (a==b && b==c && a== b){
            return 0;
        }else{
            return sum;
        }
    }
}

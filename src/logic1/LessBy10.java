package logic1;

public class LessBy10 {
    /**
     *
     Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


     lessBy10(1, 7, 11) → true
     lessBy10(1, 7, 10) → false
     lessBy10(11, 1, 7) → true

     */
    public static void main(String[] args) {
        System.out.println(lessBy10(1,7,11));
        System.out.println(lessBy10(1,7,10));
        System.out.println(lessBy10(11,1,7));
    }

    public static boolean lessBy10(int a, int b, int c) {
        int d = a-b;
        int e = b-c;
        int f = a-c;
        int i = c-a;
        int j = c-b;
        int k = b-a;
        if((d >=10)||(e>=10)||(f>=10)||(i>=10)||(j>=10)|| (k>=10)){
           return true;
        }else {
            return false;
        }
    }
}

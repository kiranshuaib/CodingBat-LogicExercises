package logic1;

public class ShareDigit {
    /**
     *
     Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
     such as the 2 in 12 and 23.
     (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)


     shareDigit(12, 23) → true
     shareDigit(12, 43) → false
     shareDigit(12, 44) → false
     */

    public static void main(String[] args) {
        System.out.println(shareDigit(12,23));
        System.out.println(shareDigit(12,43));
        System.out.println(shareDigit(12,44));
        System.out.println(shareDigit(55,44));
        System.out.println(shareDigit(23,12));
    }

    public static boolean shareDigit(int a, int b) {
//
//        System.out.println(a / 10);//2 left
//        System.out.println(b / 10);//1 left
//        System.out.println(a % 10);//3 right
//        System.out.println(b % 10);//2  right

        if((a%10 == b%10) || (a/10 == b/10)||(a%10 == b/10)||(a/10 == b%10)){
//
            return true;
        }
        else{
            return false;
        }



    }

}

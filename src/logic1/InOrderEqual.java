package logic1;

/**
 * Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
 * However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
 *
 *
 * inOrderEqual(2, 5, 11, false) → true
 * inOrderEqual(5, 7, 6, false) → false
 * inOrderEqual(5, 5, 7, true) → true
 */

public class InOrderEqual {
    public static void main(String[] args) {
        System.out.println(inOrderEqual(1,5,5,true));
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a < b && b < c && !equalOk) {
            return true;
        } if(equalOk && a == b && b == c ){
            return true;
        } else if((equalOk && a == b && b<c)||(equalOk && a<c && b == c)){
            return true;
        }else{
            return false;
        }
    }
    }

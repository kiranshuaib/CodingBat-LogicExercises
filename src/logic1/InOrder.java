package logic1;

public class InOrder {
    /**
     *
     Given three ints, a b c, return true if b is greater than a, and c is greater than b.
     However, with the exception that if "bOk" is true, b does not need to be greater than a.


     inOrder(1, 2, 4, false) → true
     inOrder(1, 2, 1, false) → false
     inOrder(1, 1, 2, true) → true
     */
    public static void main(String[] args) {
        System.out.println(inOrder(1,2,4,false));
        System.out.println(inOrder(1,2,1,false));
        System.out.println(inOrder(1,1,2,true));
        System.out.println(inOrder(4,2,2,true));//false
        System.out.println(inOrder(2,4,6,true));//true
        System.out.println(inOrder(7,5,4,true));//false
    }
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
    if(b>a && c>b ){
        return true;
    }else if( bOk && c>b){
        return true;
    }else {
        return false;
    }

    }

}


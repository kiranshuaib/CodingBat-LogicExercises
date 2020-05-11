package logic2;

public class EvenlySpaced {
    public static void main(String[] args) {
//        System.out.println(evenlySpaced(10,9,11));
        System.out.println(evenlySpaced(4,6,2));
    }

    public static  boolean evenlySpaced(int a, int b, int c) {
        int temp;
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }

        if(b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        return b - a == c - b;
    }





}
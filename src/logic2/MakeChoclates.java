package logic2;

public class MakeChoclates {
    public static void main(String[] args) {
        System.out.println(makeChocolate(5,4,9));
    }

    public static int makeChocolate(int small, int big, int goal) {
        int remainder;
        if (goal >= 5 * big){
            remainder = goal - 5 * big;
        }
        else{
            remainder = goal % 5;
        }
        if (remainder <= small) {
            return remainder;
        }
        return -1;
    }

}

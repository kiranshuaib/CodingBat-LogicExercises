package logic1;

public class SortASum {
    /**
     * Given 2 ints, a and b, return their sum.
     * However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
     * <p>
     * <p>
     * sortaSum(3, 4) → 7
     * sortaSum(9, 4) → 20
     * sortaSum(10, 11) → 21
     */
    public static void main(String[] args) {
        System.out.println(sortaSum(3,4));
        System.out.println(sortaSum(9,4));
        System.out.println(sortaSum(10,11));
    }

    public static int sortaSum(int a, int b) {
        int c = a + b;

        if (c >= 10 && c <= 19){
            return 20;
         } else {
          return c;
         }
}
}
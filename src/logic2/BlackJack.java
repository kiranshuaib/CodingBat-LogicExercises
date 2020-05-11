package logic2;

/**
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
 *
 *
 * blackjack(19, 21) → 21
 * blackjack(21, 19) → 21
 * blackjack(19, 22) → 19
 */
public class BlackJack {
    public static void main(String[] args) {
        System.out.println(blackjack(1,2));
    }

    public static int blackjack(int a, int b) {

        a = a>21 ?0 : a;
        b = b>21 ? 0: b;

        return (a > b)?a:b;


//            if(a > 21 && b > 21) return 0;
//            else if (a <= 21 && a > b || b > 21) return a;
//            return b;
//




//
    }
}

package logic1;

public class FizzString {
    /**
     *
     Given a string str, if the string starts with "f" return "Fizz".
     If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
     In all other cases, return the string unchanged. (See also: FizzBuzz Code)


     fizzString("fig") → "Fizz"
     fizzString("dib") → "Buzz"
     fizzString("fib") → "FizzBuzz"
     *
     */

    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));

    }

    public static String fizzString(String str) {
        if(
                ((str.startsWith("f")) ||(str.startsWith("F")))&&
                        !(((str.endsWith("b"))||(str.endsWith("B"))))
        ){
            return "Fizz";
        }else if(
                ((str.endsWith("b")) || (str.endsWith("B")))
                        && !((str.startsWith("f"))||(str.startsWith("F")))
        ) {
            return "Buzz";
        }else if(
                ((str.startsWith("f")) ||(str.startsWith("F")))
                        && ((str.endsWith("b"))||(str.endsWith("B")))
        ){
            return "FizzBuzz";
        }else{
            return str;
        }
    }

}
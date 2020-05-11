package logic2;

import com.sun.source.tree.DirectiveTree;

/**
 *
 We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


 makeBricks(3, 1, 8) → true
 makeBricks(3, 1, 9) → false
 makeBricks(3, 2, 10) → true
 */

public class MakeBricks {
    public static void main(String[] args) {
        System.out.println(makebricks(3,2,10));
    }
    public static boolean makebricks(int small, int big, int goal){
        if (goal >(big * 5 + small)){
            return false;
        }
        else if (goal % 5 > small){
            return false;
        }
        else return true;
    }



//        if((small +big*5 >= goal)){
//            return true;
//        }else if(goal % 5 < small){
//            return true;
//        }else return false;

}

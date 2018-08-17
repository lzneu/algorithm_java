package demo2;

import java.util.ArrayList;

public class Offer {
    public static void main(String args[]){
        String pre = "abcabcbb";
        int i = 32, j = 23;
//        System.out.print(j);
//        System.out.print(i);

        int[] in = {1,2,4,7,11,15};
        Solution solution = new Solution();
        ArrayList res = solution.FindNumbersWithSum(in, 15);
        System.out.print(res);
    }
}

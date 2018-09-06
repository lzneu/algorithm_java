package main;
//注意不要添加包名称，否则会报错。


import java.util.Scanner;

import java.lang.Math;
class Test {
    double count(int a, int b){
        double res = a;
        double tmp = a;
        for(int i = 1; i< b; i++){
            tmp = Math.sqrt(tmp);
            res += tmp;
        }
        return res;
    }

}
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Test test = new Test();
        int a, b;
        String s;
        char c;
        while(cin.hasNextInt())
        {
            a = cin.nextInt();
            s = cin.nextLine();
            b = cin.nextInt();
            double res = test.count(a, b);
            System.out.println(String.format("%.2f", res));

        }
    }
}
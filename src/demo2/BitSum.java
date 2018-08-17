package demo2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//从键盘输入一个整数 求该数的各位数字之和
public class BitSum {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a integer: ");
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        if(n <= 2)
            System.out.print(1);

        boolean[] que = new boolean[n];
        // 前两轮
        for(int k=0; k<n;k++){
            if (k %2 == 1)
                que[k] = false;
            else
                que[k] = true;
        }
        // 第3....n轮
        for(int i=3; i<n+1; i++){            //3...n
            //  第i轮==每i个人改变状态
            for(int j = i-1; j < n; j+=i){
                // j 就是要改变状态的队列中的索引
                que[j] = !que[j];
            }
        }

        // 统计输出
        int res = 0;
        for(int i=0; i < que.length; i++){
            if(que[i])
                res += 1;
        }
        System.out.print(res);

    }
}
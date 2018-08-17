package demo2;

import java.io.IOException;

public class KeyboardInput {
    public static void main(String args[]) throws IOException{  //抛出异常交予java虚拟机执行
        System.out.println("Input: ");
        byte buffer[] = new byte[512];
        int count = System.in.read(buffer);
        System.out.println(count);
        for (int i=0; i<count; i++){
            System.out.print(" " + buffer[i]);  // 按照字节方式输出buffer元素值
            System.out.println();
        }
        // 按照字符方式输出buffer的值
        for (int i=0; i< count; i++){
            System.out.print((char)buffer[i]);
            System.out.println();
        }


    }
}
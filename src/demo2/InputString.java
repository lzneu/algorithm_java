package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String please:");
        String s = in.readLine();
        int D = 0;
        int F = 0;
        int P = 0;
        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);
            if(c == 'D'){
                D++;
            }
            else{
                if(c == 'F'){
                    F++;
                }
                else{
                    P++;
                }
            }
        }
        if (D > 3 || F > 1){
            System.out.print("false");
        }
        else {
            System.out.print("ture");
        }
    }
}


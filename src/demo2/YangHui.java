package demo2;

/* 利用组合的方法求杨辉三角形 */



public class YangHui {
    public static long fac(int n){
        long res = 1;
        for (int k = 2; k <= n; k++){
            res = res * k;
        }
        return res;
    }

    public static long com(int n, int m) {
        return fac(n) / (fac((n - m)) * fac(m));
    }

    public static void main(String args[]){
        for (int n = 0; n <= 3; n++){
            for (int m = 0; m <= n; m++){
                System.out.print(com(n, m) + "  ");
            }
            System.out.println();
        }
    }
}

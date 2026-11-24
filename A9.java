public class A9 {
     /**
      * 主程式：呼叫 f(2,2)，印出 Ackermann 函數的結果（7）。
      */
     public static void main(String[] args) {
        System.out.println(f(2,2));
    }
    /**
     * 遞迴計算 Ackermann 函數 A(m, n)：
     * m 為 0 回傳 n+1；n 為 0 回傳 A(m-1, 1)；否則回傳 A(m-1, A(m, n-1))。
     */
    public static int f(int m,int n) {
       if(m==0)
            return n+1;
       else if(n ==0)
            return f(m-1,1);
       else 
            return f(m-1,f(m,(n-1)));
    }
}

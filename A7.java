public class A7 {
    /**
     * 主程式：呼叫遞迴函式 f(5)，印出 5! 的結果。
     */
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    /**
     * 遞迴計算階乘 n!：n 為 1 時回傳 1，否則回傳 n × f(n-1)。
     */
    public static int f(int n) {
       if(n==1)  
            return 1;
       else
            return n*f(n-1);

    }
}

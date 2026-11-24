public class A8 {
    /**
     * 主程式：呼叫 f(8)，印出費氏數列第 8 項（21）。
     */
    public static void main(String[] args) {
        System.out.println(f(8));
    }
    /**
     * 遞迴計算費氏數列第 n 項：第 1、2 項為 1，之後每一項等於前兩項相加。
     */
    public static int f(int n) {
       if((n==1) || (n==2))
            return 1;
       else
            return f(n-1)+f(n-2);

    }
}


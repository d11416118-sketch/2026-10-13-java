import java.util.Scanner;

public class B2 {
    /**
     * 主程式：改用長度 5 的陣列存 5 個整數，用迴圈讀入並加總，印出總和與平均。
     */
    public static void main(String[] args) {

        int [] a;
        a = new int[5] ;
        int sum =0;
        double avg;
        for(int i=0 ; i<5 ; i++)
            a[i]=input();
        for(int i=0 ; i<5 ;i++)
            sum=sum +a[i];
        avg=(double)sum/5;
        System.out.printf("sum=%d avg=%3.2f",sum,avg);
    }
    
    /**
     * 提示「輸入數字n」，讀入並回傳一個整數。
     */
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入數字n");
        return    sc.nextInt();
    }
}

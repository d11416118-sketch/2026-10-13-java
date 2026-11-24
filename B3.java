import java.util.Scanner;

public class B3 {
    /**
     * 主程式：同 B2，但迴圈上限改用 a.length，陣列長度改變時不用再改迴圈。
     */
    public static void main(String[] args) {

        int [] a;
        a = new int[5] ;
        int sum =0;
        double avg;
        for(int i=0 ; i<a.length ; i++)
            a[i]=input();
        for(int i=0 ; i<a.length ;i++)
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

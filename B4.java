import java.util.Scanner;

public class B4 {
    /**
     * 主程式：先讀入資料筆數 n 並建立長度 n 的陣列，再逐筆讀入資料，計算並印出總和與平均。
     */
    public static void main(String[] args) {
        System.out.println("輸入次數");
        int n=  input();
        int [] a;
        a = new int[n] ;
        int sum =0;
        double avg;
        for(int i=0 ; i<a.length ; i++){
            System.out.printf("輸入資料",i);
            a[i]=input();
            }
        for(int i=0 ; i<a.length ;i++)
            sum=sum +a[i];
        avg=(double)sum/a.length;
        System.out.printf("sum=%d avg=%3.2f",sum,avg);
    }
    
    /**
     * 讀入並回傳一個整數（不印提示文字）。
     */
    public static int input() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("輸入數字n");
        return    sc.nextInt();
    }
}

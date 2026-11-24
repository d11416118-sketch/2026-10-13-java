import java.util.Scanner;

public class A1 {
    /**
     * 主程式：讀入 n，每層先印 (n-i) 個 #，再印 1~i 的數字後換行，組成 n 層靠右數字三角形。
     */
    public static void main(String[] args) {
        int n ;
            n = input();
            for(int i=1 ; i<=n ; i++){
                star(n-i,'#');
                star(i);
                System.out.println();
            }
    }
    /**
     * 提示「輸入數字n」，讀入並回傳一個整數。
     */
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入數字n");
        return    sc.nextInt();
    }
    /**
     * 印出 1 到 x 的連續數字（不換行）。
     */
    public static void star(int x) {
        for(int i=1 ; i<=x ; i++){
            System.out.print(i);
        }
    }
    /**
     * 印出 x 個指定字元 c（不換行），常用來補前面的空白或符號。
     */
    public static void star(int x , char c) {
        for(int i=1 ; i<=x ; i++){
            System.out.print(c);
        }
    }
}
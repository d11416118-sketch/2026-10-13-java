import java.util.Scanner;

public class A3 {
    /**
     * 主程式：和 A2 一樣印出數字金字塔，但把遞增、遞減合併成同一個 star(x, k)，用 k 切換。
     */
    public static void main(String[] args) {
        int n;
        n = input();
        for(int i=1 ; i<=n ; i++){
                star(n-i,' ');
                star(i,1);
                star(i-1,0);
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
     * k == 1 時由 1 印到 x（遞增），k == 0 時由 x 倒數印到 1（遞減），都不換行。
     */
    public static void star(int x,int k) {
        if(k == 1){
            for(int i=1 ; i<=x ; i++){
                System.out.print(i);
            }
        }
        if(k == 0){
            for(int i=x ; i>=1 ; i--){
            System.out.print(i);
            }
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

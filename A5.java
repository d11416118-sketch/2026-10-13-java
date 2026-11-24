import java.util.Scanner;

public class A5 {
    /**
     * 主程式：讀入 n，每層印 (n-i) 個空白與 (2i-1) 個星號，只用一個方法就組成星號金字塔。
     */
    public static void main(String[] args) {
        int n;
        n = input();
        for(int i=1 ; i<=n ; i++){
                star(n-i,' ');
                star(2*i-1,'*');
                
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
     * 印出 x 個指定字元 c（不換行），常用來補前面的空白或符號。
     */
    public static void star(int x,char c) {
       
             
        for(int i=1 ; i<=x ; i++){
            System.out.print(c);
        
    }
    }


}

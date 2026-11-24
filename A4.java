import java.util.Scanner;

public class A4 {
    /**
     * 主程式：讀入 n，每層印 (n-i) 個空白，再印 i 個和 (i-1) 個星號，組成星號金字塔。
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
     * 印出 x 個星號 *（不換行）；k == 1 與 k == 0 兩種寫法印出的結果一樣。
     */
    public static void star(int x,int k) {
        if(k == 1){
            for(int i=1 ; i<=x ; i++){
                System.out.print('*');
            }
        }
        if(k == 0){
            for(int i=x ; i>=1 ; i--){
            System.out.print('*');
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

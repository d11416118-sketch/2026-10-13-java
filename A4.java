import java.util.Scanner;

public class A4 {
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
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入數字n");
        return    sc.nextInt();
    }
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

    
    public static void star(int x , char c) {
        for(int i=1 ; i<=x ; i++){
            System.out.print(c);
        }
    }


}

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int n ;
            n = input();
            for(int i=1 ; i<=n ; i++){
                star(n-i,'#');
                star(i);
                System.out.println();
            }
    }
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入數字n");
        return    sc.nextInt();
    }
    public static void star(int x) {
        for(int i=1 ; i<=x ; i++){
            System.out.print(i);
        }
    }
    public static void star(int x , char c) {
        for(int i=1 ; i<=x ; i++){
            System.out.print(c);
        }
    }
}
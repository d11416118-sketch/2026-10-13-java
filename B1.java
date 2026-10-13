import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {

        int a0,a1,a2,a3,a4;
        int sum =0;
        double avg;
        a0=input();
        a1=input();
        a2=input();
        a3=input();
        a4=input();
        sum=a0+a1+a2+a3+a4 ;
        avg=(double)sum/5;
        System.out.printf("sum=%d avg=%3.2f",sum,avg);
    }
    
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入數字n");
        return    sc.nextInt();
    }

}

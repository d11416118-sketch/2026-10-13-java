import java.util.Scanner;

public class B2 {
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
    
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入數字n");
        return    sc.nextInt();
    }
}

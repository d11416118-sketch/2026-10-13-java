public class A9 {
     public static void main(String[] args) {
        System.out.println(f(2,2));
    }
    public static int f(int m,int n) {
       if(m==0)
            return n+1;
       else if(n ==0)
            return f(m-1,1);
       else 
            return f(m-1,f(m,(n-1)));
    }
}

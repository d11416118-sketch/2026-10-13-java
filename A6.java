public class A6 {
    /**
     * 用 for 迴圈計算 5!（1×2×3×4×5）並印出結果 120。
     */
    public static void main(String[] args) {
        int p=1;
        for(int i=1 ; i<=5 ;i++){
            p=p*i;
        }
        System.out.println(p);
    }

}

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        for (int i=5;i<=n;i++){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

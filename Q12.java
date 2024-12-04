public class Q12 {
    public static void Sum(int n ) {
        if (n == 0) {
            System.out.println("The number is Zero!!!!");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i ;
        }
        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args) {
        Sum(4);
    }
}

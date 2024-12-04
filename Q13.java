public class Q13 {
    public static void Sum(int n ) {
        if (n == 0) {
            System.out.println("The number is Zero!!!!");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2!=0)
                sum += i ;
        }
        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args) {
        Sum(5);
    }
}

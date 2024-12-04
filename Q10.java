public class Q10 {
    public static boolean isMultiple (Long n , Long m){
        if (m == 0) {
            return false;
        }
        return n % m == 0;
    }
    public static void main(String[] args) {
        System.out.println(isMultiple(100L,10L));
    }
}

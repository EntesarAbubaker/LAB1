public class Q11 {
    public static boolean isEven (int i ){
        if (i < 0) {
            i = -i;
        }
        while (i > 1) {
            i -= 2;
        }
        return i == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(21));
    }
}

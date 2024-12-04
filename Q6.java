import java.util.Scanner;

public class Q6 {
    public static void inputelements(int numbers[]) {
        System.out.println("Enter Elements : ");
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = obj.nextInt();

        }
        //للتأكد من أن العناصر أضيفت إلى المصفوفة
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] +" ");

        }
    }
    public static void main(String[] args) {
        int numbers [] = new int [3];
        inputelements(numbers);
    }
}

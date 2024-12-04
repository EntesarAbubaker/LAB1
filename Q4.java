import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String [] array = new String[3];
        System.out.println("Enter Elements : ");
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]= obj.next();
        }
        //للتأكد من أن العناصر أضيفت إلى المصفوفة
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");

        }
    }
}

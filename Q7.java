import java.util.Scanner;

class Students {
    String name ;
    int ID ;
    String Mijor ;

    public Students(String name, int ID, String Mijor) {
        this.name = name;
        this.ID = ID;
        this.Mijor = Mijor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMijor() {
        return Mijor;
    }

    public void setMijor(String Mijor) {
        this.Mijor = Mijor;
    }

    @Override
    public String toString() {
        return "Students{" + "name=" + name + ", ID=" + ID + ", Mijor=" + Mijor + '}';
    }
}
public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter Students Information  : ");
        Scanner obj = new Scanner(System.in);
        Students []students = new Students[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Students(obj.next(), obj.nextInt(),obj.next());

        }
        //للتأكد من أن العناصر أضيفت إلى المصفوفة
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] +" ");

        }
    }
}

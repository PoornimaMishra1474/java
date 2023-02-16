import java.util.Scanner;
public class Student {
    public static void main(String args[]) {
        int rno[] = new int[10];
        String name[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name of student:");
            name[i] = sc.next();

            System.out.println("Enter roll number:");
            rno[i] = sc.nextInt();
        }
        try{
            System.out.println(rno[11]);
            System.out.println(name[11]);


        }
        catch(Exception e){
            System.out.println("Array index is not correct check it !!!");
        }
        System.out.println(rno[1]);
        System.out.println(name[1]);
    }
}
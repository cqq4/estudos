import java.util.Locale;
import java.util.Scanner;

import entities.Student;
public class main54 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.Name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();
        System.out.println(student.toString());
        if (student.Pass()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",student.notPass());
        }
        sc.close();

        

        
    }
    
}

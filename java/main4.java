import java.util.Scanner;
public class Main4{
    public static void main(String[] argd){
        Scanner sc = new Scanner(System.in);
         
        String a, b,c;
        int d;

        d = sc.nextInt();
        sc.nextLine();
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

        System.out.println("Strings:");
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}
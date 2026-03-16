import java.util.Scanner;
public class Main3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String a;
        //a = sc.next();
        //System.out.println(a);
        //Double b;
       // b = sc.nextDouble();
        //System.out.println(b);
       // int c;
      //  c = sc.nextInt();
      //  System.out.println(c);
        //char d;
        //d = sc.next().charAt(0);
        //System.out.println(d);    
        int x;
        String y;
        double z;
        x = sc.nextInt();
        y = sc.next();
        z = sc.nextDouble();
        System.out.printf("Seu numero foi: %d. Sua String foi %s. Seu numero double foi: %f", x, y, z);
        sc.close();
     }
}
import java.util.Scanner;
public class main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, vel;
        temp = sc.nextInt();
        vel = sc.nextInt();
        double calc = temp* vel;
        System.out.printf("%.3f", calc/12);
        sc.close();
    }
    
}

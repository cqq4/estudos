
import java.util.Scanner;

public class bee1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        for(int i=1; i < 11; i++){
            System.out.printf("%d x %d = %d\n", i, x, i*x);
        }
        sc.close();
    }
}

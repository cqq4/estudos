
import java.util.Scanner;

public class bee2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cont = 0;           
        int [] a = new int[5];
        for (int i =0; i < 5; i ++){
            a[i] =sc.nextInt();
            if (a[i] == t){
                cont++;
            }
        }

        System.out.println(cont);
        sc.close();
    }
}

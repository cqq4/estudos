
import java.util.Scanner;

public class bee1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=0; i < x; i++){
            double n1 = sc.nextInt();
            double n2 = sc.nextInt();
            if (n2 != 0){
                double divisao = n1/n2;
                System.out.println(divisao);
            }else {
                System.out.println("divisao impossivel");
            }
            
        }
        sc.close();
    }
}


import java.util.Scanner;

public class bee11134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int conta = 0;
        int contg = 0;
        int contd = 0;
        while (x >0){
            if (x == 1){
                conta++;
            }else if(x == 2){
                contg++;
            }else if (x==3){
                contd++;
            }else if (x==4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + conta);
                System.out.println("Gasoline: " + contg);
                System.out.println("Diesel: " + contd);
                break;
            }
            x = sc.nextInt();
        }
    }
}

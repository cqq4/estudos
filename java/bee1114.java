
import java.util.Scanner;

public class bee1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = 2002;
        int tent;
        tent = sc.nextInt();
        while (tent != pass){
            System.out.println("Senha Invalida");
            tent = sc.nextInt();
            if (tent == pass){
                System.out.println("Acesso Permitido");
                break;
            }
        }
        sc.close();
    }
}

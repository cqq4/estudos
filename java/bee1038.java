import java.util.Locale;
import java.util.Scanner;
public class bee1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int qtd = sc .nextInt();
        double preco1 = 0;
        switch(a){
            case 1:
                preco1 = 4.00;
                break;
            case 2:
                preco1 = 4.50;
                break;
            case 3:
                preco1 =5.00;
                break;
            case 4:
                preco1 =2.00;
                break;
            case 5:
                preco1 = 1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f\n",preco1*qtd );
    }
}

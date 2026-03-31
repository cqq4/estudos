import java.util.Locale;
import java.util.Scanner;

public class bee1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = 0;
        int r = 0;
        int s = 0;
        int all = 0;
        for (int i =0; i<x; i++){
            int qtd = sc.nextInt();
            String entrada = sc.next();
            if(entrada.equals("C")){
                c+=qtd;
                all+= qtd;
            }else if(entrada.equals("R")){
                r+=qtd;
                all+= qtd;
            }else if(entrada.equals("S")){
                s+=qtd;
                all+= qtd;
            }
        }
        System.out.printf("Total: %d cobaias\n", all);
        System.out.printf("Total de coelhos: %d\n", c);
        System.out.printf("Total de ratos: %d\n", r);
        System.out.printf("Total de sapos: %d\n", s);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (double)c/all*100);
        System.out.printf("Percentual de ratos: %.2f %%\n", (double)r/all*100);
        System.out.printf("Percentual de sapos: %.2f %%\n", (double)s/all*100);
        sc.close();
    }
}

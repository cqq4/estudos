import java.util.Locale;
import java.util.Scanner;

public class main37 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] produto = new String[n];
        double [] preco = new double[n];
        double [] precoVenda = new double[n];
        double total = 0;
        double totalVenda=0;
        int abaixo10 = 0;
        int acima20 = 0;
        int entre10e20 = 0;
        double lucroTotal = 0;
        for(int i=0; i<n; i++){
            produto[i] = sc.next();
            preco[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();
            total += preco[i];
            totalVenda += precoVenda[i];
            double lucro = 0;
            if(preco[i]!=0){
                lucro = ((precoVenda[i] - preco[i])/preco[i]) *100;
            }
            if(lucro < 10){
                abaixo10++;
            }else if(lucro <= 20){
                entre10e20++;
            }else{
                acima20++;
            }
        }
        lucroTotal = totalVenda - total;
        System.out.printf("Lucro abaixo de 10: %d\n", abaixo10);
        System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre10e20);
        System.out.printf("Lucro acima de 20%%: %d \n", acima20);
        System.out.printf("Valor total de compra: %.2f\n",total);
        System.out.printf("Valor total de venda: %.2f\n", totalVenda);
        System.out.printf("Lucro total: %.2f\n", lucroTotal);
        sc.close();
    }
}

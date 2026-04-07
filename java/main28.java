import java.util.Locale;
import java.util.Scanner;

public class main28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] nome = new String[n];
        double [] idade = new double[n];
        double [] altura = new double[n];
        double media = 0;
        int cont=0;
        for(int i =0; i < n; i++){
            sc.nextLine();
            nome[i] = sc.nextLine();
            idade[i] = sc.nextDouble();
            altura[i] = sc.nextDouble();
            media  += altura[i]/n;
            if(idade[i] < 16){
                cont++;
            }
        }
        double mediaIdade = (cont * 100.0) / n;
        System.out.printf("Altura media: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", mediaIdade);
    }
    
}

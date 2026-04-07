import java.util.Scanner;
import java.util.Locale;

public class main36 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] alt = new double[n];
        String [] sex = new String[n];
        int contH = 0;
        double Maior = 0;
        double Menor = 0;
        double mediaM = 0;
        double contM = 0;
        for(int i=0; i<n; i++){
            alt[i] = sc.nextDouble();
            sex[i] = sc.next();
            if(i==0){
                Maior = alt[i];
                Menor = alt[i];
            }
            if(alt[i] > Maior){
                Maior = alt[i];
            }
            if (alt[i] < Menor){
                Menor = alt[i];
            }
            if(sex[i].equals("M")){
                contH++;
            }
            if (sex[i].equals("F")){
                mediaM += alt[i];
                contM++;
            }
        }
        mediaM = mediaM/contM;
        System.out.printf("Menor altura = %.2f\n", Menor);
        System.out.printf("Maior altura =  %.2f\n", Maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaM);
        System.out.println("Numero de homens = " + contH);
    }
}

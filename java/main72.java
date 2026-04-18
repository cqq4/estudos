import java.util.Locale;
import java.util.Scanner;

public class main72 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        int contF = 0;
        int contM = 0;
        double media = 0;
        double sum = 0;

        System.out.printf("Altura da 1a pessoa: ");
        vect[0] = sc.nextDouble();
        System.out.printf("Genero da 1a pessoa: ");
        char genero = sc.next().charAt(0);
        if (genero == 'M') contM++;


        if (genero == 'F') {
            contF++;
            sum += vect[0];

            double maior = vect[0];
            double menor = vect[0];

            for (int i = 1; i < vect.length; i++) {
                System.out.printf("Altura da %da pessoa: ", i + 1);
                vect[i] = sc.nextDouble();
                System.out.printf("Genero da %da pessoa: ", i + 1);
                genero = sc.next().charAt(0);

                if (vect[i] < menor) menor = vect[i];

                if (vect[i] > maior) maior = vect[i];

                if (genero == 'M') contM++;


                if (genero == 'F') {
                    contF++;
                    sum += vect[i];
                }
            }

            media = sum / contF;

            System.out.printf("Menor altura %.2f\n", menor);
            System.out.printf("Maior altura %.2f\n", maior);
            System.out.printf("Media de altura da mulheres = %.2f\n", media);
            System.out.printf("Numero de hoemns = %d\n", contM);
            sc.close();
        }
    }
}
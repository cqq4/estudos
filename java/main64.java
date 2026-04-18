import entities.Fix1;

import java.util.Locale;
import java.util.Scanner;

public class main64 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double alt = 0;
        int cont = 0;
        sc.nextLine();
        Fix1[] a = new Fix1[n];

        for(int i=0; i < a.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            a[i] = new Fix1(nome,idade,altura);
            alt += altura;
        }

        alt = alt/n;
        System.out.printf("Altura media: %.2f%n",alt);

        for(int i=0; i< a.length; i++){
            if(a[i].getIdade() < 16) {
                cont++;
            }
        }
        double menores = (cont * 100.00)/n;

        System.out.printf("Pessoas com menos de 16 anos: %.2f%% \n", menores);
        for(int i=0; i<a.length; i++){
            if(a[i].getIdade() < 16){
                System.out.println(a[i].getNome());
            }
        }

        sc.close();
    }
}

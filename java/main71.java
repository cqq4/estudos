import entities.Fix3;
import java.util.Locale;
import java.util.Scanner;

public class main71 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        sc.nextLine();

        Fix3 []vect = new Fix3[n];
        for(int i=0; i<vect.length; i++) {
            System.out.printf("Digite nome, primeira e segunta nota do %do aluno:\n", i + 1);

            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Fix3(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados: ");

        for(int i=0; i<vect.length; i++) {
            double media = (vect[i].getNota() + vect[i].getNota2()) / 2;

            if (media >= 6.0) {
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();

    }
}

import java.util.Locale;
import java.util.Scanner;
public class bee1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3,n4;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        double n5 = 0;
        double media = (n1*2 + n2*3 + n3*4 + n4*1) /10;
        double mediaPrint = (int)(media* 10)/10.0;
        if (media >= 7.0){
            System.out.printf("Media: %.1f\n",mediaPrint);
            System.out.println("Aluno aprovado.");
        }else if (media < 5.0){
            System.out.printf("Media: %.1f\n",mediaPrint);
            System.out.println("Aluno reprovado.");
        }else{
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno em exame.");
            n5 = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", n5);
            media = (media + n5)/2;
            if(media >= 5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",media);

        }

    }
}

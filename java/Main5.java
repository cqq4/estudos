import java.util.Locale;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float a,b,c,area, preco;
        System.out.println("Digite a Largura do terreno:");
        a = sc.nextFloat();
        System.out.println("Digite o Comprimento do terreno:");
        b = sc.nextFloat();
        System.out.println("Qual o valor por metro Quadrado do terreno:");
        c = sc.nextFloat();
        System.out.printf("A area do do seu terreno e de: %.2f %n", a*b);
        System.out.printf("O Preco por metro Quadrado do seu terreno sera de: %.2f %n", a*b*c);
        sc.close();
    }
}

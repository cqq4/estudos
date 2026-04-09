import entities.Retangle;
import java.util.Locale;
import java.util.Scanner;
public class main52 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangle retangulo = new Retangle();
        System.out.println("Insira o tamanho e largura do Retangulo: ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();
        System.out.println(retangulo.toString());
        sc.close();
        
    }
}

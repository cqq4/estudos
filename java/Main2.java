import java.util.Locale;

public class Main2 {
    public static void main(String[] args){
        String produto1 = "Computador";
        String produto2 = "Mesa de Escritorio";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        double preco1 = 2100;
        double preco2 = 650.50;
        double medida = 53.2345676;

        System.out.println("Produtos:");
        System.out.printf("O preco do %s, Sera de %.2f %n", produto1, preco1 );
        System.out.printf("O preco de %s, Sera de %.2f %n", produto2, preco2);

        System.out.printf("Registro: %d Anos, Codigo: %d, Genero: %s %n", idade, codigo, genero);
        System.out.printf("Medida com 8 casas decimais: %f %n", medida);
        System.out.printf("Medida com 3 casas decimais %.3f %n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Medida com ponto decimal US: %.3f", medida);
    }
}

import java.util.Locale;

public class Main {
public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Ola Mundo!"); //println (ln= quebra de linha)
        System.out.println("teste de linha"); //sem ln (n tem quebra) 
        int a = 10;
        int b = 90;
        //String opcao;
        double c = a+b;
        if (c == 100){
            System.out.printf("%.2f%n", c); //2 casas decimais 
            System.out.printf("%.4f%n", c); //4 casas decimais
        }else{
            System.out.println("Erro!");
        }
            
    }  
}
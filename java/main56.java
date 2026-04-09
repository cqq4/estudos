import java.util.Locale;
import java.util.Scanner;

import entities.Radius;

public class main56 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);    
        //Radius radius = new Radius(); //instancia
        System.out.print("Enter radius: ");
        double valor = sc.nextDouble();
        Radius.calcular(valor);
        //System.out.println(Radius.toString());
        System.out.printf("Circunferencia: %.2f\n", Radius.circunferencia);
        System.out.printf("Volume %.2f\n", Radius.volume);
        System.out.printf("Valor de PI: %.2f", Radius.PI);
        //Valores setados sem necessidade de uma instancia pois todos sao estaticos
        //Assim podem ser acessados dentro da public class static/Main
    }
}

//dentro da class static n pode ser adicionada outros metodos q n sao estaticos

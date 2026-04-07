import java.util.Locale;
import java.util.Scanner;

import entities.Triangle; //caminho do outro arquivo 

public class main50 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Paramentros Area X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Paramentros Area Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        System.out.printf("Area Triangulo X: %.4f%n", areaX);

        double areaY = y.area();
        System.out.printf("Area Triangulo Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Maior area: X");
        }else{
            System.out.println("Maior area: Y");
        }
        sc.close();
    }
}
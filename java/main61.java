import entities.ProductVector;

import java.util.Scanner;
import java.util.Locale;
public class main61 {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ProductVector[] vect = new ProductVector[n];

        for(int i = 0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductVector(name, price);
        }
        double media = 0;
        for(int i = 0; i<vect.length; i++){
            media += vect[i].getPrice()/vect.length; //.getPrice pega somente o valor do preco e nao do nome/String
        }
        System.out.printf("Media de preco %.2f", media);
        sc.close();
    }
}

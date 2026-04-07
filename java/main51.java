import java.util.Locale;
import java.util.Scanner;
import entities.Stock;

public class main51 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Stock product = new Stock();
        System.out.println("Insira os dados do produto");
        System.out.print("Produto: ");
        product.name = sc.next();
        System.out.print("Preco: ");
        product.price = sc.nextDouble();


        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt(); 
        System.out.println("Product data: " + product);
        System.out.println();


        System.out.print("Enter the number of products to be added in sotck: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);
        System.out.println();


        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("Updated data: " + product);

        
        sc.close();
    }
}

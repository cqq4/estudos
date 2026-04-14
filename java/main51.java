import java.util.Locale;
import java.util.Scanner;
import entities.Stock;

public class main51 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert product data");
        System.out.print("Produto: ");
        String name = sc.next();

        System.out.print("Preco: ");
        double price = sc.nextDouble();


        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Stock stock = new Stock(name, price, quantity);

        System.out.println("Product data: " + stock);

        System.out.print("Enter the number of products to be added in stock: ");
        stock.setQuantity(sc.nextInt());
        stock.addProducts(quantity);
        System.out.println("Updated data: " + stock);
        System.out.println();


        System.out.print("Enter the number of products to be removed in stock: ");
        stock.setQuantity(sc.nextInt());
        stock.RemoveProducts(quantity);
        System.out.println("Updated data: " + stock);

        sc.close();
    }
}

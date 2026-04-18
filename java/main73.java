import entities.Rent;

import java.util.Scanner;
public class main73 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Rent[] vect = new Rent[10];
        System.out.print("Quantos Quartos seram reservados? ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            System.out.printf("Hospede #%d:\n", i);
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Rent(nome, email);
        }

        System.out.println("Quartos reservados: ");
        for(int i=0; i < 10; i++) {
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
                sc.close();
            }
        }
    }

}

import entities.Account;
import entities.Banc;

import java.util.Locale;
import java.util.Scanner;

public class main59 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banc banc;

        System.out.print("Informe o numero da conta: ");
        int numconta = sc.nextInt();

        System.out.print("Informe seu nome: ");
        String nome = sc.next();
        banc = new Banc(numconta, nome);

        System.out.print("Esse e o seu primeiro deposito (y/n)? ");
        char opcao = sc.next().charAt(0);
        if(opcao == 'y'){
            System.out.print("Informe o valor a ser depositado: ");
            double deposito = sc.nextDouble();
            banc = new Banc(numconta, nome, deposito);
        }
        System.out.println("Status da conta:");
        System.out.println(banc);
        System.out.println();

        System.out.print("Informe o valor do deposito: ");
        double deposito = sc.nextDouble();
        banc.depositar(deposito);
        System.out.println("Atualizacao de dados da conta: ");
        System.out.println(banc);
        System.out.println();

        System.out.print("Informe o valor de Saque: ");
        double saque = sc.nextDouble();
        banc.sacar(saque);
        System.out.println("Atualizacao de saque da conta: ");
        System.out.println(banc);


    }
}

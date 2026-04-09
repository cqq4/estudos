import java.util.Locale;
import java.util.Scanner;

import entities.Account;
public class main55 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account conta = new Account();
        System.out.println("Ola Cliente, Poderia me informar seu nome? ");
        conta.nome = sc.nextLine();
        
        System.out.println("E um prazer Sr(a) " + conta.nome + " Qual operacao gostaria de realizar? ");
        int opcao;
        System.out.println();

        do{
            System.out.println("[1] Para depositar ");
            System.out.println("[2] Para Sacar");
            System.out.println("[3]Verificar Saldo");
            System.out.println("[0] Para sair");
            
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            System.out.println();

            if(opcao == 1){
                System.out.print("Qual valor Gostaria de Depositar?: ");
                double valor = sc.nextDouble();
                System.out.println();
                if (valor > 0){
                    conta.Deposit(valor);
                    System.out.println("Saldo Adicionado com Sucesso! ");
                    System.out.println();
                }else{
                    System.out.println("Valor invalido!");
                }
                System.out.println();
            }
            
            else if(opcao == 2){
                System.out.print("Qual valor Gostaria de Sacar?: ");
                double valor = sc.nextDouble();
                if(valor <= 0 || valor + 5.0 > conta.getSaldo()){
                    System.out.println("Impossivel concluir sua operacao! (saldo invalido)");
                    System.out.println();
               }else{
                    conta.Retirada(valor);
                    System.out.println("Saldo retirado com sucesso!");
                }
                System.out.println();

            }
            
            else if(opcao == 3){
                System.out.printf("Sr(a) %s, seu saldo atual e: %.2f R$%n", conta.nome, conta.getSaldo());
                System.out.println();
            }
        }while(opcao != 0);
    
    }
}

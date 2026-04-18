import entities.Fix2;

import java.util.Scanner;

public class main70 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Fix2 [] vect = new Fix2[n];
        int idadeVelho = 0;
        String velho = "";

        for(int i=0; i<vect.length; i++){
            System.out.printf("Dados da %da pessoa:\n ", i+1);
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new Fix2(nome, idade);
            if(vect[i].getIdade() > idadeVelho){
                idadeVelho = vect[i].getIdade();
                velho = vect[i].getNome();
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s ", velho);
        sc.close();
    }
}



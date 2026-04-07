import java.util.Scanner;

public class main35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] nome = new String[n];
        int [] idade = new int[n];
        int velho = 0;
        String velhonome = "";
        for(int i=0; i<n; i++){
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            if(idade[i] > velho){
                velho = idade[i];
                velhonome = nome[i];
            }
        }
        System.out.println("Pessoa mais velha: " + velhonome);
        sc.close();
    }
}


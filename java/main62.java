import java.util.Scanner;

public class main62 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int [] x = new int [n];
        int cont  =0;
        for(int i=0; i<x.length; i++){
            System.out.print("Digite um numero: ");
            x[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i=0; i<x.length; i++){
            if(x[i] < 0) {
                System.out.println(x[i]);
            }
        }
        sc.close();
    }
}

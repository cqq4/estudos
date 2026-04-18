import java.util.Scanner;

public class main69 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double sum = 0;
        double media = 0;
        int cont = 0;
        int [] vect = new int [n];
        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i]= sc.nextInt();
            if(vect[i]%2 == 0) {
                sum += vect[i];
                cont++;
            }
        }

        media = sum/cont;

        if(media > 0){
            System.out.print("MEDIA DOS PARES =  " + media);
        }else {
            System.out.print("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}

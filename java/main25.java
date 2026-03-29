import java.util.Scanner;

public class main25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int soma =0;
    int cont =0;
    while (x >= 0){
        soma += x;
        cont ++;
        x = sc.nextInt();
    }
    if (cont > 0){
        double media = (double) soma/cont;
        System.out.printf("%.2f\n", media);
    }else{
        System.out.println("Impossivel calcular");
    }
        
    }
}

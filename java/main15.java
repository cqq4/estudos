import java.util.Scanner;
public class main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.printf("%d \n",n);
        int[] notas = {100,50,20,10,5,2,1};
        for (int i = 0; i < 7; i++){
            int qtd = n / notas[i];
            System.out.printf("%d nota(s) de R$ %d,00\n", qtd, notas[i]);
            n = n %notas[i];
        }


    }
}

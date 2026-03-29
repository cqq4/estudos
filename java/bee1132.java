
import java.util.Scanner;

public class bee1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int inicio = Math.min(y, x);
        int fim = Math.max(y, x);
        int soma = 0;
        for(int i=inicio; i <= fim; i++){
            if(i%13 !=0){
                soma+=i;
            }
        }
        System.out.println(soma);
        sc.close();
    }
}

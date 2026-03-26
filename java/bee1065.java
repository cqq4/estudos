import java.util.Scanner;

public class bee1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[5];
        int cont = 0;
        for(int i = 0; i < 5; i++){
            a[i] = sc.nextInt();
            if ((a[i]% 2) ==0){ //compara se o valor e par ou n
                cont++;
            }
        }
        System.out.printf("%d valores pares", cont);
        sc.close();
    }
}


import java.util.Scanner;

public class bee1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        int cont = 0;
        while (x != 0){
            if((x%2) != 0){
                x++;
            }
            while(cont !=5){
            soma +=x;
            x+=2;
            cont++;
            }
            System.out.println(soma);
            cont = 0;
            soma =0;
            x = sc.nextInt();
        }
      sc.close();
    }
}


import java.util.Scanner;

public class bee1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont =1;
        int x= sc.nextInt();
        int maior = x;
        for(int i=0; i < 99; i++){
            x= sc.nextInt();
            if(x > maior){
                maior = x;
                cont = i+2;
            }
        }
        System.out.println(maior);
        System.out.println(cont);
        sc.close();
    }
}

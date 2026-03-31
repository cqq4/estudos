import java.util.Scanner;

public class bee1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            if(x%2 == 0){
                x++;
            }
            for(int j=0; j < y; j++){
                soma+=x;
                x += 2;
            }
            System.out.println(soma);
        }
        sc.close();
    }
}

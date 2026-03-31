import java.util.Scanner;

public class bee1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cont = 0;
        for(int i =1; i <= y; i++){
            cont++;
            System.out.printf("%d", i);
            if(cont < x && i !=y){
                System.out.printf(" ");
            }
            if(cont == x || cont == y){
                System.out.println();
                cont = 0;
            }
        }
        sc.close();
    }
}

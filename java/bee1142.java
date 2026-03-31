import java.util.Scanner;

public class bee1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =1;
        for(int i=1; i <= n; i++){
            System.out.printf("%d %d %d PUM\n", x, x+1, x+2);       
            x += 4; 
        }
        sc.close();
    }
}

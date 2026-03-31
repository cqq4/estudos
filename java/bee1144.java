import java.util.Scanner;

public class bee1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n*2/2; i++){
            System.out.printf("%d %d %d\n", i, i*i, i*i*i);
            System.out.printf("%d %d %d\n", i, i*i + 1, i*i*i +1);
        }
        sc.close();
    }
}

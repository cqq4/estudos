import java.util.Scanner;

public class main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cont = 0;
        int [] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
            if(num[i]%2 == 0){
                System.out.printf("%d ", num[i]);
                cont++;
            }
        }
        System.out.println();
        System.out.println(cont);
        sc.close();
    }
}

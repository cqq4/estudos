import java.util.Scanner;

public class bee1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        for (int i=0; i<n; i++){
            System.out.print(n1);
            if(i < n -1){
                System.out.printf(" ");
            }
            int soma = n1+n2;
            n1 = n2;
            n2 = soma;
        }
        System.out.println();
        sc.close();  
    }
}

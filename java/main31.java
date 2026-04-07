import java.util.Scanner;

public class main31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]num = new int[n];
        int[]num2 = new int[n];
        int[]soma = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){    
            num2[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            soma[i] = num[i] + num2[i];
            System.out.printf("%d ", soma[i]);
        }
        sc.close();
    }
}

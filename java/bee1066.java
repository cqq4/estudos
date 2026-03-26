import java.util.Scanner;

public class bee1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[5];
        int par = 0;
        int impar = 0;
        int negativo =0;
        int positivo =0;
        for(int i=0; i<5; i++){
            a[i] = sc.nextInt();
            if((a[i]%2) == 0){
                par++;
            }else{
                impar++;
            }
            if(a[i] > 0){
                positivo++;
            }else if (a[i] < 0){
                negativo++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
    }
}

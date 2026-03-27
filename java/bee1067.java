import java.util.Scanner;

public class bee1067{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0; i <= x; i++){
            if ((i%2)!=0){  //se i nao for par ele e imprimido
                System.out.println(i);
            }
        }
        sc.close();
    }
}

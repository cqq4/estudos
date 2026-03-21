import java.util.Scanner;
public class main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        int cont = 0;
        int[]v = new int[5];
        t = sc.nextInt();
        for(int i=0; i<5; i++){
            v[i] = sc.nextInt();
            if(v[i] == t){
                cont++;
            }
        }
        System.out.println(cont);
        sc.close();
    }
}

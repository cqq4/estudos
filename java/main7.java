import java.util.Scanner;
public class main7 {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            int km;
            km = sc.nextInt();
            if (km  == 0){
                break;
            }
            System.out.printf("%d minutos", km*2 );
            sc.close();
        };
    }
}

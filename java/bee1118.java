import java.util.Locale;
import java.util.Scanner;

public class bee1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x,y;
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        while(cont != 1){
            x = sc.nextDouble();
            while (x<0 || x>10){
                System.out.println("nota invalida");
                x = sc.nextDouble();
            }
            y = sc.nextDouble();
            while (y<0 || y>10){
                System.out.println("nota invalida");
                y = sc.nextDouble();
            }
            double media = (x+y)/2;
            System.out.printf("media = %.2f\n", media);
            int z;
            do{
                System.out.println("novo calculo (1-sim 2-nao)");
                z = sc.nextInt();
            }while(z != 1 && z!=2);
            if(z == 2){
                cont++;
            }
        }
        sc.close();
    }
}

            
    


            
        
    


    

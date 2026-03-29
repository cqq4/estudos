import java.util.Scanner;

public class bee1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,c,cont;
        int empate = 0;
        int inter = 0;
        int gremio =0;
        cont = 0;
        do{
            x = sc.nextInt();
            y = sc.nextInt();
            if(x > y){
                inter++;
                cont++;
            }else if (x<y){
                gremio++;
                cont++;
            }else{
                empate++;
                cont++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            c = sc.nextInt();
        }while (c == 1);
        if(c==2){
            System.out.println(cont + " grenais");
            System.out.println("Inter:" + inter);
            System.out.println("Gremio:" + gremio);
            System.out.println("Empates:"+empate);
            if(inter > gremio){
                System.out.println("Inter venceu mais");
            }else if (gremio > inter){
                System.out.println("Gremio venceu mais");
            }else{
                System.out.println("Nao houve vencedor");
            }
        }
        sc.close();
    }
}
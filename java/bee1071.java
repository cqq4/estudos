import java.util.Scanner;

public class bee1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,menor,maior;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x>y){
            maior = x;
            menor = y;
        }else{
            maior =y;
            menor = x;
        }

        int soma = 0;

        for(int i=menor+1; i<maior; i++){
            if(i%2 !=0){
                soma+=i;
            }
        }
        System.out.println(soma);
    }
}

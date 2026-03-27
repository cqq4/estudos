import java.util.Scanner;

public class bee2949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //recebe a quantidade
        sc.nextLine();
        String[] t = new String[n];
        int a = 0;
        int e = 0;
        int h = 0;
        int m = 0;
        int x = 0;
        for (int i=0; i < n; i++){ //for recebe n e sabe qts vezes rodar
            String linha = sc.nextLine(); //le a linha
            String[] partes = linha.split(" ");  //faz a separacao do ultimo caractere Ex: "Frodo X"
            String raca = partes[1]; //pega o segundo pedaco cortado do split acima e armazena em raca (1) pois o primeiro pedaco conta como numero 0

            if(raca.equals("A")) a++; //equals verifica String mesma coisa q " == " para tratamento de numeros
            else if(raca.equals("E")) e++;
            else if(raca.equals("H")) h++;
            else if(raca.equals("M")) m++;
            else if(raca.equals("X"))x++;
        }
        System.out.println(x + " Hobbit(s)");
        System.out.println(h + " Humano(s)");
        System.out.println(e + " Elfo(s)");
        System.out.println(a + " Anao(oes)");
        System.out.println(m + " Mago(s)");
        sc.close();
    }
    
}
 
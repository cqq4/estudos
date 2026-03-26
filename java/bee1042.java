import java.util.Scanner;
public class bee1042 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int x= a;
        int y = b;
        int z= c;

        int temp;
        if (a>b){temp = a; a=b; b=temp;}
        if (a>c){temp =a; a=c; c=temp;}
        if (b>c){temp =b; b=c;  c=temp;}
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();


    }
}

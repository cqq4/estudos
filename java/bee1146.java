import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bee1146 {
    public static void main(String[] args) throws IOException{
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sc = new StringBuilder();
        while (true){
            int x = Integer.parseInt(num.readLine());
            if(x== 0){
                break;
            }
            for(int i=1; i<=x; i++ ){
                if (i < x){
                    sc.append(i + " ");
                }else{
                    sc.append(i);
                }
            }
            sc.append("\n");
        }
        System.out.print(sc.toString());
    }
}


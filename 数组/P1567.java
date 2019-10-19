import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1567 {
    public static void main(String[] args)throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int day=0;
        String num = cin.readLine();
        int days = Integer.parseInt(num);
        String A = cin.readLine();
        int M = 0;
        int N = 0;
        String[] B = A.split(" ");
        for(int i=0;i<days;i++){
            M = Integer.parseInt(B[i]);
            if(M>N){
                day++;
            }
            else{
                if(day>total){
                    total=day;
                }
                day=1;
            }
            N=M;
        }
        System.out.print(total);
    }
}
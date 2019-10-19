import java.util.Scanner;

public class P1980 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n =0;
        int N = cin.nextInt();
        int X = cin.nextInt();
        for(int i=1;i<=N;i++) {
            int m=i;
            while(m>0)
            {
                if(m%10==X)
                    n++;
                m/=10;
            }
        }
        System.out.println(n);
    }
}

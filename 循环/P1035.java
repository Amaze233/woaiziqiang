import java.util.Scanner;

public class P1035 {
    public static void main(String[] args) {
        double S=0;
        int i=0;
        Scanner cin = new Scanner(System.in);
        int K = cin.nextInt();
        while (S<=K){
            i++;
            S=S+(double) 1/i;
        }
        System.out.println(i);
    }
}

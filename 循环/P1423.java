import java.util.Scanner;

public class P1423 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int i = 0;
        double L = 0;
        double s = 2;
        double S = cin.nextDouble();
        while (L<S){
            i++;
            L = L+s;
            s = s*0.98;
        }
        System.out.println(i);
    }
}

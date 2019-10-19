import java.util.*;

public class P1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int unhappy = 0;
        for (int i=1;i<8;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a+b;

            if (c>8){
                if (c>unhappy){
                    unhappy=c;
                    day = i;
                }
            }
        }
        System.out.println(day);

    }

}

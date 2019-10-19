import java.util.*;

public class P1422 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i <= 150) {
            double a = i * 0.4463;
            String ac = String.format("%.1f", a);
            System.out.println(ac);
        } else if (i <= 400) {
            double b = (0.4463 * 150) + (i - 150) * 0.4663;
            String bc = String.format("%.1f", b);
            System.out.println(bc);
        } else {
            double c = (0.4463 * 150) + (250 * 0.4663) + (i - 400) * 0.5663;
            String cc = String.format("%.1f", c);
            System.out.println(cc);
        }
    }
}

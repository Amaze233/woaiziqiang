import java.util.Scanner;

public class P1424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = scanner.nextInt()-1;
        int day = scanner.nextInt();
        int sum = date+day;
        if (date<=5){
            if (sum<=5){
                int total = day*250;
                System.out.println(total);
            }
            else if (sum<=7){
                int total = 5*250-date*250;
                System.out.println(total);
            }
            else {
                if (sum % 7 <= 5) {
                    int total = sum / 7 * 250 * 5 + sum % 7 * 250 - date * 250;
                    System.out.println(total);
                } else {
                    int total = (sum/7+1) * 250 * 5 - date * 250;
                    System.out.println(total);
                }
            }
        }
        else {
            if (sum<=7){
                int total = 0;
                System.out.println(total);
            }
            else if (sum%7<=5){
                int total = (sum/7-1)*250*5+sum%7*250;
                System.out.println(total);
            }
            else {
                int total = sum/7*250*5;
                System.out.println(total);
            }
        }
    }
}

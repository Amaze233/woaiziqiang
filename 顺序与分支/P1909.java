import java.util.Scanner;

public class P1909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int cost = 0;
        int number = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = number/a;
        if (number%a==0){
            cost = c*b;
            min = cost;
        }
        else {
            cost = (c+1)*b;
            min = cost;
        }
        for (int i=1;i<=2;i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = number/A;
            if (number%A==0){
                cost = C*B;
                if (cost<min){
                    min = cost;
                }
            }
            else {
                cost = (C+1)*B;
                if (cost<min){
                    min = cost;
                }
            }
        }
        System.out.println(min);
    }
}

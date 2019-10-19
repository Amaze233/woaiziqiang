import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] all = new int[100];
        int input = 0;
        for (int i=0;i<=99;i++){
            input = scanner.nextInt();
            if (input==0){
                break;
            }
            all[i] = input;
        }
        int n = 100;
        while (n>1){
            n--;
            if (all[n-1]!=0){
                System.out.print(all[n-1]+" ");
            }
        }
    }
}

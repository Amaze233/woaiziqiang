import java.util.Scanner;

public class P1428 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] all = new int[N];
        for (int i=0;i<N;i++){
            all[i]=scanner.nextInt();
        }
        for (int n=0;n<N;n++){
            if (n==0){
                System.out.print(0+" ");
            }
            else {
                int total = 0;
                for (int number=0;number<n;number++){
                    if (all[number]<all[n]){
                        total = total+1;
                    }
                }
                System.out.print(total+" ");
            }
        }
    }
}

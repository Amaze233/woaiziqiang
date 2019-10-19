import java.util.Scanner;

public class P1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tree = 0;
        int N = scanner.nextInt();
        int number = scanner.nextInt();
        int[] whole = new int[N+1];
        for (int i=0;i<=N;i++){
            whole[i] = i;
        }
        for (int n=1;n<=number;n++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            for (int m=A;m<=B;m++){
                whole[m]=-1;
            }
        }
        for (int z=0;z<=N;z++){
            if (whole[z]==-1){
                tree = tree+1;
            }
        }
        System.out.println(N-tree+1);
    }
}
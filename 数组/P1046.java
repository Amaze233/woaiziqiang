import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] height = new int[10];
        int N = 0;
        for (int i=0;i<10;i++){
            height[i]=cin.nextInt();
        }
        int X = cin.nextInt();
        for (int n=0;n<10;n++){
            if (height[n]<=(X+30)){
                N++;
            }
        }
        System.out.println(N);
    }
}

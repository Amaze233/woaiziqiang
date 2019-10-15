import java.util.Scanner;
import java.io.*;

public class Buypen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入班主任给小玉的钱的多少元和多少角\n并将两数用空格隔开");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = a+(b*0.1);
        double d = c/1.9;
        System.out.println((int)d);

    }
}

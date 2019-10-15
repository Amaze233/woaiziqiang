import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需计算的两数，并以空格隔开");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
    }

}

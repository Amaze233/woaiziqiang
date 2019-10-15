import java.util.*;
import java.io.*;

public class Fish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入小鱼是从几时几分开始训练\n" +
                "有是在几时几分停止训练的\n" +
                "并将四个数据用空格隔开\n" +
                "注意:输入的第一个时必须大于等于0\n" +
                "第二个时必须小于等于24\n" +
                "第一个分必须大于等于0\n" +
                "第二个分必须小于等于60\n" +
                "且结束时间必须小于开始时间");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        double A = (a*60)+b;
        double B = (c*60)+d;
        double C = B-A;
        System.out.print((int)(C/60)+" ");
        System.out.print((int)(C%60)+" ");

    }
}
`

`
import java.util.Arrays;

public class P1008 {
    public static void main(String[] args) {
        int[] all={1,2,3,4,5,6,7,8,9};
        for (int i=123;i<329;i++){
            int a =i/100;//百位数
            int b =(i-a*100)/10;//十位数
            int c =i-a*100-b*10;//个位数
            int d =2*i/100;
            int e =(2*i-d*100)/10;
            int f =2*i-d*100-e*10;
            int g =3*i/100;
            int h =(3*i-g*100)/10;
            int j =3*i-g*100-h*10;
            if (a!=b&&a!=c&&a!=d&&a!=e&&a!=f&&a!=g&&a!=h&&a!=j&&b!=c&&b!=d&&b!=e&&b!=f&&b!=g&&b!=h&&b!=j&&c!=d&&c!=e&&c!=f&&c!=g&&c!=h&&c!=j&&d!=e&&d!=f&&d!=g&&d!=h&&d!=j&&e!=f&&e!=g&&e!=h&&e!=j&&f!=g&&f!=h&&f!=j&&g!=h&&g!=j&&h!=j&&b!=0&&c!=0&&e!=0&&f!=0&&h!=0&&j!=0){
                System.out.println(i+" "+2*i+" "+3*i);
            }


        }
    }

}

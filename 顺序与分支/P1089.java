import java.util.Scanner;

public class P1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bank = 0;
        int rest = 0;
        int number = 12;

        for (int i=1;i<=12;i++){
            int cost = scanner.nextInt();
            System.out.println(cost);
            rest = rest+300;
            if (rest>=cost){
                rest=rest-cost;
                if (rest>100){
                    int a =rest/100;
                    bank = bank+(a*100);
                    rest = rest-a*100;
                }
            }
            else {
                rest=rest-cost;
                if (i<number){
                    number = i;
                }
                /*number = i;
                rest=rest-cost;
                System.out.println(number);
                i=13;*/
            }
        }
        if (number!=12){
            System.out.println("-"+number);
        }
        else {
            int total = (int) (rest + (bank * 1.2));
            System.out.println(total);
        }

    }
}

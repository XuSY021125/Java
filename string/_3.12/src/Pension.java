import java.util.Scanner;

public class Pension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("您目标是需要存到多少养老金：");
        double gold = in.nextDouble();

        System.out.println("您想要存入多少钱：");
        double money = in.nextDouble();

        //for
        int years = 0;
        years = retireMoney(money, gold, 10);
        System.out.println("需要" + years + "年才能存到" + gold + "元");

        System.out.println();

        //while
        int years1 = 0;
        years1 = retireMoney(years1, money, gold, 10);
        System.out.println("需要" + years1 + "年才能存到" + gold + "元");

        System.out.println();

        //do   while
        int years2 = 0;
        years2 = retireMoney1(years2, money, gold, 10);
        System.out.println("需要" + years2 + "年才能存到" + gold + "元");
    }

    public static int retireMoney(double m, double g, double r) {
        double banlance = 0;
        int i;
        for (i = 0; banlance < g; i++) {
            banlance += m;
            double interest = banlance * r / 100;
            banlance += interest;
            System.out.println(banlance);

        }
        return i;
    }

    public static int retireMoney(int y, double m, double g, double r) {
        double banlance = 0;
        while (banlance < g) {
            banlance += m;
            double interest = banlance * r / 100;
            banlance += interest;
            System.out.println(banlance);
            y++;
        }
        return y;
    }

    public static int retireMoney1(int y, double m, double g, double r) {
        double banlance = 0;
        do {
            banlance += m;
            double interest = banlance * r / 100;
            banlance += interest;
            System.out.println(banlance);
            y++;
        } while (banlance < g);
        return y;
    }
}